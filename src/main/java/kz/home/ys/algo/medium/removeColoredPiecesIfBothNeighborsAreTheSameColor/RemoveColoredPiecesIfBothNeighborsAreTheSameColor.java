package kz.home.ys.algo.medium.removeColoredPiecesIfBothNeighborsAreTheSameColor;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {

    public boolean winnerOfGame(String colors) {
        /*

        1 <= colors.length <= 10^5

        Approach:
        1. create linked list
        2. iterate over the list till there is movement

        time - O(N) + O(N^2)
        space - O(N)

        Input: colors = "ABBBBBBBAAA"
        bob = 5
        alice = 1

        time - O(N)
        space - O(1)

        Input: colors = "AA"
        bob = 0
        alice = 0

        Input: colors = "AAABABB"
        alice - 1
        bob - 0

        */

        int numberOfMovesOfBob = 0;
        int numberOfMovesOfAlice = 0;
        boolean isAliceTurn = true;
        char[] colorsAsArray = colors.toCharArray();
        for (int i = 1; i < colors.length() - 1; i++) {
            char prev = colorsAsArray[i - 1];
            char curr = colorsAsArray[i];
            char next = colorsAsArray[i + 1];
            if (curr == next && prev == next) {
                if (prev == 'A') {
                    numberOfMovesOfAlice++;
                } else {
                    numberOfMovesOfBob++;
                }
            }
        }

        return numberOfMovesOfAlice > numberOfMovesOfBob;
    }
}
