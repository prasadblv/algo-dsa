#!/usr/bin/env python

def sort(list : list[int]) -> list[int]:
    for i in range(len(list)):
        cur = i
        while cur > 0 and list[cur] < list[cur-1]:
            list[cur], list[cur-1] = list[cur-1], list[cur]
            cur -= 1            
    return list    

if __name__ == "__main__":
    list = [int(x) for x in input().split()]
    list = sort(list)
    print(" ".join(map(str,list)))