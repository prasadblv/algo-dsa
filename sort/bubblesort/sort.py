#!/usr/bin/env python

def sort(arr : list[int]) -> list[int]:
    n = len(arr)
    for i in reversed(range(n)):
        swapped = False
        for j in range(i):
            if arr[j] > arr[j+1]:
                swapped = True
                arr[j],arr[j+1] = arr[j+1], arr[j]

        if not swapped:
            return arr
        
    return arr

if __name__ == "__main__":
    list = [int(x) for x in input().split()]
    print(" ".join(map(str, sort(list))))