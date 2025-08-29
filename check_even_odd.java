import java.util.*;

public class check_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value which you want to check even or odd:  ");
        long num = sc.nextLong();
        
        if(num % 2 == 0){
            System.out.println("Even NO");
        }else{
            System.out.println("Odd No");
        }


    }
    
}
