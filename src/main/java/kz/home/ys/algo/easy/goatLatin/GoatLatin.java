package kz.home.ys.algo.easy.goatLatin;

import java.util.Set;

class GoatLatin {

    private final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        int l = 0;
        int r = 0;
        int wordNumber = 0;
        while (l < sentence.length()) {
            wordNumber++;
            while (r < sentence.length() && sentence.charAt(r) != ' ') {
                r++;
            }
            if (vowels.contains(sentence.charAt(l))) {
                sb.append(sentence, l, r);
            } else {
                char firstLetter = sentence.charAt(l);
                sb.append(sentence, l + 1, r);
                sb.append(firstLetter);
            }
            sb.append("ma");
            sb.append("a".repeat(wordNumber));
            if (r < sentence.length()) sb.append(" ");
            r++;
            l = r;
        }
        return sb.toString();
    }
}