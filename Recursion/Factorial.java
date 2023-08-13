public class Factorial {
    static int findFactorial(int n){
        if(n==0){
            return 1;
        }
        int fn = n * findFactorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }    
}
