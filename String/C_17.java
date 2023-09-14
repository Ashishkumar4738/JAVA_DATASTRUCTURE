//for a given string convert each the first letter each word to uppercase.
public class C_17 {

    public static void toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));//this line print spaces
                ch = Character.toUpperCase(str.charAt(i+1));
                i++;
                sb.append(ch);
            }else{
                ch = str.charAt(i);
                sb.append(ch);
            }
        }
        System.out.println(sb);

    }
    public static void main(String[] args) {
        String str = "hi, i am ashsih";
        toUpperCase(str);
    }
}
