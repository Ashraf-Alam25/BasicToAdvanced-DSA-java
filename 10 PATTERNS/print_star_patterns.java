import java.util.*;
public class print_star_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no line of pattern: ");
        int lines = sc.nextInt();
        for(int line =1; line<=lines; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
