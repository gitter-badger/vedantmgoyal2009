package BlueJ_10.Arrays;
import java.util.Scanner;
public class SumDigitsNoWith7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of blocks of array: ");
        int n=sc.nextInt(),arr[] = new int[n],s=0;
        boolean contains7 = false;
        for(int i=0;i<n;i++,contains7=false) {
            System.out.println("Enter value for "+i+" block of array: ");
            arr[i]=sc.nextInt();
            for(int j=arr[i];j!=0;j=j/10)
                if(j%10==7) {
                    contains7=true;
                    break;
                }
            if(contains7)
	            for(int k=arr[i];k!=0;k=k/10)
	                s+=k%10;
        }
        System.out.println("Displaying Sum of Digits of Numbers with 7: "+s);
    }
}