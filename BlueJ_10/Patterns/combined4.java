package BlueJ_10.Patterns;
import java.util.Scanner;
public class combined4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of lines to print : ");
        int lines=sc.nextInt();
        for(int i=1;i<=lines;i++) {
            for(int j=1;j<=i;j++) {
                for(int k=1;k<=i;k++)
                    System.out.print(i);
                System.out.println();
            }
        }
    }
}
