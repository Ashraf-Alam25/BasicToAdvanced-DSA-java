import java.util.*;
public class switch_statement_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int a = sc.nextInt();
        System.out.print("Enter no: ");
        int b = sc.nextInt();
        System.out.print("Enter operator i.e= + ,  -  , *   ,  /, % : ");
        char operator = sc.next().charAt(0);

        switch(operator){

            case '+' : System.out.println(a+b);
            break;

            case '-' : System.out.println(a-b);
            break;

            case '*' : System.out.println(a*b);
            break;

            case '/' : System.out.println(a/b);
            break;

            case '%' : System.out.println(a%b);
            break;

            default : System.out.println("wrong operator");
        }
        
    }
    
}
