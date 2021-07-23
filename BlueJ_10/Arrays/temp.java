package BlueJ_10.Arrays;
import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = 5;
        int arr[] = new int[N];
        for (int i=0;i<N;i++) {
            System.out.println("Enter a no.: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);
    }
}