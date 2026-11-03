public class Histogram {

    public static void printHistogram(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printHistogram(new int[]{2, 4});
    }
}
