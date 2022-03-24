package kz.home.ys.algo.hard.topologicalSort;

import java.util.*;

class TopologicalSort {

    public List<Integer> topologicalSort(List<Integer> jobs, List<Integer[]> deps) {
        // create job graph
        // get ordered jobs

        return new ArrayList<>();
    }

    static class JobGraph {
        public List<JobNode> nodes;
        public Map<Integer, JobNode> graph;

        public JobGraph(List<Integer> jobs) {
            nodes = new ArrayList<>();
            graph = new HashMap<>();
            for (Integer job : jobs) {
                addNode(job);
            }
        }

        public void addPrereq(Integer job, Integer prereq) {
            JobNode jobNode = getNode(job);
            JobNode prereqNode = getNode(prereq);
            jobNode.prereqs.add(prereqNode);
        }

        public void addNode(Integer job) {
            graph.put(job, new JobNode(job));
            nodes.add(graph.get(job));
        }

        public JobNode getNode(Integer job) {
            if (!graph.containsKey(job)) addNode(job);
            return graph.get(job);
        }
    }

    static class JobNode {
        public Integer job;
        public List<JobNode> prereqs;
        public boolean visited;
        public boolean visiting;

        public JobNode(Integer job) {
            this.job = job;
            prereqs = new ArrayList<>();
            visited = false;
            visiting = false;
        }
    }
}

