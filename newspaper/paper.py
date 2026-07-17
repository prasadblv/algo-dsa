#!/usr/bin/env python

def news_paper_read_time(a : list[int], coworkers : int) -> int:
    low, high = max(a), sum(a)
    result = -1
    while low <= high:
        mid = (low + high) // 2
        if  feasible(a,coworkers,mid):
            result = mid
            high = mid - 1
        else:
            low = mid + 1    
    return result 

def feasible(a : list[int], coworkers : int, limit: int) -> bool:
    time, workers = 0, 0
    for read_time in a:
        if (time+read_time) > limit:
            time = 0
            workers += 1
        time += read_time
    if time != 0:
        workers += 1
    return (workers <= coworkers)     


if __name__ == "__main__":
    print("Enter the reading time :")
    list = [int(x) for x in input().split()]
    print("Enter the number of coworkers:")
    coworkers = int(input())
    print("Result : ", news_paper_read_time(list,coworkers))