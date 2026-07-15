package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func square(n int) int {
	low := 0
	high := n
	result := -1
	for low <= high {
		mid := low + (high-low)/2
		if mid*mid >= n {
			result = mid
			high = mid - 1
		} else {
			low = mid + 1
		}
	}
	if (result * result) == n {
		return result
	}
	return result - 1
}

func main() {
	scan := bufio.NewScanner(os.Stdin)
	fmt.Println("Enter the number :")
	scan.Scan()
	val, _ := strconv.Atoi(scan.Text())
	fmt.Println("Result : ", square(val))
}
