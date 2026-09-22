import java.util.*;

public class LargestOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= b){
            System.out.println("Largest Number is: " + a);
        }
        if (b > a){
            System.out.println("Largest Number is: " + b);
        }
        
     
    sc.close();
    }

    
}
