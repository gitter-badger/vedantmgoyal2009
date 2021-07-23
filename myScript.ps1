$workingDir = Get-Location
$ProgressPreference = 'SilentlyContinue'
$fileDownload = [System.Net.WebClient]::new()
Import-Module -Name Appx -UseWindowsPowershell
$fileDownload.DownloadFile("https://aka.ms/Microsoft.VCLibs.x64.14.00.Desktop.appx","$workingDir\Microsoft.VCLibs.x64.14.00.Desktop.appx") 
Add-AppxPackage -Path "$workingDir\Microsoft.VCLibs.x64.14.00.Desktop.appx"
Write-Host "Successfully installed Microsoft.VCLibs.x64.14.00.Desktop.appx"
$fileDownload.DownloadFile("https://github.com/microsoft/winget-cli/releases/download/v1.0.11692/Microsoft.DesktopAppInstaller_8wekyb3d8bbwe.msixbundle","$workingDir\Microsoft.DesktopAppInstaller_8wekyb3d8bbwe.msixbundle")
Add-AppxPackage -Path "$workingDir\Microsoft.DesktopAppInstaller_8wekyb3d8bbwe.msixbundle"
Write-Host "Successfully installed Microsoft.DesktopAppInstaller_8wekyb3d8bbwe.msixbundle"
### Source: https://github.com/microsoft/winget-cli/issues/1321 
    # Install NtObjectManager module
Install-Module NtObjectManager -Force
    # Create reparse point 
$installationPath = (Get-AppxPackage Microsoft.DesktopAppInstaller).InstallLocation
Set-ExecutionAlias -Path "C:\Windows\System32\winget.exe" -PackageName "Microsoft.DesktopAppInstaller_8wekyb3d8bbwe" -EntryPoint "Microsoft.DesktopAppInstaller_8wekyb3d8bbwe!winget" -Target "$installationPath\AppInstallerCLI.exe" -AppType Desktop -Version 3
explorer.exe "shell:appsFolder\Microsoft.DesktopAppInstaller_8wekyb3d8bbwe!winget"
### End
git clone https://github.com/microsoft/winget-pkgs.git
if (-Not (Get-Command "winget" -ErrorAction "SilentlyContinue")) {
    Write-Host "WinGet is not installed yet." -ForegroundColor Red
    return
} else {
    Write-Host "`nChecking HTTP Response codes for Download URLs...`n"
    $manifestsDir = "$workingDir\winget-pkgs\manifests"
    Foreach($i in (Get-ChildItem -Path $manifestsDir -Directory -Recurse -Depth 6 | Select FullName)) {
        if(((Get-ChildItem -Directory -Path $i.FullName).Count) -eq 0) {
            $manifestPath = $i.FullName
            $DownUrl = (winget show --manifest "$manifestPath" | Select-String -Pattern "Download Url").ToString()
            $trimUrl = $DownUrl.TrimStart("Download Url: ")
            $filename = ($trimUrl -split '\/')[-1]
            try {
                $responseTest = (Invoke-WebRequest -SkipHttpErrorCheck -Uri $trimUrl -Method Get -OutFile "$workingDir\$filename" -PassThru) | Select StatusCode
                $responseCode = $responseTest.StatusCode
            } catch {
                $responseCode = "Error"
            }
            Write-Host "$responseCode`: $trimUrl"
            "$responseCode`: $trimUrl" | Out-File -Append -FilePath $workingDir\log.txt
            Remove-Item $workingDir\$filename -ErrorAction Ignore
        }
    }
    Write-Host "Completed!"
}
