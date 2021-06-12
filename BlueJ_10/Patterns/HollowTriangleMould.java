package BlueJ_10.Patterns;
import java.util.Scanner;
public class HollowTriangleMould {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of lines to print : ");
        int lines=sc.nextInt();
        for(int i=1;i<=lines;i++) {
            for(int j=lines;j>i;j--)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                if(j==1 || i==lines)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            for(int j=2;j<=i;j++)
                if(j==i || i==lines)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }
}
