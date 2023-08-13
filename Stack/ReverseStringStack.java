import java.util.*;
public class ReverseStringStack {

    public static void main(String[] args) {
        String str = "abc";
        Stack<String> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(String.valueOf(str.charAt(i)));
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        System.out.println(sb);
    }
}
