public class marks {
    public static void main(String[] args) {
        int marks[] = {72,86,95,20,18,24,29,78,99,34,86,74,100};
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] < 35) System.out.println(i);
        }
    }
}
