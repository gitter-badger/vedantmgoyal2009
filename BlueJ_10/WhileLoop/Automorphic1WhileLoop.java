package BlueJ_10.WhileLoop;

import java.util.Scanner;

class Automorphic1WhileLoop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n=sc.nextInt(),c=0,t=n;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        c=(int)Math.pow(10,c);
        if((t*t)%c==t)
            System.out.println("Automorphic");
        else    
            System.out.println("Not Automorphic");
        sc.close();
    }
}