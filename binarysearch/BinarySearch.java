package binarysearch;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BinarySearch {


    private static List<String> split(String s){
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    private static int search(List<Integer> list, int target){
        int left = 0;
        int right = list.size() - 1;
        while ( left <= right ){
            int mid = left + (right - left) / 2;
            int cur = list.get(mid);
            if (  cur == target ){
                return mid;
            } else if ( cur < target ){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String ...s) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the elements of list : ");
            List<Integer> list = split(scan.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
            System.out.println("Enter target :");
            int target = Integer.parseInt(scan.nextLine());
            System.out.println("Result : " + search(list, target));
        }
    }
    
}
