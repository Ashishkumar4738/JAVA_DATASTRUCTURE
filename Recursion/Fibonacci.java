public class Fibonacci{
    static int findFibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        int n3 = findFibonacci(n-1)+findFibonacci(n-2);

        return n3;
    }
    public static void main(String[] args) {
        
        System.out.println(findFibonacci(5));
    }
}