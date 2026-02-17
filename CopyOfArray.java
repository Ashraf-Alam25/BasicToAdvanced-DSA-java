import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int [] arr = {4,2,5,8,2,5,6,4,5,8};
        for(int x : arr) System.out.print(x+" ");
        System.out.println();

        // int [] nums = arr; // shallow copy
        // arr [0] = 70;  // shallow copy se original array ka hi hota hai not a deep copy
        // System.out.println(arr[0]);
        // for(int num : nums ) System.out.print(num+" ");
        // System.out.println();


        // deep copy
        int [] drr = Arrays.copyOf(arr, arr.length);
        drr[0] = 70;
        System.out.println(arr[0]);
    }
}
