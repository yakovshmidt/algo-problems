package kz.home.ys.algo.easy.circularSentence;

class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) return false;
        }

        return sentence.charAt(0) == sentence.charAt(sentence.length() - 1); 
    }
}