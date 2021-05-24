package BlueJ_9.WhileLoop;

import java.util.*;
class TableWhileLoop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n=sc.nextInt(),i=1;
        while(i<=10) {
            System.out.println(n*i);
            i++;
        }
    }
}