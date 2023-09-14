//String functions use practice
public class C_16 {
    // equals() method
    public static void equal(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Your string are equal");
        } else {
            System.out.println("your string are not equal");
        }
    }

    // charAt() method
    public static void charat(String str1, char key) {
        int i = 0;
        for (i = 0; i < str1.length(); i++) {
            if (key == str1.charAt(i)) {
                System.out.println("Your character found at index " + i);
                break;
            }
        }
        if (i == str1.length()) {
            System.out.println("Your character not present in this string");
        }
    }

    // substring() method
    public static void subString(String str1, int st, int en) {
        String str = str1.substring(st, en);
        System.out.println("Sub String is " + str);
    }
    // compareToIgnoreCase() method 
    public static void compareto(String str1[]) {
        String max = str1[0];
        for (int i = 1; i < str1.length; i++) {
            if(max.compareToIgnoreCase(str1[i]) < 0 ){
                max = str1[i];
            }
        }
        System.out.println("Maximum String is "+max);
    }

    // main() method
    public static void main(String[] args) {
        String str1 = "Hello this is first string";
        String str2 = "Hello this is second string";
        String arr[] = {"Banana","Orange","Pear","apple"};
        equal(str1, str2);
        charat(str1, 'f');
        subString(str1, 5, 14);
        compareto(arr);
    }
}
