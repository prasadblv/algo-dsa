#!/usr/bin/env python

def find_smallest(a : list[int]) -> int:
    left = 0;
    right = len(a) - 1
    result = -1
    while left <= right:
        mid = (left + right) // 2
        if a[mid] <= a[-1]:
            result = mid
            right = mid - 1
        else:
            left = mid + 1
    return result            

if __name__ == "__main__":
    print("Enter the elements : ")
    list = [int(x) for x in input().split()]
    print(" Result : " , find_smallest(list))