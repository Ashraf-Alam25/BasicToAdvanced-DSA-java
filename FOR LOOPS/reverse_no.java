public class reverse_no {
    public static void main(String[] args) {
        int n = 5052006; // first no 0 nhi lga skte hai error dega (java me octal mana jata hai )
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
        System.out.println();
    }
    
}
