public class ApplyArray {
    public static void updateMarks(int mark[]) {
        for (int i = 0; i < mark.length; i++) {
            // int temp=mark[i];
            mark[i] += 1;
        }
    }

    public static void printArray(int mark[]) {
        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }
    }

    public static void main(String[] args) {
        int marks[] = { 34, 57, 34, 23 };
        updateMarks(marks);
        printArray(marks);

    }
}
