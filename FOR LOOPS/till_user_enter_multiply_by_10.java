import java.util.*;
public class till_user_enter_multiply_by_10 { //keep entering numbers till user enters a multiply of 10 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter your no: ");
            int n = sc.nextInt();
            if (n%10 ==0){
                break;
                
            }
            System.out.println(n);
            
        }
        
        while(true);
        System.out.println("We are outed from the loop");
        
    }
    
}
