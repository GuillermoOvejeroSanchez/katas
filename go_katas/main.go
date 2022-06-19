package main

import (
	"fmt"
)

func calculateCube(x int) int {
	return x * x * x
}

func main() {
	fmt.Println(calculateCube(3))
}
