package BlueJ_10.Patterns;

import java.util.Scanner;

public class Diamond {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n=sc.nextInt();
            for(int i=1;i<=n;i++) {
                for(int j=n;j>i;j--)
                    System.out.print("  ");
                for(int j=1;j<=i;j++)
                    System.out.print(j+" ");
                for(int j=i-1;j>=1;j--)
                    System.out.print(j+" ");
                System.out.println();
            }
            for(int i=n-1;i>=1;i--) {
                for(int j=n-1;j>=i;j--)
                    System.out.print("  ");
                for(int j=1;j<=i;j++)
                    System.out.print(j+"");
                for(int j=i-1;j>=1;j--)
                    System.out.print(j+" ");
                System.out.println();
            }
        }
    }
