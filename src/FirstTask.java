public class FirstTask {

    public static int money(int first, int difference, int n) {
        if (n == 0) {
            return first;
        }
        return money(first, difference, n - 1) + difference;
    }

    public static void main(String[] args) {
        System.out.println("День 3: " + money(3, 4, 3));
    }
}
