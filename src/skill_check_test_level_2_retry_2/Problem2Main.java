package skill_check_test_level_2_retry_2;

public class Problem2Main {

    static public void grade(int input, int output) {
        Boolean equals = input == output;
        if (equals) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    static public void main(String[] args) {
        Problem2 problem2 = new Problem2();
        String input1 = "AAAAE";
        int output1 = 6;
        String input2 = "AAAE";
        int output2 = 10;
        String input3 = "I";
        int output3 = 1563;
        String input4 = "EIO";
        int output4 = 1189;
        grade(problem2.solution(input1), output1);
        grade(problem2.solution(input2), output2);
        grade(problem2.solution(input3), output3);
        grade(problem2.solution(input4), output4);
    }

}
