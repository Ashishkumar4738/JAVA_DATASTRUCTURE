
public class C_15 {

    public static void palindrome(String str){
        //this function is for palindrome 
        int length = str.length() - 1;
        int i = 0;
        for (i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i)) {
                System.out.println("Your string is not palindrome");
                break;
            }
        }
        if (i >= str.length() / 2) {
            System.out.println("your string is palindrome");
        }
    }

    public static void checkShortestPath(String str){
        double startX = 0;
        double startY = 0;
        double x=0;
        double y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 's'){
                y--;
            }else if(str.charAt(i)=='n'){
                y++;
            }else if(str.charAt(i)=='e'){
                x++;

            }else if(str.charAt(i)=='w'){
                x--;
            }

        }
        double route = Math.sqrt(Math.pow((x-startX),2) + Math.pow((y-startY),2));
        System.out.println("The shortest route is "+route);
    }

    public static void main(String[] args) {
        String str = "racecar";
        String destination = "wneenesennn";
        palindrome(str);
        checkShortestPath(destination);
    }
}
