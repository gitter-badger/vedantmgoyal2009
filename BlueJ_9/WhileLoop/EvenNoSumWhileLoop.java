package BlueJ_9.WhileLoop;

import java.util.*;
class EvenNoSumWhileLoop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int i=2,sum=0,n=sc.nextInt();
        while(i<=n) {
            System.out.println(i);
            sum+=i;
            i+=2;
        }
        System.out.println("Sum : "+sum);
    }
}
