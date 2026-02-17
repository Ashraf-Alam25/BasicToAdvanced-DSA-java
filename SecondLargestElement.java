public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {20,30,40,50,6,8,9};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                //max = arr[i];
                max = Math.max(max,arr[i]);
            }
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            //if(arr[i] > smax && arr[i] != max){
                //smax = arr[i];
            //}
            if(arr[i] != max )
                smax = Math.max(smax,arr[i]);
            
        }

        System.out.println(max);
        System.out.println(smax);
    }
}
