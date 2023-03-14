package problem_kit.hash;

public class Pokemon {

    static private void grade(int input, int output) {
        Boolean equals = input == output;
        if (equals) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    static public int solution(int[] nums) {
        boolean[] existence = new boolean[200001];
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!existence[nums[i]]) {
                answer++;
                existence[nums[i]] = true;
            }
        }
        return nums.length / 2 < answer ? nums.length / 2 : answer;
    }

    static public void main(String args[]) {
        int[] input1 = {3, 1, 2, 3};
        int[] input2 = {3, 3, 3, 2, 2, 4};
        int[] input3 = {3, 3, 3, 2, 2, 2};
        int output1 = 2;
        int output2 = 3;
        int output3 = 2;
        grade(solution(input1), output1);
        grade(solution(input2), output2);
        grade(solution(input3), output3);
    }

}
