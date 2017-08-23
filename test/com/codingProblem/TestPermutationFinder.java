package com.codingProblem;

import org.junit.Assert;
import org.junit.Test;

public class TestPermutationFinder {
	@Test
	public void perm_finderTest(){
		String input = "ABC";
        PermutationFinder.permutation(input);
         
		Assert.assertEquals("ABC,ACB,BAC,BCA,CAB,CBA,", PermutationFinder.permutations);
}
}