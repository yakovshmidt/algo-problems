package kz.home.ys.algo.medium.revealCardsInIncreasingOrder;

import java.util.Arrays;
import java.util.LinkedList;

class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        LinkedList<Integer> index = new LinkedList<>();
        for (int i = 0; i < deck.length; i++) {
            index.add(i);
        }

        int[] ans = new int[deck.length];
        Arrays.sort(deck);
        for (int card : deck) {
            ans[index.pollFirst()] = card;
            if (!index.isEmpty()) index.add(index.pollFirst());
        }

        return ans;
    }
}