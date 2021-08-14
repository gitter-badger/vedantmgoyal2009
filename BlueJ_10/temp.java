package BlueJ_10;
import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        for (int i=1;i<=2;i++,n/=100){
            System.out.println("1:"+n%10);
            System.out.println("2:"+n%100/10);
        }
    }
}
