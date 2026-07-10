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

func arrayAtoi(list []string) []int {
	res := []int{}
	for _, val := range list {
		key, _ := strconv.Atoi(val)
		res = append(res, key)
	}
	return res
}

func getCounter(arr []int) map[int]int {
	res := make(map[int]int)
	for _, num := range arr {
		if _, exists := res[num]; exists {
			res[num]++
		} else {
			res[num] = 1
		}
	}
	return res
}

func main() {
	scan := bufio.NewScanner(os.Stdin)
	scan.Scan()
	arr := arrayAtoi(split(scan.Text()))
	ctr := getCounter(arr)
	for key, val := range ctr {
		fmt.Println(key, ":", val)
	}
}
