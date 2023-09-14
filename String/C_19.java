//Bit manipulation 
public class C_19 {
    public static void main(String[] args) {
        System.out.println(6 & 7); // and bit wise operator
        System.out.println(6 | 7); // or bit wise operator
        System.out.println(6 ^ 7); // xor bit wise operator
        System.out.println(~5); // negation bit wise operator
        System.out.println(5 << 2); // left shift operator formula (a<<b = a*2^b)
        System.out.println(6 >> 1);// right shift operator formula (a>>b) = a/2^b)

        // find even and odd with the help of bits
        int bitMask = 1;
        int num = 3;
        if ((bitMask & num) == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        //Get ith bit
        // int n=5;
        // int bitmask = 1<<2;
        // if((n & bitmask) == 0){
        //     System.out.println("0");
        // }else{
        //     System.out.println("1");
        // }
        getIthBit(10, 2);
        setIthBit(10, 2);
        clearIthBit(10, 2);

    }
    public static void getIthBit(int n,int i){
        int bitMask = n & 1<<i;
        if(bitMask == 0){
            System.out.println("0");

        }else{
            System.out.println("1");
        }
    }
    public static void setIthBit(int n,int i){
        int bitMask = n|1<<i;
        System.out.println(bitMask);
    }
    public static void clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        System.out.println(n & bitMask); 
    }
}
