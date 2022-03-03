package kz.home.ys.algo.easy.generateDocument;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GenerateDocumentTest {

    @Test
    public void testGenerateDocument() {
        boolean canGenerateDocument = new GenerateDocument()
                .generateDocument("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!");

        assertTrue(canGenerateDocument);
    }
}