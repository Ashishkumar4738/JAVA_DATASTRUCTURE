//Create 2D array
import java.util.*;
public class C_12 {
    public static void main(String[] args) {
        int matrix [][] = new int[3][3];
        System.out.println("enter array elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        sc.close();
        printArray(matrix);
    }
    public static void printArray(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
