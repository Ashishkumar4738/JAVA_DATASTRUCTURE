import java.util.*;

public class MaxLenChainofPairs {
    public static void main(String[] args) {
        int pairs[][] = {
                { 5, 24 },
                { 39, 60 },
                { 5, 28 },
                { 27, 40 },
                { 50, 90 }
        };
        int len = 1;
        Arrays.sort(pairs,Comparator.comparing(o->o[1]));
        print(pairs);
        int preLast = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(preLast<pairs[i][0]){
                len++;
                preLast = pairs[i][1];
            }
        }
        System.out.println(len);

    }
    static void print(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
