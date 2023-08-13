
public class FindSubsets {

    static void findSubsetsInString(String str, String newString, int n) {
        if (n == str.length()) {
            if (newString.length() == 0) {
                System.out.println("null");

            } else {
                System.out.println(newString);

            }
            return;
        }
        // yes choice
        findSubsetsInString(str, newString + str.charAt(n), n + 1);
        // no choice
        findSubsetsInString(str, newString, n + 1);
    }

    public static void main(String[] args) {
        findSubsetsInString("abc", "", 0);
    }
}
