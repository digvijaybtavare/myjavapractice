import java.util.Scanner;

public class P14_DiscountEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean isSeniorCitizen = sc.nextBoolean();

        boolean isPremiumCust = sc.nextBoolean();

        if (isSeniorCitizen || isPremiumCust ){
            System.out.print("DISCOUNT");
        }
        else {
            System.out.print("NO DISCOUNT");
        }
    }
    
}
