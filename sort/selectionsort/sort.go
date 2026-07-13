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

func sort(a []int) []int {
	n := len(a)
	for i := range n {
		min := i
		for j := i; j < n; j++ {
			if a[j] < a[min] {
				min = j
			}
		}
		a[i], a[min] = a[min], a[i]
	}
	return a
}

func main() {
	scan := bufio.NewScanner(os.Stdin)
	scan.Scan()
	list := arrAtoi(split(scan.Text()))
	result := sort(list)
	fmt.Println(strings.Join(arrItoa(result), " "))
}
