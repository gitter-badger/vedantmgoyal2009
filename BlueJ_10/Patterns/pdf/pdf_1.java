package BlueJ_10.Patterns.pdf;
import java.util.Scanner;
/*  1
    1 2
    1 2 3
    1 2 3 4
*/
public class pdf_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of lines to print : ");
        int lines=sc.nextInt();
        for(int i=1;i<=lines;i++) {
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}