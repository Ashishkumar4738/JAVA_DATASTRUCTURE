import java.util.*;
import java.util.LinkedList;
public class NonReapeting {
    public static void main(String[] args) {
        String str = "aabccxb";
        // we need to find first non reapeating alaphabet in string
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            q.add(currchar);
            freq[currchar-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1) q.remove();
            if(q.isEmpty()) System.out.print("-1 ");
            else System.out.print(q.peek()+" ");
        }
    }
}
