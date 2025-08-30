import java.util.*;
public class check_prime_or_not {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you No: ");
        int n = sc.nextInt();
        boolean isprime = true;
        if(n==2){
            System.out.print("This is prime no:  ");
        }else{

            for(int i=2;  i<=Math.sqrt(n); i++){   // we use instead of i<=n-1 to Math.sqrt(n) ,  for optimisation cide 
            if(n % i == 0){
                isprime = false;
                
            }

        }
        if (isprime == true){
            System.out.print("This is Prime no: " + n);
        }
        else {
            System.out.print("This is composite no / not prime no: " + n);
        }
 
        }

       
 
    }
}