import java.util.Scanner;

public class P15_LoginAccess {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean isAdmin = sc.nextBoolean();
        boolean isRegularUser = sc.nextBoolean();
        boolean hasValidPassword = sc.nextBoolean();

        if (isAdmin || (isRegularUser && hasValidPassword )){
            System.out.println("ACCESS GRANTED");
        }
        else {
            System.out.println("ACCESS DENIED");
        }

sc.close();
    }
    
}
