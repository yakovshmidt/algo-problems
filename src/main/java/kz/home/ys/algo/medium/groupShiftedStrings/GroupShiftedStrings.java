package kz.home.ys.algo.medium.groupShiftedStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupShiftedStrings {

    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> hashToList = new HashMap<>();

        for (String str : strings) {
            String hashKey = getHash(str);
            if (!hashToList.containsKey(hashKey)) {
                hashToList.put(hashKey, new ArrayList<>());
            }
            hashToList.get(hashKey).add(str);
        }

        return new ArrayList<>(hashToList.values());
    }

    private String getHash(String str) {
        char[] chars = str.toCharArray();

        char shift = chars[0];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = shiftLetter(chars[i], shift);
        }

        return String.valueOf(chars);
    }

    private char shiftLetter(char letter, char shift) {
        return (char) ((letter - shift + 26) % 26 + 'a');
    }
}
