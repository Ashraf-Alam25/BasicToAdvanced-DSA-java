public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == key){
                return mid;
            }

            if(numbers[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }         
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,33,36,45,66,98,100};
        int key = 98;
        System.out.println("key is at index = " + binarySearch(numbers, key));
    }
}
