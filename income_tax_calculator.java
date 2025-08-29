import java.util.*;
public class income_tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you income: ");

        int income = sc.nextInt();
        int tax = 0;
        
        if (income < 500000){
            tax = 0;
        }

        else if (income >= 500000 && income < 1000000){
            tax = (int) (income * 0.2f) ;

        }
        else{
            tax = (int) (income*0.3);

        }
        System.out.println("Your income tax is: " + tax);

    }
    
}
