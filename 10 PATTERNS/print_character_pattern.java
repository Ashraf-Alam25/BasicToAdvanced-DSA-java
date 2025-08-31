import java.util.*;

public class print_character_pattern {
    
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter no line of pattern: ");
        //int lines = sc.nextInt();
        //System.out.println("pattern is: ");
        int n =4;
        char ch = 'A';

        for(int line =1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){ // inner loop
                System.out.print(ch);
                ch++;
            }
           System.out.println();
        }
    }
}
