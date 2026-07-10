package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func splitWords(s string) []string {
	if s == "" {
		return []string{}
	} else {
		return strings.Split(s, " ")
	}
}

func arrayAtoi(arr []string) []int {
	res := []int{}
	for _, val := range arr {
		v, _ := strconv.Atoi(val)
		res = append(res, v)
	}
	return res
}
func arrayItoa(arr []int) []string {
	res := []string{}
	for _, val := range arr {
		v := strconv.Itoa(val)
		res = append(res, v)
	}
	return res
}

func rotate(a []int) []int {
	for a[0] != 0 {
		a = append(a[1:], a[0])
	}
	return a
}

func main() {
	s := bufio.NewScanner(os.Stdin)
	s.Scan()
	num := arrayAtoi(splitWords(s.Text()))
	res := rotate(num)
	fmt.Println(" Result : [ " + strings.Join(arrayItoa(res), " ") + " ]")
}
