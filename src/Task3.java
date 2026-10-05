public class Task3 {

    public static void generateBrackets(String current, int opened, int closed, int n) {
        if (current.length() == 2 * n) {
            System.out.println(current);
            return;
        }

        if (opened < n) {
            generateBrackets(current + "(", opened + 1, closed, n);
        }

        if (closed < opened) {
            generateBrackets(current + ")", opened, closed + 1, n);
        }
    }

    public static void main(String[] args) {
        generateBrackets("", 0, 0, 3);
    }
}
