import java.util.Scanner;

public class P13_ExamHallEntry {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);       

        System.out.print("Do you have an Admit Card? (true/false): ");
        boolean hasAdmitCard = sc.nextBoolean();

        System.out.print("Do you have an ID Proof ? (true/false): ");
        boolean hasValidId = sc.nextBoolean();

        if (hasAdmitCard && hasValidId){
                System.out.println("ALLOW");
            } 
            
        else {
            System.out.println("REJECT");
        } 

        sc.close();
    }
    
}
