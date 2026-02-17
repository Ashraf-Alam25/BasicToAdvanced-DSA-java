import java.util.Arrays;

public class BuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {5,4,9,2,8,2,8,2,8,9,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // for each loop
        for(int x : arr) System.out.print(x+" ");
    }
}
