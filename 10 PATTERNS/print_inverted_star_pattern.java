import java.util.Scanner;

public class print_inverted_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no line of pattern: ");

        int lines = sc.nextInt();
        System.out.println("pattern is: ");

        for(int line =1; line<=lines; line++){
            for(int star=1; star<=lines -line +1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

}
