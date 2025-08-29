import java.util.*;
public class switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("choose No from 1 to 3: ");
        int number = sc.nextInt();
        
        switch(number) {
            case 1 : System.out.println("samosa");
            break;

            case 2 : System.out.println("chicken roll");
            break;

            case 3 : System.out.println("chocolate coffee");
            break;

            default : System.out.println("you are in dream");

            
        }
    }
    
}
