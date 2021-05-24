package BlueJ_10.WhileLoop;
import java.util.Scanner;
/*
 *  Multiplying a number by two and three separately,
 *  the number obtained by writing the results obtained with the given number will be called a fascinating number.
 *  If the result obtained after concatenation contains all digits from 1 to 9, exactly once.
 *
 * Number is 327, 327×2=654, 327×3=981
 * Now, concatenate the above results to the given number (n).
 * "327"+"654"+"981"= 327654981
 */
public class isbn_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a ISBN number : ");
        long n=sc.nextLong(),t=n,c=0;
        while(t!=0) {
            c++;
            t/=10;
        }
        if(c!=10)
            System.out.println("Not a valid ISBN number");
        else {
            long rev=0;
            for(long i = n; i!=0; i=i/10)
                rev=rev*10+i%10;



        }
        //catch(java.lang.Exception e){
        //    System.out.println("Error while reading data!");
        //}
    }
}
