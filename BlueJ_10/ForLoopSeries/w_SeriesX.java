package BlueJ_10.ForLoopSeries;
import java.util.Scanner;
//W. 1+X+(X^1)/1! + (X^2)/2! + (X^3)/3! + (X^4)/4!...................(X^N)/N!
public class w_SeriesX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter X and no. of terms : ");
        int x=sc.nextInt(),n=sc.nextInt(),term=1;
        double f=1,s=1+x;
        System.out.print("1 + "+x);
        for(int i=3;i<=n;i++,f=1,term++) {
            for(int findFactorial=1;findFactorial<=term;findFactorial++)
                f*=findFactorial;
            s+=(Math.pow(x,term)/f);
            System.out.print(" + "+Math.pow(x,term)+"/"+f);
        }
        System.out.print("\nSum : "+s);
    }
}