package sort.insertionsort;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class Sort {

    private static List<Integer> sort(List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            var cur = i;
            while (cur > 0 && (arr.get(cur - 1) > arr.get(cur))) {
                var temp = arr.get(cur);
                arr.set(cur, arr.get(cur - 1));
                arr.set(cur - 1, temp);
                cur--;
            }
        }
        return arr;
    }

    private static List<String> split(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String... s) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Integer> arr = split(scan.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
            System.out.println(sort(arr).stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }

}
