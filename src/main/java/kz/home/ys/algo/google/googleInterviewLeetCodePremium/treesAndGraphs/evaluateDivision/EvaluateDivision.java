package kz.home.ys.algo.google.googleInterviewLeetCodePremium.treesAndGraphs.evaluateDivision;

import java.util.*;

public class EvaluateDivision {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            double value = values[i];

            graph.putIfAbsent(equation.get(0), new HashMap<>());
            graph.putIfAbsent(equation.get(1), new HashMap<>());

            graph.get(equation.get(0)).put(equation.get(1), value);
            graph.get(equation.get(1)).put(equation.get(0), 1.0 / value);
        }

        double[] result = new double[queries.size()];
        Arrays.fill(result, -1.0);
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String from = query.get(0);
            String to = query.get(1);

            Stack<Pair> stack = new Stack<>();
            stack.add(new Pair(from, 1.0));
            Set<String> visited = new HashSet<>();

            while (!stack.isEmpty()) {
                Pair curr = stack.pop();

                if (!graph.containsKey(curr.getFirst())) {
                    result[i] = -1.0;
                    continue;
                }

                Map<String, Double> next = graph.get(curr.getFirst());
                for (Map.Entry<String, Double> entry : next.entrySet()) {
                    String key = entry.getKey();

                    if (!graph.containsKey(key)) {
                        result[i] = -1.0;
                        break;
                    }

                    if (visited.contains(key)) {
                        continue;
                    }
                    visited.add(key);

                    if (key.equals(to)) {
                        result[i] = curr.getSecond() * entry.getValue();
                    } else {
                        stack.add(new Pair(key, curr.getSecond() * entry.getValue()));
                    }
                }
            }
        }

        return result;
    }
}