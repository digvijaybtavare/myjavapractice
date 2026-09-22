import java.util.*;

public class Problem07_DivisibleByFiveAndEleven {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a%5==0 && a%11==0){
            System.out.println("Divisible by both 5 and 11");
        }
        else System.out.println("Not divisible by both 5 and 11");


        sc.close();
    }
    
}
