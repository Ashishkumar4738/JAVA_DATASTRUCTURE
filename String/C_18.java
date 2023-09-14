// compress a String itno numbers of repetation of words continusoly.

public class C_18 {

    public static void allAlphabet() {
        StringBuilder sb = new StringBuilder("");
        for (char i = 'a'; i <= 'z'; i++) {
            //System.out.print(i + " ");
            sb.append(i);
            sb.append(' ');
        }
        System.out.println(sb);
    }

    public static void compression(String str) {
        char firstLetter = str.charAt(0);
        StringBuilder sb = new StringBuilder("");
        sb.append(str.charAt(0));
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (firstLetter == str.charAt(i)) {
                count++;
            } else {
                sb.append(count);
                sb.append(str.charAt(i));
                count = 1;
                firstLetter = str.charAt(i);
            }
        }
        sb.append(count);
        System.out.println(sb);

    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        compression(str);
        allAlphabet();
    }
}
