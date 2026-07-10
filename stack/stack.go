package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func execute(ops []string) []int {
	var stack []int
	for _, op := range ops {
		switch op {
		case "peek":
			if len(stack) > 0 {
				fmt.Printf("<< %d >> \n", stack[len(stack)-1])
			}
		case "pop":
			if len(stack) > 0 {
				fmt.Println("<<Popping>>")
				stack = stack[:len(stack)-1]
			}
		default:
			data, err := strconv.Atoi(op[5:])
			if err == nil {
				stack = append(stack, data)
			}
		}
	}
	return stack
}

func arrayItoa(arr []int) []string {
	res := []string{}
	for _, v := range arr {
		res = append(res, strconv.Itoa(v))
	}
	return res
}

func main() {
	s := bufio.NewScanner(os.Stdin)
	fmt.Println("Enter length of operations : ")
	s.Scan()
	len, _ := strconv.Atoi(s.Text())
	fmt.Println("Enter operation list: ")
	ops := []string{}
	for i := 0; i < len; i++ {
		s.Scan()
		ops = append(ops, s.Text())
	}
	result := execute(ops)
	fmt.Println(" Result : " + strings.Join(arrayItoa(result), " "))
}
