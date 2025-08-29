import java.util.*;
public class largest_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value No:1 ");
        int num1 = sc.nextInt();

        System.out.print("Enter value No:2 ");
        int num2 = sc.nextInt();
        
        if(num1>num2){
            System.out.println("This is largest NO: "+ num1);
        }

        if(num1==num2){
            System.out.println("Both are same value: "+ num1);
        }
        else {
            System.out.println("This is largest NO: " + num2);
        }
                
    }
    
}
