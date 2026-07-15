#!/usr/bin/env python

def square(n : int) -> int:
    left = 0
    right = n
    result = -1
    while left <= right:
        mid = (left + right) // 2
        if mid * mid >= n:
            result = mid
            right = mid - 1
        else:
            left = mid + 1
    return result if result * result == n else result - 1         

if __name__ == "__main__":
    print("Enter the number :")
    val = int(input())
    print("Result: ", square(val))

