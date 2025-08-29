import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        
       
        if (age >=18){
            System.out.println("you are elible for vote and drive.");

        }

        if (age >13 && age<18){
            System.out.println("you are teenager.");
        }
        else {
            System.out.println("you ade not adult so you are not eligible for vote etc.");
        }
    }
    
}
