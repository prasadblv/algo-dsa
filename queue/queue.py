#!/usr/bin/env python
from collections import deque

def rotate(nums : list[int]) -> list[int]:
    q = deque(nums)
    while q[0] != 0:
        q.append(q.popleft())
    return list(q)    


if __name__ == "__main__":
    nums = [int(x) for x in input().split()]
    res = rotate(nums)
    print("Result : ")
    print(" ".join(map(str,res)))