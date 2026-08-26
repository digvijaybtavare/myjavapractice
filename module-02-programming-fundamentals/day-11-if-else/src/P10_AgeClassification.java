import java.util.*;

public class P10_AgeClassification {

    public static void main(String[] args){ 

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a<0){
            System.out.println("Invalid Age");
        }
        else if (a>=60){
            System.out.println("Senior Citizen");
        }
        else if (a>=20){
            System.out.println("Adult");
        }
        else if (a>=13){
            System.out.println("Teenager");
        }
        else
            System.out.println("Child");
        

        sc.close();
    }
    
}
