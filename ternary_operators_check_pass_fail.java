import java.util.*;
public class ternary_operators_check_pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        //int marks = 6;
        String reportcard = (marks<33 ? "fail" : "pass");
        System.out.println("result is: " + reportcard);
    }
    
}
