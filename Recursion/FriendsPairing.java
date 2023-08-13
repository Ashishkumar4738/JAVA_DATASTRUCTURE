public class FriendsPairing {

    static int pair(int n){
        if(n==0||n==1) return n;
        // //single
        // int single = pair(n-1);
        // //int
        // int p = (n-1)*pair(n-2);
        // return single+p;
        //or second approach
        return pair(n-1)+(n-1)*pair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(pair(4));
    }
}
