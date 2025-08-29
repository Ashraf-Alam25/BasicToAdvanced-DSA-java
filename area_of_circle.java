import java.util.*;
public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius: ");
        float rad = sc.nextFloat();

        float area = 22/7f * rad * rad ;
        System.out.print("The area of circle is: ");
        System.out.println(area);


    }
}