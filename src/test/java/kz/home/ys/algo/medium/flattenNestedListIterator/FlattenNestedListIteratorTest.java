package kz.home.ys.algo.medium.flattenNestedListIterator;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlattenNestedListIteratorTest {

    @Test
    public void testFlattenNestedListIterator() {
        FlattenNestedListIterator iterator = new FlattenNestedListIterator(
                List.of(
                        new NestedInteger() {
                            @Override
                            public boolean isInteger() {
                                return true;
                            }

                            @Override
                            public Integer getInteger() {
                                return 1;
                            }

                            @Override
                            public List<NestedInteger> getList() {
                                return null;
                            }
                        },
                        new NestedInteger() {
                            @Override
                            public boolean isInteger() {
                                return false;
                            }

                            @Override
                            public Integer getInteger() {
                                return null;
                            }

                            @Override
                            public List<NestedInteger> getList() {
                                return List.of(
                                        new NestedInteger() {
                                            @Override
                                            public boolean isInteger() {
                                                return true;
                                            }

                                            @Override
                                            public Integer getInteger() {
                                                return 2;
                                            }

                                            @Override
                                            public List<NestedInteger> getList() {
                                                return null;
                                            }
                                        },
                                        new NestedInteger() {
                                            @Override
                                            public boolean isInteger() {
                                                return true;
                                            }

                                            @Override
                                            public Integer getInteger() {
                                                return 3;
                                            }

                                            @Override
                                            public List<NestedInteger> getList() {
                                                return null;
                                            }
                                        }
                                );
                            }
                        }
                )
        );

        Assert.assertEquals(1, iterator.next().intValue());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(2, iterator.next().intValue());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(3, iterator.next().intValue());
        Assert.assertFalse(iterator.hasNext());
    }
}