public class MaxValue {
    public static void main(String[] args) {
        int arr[] = {20,30,40,50,60,80,90};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
