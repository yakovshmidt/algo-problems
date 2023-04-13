package kz.home.ys.algo.medium.simplifyPath;

import java.util.LinkedList;

class SimplifyPath {
    public String simplifyPath(String path) {
        /* 
        
        Constraints:
            length of path -> from 1 to 3000 inclusively
            letters of path -> lower cased letters, /, ., _

        "/home/../bar/.//foo/"

        /bar/foo 

        Approach: 
        split by / -> [home , .. , bar , . , "" , "foo"]

        foo
        bar

        /bar/foo

        time - O(N)
        space - O(N)

        */

        // "/home/../bar/.//foo/" -> [home , .. , bar , . , "" , "foo"]
        String[] splitPath = path.split("/");
        LinkedList<String> deque = new LinkedList<>();
        for (String pathPart : splitPath) {
            if (pathPart.equals("..")) {
                if (!deque.isEmpty()) deque.removeLast();
            } else if (pathPart.isEmpty() || pathPart.equals(".")) {
                // do nothing
            } else {
                deque.addLast(pathPart);
            }
        }

        if (deque.isEmpty()) return "/";

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            String pathPart = deque.removeFirst();
            sb.append("/").append(pathPart);
        }

        return sb.toString();
    }
}