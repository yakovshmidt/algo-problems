package kz.home.ys.algo.hard.topologicalSort;

import java.util.*;

class TopologicalSort {

    // time - O(J + D) - where J is number of jobs and D is number of dependencies
    // space - O(J + D)
    public List<Integer> topologicalSort(List<Integer> jobs, List<Integer[]> deps) {
        JobGraph jobGraph = createTopologicalGraph(jobs, deps);
        return getOrderedJobs(jobGraph);
    }

    private JobGraph createTopologicalGraph(List<Integer> jobs, List<Integer[]> deps) {
        JobGraph jobGraph = new JobGraph(jobs);
        for (Integer[] dep : deps) {
            jobGraph.addDep(dep[0], dep[1]);
        }
        return jobGraph;
    }

    private static List<Integer> getOrderedJobs(JobGraph graph) {
        List<Integer> orderedJobs = new ArrayList<>();
        List<JobNode> jobsWithoutPrereqs = graph.getNodesWithoutPrereqs();
        while (!jobsWithoutPrereqs.isEmpty()) {
            JobNode node = jobsWithoutPrereqs.get(jobsWithoutPrereqs.size() - 1);
            jobsWithoutPrereqs.remove(jobsWithoutPrereqs.size() - 1);
            orderedJobs.add(node.job);
            removeDeps(node, jobsWithoutPrereqs);
        }
        boolean graphHasEdges = false;
        for (JobNode node : graph.nodes) {
            if (node.numOfPrereqs > 0) {
                graphHasEdges = true;
                break;
            }
        }
        return graphHasEdges ? new ArrayList<>() : orderedJobs;
    }

    private static void removeDeps(JobNode node, List<JobNode> nodesWithoutPrereqs) {
        while (!node.deps.isEmpty()) {
            JobNode dep = node.deps.get(node.deps.size() - 1);
            node.deps.remove(node.deps.size() - 1);
            dep.numOfPrereqs--;
            if (dep.numOfPrereqs == 0) {
                nodesWithoutPrereqs.add(dep);
            }
        }
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

        public void addDep(Integer job, Integer dep) {
            JobNode jobNode = getNode(job);
            JobNode depNode = getNode(dep);
            jobNode.deps.add(depNode);
            depNode.numOfPrereqs++;
        }

        public void addNode(Integer job) {
            graph.put(job, new JobNode(job));
            nodes.add(graph.get(job));
        }

        public JobNode getNode(Integer job) {
            if (!graph.containsKey(job)) addNode(job);
            return graph.get(job);
        }

        public List<JobNode> getNodesWithoutPrereqs() {
            List<JobNode> jobsWithoutPrereqs = new ArrayList<>();
            for (JobNode node : nodes) {
                if (node.numOfPrereqs == 0) {
                    jobsWithoutPrereqs.add(node);
                }
            }
            return jobsWithoutPrereqs;
        }
    }

    static class JobNode {
        public Integer job;
        public List<JobNode> deps;
        public Integer numOfPrereqs;

        public JobNode(Integer job) {
            this.job = job;
            deps = new ArrayList<>();
            numOfPrereqs = 0;
        }
    }
}

