#!/usr/bin/env bash

def search(a : list[int], target: int) -> int:
    left = 0
    right = len(a) - 1
    result = -1
    while left <= right:
        mid = (left + right) // 2
        if a[mid] >= target:
            result = mid
            right = mid -1
        else:
            left = mid + 1
    return result

if __name__ == "__main__":
    print(" Enter elements : ")
    list = [int(x) for x in input().split()]
    print("Enter Target : ")
    target = int(input())
    print(" Result : ", search(list,target))