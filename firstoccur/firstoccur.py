#!/usr/bin/env python

def first_occur(a : list[int], target : int) -> int:
    left = 0
    right = len(a) - 1
    result = -1
    while left <= right :
        mid = (left + right ) // 2
        if a[mid] == target:
            result = mid
            right = mid - 1
        elif a[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return result            

if __name__ == "__main__":
    print("Enter elements : ")
    list = [int(x) for x in input().split()]
    print("Enter Target : ")
    target = int(input())
    print(" Result : " , first_occur(list,target))