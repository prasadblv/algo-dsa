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

func arrayAtoi(arr []string) []int {
	r := []int{}
	for _, x := range arr {
		val, _ := strconv.Atoi(x)
		r = append(r, val)
	}
	return r
}

func arrayItoa(a []int) []string {
	r := []string{}
	for _, v := range a {
		val := strconv.Itoa(v)
		r = append(r, val)
	}
	return r
}

func sort(arr []int) []int {
	for i := 1; i < len(arr); i++ {
		cur := i
		for cur > 0 && (arr[cur] < arr[cur-1]) {
			arr[cur], arr[cur-1] = arr[cur-1], arr[cur]
			cur--
		}
	}
	return arr
}

func main() {
	scan := bufio.NewScanner(os.Stdin)
	scan.Scan()
	list := arrayAtoi(split(scan.Text()))
	result := sort(list)
	fmt.Println(strings.Join(arrayItoa(result), " "))
}
