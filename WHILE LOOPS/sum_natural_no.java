import java.util.*;
public class sum_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum +=i;
            i ++;
        }
        System.out.println("The sum is: " + sum);

    }
}
    

