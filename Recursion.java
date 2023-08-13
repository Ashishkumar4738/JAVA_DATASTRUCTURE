public class Recursion{
    public static void main(String[] args) {
        int num = 5;
        int result = findFactorial(num);
        System.out.println(result);
        int addition = addNNumbers(num);
        System.out.println(addition);
        
    }
    public static int findFactorial(int num){
        if(num==0){
            return 1;
        }

        return num*findFactorial(num-1);
    }
    public static int addNNumbers(int num){
        if(num==0){
            return 0;
        }
        return num+addNNumbers(num-1);
    }
}