import java.util.*;
public class P10_SumDivisibleBy3Or5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        int i=1;

        while (i<=n){
            if(i%3==0 || i%5==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);

        sc.close();
    }
    
}
