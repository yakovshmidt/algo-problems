package kz.home.ys.algo.google.googleInterviewLeetCodePremium.treesAndGraphs.wordLadder;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordLadderTrieTest {

    @Test
    public void testLadderLength() {
        int ladderLength = new WordLadderTrie().ladderLength(
                "hit",
                "cog",
                List.of("hot", "dot", "dog", "lot", "log", "cog")
        );

        assertEquals(5, ladderLength);
    }
}