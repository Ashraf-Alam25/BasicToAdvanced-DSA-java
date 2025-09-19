// public class SubArray {
//     public static void printSubArray(int numbers[]){
//         int ts = 0;
//         //int maxsum = Integer.MIN_VALUE;
//         for(int i=0; i<numbers.length; i++){
//             int start = i;
//             for(int j=i; j<numbers.length;  j++){
//                 int end = j;
//                 //int sum = 0;
//                 for(int k=start; k<=end; k++){
//                     System.out.print(numbers[k]+ " ");
//                     //sum += numbers[k];
//                 }
//                 ts++;
//                 System.out.println();
//                 //System.out.println("  sum = " + sum);

//                 // if(sum > maxsum){
//                 //     maxsum = sum;
//                 // }
//             }
//             System.out.println();
//         }
//         System.out.println("the total subarray is = " + ts);
//         //System.out.println("maximum subarray sum = " + maxsum);
//     }
//     public static void main(String[] args) {
//         int numbers [] = {2,4,6,8,10};
//         printSubArray(numbers);
//     }
// }

public class SubArray{
    public static void printSubArray(int numbers[]){
        int n = numbers.length;
        for(int i = 0; i < numbers.length; i++){
            int start = i ;
            for(int j=i; j < numbers.length; j++){
                int end = j;

                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: " + (n * (n + 1) / 2));
    }
    public static void main(String[] args) {
        int numbers[] = { 2 , 4 , 6}; 
        printSubArray(numbers);
    }
}