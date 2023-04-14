package kz.home.ys.algo.medium.subdomainVisitCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SubdomainVisitCount {

    // time - O(N)
    // space - O(N)
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> domainsToCounts = new HashMap<>();
        for (String d : cpdomains) {
            String[] numberOfVisitsToDomain = d.split("\\s");
            int numberOfVisits = Integer.parseInt(numberOfVisitsToDomain[0]);
            String[] frags = numberOfVisitsToDomain[1].split("\\.");
            String curr = "";
            for (int i = frags.length - 1; i >= 0; i--) {
                curr = frags[i] + (i < frags.length - 1 ? "." : "") + curr;
                domainsToCounts.put(curr, domainsToCounts.getOrDefault(curr, 0) + numberOfVisits);
            }
        }

        List<String> result = new ArrayList<>();
        for (var entry : domainsToCounts.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        return result;
    }
}