import java.util.*;
public class print_except_muliply_of_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter your no : ");
            int n = sc.nextInt();

            if (n % 10 == 0){
                continue;
            }
            System.out.println("your no was: " + n);
           
            

        }while(true);
    }
    
}
