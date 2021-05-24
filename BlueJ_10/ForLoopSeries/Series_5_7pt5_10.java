package BlueJ_10.ForLoopSeries;
import java.util.Scanner;
import java.text.DecimalFormat;
class Series_5_7pt5_10
{
    public static void main(String[] args)
    {
        DecimalFormat rmDecZero = new DecimalFormat("0.#");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of terms : ");
        int n=sc.nextInt();
        double a=5;
        for(int i=1;i<=n;i++,a+=2.5) {
            System.out.print(rmDecZero.format(a));
            if(i!=n)
                System.out.print(", ");
        }
    }
}