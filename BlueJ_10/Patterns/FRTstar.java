package BlueJ_10.Patterns;
/*  * * * *
    * * *
    * *
    *
*/
import java.util.Scanner;
public class FRTstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of lines to print : ");
        int lines=sc.nextInt();
        for(int i=lines;i>=1;i--) {
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}