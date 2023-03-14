package problem_kit.hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Camouflage {

    static public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
        }
        Collection<Integer> values = map.values();
        return values.stream().reduce(1, (x, y) -> x * y).intValue() - 1;
    }

    static public void main(String[] args) {
        String[][] input1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] input2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
    }

}
