package kz.home.ys.algo.hard.reverseLinkedList;

import java.util.ArrayList;
import java.util.List;

public final class ReverseLinkedListUtils {

    public static LinkedList newLinkedList(int[] values) {
        LinkedList ll = new LinkedList(values[0]);
        LinkedList current = ll;
        for (int i = 1; i < values.length; i++) {
            current.next = new LinkedList(values[i]);
            current = current.next;
        }
        return ll;
    }

    public static List<Integer> toArrayList(LinkedList ll) {
        List<Integer> arr = new ArrayList<>();
        LinkedList current = ll;
        while (current != null) {
            arr.add(current.value);
            current = current.next;
        }
        return arr;
    }

    public static boolean arraysEqual(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) return false;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) return false;
        }
        return true;
    }
}
