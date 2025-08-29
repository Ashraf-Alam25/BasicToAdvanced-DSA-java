import java.util.*;
public class sum_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int num1 = sc.nextInt();
        //System.out.println(num1);

        System.out.print("Enter second value: ");
        int num2 = sc.nextInt();
        //System.out.print(num2);

        int sum = num1 + num2 ;
        System.out.print("The sum of total value is: ");
        System.out.println(sum);
    }
    
}
