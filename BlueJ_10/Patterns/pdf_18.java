package BlueJ_10.Patterns;
import java.util.Scanner;
public class pdf_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of lines to print : ");
        int lines=sc.nextInt();
        for(int i=1;i<=lines;i++) {
            for(int j=i;j<lines;j++)
                System.out.print("  ");
            for(int j=i;j>=1;j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
