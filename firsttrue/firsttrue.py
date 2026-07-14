#!/usr/bin/env python

def search(a : list[bool]) -> int:
    left = 0
    right = len(a) -1
    result = -1
    while left <= right:
        mid = (left + right ) // 2
        if a[mid]:
            result = mid
            right = mid -1
        else:
            left = mid + 1
    return result
            
if __name__ == "__main__":
    list = [ x == "true" for x in input().split()]
    print("Result : ", search(list))