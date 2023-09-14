package kz.home.ys.algo.medium.executionOfAllSuffixInstructionsStayingInAGrid;

class ExecutionOfAllSuffixInstructionsStayingInAGrid {

    private String s;
    private int n;

    // time - O(N^2)
    // space - O(N)
    public int[] executeInstructions(int n, int[] startPos, String s) {
        this.s = s;
        this.n = n;

        int[] ans = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ans[i] = dfs(i, new int[] {startPos[0], startPos[1]}, 0);
        }

        return ans;
    }

    private int dfs(int idx, int[] position, int numOfInstructions) {
        if (idx == s.length()) return numOfInstructions;

        char instruction = s.charAt(idx);
        if (instruction == 'R') {
            position[1]++;
        } else if (instruction == 'L') {
            position[1]--;
        } else if (instruction == 'D') {
            position[0]++;
        } else {
            position[0]--;
        }

        if (position[0] < 0 || position[0] >= n || position[1] < 0 || position[1] >= n) {
            return numOfInstructions;
        } else {
            return dfs(idx + 1, position, numOfInstructions + 1);
        }
    }
}