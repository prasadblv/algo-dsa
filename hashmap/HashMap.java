package hashmap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMap {

    private static Map<Integer, Integer> getCounter(List<Integer> list) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int num : list) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return map;
    }

    private static List<String> split(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String... s) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Integer> list = split(scan.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
            Map<Integer, Integer> res = new TreeMap<>(getCounter(list));
            for (int key : res.keySet()) {
                System.out.println(key + " : " + res.get(key));
            }
        }
    }
}
