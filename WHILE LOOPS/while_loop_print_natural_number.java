import java.util.*;
public class while_loop_print_natural_number {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number where to print: ");
        int number = sc.nextInt();
        int counter = 1;
        while(counter <= number){
            //System.out.println(counter);
            System.out.print(counter + " ");
            counter ++;
        }

    }
    
}
