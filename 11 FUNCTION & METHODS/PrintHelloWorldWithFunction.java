import java.util.*;
 
public class PrintHelloWorldWithFunction { 
    public static void PrintHelloWorld(){ // if 'int' the place of 'void'
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;// then return 3; means hoe many time print return 
    }
    public static int CalculateSum (int num1 , int num2) {
        int sum = num1 + num2;
         return sum;

    }
    public static void main(String[] args) {
        //PrintHelloWorld();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no: ");
        int a = sc.nextInt();
        System.out.print("enter your no: ");
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);
        System.out.println("sum is: " +sum);
        

       
    }
    
}

    
    

