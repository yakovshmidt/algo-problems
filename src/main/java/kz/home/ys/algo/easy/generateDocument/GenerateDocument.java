package kz.home.ys.algo.easy.generateDocument;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {

    // time - O(M + N) - where M is length of characters and N is length of document
    // space - O(M) - where M is length of characters
    public boolean generateDocument(String characters, String document) {
        Map<Character, Integer> charactersToCounts = mapToCharactersToCounts(characters);
        return canGenerateDocument(document, charactersToCounts);
    }

    private Map<Character, Integer> mapToCharactersToCounts(String characters) {
        Map<Character, Integer> charactersToCounts = new HashMap<>();
        for (int i = 0; i < characters.length(); i++) {
            char character = characters.charAt(i);
            charactersToCounts.put(character, charactersToCounts.getOrDefault(character, 0) + 1);
        }
        return charactersToCounts;
    }

    private boolean canGenerateDocument(String document, Map<Character, Integer> charactersToCounts) {
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            if (charactersToCounts.containsKey(character)) {
                int decrementedCount = charactersToCounts.get(character) - 1;
                if (decrementedCount < 0) {
                    return false;
                }
                charactersToCounts.put(character, decrementedCount);
            } else {
                return false;
            }
        }
        return true;
    }
}
