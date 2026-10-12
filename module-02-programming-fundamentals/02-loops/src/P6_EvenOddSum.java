import java.util.*;
public class P6_EvenOddSum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int sum_o=0;

        int sum_e=0;

        int i = 1 ;

        while (i<=a){
            if(i%2==0){
                sum_e=sum_e+i;
            }
            else {
                sum_o=sum_o+i;
            }
            i++;

        }
        

        System.out.println("Sum of Even = "+ sum_e);
        System.out.println("Sum of Odd = "+ sum_o);
        
        
       sc.close(); 
    } 
}
