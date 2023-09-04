
public class IndianCoins {
    public static void main(String[] args) {
        int coins[] = {2000,500,200,100,50,20,10,5,2,1};
        int v = 121;
        int i = 0;
        while(v>0){
            if(coins[i]>v) i++;
            else{
                while (coins[i]<=v) {
                    v-=coins[i];
                    System.out.print(coins[i]+" ");
                }
            }
        }        
    }
}
