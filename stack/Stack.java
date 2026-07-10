package stack;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Stack{


    public static List<Integer> execute(List<String> ops){
        List<Integer> stack = new ArrayList<>();
        for( String op : ops){
            switch(op){
                case "peek":
                    System.out.println(" Peek : " + stack.get(stack.size() - 1 ));                   
                    break;
                case "pop":
                    stack.remove(stack.size() - 1);
                    break;
                default:
                    stack.add(Integer.parseInt(op.substring(5)));    
                    break;
            }
        }
        return stack;
    }

    public static void main(String ... arg){
        try(Scanner  s = new Scanner(System.in)){
            System.out.println("Enter number of ops : ");
            int nOps = Integer.parseInt(s.nextLine());
            System.out.println("Enter instructions : ");
            List<String> ops = new ArrayList<>();
            for ( int i = 0; i < nOps; i++){
                ops.add(s.nextLine());
            }
            List<Integer> result = execute(ops);
            System.out.println(" Result : "+result.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}