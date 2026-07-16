#!/usr/bin/env python


def peak(a : list[int]) -> int:
    left = 0
    right = len(a) - 1
    result = -1
    alen = len(a) -1
    while left <= right:
        mid = (left + right) // 2
        if mid == alen - 1 or a[mid] > a[mid+1]:
            result = mid
            right = mid - 1
        else:
            left = mid + 1
    return result        


if __name__ == "__main__":
    print("Enter elements : ")
    list = [int(x) for x in input().split() ]
    print("Result : " , peak(list))
