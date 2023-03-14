package problem_kit.hash;

import java.util.*;

public class BestAlbum {

    static private void grade(int[] input, int[] output) {
        Boolean equals = Arrays.equals(input, output);
        if (equals) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    static public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genresMap = generateGenresMap(genres, plays);
        Map<String, Map<Integer, Integer>> idPlaysMap = generateIdPlaysMap(genres, plays);
        List<String> ordered = genresOrderByPlays(genresMap);
        return generateAlbum(ordered, idPlaysMap);
    }

    static public Map<String, Integer> generateGenresMap(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        return map;
    }

    static public Map<String, Map<Integer, Integer>> generateIdPlaysMap(String[] genres, int[] plays) {
        Map<String, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            Map<Integer, Integer> entry = map.getOrDefault(genres[i], null);
            if (entry == null) {
                entry = new HashMap<>();
            }
            entry.put(i, plays[i]);
            map.put(genres[i], entry);
        }
        return map;
    }

    static public List<String> genresOrderByPlays(Map<String, Integer> genresMap) {
        List<String> keySet = new ArrayList<>(genresMap.keySet());
        keySet.sort((v1, v2) -> genresMap.get(v2) - genresMap.get(v1));
        return keySet;
    }

    static private int[] generateAlbum(List<String> ordered, Map<String, Map<Integer, Integer>> idPlaysMap) {
        List<Integer> answer = new ArrayList<>();
        for (String s : ordered) {
            Map<Integer, Integer> entry = idPlaysMap.get(s);
            List<Integer> keySet = new ArrayList<>(entry.keySet());
            keySet.sort((v1, v2) -> entry.get(v2) - entry.get(v1));
            answer.add(keySet.get(0));
            if (keySet.size() > 1) {
                answer.add(keySet.get(1));
            }
        }
        return answer.stream().mapToInt(e -> e).toArray();
    }

    static public void main(String[] args) {
        String[] input = {"classic", "pop", "classic", "classic", "pop"};
        int[] semiInput = {500, 600, 150, 800, 2500};
        int[] output = {4, 1, 3, 0};
        grade(solution(input, semiInput), output);
    }


}
