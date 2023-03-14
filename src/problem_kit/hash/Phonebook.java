package problem_kit.hash;

import java.util.Arrays;

public class Phonebook {

    static private void grade(boolean input, boolean output) {
        Boolean equals = input == output;
        if (equals) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    static public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }

    static public void main(String[] args) {
        String[] input1 = {"119", "97674223", "1195524421"};
        String[] input2 = {"123", "456", "789"};
        String[] input3 = {"12", "123", "1235", "567", "88"};
        boolean output1 = false;
        boolean output2 = true;
        boolean output3 = false;
        grade(solution(input1), output1);
        grade(solution(input2), output2);
        grade(solution(input3), output3);
    }

}
