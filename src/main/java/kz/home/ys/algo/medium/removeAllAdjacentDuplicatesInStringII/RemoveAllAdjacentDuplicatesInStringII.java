package kz.home.ys.algo.medium.removeAllAdjacentDuplicatesInStringII;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInStringII {

    public String removeDuplicates(String s, int k) {
        Stack<LetterToCount> lettersToCounts = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (lettersToCounts.isEmpty()) {
                lettersToCounts.push(new LetterToCount(letter, 1));
                continue;
            }
            LetterToCount letterToCount = lettersToCounts.peek();

            if (letterToCount.getLetter() == letter) {
                letterToCount.setCount(letterToCount.getCount() + 1);
            } else {
                lettersToCounts.push(new LetterToCount(letter, 1));
            }

            if (letterToCount.getCount() == k) {
                lettersToCounts.pop();
            }
        }

        StringBuilder withoutAdjacentDuplicates = new StringBuilder();
        for (LetterToCount letterToCount : lettersToCounts) {
            for (int i = 0; i < letterToCount.getCount(); i++) {
                withoutAdjacentDuplicates.append(letterToCount.getLetter());
            }
        }

        return withoutAdjacentDuplicates.toString();
    }
}

class LetterToCount {
    private final char letter;
    private int count;

    public LetterToCount(char letter, int count) {
        this.letter = letter;
        this.count = count;
    }

    public char getLetter() {
        return letter;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}