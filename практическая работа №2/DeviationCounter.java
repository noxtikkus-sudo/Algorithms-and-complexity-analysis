public class DeviationCounter {

    public static int[] count(int[] data) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                positive++;
            } else if (data[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        return new int[]{positive, negative, zero};
    }

    public static void main(String[] args) {
        int[] data = {-2, 0, 3, 0};
        int[] result = count(data);
        System.out.println("положительных " + result[0]);
        System.out.println("отрицательных " + result[1]);
        System.out.println("нулевых " + result[2]);
    }
}
