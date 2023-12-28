package kz.home.ys.algo.medium.productOfTwoRunLengthEncodedArrays;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class ProductOfTwoRunLengthEncodedArraysTest extends TestCase {

    public void testFindRLEArray() {
        List<List<Integer>> expected = List.of(List.of(6, 6));

        List<List<Integer>> actual = new ProductOfTwoRunLengthEncodedArrays().findRLEArray(
                new int[][]{{1, 3}, {2, 3}},
                new int[][]{{6, 3}, {3, 3}}
        );

        assertMatrices(expected, actual);
    }
}