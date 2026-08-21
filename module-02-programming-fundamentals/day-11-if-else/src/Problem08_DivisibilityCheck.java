import java.util.Scanner;

public class Problem08_DivisibilityCheck {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a%5==0 && a%11==0){
            System.out.println("Divisible by both 5 and 11");
        }
        else if (a%5==0){
            System.out.println("Divisible by 5 only");
        }
        else if (a%11==0){
            System.out.println("Divisible by 11 Only");
        }
        else {
            System.out.println("Divisible by neither 5 nor 11");
        }

        sc.close();
    }
    
}
