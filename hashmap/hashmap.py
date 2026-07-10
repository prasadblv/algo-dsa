#!/usr/bin/env python

def getCounter(list : list[int]) -> dict[int,int]:
    counter: dict[int,int] = {}
    for num in list:
        if num in counter:
            counter[num] = counter[num] + 1
        else:
            counter[num] = 1
    return counter        

if __name__ == "__main__":
    list = [int(x) for x in input().split()]
    res = getCounter(list)
    for key in sorted(res.keys()):
        print(key , ":", res[key])