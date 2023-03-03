package skill_check_test_level_2_retry_1;

public class Problem1Main {

    static public void grade(Integer input, Integer output) {
        Boolean equals = input == output;
        if (equals) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    static public void main(String[] args) {
        Problem1 problem1 = new Problem1();
        Integer input = 4;
        Integer output = 5;
        grade(problem1.solution(input), output);
    }

}
