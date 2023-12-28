package kz.home.ys.algo.medium.accountsMerge;

import java.util.*;

class AccountsMerge {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) graph.put(i, new ArrayList<>());

        for (int i = 0; i < accounts.size(); i++) {
            for (int j = i + 1; j < accounts.size(); j++) {
                if (isConnected(accounts, i, j)) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        Set<Integer> visited = new HashSet<>();
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++) {
            if (visited.contains(i)) continue;
            Set<String> mergedAccount = new HashSet<>();
            String name = accounts.get(i).get(0);

            dfs(graph, visited, i, mergedAccount, accounts);
            mergedAccount.remove(name);

            List<String> account = new ArrayList<>(mergedAccount);
            Collections.sort(account);
            List<String> accountWithName = new ArrayList<>();
            accountWithName.add(name);
            accountWithName.addAll(account);
            result.add(accountWithName);
        }

        return result;
    }

    private void dfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int i, Set<String> mergedAccount, List<List<String>> accounts) {
        if (visited.contains(i)) return;
        visited.add(i);

        mergedAccount.addAll(accounts.get(i));

        for (int neighbour : graph.get(i)) {
            dfs(graph, visited, neighbour, mergedAccount, accounts);
        }
    }

    private boolean isConnected(List<List<String>> accounts, int i, int j) {
        Set<String> first = new HashSet<>(accounts.get(i));
        Set<String> second = new HashSet<>(accounts.get(j));
        for (String firstVal : first) {
            if (!firstVal.contains("@")) continue;
            if (second.contains(firstVal)) return true;
        }
        return false;
    }
}