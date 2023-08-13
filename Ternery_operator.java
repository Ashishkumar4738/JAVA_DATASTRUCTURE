import java.util.*;

public class Ternery_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        String check = (num % 2 == 0) ? "even" : "odd";
        System.out.println("your number is " + check);
        sc.close();

    }
}
