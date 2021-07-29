$workingDir = Get-Location
$ProgressPreference = 'SilentlyContinue'
git clone https://github.com/microsoft/winget-pkgs.git
Write-Host "`nChecking HTTP Response codes for Download URLs..."
Foreach($i in (Get-ChildItem -Path "$workingDir\winget-pkgs\manifests" -Directory -Recurse | Select FullName)) {
    if(((Get-ChildItem -Directory -Path $i.FullName).Count) -eq 0) {
        if((Get-ChildItem -Path $i.FullName).Count -eq 1) {
            $installerYaml = Get-ChildItem -Path $i.FullName | Select FullName
            $DownUrl = ((Get-Content $installerYaml.FullName | Select-String -Pattern "InstallerUrl:").ToString()).TrimStart("InstallerUrl: ")
            if ($DownUrl.Contains('"')) {
                $DownUrl = $DownUrl.Trim('"')
            }
            $filename = ($DownUrl -split '\/')[-1]
            try {
                $responseTest = (Invoke-WebRequest -SkipHttpErrorCheck -Uri $DownUrl -Method Get -OutFile "$workingDir\$filename" -PassThru) | Select StatusCode
                $responseCode = $responseTest.StatusCode
            } catch {
                $responseCode = "Error"
            }
            Write-Host "$responseCode`: $DownUrl"
            "$responseCode`: $DownUrl" | Out-File -Append -FilePath $workingDir\wingetHttpCodes.txt
            Remove-Item $workingDir\$filename -ErrorAction Ignore
        } else {
            $installerYaml = Get-ChildItem -Path $i.FullName -Filter "*installer*" | Select FullName
            Foreach($InstallUrls in (Get-Content $installerYaml.FullName | Select-String -Pattern "InstallerUrl:")) {
                $DownUrl = ($InstallUrls.ToString()).TrimStart("InstallerUrl: ")
                if ($DownUrl.Contains('"')) {
                    $DownUrl = $DownUrl.Trim('"')
                }
                $filename = ($DownUrl -split '\/')[-1]
                try {
                    $responseTest = (Invoke-WebRequest -SkipHttpErrorCheck -Uri $DownUrl -Method Get -OutFile "$workingDir\$filename" -PassThru) | Select StatusCode
                    $responseCode = $responseTest.StatusCode
                } catch {
                    $responseCode = "Error"
                }
                Write-Host "$responseCode`: $DownUrl"
                "$responseCode`: $DownUrl" | Out-File -Append -FilePath $workingDir\wingetHttpCodes.txt
                Remove-Item $workingDir\$filename -ErrorAction Ignore
            }
        }
    }
}
Write-Host "Completed!"