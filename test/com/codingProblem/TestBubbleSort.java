package com.codingProblem;

import org.junit.Assert;
import org.junit.Test;


public class TestBubbleSort {
	@Test
	public void bubble_sortTest(){
		int a[] = {9,7,6,3,2,1,15,60,0,59};
		BubbleSort.bubbleSorting(a);
		int [] expected ={0, 1, 2, 3, 6, 7, 9, 15, 59, 60};
		Assert.assertArrayEquals(expected, a);
	}
}
