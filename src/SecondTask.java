public class SecondTask {

    public static int findMax(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }

        int maxRight = findMax(array, index + 1);

        if (array[index] > maxRight) {
            return array[index];
        } else {
            return maxRight;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, -1, 7, 2};
        System.out.println("Максимум: " + findMax(numbers, 0));
    }
}
