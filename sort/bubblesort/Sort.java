package sort.bubblesort;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort {

    private static List<Integer> sort(List<Integer> a){
        for( int i = a.size() - 1; i >= 0; i-- ){
            boolean swapped = false;
            for ( int j = 0; j < i; j++){
                if ( a.get(j) > a.get(j+1) ){
                    swapped = true;
                    int tmp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j + 1,tmp);
                }
            } 
            if( !swapped){
                return a;
            }
        }
        return a;
    }

    private static List<String> split(String s){
        return s.isEmpty()? List.of() :Arrays.asList(s.split(" "));
    }

    public static void main(String ...s){
        try(Scanner scan = new Scanner(System.in)){
            List<Integer> list = split(scan.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
            System.out.println(sort(list).stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}
