#!/usr/bin/env python

def sort(arr: list[int]) -> list[int]:
    n = len(arr)
    for i in range(n):
        min = i
        for j in range(i,n):
            if arr[j] < arr[i]:
                min = j 
        arr[i],arr[min] = arr[min],arr[i]
    return arr
    

if __name__ == "__main__":
    list = [int(x) for x in input().split(" ")]
    result = sort(list)
    print(" ".join(map(str,result)))