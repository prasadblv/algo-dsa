package firsttrue;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class FirstTrue {
    

    private static int searchTrue(List<Boolean> list){
        int left = 0;
        int right = list.size() -1;
        int result = -1;
        while( left <= right){
            int mid = left + (right - left) / 2;
            if( list.get(mid)){
                result  = mid;
                right = mid -1;
            } else{
                left = mid + 1;
            }           
        }
        return result;
    }

    private static List<String> split(String s){
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String ...s){
        try(Scanner scan  = new Scanner(System.in)){
            List<Boolean> list = split(scan.nextLine()).stream().map(e -> e.equals("true")).collect(Collectors.toList());
            System.out.println("Result : " + searchTrue(list));
        }
    }
}
