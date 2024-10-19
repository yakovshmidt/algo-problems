package kz.home.ys.algo.medium.removeSubFoldersFromTheFilesystem;

import junit.framework.TestCase;

import java.util.Collections;
import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertLists;

public class RemoveSubFoldersFromTheFilesystemTest extends TestCase {

    public void testRemoveSubfolders() {
        List<String> actual = new RemoveSubFoldersFromTheFilesystem()
                .removeSubfolders(new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"});
        Collections.sort(actual);

        List<String> expected = List.of("/a","/c/d","/c/f");

        assertLists(expected, actual);
    }
}