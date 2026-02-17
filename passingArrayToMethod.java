public class passingArrayToMethod {
    public static void change(int[] arr){
        arr[1] = 80;
    }
    public static void main(String[] args) {
        int arr[] = {5,8,9,7,8,5,2,0,1,6};
        arr[1] = 20;
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }
}
