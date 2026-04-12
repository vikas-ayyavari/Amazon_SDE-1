//1320. Minimum Distance to Type a Word Using Two Fingers
import java.util.Arrays;

class Solution {
    private static final int FREE = 26;
    private static final int SIZE = 27;
    private static final int INF = 1_000_000_000;

    private int distance(int from, int to) {
        if (from == FREE || to == FREE) {
            return 0;
        }

        return Math.abs(from / 6 - to / 6) + Math.abs(from % 6 - to % 6);
    }

    public int minimumDistance(String word) {
        int[] dp = new int[SIZE];
        Arrays.fill(dp, INF);
        dp[FREE] = 0;

        for (int i = 1; i < word.length(); i++) {
            int prev = word.charAt(i - 1) - 'A';
            int cur = word.charAt(i) - 'A';
            int[] next = new int[SIZE];
            Arrays.fill(next, INF);

            for (int other = 0; other < SIZE; other++) {
                if (dp[other] == INF) {
                    continue;
                }

                next[other] = Math.min(next[other], dp[other] + distance(prev, cur));
                next[prev] = Math.min(next[prev], dp[other] + distance(other, cur));
            }

            dp = next;
        }

        int answer = INF;
        for (int value : dp) {
            answer = Math.min(answer, value);
        }
        return answer;
    }
}
