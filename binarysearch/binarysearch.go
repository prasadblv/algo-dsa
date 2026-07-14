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

func arrAtoi(s []string) []int {
	res := []int{}
	for _, v := range s {
		val, _ := strconv.Atoi(v)
		res = append(res, val)
	}
	return res
}

func search(list []int, target int) int {
	left := 0
	right := len(list) - 1
	for left <= right {
		mid := left + (right-left)/2
		if list[mid] == target {
			return mid
		}
		if list[mid] < target {
			left = mid + 1
		} else {
			right = mid - 1
		}
	}
	return -1
}

func main() {
	scan := bufio.NewScanner(os.Stdin)
	fmt.Println("Enter elements in list : ")
	scan.Scan()
	list := arrAtoi(split(scan.Text()))
	fmt.Println("Enter the target : ")
	scan.Scan()
	target, _ := strconv.Atoi(scan.Text())
	fmt.Println(search(list, target))
}
