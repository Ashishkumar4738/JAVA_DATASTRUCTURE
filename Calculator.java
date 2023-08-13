import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculate(a,b);
        sc.close();
    }

    public static void calculate(int a ,int b){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choice from this list");
        System.out.println("1. Addition\n2. Subtraction\n3. Division\n4. Multiplication");
        int choice=sc.nextInt();
        switch(choice){
            case 1:{
                int c=a+b;
                System.out.println("Addition of two number is "+c);
                break;
            }
            case 2:{
                int c=a-b;
                System.out.println("Subtraction of two number is "+c);
                break;
            }
            case 3:{
                int c=a/b;
                System.out.println("Divison of two number is "+c);
                break;
            }
            case 4:{
                int c=a*b;
                System.out.println("Multiplication of two number is "+c);
                break;
            }
            default :{
                
                System.out.println("Please enter a valid choice");
                System.out.println("Enter y for yes and n for no");
                String target=sc.next();
                if("Y".equals(target)||"y".equals(target)){
                    calculate(a,b);
                }
                else 
                break;
            }
        }
        sc.close();
    }
}
