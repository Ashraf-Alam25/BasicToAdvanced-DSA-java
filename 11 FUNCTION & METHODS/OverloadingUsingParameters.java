import java.util.Scanner;
public class OverloadingUsingParameters {
    public static int sum(int a, int b){
        return a+b;

    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first value = ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second value = ");
        int num2 = sc.nextInt();

        System.out.print("Enter your third value = ");
        int num3 = sc.nextInt();
        System.out.print("Enter your fourth value = ");
        int num4 = sc.nextInt();
        System.out.print("Enter your fifth value = ");
        int num5 = sc.nextInt();

        System.out.println("  ");
        System.out.println("The sum of two value is = " + sum(num1, num2));
        System.out.println("  ");
        System.out.println("The sum of three value is = " + sum(num3, num4, num5));
    }
    
}
