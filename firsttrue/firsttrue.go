package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func split(s string) []bool {
	res := []bool{}
	if s == "" {
		return res
	} else {
		for _, i := range strings.Split(s, " ") {
			val, _ := strconv.ParseBool(i)
			res = append(res, val)
		}
	}
	return res
}

func search(a []bool) int {
	left := 0
	right := len(a) - 1
	result := -1
	for left <= right {
		mid := left + (right-left)/2
		if a[mid] {
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
	list := split(scan.Text())
	fmt.Println(" Result : ", search(list))
}
