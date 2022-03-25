package kz.home.ys.algo.hard.topologicalSort;

import java.util.*;

class TopologicalSortDFS {

    // time - O(J + D) - where J is number of jobs and D is number of dependencies
    // space - O(J + D)
    public List<Integer> topologicalSort(List<Integer> jobs, List<Integer[]> deps) {
        JobGraph jobGraph = createTopologicalGraph(jobs, deps);
        return getOrderedJobs(jobGraph);
    }

    private JobGraph createTopologicalGraph(List<Integer> jobs, List<Integer[]> deps) {
        JobGraph jobGraph = new JobGraph(jobs);
        for (Integer[] dep : deps) {
            jobGraph.addPrereq(dep[1], dep[0]);
        }
        return jobGraph;
    }

    private List<Integer> getOrderedJobs(JobGraph jobGraph) {
        List<Integer> orderedJobs = new ArrayList<>();
        List<JobNode> nodes = new ArrayList<>(jobGraph.nodes);
        while (!nodes.isEmpty()) {
            JobNode node = nodes.get(nodes.size() - 1);
            nodes.remove(nodes.size() - 1);
            boolean containsCycle = depthFirstTraverse(node, orderedJobs);
            if (containsCycle) return new ArrayList<>();
        }
        return orderedJobs;
    }

    private boolean depthFirstTraverse(JobNode node, List<Integer> orderedJobs) {
        if (node.visited) return false;
        if (node.visiting) return true;
        node.visiting = true;
        for (JobNode prereqNode : node.prereqs) {
            boolean containsCycle = depthFirstTraverse(prereqNode, orderedJobs);
            if (containsCycle) return true;
        }
        node.visited = true;
        node.visiting = false;
        orderedJobs.add(node.job);
        return false;
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

