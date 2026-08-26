import java.util.*;

public class Problem09_GradeClassification {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a>=0 && a<=100){

            if (a>=90){
            System.out.println("Excellent");
            }
            else if (a>=75){
                System.out.println("Good");
            }
            else  if (a>=50){
                System.out.println("Average");
            }
            else System.out.println("Fail");
        }

        else System.out.println("Invalid Input");

        

        sc.close();
        
    }
    
}
