package main

import (
	"bufio"
	"fmt"
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

func arrAtoi(a []string) []int {
	res := []int{}
	for _, v := range a {
		val, _ := strconv.Atoi(v)
		res = append(res, val)
	}
	return res
}

func search(a []int, target int) int {
	left := 0
	right := len(a) - 1
	result := -1
	for left <= right {
		mid := left + (right-left)/2
		if a[mid] >= target {
			result = mid
			right = mid - 1
		} else {
			left = mid + 1
		}
	}
	return result
}

func main() {
	scan := bufio.NewScanner(os.Stdin)
	fmt.Println("Enter the elements : ")
	scan.Scan()
	list := arrAtoi(split(scan.Text()))
	fmt.Println("Enter target : ")
	scan.Scan()
	target, _ := strconv.Atoi(scan.Text())
	fmt.Println("Result : ", search(list, target))
}
