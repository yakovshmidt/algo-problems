package kz.home.ys.algo.easy.keyboardRow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class KeyboardRow {

    // time - O(WORDS_SIZE * ROWS_SIZE (always 3) * AVERAGE_WORD_LENGTH)
    // space - O(ROWS) + O(RESULTED_LIST_SIZE) -> O(RESULTED_LIST_SIZE)
    public String[] findWords(String[] words) {
        List<Set<Character>> rows = List.of(
            Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'),
            Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'),
            Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M')
        );

        List<String> result = new ArrayList<>();
        for (String word : words) {
            boolean isOnOneRowWord = true;
            char firstLetter = word.charAt(0);
            Set<Character> row = new HashSet<>();
            for (Set<Character> currRow : rows) {
                row = currRow;
                if (row.contains(firstLetter)) {
                    break;
                }
            }

            for (char letter : word.toCharArray()) {
                if (!row.contains(letter)) {
                    isOnOneRowWord = false;
                    break;
                }
            }

            if (isOnOneRowWord) result.add(word);
        }

        String[] resultAsArray = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultAsArray[i] = result.get(i);
        }
        return resultAsArray;
    }
}