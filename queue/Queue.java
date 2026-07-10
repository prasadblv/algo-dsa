package queue;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queue {

    private static List<Integer> rotate(List<Integer> list) {
        ArrayDeque<Integer> deque = new ArrayDeque<>(list);
        while (deque.peek() != 0) {
            deque.add(deque.poll());
        }
        return new ArrayList<Integer>(deque);
    }

    private static List<String> splitText(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Integer> nums = splitText(scan.nextLine()).stream().map(Integer::parseInt)
                    .collect(Collectors.toList());
            var result = rotate(nums);
            System.out.println("Result : [ " + result.stream().map(String::valueOf).collect(Collectors.joining(" "))+ " ]");
        }
    }
}
