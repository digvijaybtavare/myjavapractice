import java.util.*;

public class P7_SumOfDigits {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int sum=0;

        int i = 0;

        if (a<0){
            a=(a*(-1));
        }

        while (a>0){
            i=a%10;
            sum= sum+i;
            a=a/10;
        }
        System.out.println("Sum of all digits is = "+sum);

        sc.close();
    }
    
}
