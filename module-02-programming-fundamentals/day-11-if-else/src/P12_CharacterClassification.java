import java.util.*;
public class P12_CharacterClassification {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch>='a' && ch<='z'){
            System.out.println("Lowercase Character");
        }
        else if (ch>='A' && ch<='Z'){
            System.out.println("Uppercase Character");
        }
        else if (ch>='0' && ch<='9'){
            System.out.println("It's a Digit");
        }
        else {System.out.println("It's a special character ");
            
        }

    }
    
}
