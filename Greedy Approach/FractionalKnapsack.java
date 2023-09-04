import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};        
        int w = 50;
        double fraction[][] = new double[val.length][val.length];
        for(int i=0;i<val.length;i++){
            fraction[i][0] = i;
            fraction[i][1] = val[i]/(double)weight[i];
        }
        Arrays.sort(fraction,Comparator.comparingDouble(o->o[1]));
        int totalProfit = 0;
        for(int i=fraction.length-1;i>=0;i--){
            int idx = (int) fraction[i][0];
            if(w>=weight[idx]){
                totalProfit += val[idx];
                w -= weight[idx];
            }else{
                totalProfit += (int) fraction[i][1]*w;
                break;
            }
        }
        System.out.println("total Profit "+totalProfit);
    }
}
