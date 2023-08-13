public class RemoveDuplicateInString {

    static void removeDuplicate(String str, int idx, boolean arr[], StringBuilder newStr) {
        if (idx == str.length() - 1) {
            System.out.println(newStr);
            return;
        }
        char location = str.charAt(idx);
        if (arr[location - 'a'] == true)
            removeDuplicate(str, idx + 1, arr, newStr);
        else {
            arr[location - 'a'] = true;
            removeDuplicate(str, idx + 1, arr, newStr.append(location));
        }

    }

    public static void main(String[] args) {
        String str = "ashish";
        boolean arr[] = new boolean[26];
        StringBuilder sb = new StringBuilder();
        removeDuplicate(str, 0, arr, sb);
    }
}
