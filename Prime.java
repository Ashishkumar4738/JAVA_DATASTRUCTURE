import java.util.*;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter your number to check number is or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        p(num);
        sc.close();
        // int result=check(num,next);

    }

    public static void p(int num) {
        int i = 0;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("your number is not prime number");
                break;
            }
        }
        if (num == i) {
            System.out.println("Your number is a prime number");

        }
    }


}
