public class BinomialCoefficient {
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <=n; i++){
             f = f*i;
        }
        return f;
    }

    public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_minus_r = factorial(n-r);
        int bincoeff = fact_n/ (fact_r * fact_n_minus_r);
        return bincoeff;
    }
    public static void main(String[] args) {
        System.out.print("binomial coefficient is = ");
        System.out.println(bincoeff(5, 2));
    }

}
