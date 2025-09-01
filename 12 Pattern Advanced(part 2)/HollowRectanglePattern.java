public class HollowRectanglePattern {
    public static void hollowRectangle(int totRow, int totCol){
        // outer loop
        for(int i = 1; i <= totRow; i++) {
            // inner loop
            for(int j = 1; j <= totCol; j++) {
                if(i == 1 || i == totRow || j == 1 || j == totCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(4, 5);
    }
}