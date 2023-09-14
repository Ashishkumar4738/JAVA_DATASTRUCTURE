//linear search
import java.util.*;

public class C_1 {
    public static void main(String[] args) {
        String menu[] = { "samosa", "burger", "pizza", "tea", "biryani" };
        System.out.println("Enter your food type");
        Scanner sc = new Scanner(System.in);
        String food = sc.next();
        sc.close();
        int i = 0;
        for (i = 0; i < menu.length; i++) {
            if (food.equals(menu[i])) {
                System.out.println("Your " + food + " is available at index " + i);
                break;
            }
        }
        if (i == menu.length) {
            System.out.println("Your food is not present in our menu :( ");
        }
        

    }
}
