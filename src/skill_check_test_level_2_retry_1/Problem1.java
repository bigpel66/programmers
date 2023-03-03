package skill_check_test_level_2_retry_1;

public class Problem1 {

    static private final Integer mod = 1000000007;

    public int solution(int n) {
        int[] dp = new int[60000 + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= 60000; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }
        return dp[n];
    }

}
