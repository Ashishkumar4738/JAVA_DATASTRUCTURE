public class BitManipulation {

    public static void checkOddEven(int n) {
        if ((n & 1) != 0)
            System.out.println("Your number is odd ");
        else
            System.out.println("Number is even ");
    }

    public static void getIthBit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask)!=0) System.out.println("Ith bit is 1"); 
        else System.out.println("Ith bit is 0");
    }

    public static void setIthBit(int n, int i){
        int bitMask = 1<<i;
        n = n|bitMask;
        System.out.println("After setting Ith bit "+n);
    }

    public static void clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        n = n&bitmask;
        System.out.println("After clearing Ith bit "+n);
    }

    public static void updateIthBit(int n, int i){
        int bitMask = 1<<i;
        n = ~(n&bitMask);
        System.out.println("After update "+n);
    }

    public static void main(String[] args) {
        checkOddEven(5);
        getIthBit(5, 0);
        setIthBit(5, 1);
        clearIthBit(5, 0);
        updateIthBit(5, 0);
        
    }
}
