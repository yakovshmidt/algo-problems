package kz.home.ys.algo.medium.invalidTransactions;

import java.util.ArrayList;
import java.util.List;

class InvalidTransactions {

    // time - O(N^2)
    // space - O(N)
    public List<String> invalidTransactions(String[] transactions) {
        String[] names = new String[transactions.length];
        int[] times = new int[transactions.length];
        int[] amounts = new int[transactions.length];
        String[] cities = new String[transactions.length];
        boolean[] needToAdd = new boolean[transactions.length];

        for (int i = 0; i < transactions.length; i++) {
            String[] split = transactions[i].split(",");

            names[i] = split[0];
            times[i] = Integer.parseInt(split[1]);
            amounts[i] = Integer.parseInt(split[2]);
            cities[i] = split[3];
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] > 1000) {
                needToAdd[i] = true;
            }
        }

        for (int i = 0; i < transactions.length; i++) {
            for (int j = 0; j < transactions.length; j++) {
                if (i == j) continue;

                if (names[i].equals(names[j]) && !cities[i].equals(cities[j]) && Math.abs(times[i] - times[j]) <= 60) {
                    needToAdd[i] = true;
                    needToAdd[j] = true;
                }
            }
        }

        for (int i = 0; i < transactions.length; i++) {
            if (needToAdd[i]) {
                result.add(transactions[i]);
            }
        }

        return result;
    }
}