import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arrays size = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter your element = " +n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]*2+" ");
        } 
        sc.close();
    }
}
