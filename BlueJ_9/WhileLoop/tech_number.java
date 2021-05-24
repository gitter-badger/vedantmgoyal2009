package BlueJ_9.WhileLoop;

import java.util.Scanner;
public class tech_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt(),c=0,t=n;
        while(t!=0) {
            c++;
            t/=10;
        }
        if(c%2==0 && (int)Math.pow((n/(int)Math.pow(10,c/2))+(n%(int)Math.pow(10,c/2)),2)==n)
                System.out.println(n+" is a tech number");
            else
                System.out.println(n+" is not a tech number");
    }
}