public class SortZeroOne {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,0,0,1,1,0,1,1};
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) count1 ++;
            else count2 ++;
        }
        for (int i = 0; i < count1; i++) {
            arr[i]=0;
        }
        for (int i = count1; i <arr.length ; i++) {
            arr[i]=1;
        }
        for(int ele : arr) System.out.print(arr+" ");
        
    }
}
