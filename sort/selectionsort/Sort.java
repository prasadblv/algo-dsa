package sort.selectionsort;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class Sort {

    private static List<Integer> sort(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int min = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(min)) {
                    min = j;
                }
            }
            int tmp = arr.get(i);
            arr.set(i, arr.get(min));
            arr.set(min,tmp);
        }
        return arr;
    }

    private static List<String> split(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void Main(String... s) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Integer> list = split(scan.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
            System.out.println(sort(list).stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }

}
