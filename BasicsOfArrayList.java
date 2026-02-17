import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);        
        arr.add(1,20);        
        arr.add(2,30);        
        arr.add(3,50);   
        System.out.println(arr.get(3));  
        for (int i = 0; i <= 3; i++) {
            System.out.print(arr.get(i)+" ");
        }   



    }
}
