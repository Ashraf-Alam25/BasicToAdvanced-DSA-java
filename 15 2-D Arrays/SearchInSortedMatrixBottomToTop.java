public class SearchInSortedMatrixBottomToTop {
   public static boolean stairCaseSearch(int matrix[][] , int key){
    int row = matrix.length - 1 , col = 0;
    while(row >=0 && col <matrix[0].length){
        if(matrix[row][col] == key){
            System.out.print("key id index at ( " + row + " , " + col + " )");
            return true;
        }
        else if(key < matrix[row][col]){
            row --;

        }
        else{
            col ++;
        }
    }
    System.out.print("Element not found in this matrix");
    return false;

   }
   public static void main(String[] args) {
    int matrix [][] = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
    };
    int key = 0;
    stairCaseSearch(matrix, key);
   }
}
    
