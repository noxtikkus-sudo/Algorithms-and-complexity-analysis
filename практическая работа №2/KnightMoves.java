public class KnightMoves {

    public static int countMoves(String square) {
        int file = square.charAt(0) - 'a';
        int rank = square.charAt(1) - '1';
        int count = 0;

        int[][] jumps = {
            {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
            {1, -2}, {1, 2}, {2, -1}, {2, 1}
        };

        for (int i = 0; i < jumps.length; i++) {
            int newFile = file + jumps[i][0];
            int newRank = rank + jumps[i][1];

            if (newFile >= 0 && newFile < 8 && newRank >= 0 && newRank < 8) {
                count++;
            }
        }

        return count;
    }

    public static boolean isWhiteSquare(String square) {
        int file = square.charAt(0) - 'a';
        int rank = square.charAt(1) - '1';
        return (file + rank) % 2 == 1;
    }

    public static void printMoves(String square) {
        int file = square.charAt(0) - 'a';
        int rank = square.charAt(1) - '1';

        int[][] jumps = {
            {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
            {1, -2}, {1, 2}, {2, -1}, {2, 1}
        };

        System.out.println("Старт " + square + ": " + (isWhiteSquare(square) ? "белая" : "черная"));

        for (int i = 0; i < jumps.length; i++) {
            int newFile = file + jumps[i][0];
            int newRank = rank + jumps[i][1];

            if (newFile >= 0 && newFile < 8 && newRank >= 0 && newRank < 8) {
                String move = "" + (char) ('a' + newFile) + (char) ('1' + newRank);
                String color = isWhiteSquare(move) ? "белая" : "черная";
                System.out.println(move + " -> " + color);
            }
        }
    }

    public static void main(String[] args) {
        printMoves("e4");
    }
}
