import java.util.*;
public class P8_CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int count= 0;
        
        int n = sc.nextInt();
        if (n<0){
            n=n*(-1);
        }
        if (n==0){
            count=1;

        }

        while (n>0){
            count = count+1;
            n=n/10;
        }
        System.out.println("Count of all digit is = "+count);

        sc.close();
    }
}
