package BlueJ_10.ForLoopSeries;
import java.util.*;
class Sum_1by2_1by3_1by4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of terms : ");
        int n=sc.nextInt();
        double s=0;
        for(int i=1;i<=n;i++) {
            s+=1.0/(i+1);
            System.out.print("1/"+(i+1));
            if(i!=n)
                System.out.print(" + ");
        }
        System.out.println("\nSum : "+s);
    }
}