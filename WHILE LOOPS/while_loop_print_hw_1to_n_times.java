import java.util.*;
public class while_loop_print_hw_1to_n_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times you want to print HW: ");
        int times = sc.nextInt();
        int counter = 0;

        while(counter < times){
            System.out.print("Hello World" + "  ");
            counter ++;

        
        }
        
    }
    
}
