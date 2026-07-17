package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strconv"
	"strings"
)

func split(s string) []string {
	if s == "" {
		return []string{}
	} else {
		return strings.Split(s, " ")
	}
}

func arrAtoi(s []string) []int {
	res := []int{}
	for _, v := range s {
		val, _ := strconv.Atoi(v)
		res = append(res, val)
	}
	return res
}

func newPaperReadTime(a []int, workers int) int {
	low, high := math.MinInt32, 0
	result := -1

	for _, readTime := range a {
		low = int(math.Max(float64(low), float64(readTime)))
		high += readTime
	}

	for low <= high {
		mid := low + (high-low)/2
		if feasible(a, workers, mid) {
			result = mid
			high = mid - 1
		} else {
			low = mid + 1
		}
	}
	return result
}

func feasible(a []int, workers int, limit int) bool {
	time, nworkers := 0, 0
	for _, readTime := range a {
		if (time + readTime) > limit {
			time = 0
			nworkers++
		}
		time += readTime
	}
	if time != 0 {
		nworkers++
	}
	return nworkers <= workers
}

func main() {
	scan := bufio.NewScanner(os.Stdin)
	fmt.Println(" Enter read time : ")
	scan.Scan()
	list := arrAtoi(split(scan.Text()))
	fmt.Println("Enter no of workers : ")
	scan.Scan()
	workers, _ := strconv.Atoi(scan.Text())
	fmt.Println("Result : ", newPaperReadTime(list, workers))
}
