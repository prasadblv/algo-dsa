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

func sort(a []int) []int {
	for i := len(a) - 1; i >= 0; i-- {
		swapped := false
		for j := 0; j < i; j++ {
			if a[j] > a[j+1] {
				swapped = true
				a[j], a[j+1] = a[j+1], a[j]
			}
		}
		if !swapped {
			return a
		}
	}
	return a
}

func arrAtoi(a []string) []int {
	res := []int{}
	for _, v := range a {
		val, _ := strconv.Atoi(v)
		res = append(res, val)
	}
	return res
}

func main() {
	scan := bufio.NewScanner(os.Stdin)
	scan.Scan()
	list := arrAtoi(split(scan.Text()))
	fmt.Println(strings.Join(arrItoa(sort(list)), " "))
}
