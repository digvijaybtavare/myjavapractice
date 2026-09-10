import java.util.Scanner;

public class P16_GradeClassification {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks>=0 && marks<=100){

            if (marks>=90){
            System.out.println("GRADE A");
            }
            else if (marks>=75){
            System.out.println("GRADE B");
            }
            else if (marks>=60){
            System.out.println("GRADE C");
            }
            else if (marks>=40){
            System.out.println("GRADE D");
            }
            else {
            System.out.println("GRADE F");
            }
        }
        else {
            System.out.println("INVALID MARKS");
        }

    sc.close();    
    }
    
}
