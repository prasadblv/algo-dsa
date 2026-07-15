package squareroot;

import java.util.Scanner;

public class Square {
    

    private static int square(int n){
        int left = 0;
        int right = n;
        int result = -1;

        if ( n == 0){
            return 0;
        }

        while ( left <= right ){
            int mid = left + (right - left) / 2;
            if ( (mid * mid) >= n ){
                result = mid;
                right = mid - 1;
            } else{
                left = mid + 1;
            }         
        }

        return (result * result == n) ? result : result -1; 
    }

    public static void main(String ...s){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the number : ");
            int val = Integer.parseInt(scan.nextLine());
            System.out.println("Result : " + square(val));
        }
    }
}
