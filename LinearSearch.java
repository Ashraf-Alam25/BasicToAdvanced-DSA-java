public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {20,30,40,50,60,80,90};
        int x = 40;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                System.out.println("found at index = "+i);
                flag = true;
                
                break;
            }
        }
        if(flag == true){
            System.out.println("element is exits ");
        }
        else System.out.println("element is not exits in this array ");
    }
}
