public class CalculatePower {

    static int calculate(int num,int pow){
        if(pow==0) return 1;
        int n = num * calculate(num, pow-1);
        return n;
    }
    public static void main(String[] args) {
        System.out.println(calculate(2, 3));
        
    }
}
