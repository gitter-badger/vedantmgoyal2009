package BlueJ_9.ForLoop;
import java.util.*;
class Factors
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n=sc.nextInt(),i,c=0;
        for(i=1;i<=n;i++)
            if(n%i==0)
                c++;
        System.out.println(c);
    }
}