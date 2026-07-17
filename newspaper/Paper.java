import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

class Paper {

private static List<String>  split(String s){
    return s.isEmpty() ?  List.of() : Arrays.asList(s.split(" ")); 
}

private static int newPaperSplit(List<Integer> a, int coworkers){
    int low = Collections.max(a);
    int high =  a.stream().mapToInt(i->i).sum();
    int result = -1;
    while ( low <= high ){
        int mid = low + (high - low) / 2;
        if(feasible(a, coworkers, mid)){
            result = mid;
            high = mid - 1;
        } else{
            low = mid + 1;
        }
    }
    return result;
}

private static boolean feasible(List<Integer> a, int coworkers, int limit){
    int time = 0;
    int nWorkers = 0;
    for( int readTime :  a){
        if( (time + readTime) > limit ){
            time = 0;
            nWorkers++;
        }
        time += readTime;       
    }
    if( time != 0){
        nWorkers++;
    }
    return nWorkers <= coworkers;
}


 public static  void main(String ...s){
    try(Scanner scan = new Scanner(System.in)){
        System.out.println("Enter the read times of new paper : ");
        List<Integer> list = split(scan.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(" Enter number of workers : ");
        int numWorkers = Integer.parseInt(scan.nextLine());
        System.out.println("Result : " + newPaperSplit(list, numWorkers));
    }
 }
}