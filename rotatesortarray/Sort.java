package rotatesortarray;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort {


    private static List<String> split(String s){
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    private static int findSmallest(List<Integer> a){
        int left = 0;
        int right = a.size() - 1;
        int result = -1;
        while( left <= right){
            int mid = left + (right - left) / 2;
            if ( a.get(mid) <= a.get(a.size() -1)){
                result = mid;
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String  ... s){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the elements : ");
            List<Integer> list = split(scan.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
            System.out.println("Result : "+ findSmallest(list));
        }
    }
    
}
