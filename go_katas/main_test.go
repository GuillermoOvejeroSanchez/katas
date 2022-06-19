package main

import "testing"

func TestCalculateCubeOf3(t *testing.T) {
	ans := calculateCube(3)
	if ans != 27 {
		t.Errorf("calculateCube(3) = %d; want 27", ans)
	}
}
