package BlueJ_9;

import java.util.Scanner;
public class pyramidPattern
{  
    public static void main(String[] args)
    {  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of lines to print pattern : ");
        int n=sc.nextInt(),t1=0,t2=0;
        while(t1<n) {
            t2=n-t1;
            while(t2>1) {
                System.out.print(" ");
                t2--;
            }
            t2=0;
            while(t2<=t1) {
                System.out.print("* ");
                t2++;
            }
            System.out.println();
            t1++;
        }
    } 
}