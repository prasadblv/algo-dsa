package firstoccur;


import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;



public class FisrtOccur {

    private static List<String> split(String s){
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    private static int firstOccur(List<Integer> a, int target){
        int left = 0;
        int right = a.size() -1;
        int result = -1;
        while( left <= right){
            var mid = left + ( right - left) / 2;
            if ( a.get(mid) == target) {
                result = mid;
                right = mid - 1;
            } else if( a.get(mid) < target){
                left = mid + 1;
            }  else{    
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String ...s){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter elements : ");
            List<Integer> list = split(scan.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
            System.out.println("Enter target : ");
            int target = Integer.parseInt(scan.nextLine());
            System.out.println("Result : " + firstOccur(list, target));
        }
    }
    
}
