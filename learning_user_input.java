import java.util.*;
public class learning_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String input = sc.next();
        //System.out.println(input);
        System.out.print("enter your name: ");
        String input = sc.nextLine();
        System.out.println (input);


        System.out.print("contact no: ");
        long number = sc.nextLong();
        //sc.nextLine(); //Consume the leftover newline
        System.out.println(number);

    }
}
