import java.util.*;
public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "{{()]}}";
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{'){
                s.push(str.charAt(i));
            }
            else if(s.peek()=='('&&str.charAt(i)==')'){
                s.pop();
            }
            else if(s.peek()=='['&&str.charAt(i)==']'){
                s.pop();
            }
            else if(s.peek()=='{'&&str.charAt(i)=='}'){
                s.pop();
            }else {
                System.out.println("false");
                break;
            }
        }
        
    }
}
