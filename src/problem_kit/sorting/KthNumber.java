package problem_kit.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KthNumber {

    static private void grade(int[] input, int[] output) {
        Boolean equals = Arrays.equals(input, output);
        if (equals) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    static public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = Arrays.stream(array).mapToObj(e -> e).collect(Collectors.toList());
            List<Integer> subList = list.subList(commands[i][0] - 1, commands[i][1]);
            subList.sort(Comparator.naturalOrder());
            answer.add(subList.get(commands[i][2] - 1));
        }
        return answer.stream().mapToInt(e -> e).toArray();
    }

    static public void main(String[] args) {
        int[] input = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] output = {5, 6, 3};
        grade(solution(input, commands), output);
    }

}
