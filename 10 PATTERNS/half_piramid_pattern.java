import java.util.Scanner;

public class half_piramid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no line of pattern: ");

        int lines = sc.nextInt();
        System.out.println("pattern is: ");

        for(int line =1; line<=lines; line++){
            for(int number=1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
    

}
