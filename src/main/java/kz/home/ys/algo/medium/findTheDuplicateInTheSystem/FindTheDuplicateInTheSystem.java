package kz.home.ys.algo.medium.findTheDuplicateInTheSystem;

import java.util.*;

class FindTheDuplicateInTheSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        /*
        
        Constraints:
        * -----

        Approach:
        1) iterate over paths array
        2) Map<File Content, Map<File Path, File Name>>

        Example: "root/a 1.txt(abcd) 2.txt(efgh)"
        mapOf(
            "abcd" to Map(
                "root/a" to "1.txt",
                "root/c" to "3.txt"
                ), 
            "efgh" to Map(
                "root/a" to "2.txt",
                "root/c/d" to "4.txt(efgh)"
                ), 
            )
            take "root/a 3.txt(abcd)","root/c/d 4.txt(efgh)"

        Time: O(N) * O(MAX(path[i].length))

        Space: O(N)???

        */

        Map<String, ArrayList<String>> contentToPaths = new HashMap<>();
        for (String path : paths) {
            String[] splitPath = path.split(" ");
            String dir = splitPath[0];

            for (int j = 1; j < splitPath.length; j++) {
                String fileNameToContent = splitPath[j];
                String[] splitFileNameToContent = fileNameToContent.split("\\(");
                String fileName = splitFileNameToContent[0];
                String content = splitFileNameToContent[1].split("\\)")[0];
                contentToPaths.putIfAbsent(content, new ArrayList<>());
                contentToPaths.get(content).add(dir + fileName);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (var entry : contentToPaths.entrySet()) {
            if (entry.getValue().size() > 1) {
                result.add(entry.getValue());
            }
        }

        return result; 
    }
}