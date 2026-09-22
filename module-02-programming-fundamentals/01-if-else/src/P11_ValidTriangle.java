import java.util.Scanner;

public class P11_ValidTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        int ans = a+b+c;

        if ( a>0 && b>0 && c>0 &&  ans==180){
            System.out.println("Valid Triangle");
        }

        else System.out.println("Invalid Triangle");


        sc.close();
    }
    
}
