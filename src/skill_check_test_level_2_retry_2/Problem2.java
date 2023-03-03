package skill_check_test_level_2_retry_2;

public class Problem2 {

    static private final String wordElement = "AEIOU";

    static private final int[] orderDiff = {781, 156, 31, 6, 1};

    public int solution(String word) {
        int startOrder = word.length();
        int orderAccumulation = 0;
        for (int i = 0; i < word.length(); i++) {
            orderAccumulation += wordElement.indexOf(word.charAt(i)) * orderDiff[i];
        }
        return startOrder + orderAccumulation;
    }

}
