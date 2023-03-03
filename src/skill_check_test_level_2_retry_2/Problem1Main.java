package skill_check_test_level_2_retry_2;

import java.util.Arrays;

public class Problem1Main {

    static public void grade(int[] input, int[] output) {
        Boolean equals = Arrays.equals(input, output);
        if (equals) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    static public void main(String[] args) {
        Problem1 problem1 = new Problem1();
        int inputRowSize = 6;
        int inputColSize = 4;
        int[][] inputPicture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        int[] output = {4, 5};
        grade(problem1.solution(inputRowSize, inputColSize, inputPicture), output);
    }

}
