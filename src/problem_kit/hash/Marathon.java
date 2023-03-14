package problem_kit.hash;

import java.util.HashMap;
import java.util.Map;

public class Marathon {

    static private void grade(String input, String output) {
        Boolean equals = input.equals(output);
        if (equals) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    static public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            int count = map.getOrDefault(participant[i], 0);
            map.put(participant[i], count + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            int count = map.get(completion[i]);
            if (count - 1 == 0) {
                map.remove(completion[i]);
            } else {
                map.replace(completion[i], count - 1);
            }
        }
        final String[] answer = new String[1];
        map.forEach((key, val) -> {
            answer[0] = key;
        });
        return answer[0];
    }

    static public void main(String[] args) {
        String[] input1 = {"leo", "kiki", "eden"};
        String[] input2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] input3 = {"mislav", "stanko", "mislav", "ana"};
        String[] semiInput1 = {"eden", "kiki"};
        String[] semiInput2 = {"josipa", "filipa", "marina", "nikola"};
        String[] semiInput3 = {"stanko", "ana", "mislav"};
        String output1 = "leo";
        String output2 = "vinko";
        String output3 = "mislav";
        grade(solution(input1, semiInput1), output1);
        grade(solution(input2, semiInput2), output2);
        grade(solution(input3, semiInput3), output3);
    }

}
