import java.util.*;
public class LargestArrayElement {
    public static int foundLargestElement(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;  i <number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("smallest element is = "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[]= {5,8,4,0,13,4,7};
        System.out.println("Largest element is = " + foundLargestElement(number));
    }
}
