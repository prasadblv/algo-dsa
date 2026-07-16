package peakarray;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Peak { 


    private static List<String> split(String s){
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    private static int peak(List<Integer> a) {
        var left = 0;
        var right = a.size() - 1;
        var result = -1;
        var aLen = a.size() - 1;
        while( left <= right ){
            var mid = left + (right - left) / 2;
            if ( mid == aLen || a.get(mid) > a.get(mid+1)){
                result = mid;
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String ...s){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the elements : ");
            List<Integer> list = split(scan.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
            System.out.println("Result : " + peak(list));
        }
    }

}