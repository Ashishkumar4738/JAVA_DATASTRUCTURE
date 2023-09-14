import java.util.*;

public class Butterfly {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int n = ch.nextInt();
        ch.close();
        // int m = ch.nextInt();
        int m = n + n + 1;
        int j, k, l;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= (m + i) - m; j++) {
                System.out.print(" * ");
            }
            for (k = j; k <= m - i; k++) {
                System.out.print("   ");
            }
            for (l = k; l <= m; l++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 1; i--) {
            for (j = 1; j <= (m + i) - m; j++) {
                System.out.print(" * ");
            }
            for (k = j; k <= m - i; k++) {
                System.out.print("   ");
            }
            for (l = k; l <= m; l++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        /*
         * for(int i=1;i<=n;i++){
         * for(j=1;j<(m-n)-i;j++){
         * System.out.print("   ");
         * }
         * int count =i;
         * for(k=j;k<=(m-n-1);k++){
         * 
         * System.out.print(" "+count+" ");
         * count--;
         * }
         * 
         * for(l=2;l<=i;l++){
         * 
         * System.out.print(" "+l+" ");
         * 
         * }
         * System.out.println(" ");
         * }
         * 
         * for(int i=n-1;i>=1;i--){
         * for(j=1;j<(m-n)-i;j++){
         * System.out.print("   ");
         * }
         * int count =i;
         * for(k=j;k<=(m-n-1);k++){
         * 
         * System.out.print(" "+count+" ");
         * count--;
         * }
         * 
         * for(l=2;l<=i;l++){
         * 
         * System.out.print(" "+l+" ");
         * 
         * }
         * System.out.println(" ");
         * }
         */
    }
}
