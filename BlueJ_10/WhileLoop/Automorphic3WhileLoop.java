package BlueJ_10.WhileLoop;

import java.util.Scanner;

class Automorphic3WhileLoop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n=sc.nextInt(),s=n*n;
        while(n!=0)
        {
            if(n%10!=s%10)
                break;
            s=s/10;
            n=n/10;
        }
        if(n==0)
            System.out.println("Automorphic");
        else    
            System.out.println("Not Automorphic");
        sc.close();
    }
}