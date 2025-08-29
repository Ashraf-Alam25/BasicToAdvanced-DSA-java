import java.util.*;
public class largest_of_three_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second value: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third value: ");
        int num3 = sc.nextInt();

        if ((num1 >= num2) && (num1 >= num2)){
            System.out.println("Largest value is: " + num1);
        }
        else if (num2>=num3){
            System.out.println("Largest value is: " + num2);
        }
        else {
            System.out.println("Largest value is: "+ num3);
        }


    }
    
}
