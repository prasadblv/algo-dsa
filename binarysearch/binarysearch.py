#!/usr/bin/env python

def search(list : list[int], target: int) -> int:
    left = 0
    right = len(list) - 1
    while left <= right:
        mid = (left + right) // 2
        if list[mid] == target :
            return mid
        if list[mid] < target:
            left = mid + 1
        else: 
            right = mid - 1
    return -1



if __name__ == "__main__":
    print("Enter elements of the list : ")
    list = [int(x) for x in input().split(" ")]
    print("Enter the target : ")
    target = int(input())
    print("Result : ", search(list, target))