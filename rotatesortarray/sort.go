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

func arrItoa(a []int) []string {
	res := []string{}
	for _, v := range a {
		val := strconv.Itoa(v)
		res = append(res, val)
	}
	return res
}

func arrAtoi(a []string) []int {
	res := []int{}
	for _, v := range a {
		val, _ := strconv.Atoi(v)
		res = append(res, val)
	}
	return res
}

func findSmallest(a []int) int {
	left := 0
	right := len(a) - 1
	result := -1
	for left <= right {
		mid := left + (right-left)/2
		if a[mid] <= a[len(a)-1] {
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
	fmt.Println(" Result : ", findSmallest(list))
}
