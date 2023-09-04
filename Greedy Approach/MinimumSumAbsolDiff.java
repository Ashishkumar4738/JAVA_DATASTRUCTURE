import java.util.*;
public class MinimumSumAbsolDiff {
    public static void main(String[] args) {
        int a[] = {1,3,2};
        int b[] = {2,1,3};
        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += Math.abs(a[i]-b[i]) ;
        }
        System.out.println(sum);
    }
}
