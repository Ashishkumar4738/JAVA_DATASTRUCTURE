public class TilingProblem{

    static int problem(int n){
        if(n==0||n==1) return 1;

        //horizantol
        int ver = problem(n-1);
        System.out.println("ver "+ver);

        //vertical
        int hor = problem(n-2);
        System.out.println("ver "+hor);
        int result = hor + ver;
        return result;

        //return problem(n-1)+problem(n-2);
    }

    public static void main(String[] args) {
       System.out.println(problem(4));
    }
}