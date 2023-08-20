public class FindPermutation {

    static void findPermutation(String str, String newStr, int n){
        if(n==str.length()){
            System.out.println(newStr);
            return;
        }
        //choice choose next character
        findPermutation(str, newStr+str.charAt(n), n+1);
        //not choose next character
        findPermutation(str, newStr, n+1);

    }

    public static void main(String[] args) {
        findPermutation("abc", "", 0);
    }
}
