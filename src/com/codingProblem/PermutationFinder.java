package com.codingProblem;

public class PermutationFinder {
	
	static String permutations= "";
	public static void main(String[] args) {
		//System.out.println("abc".substring(1, 3));
		permutation("ABC");
		System.out.println(permutations);
	}
	public static void permutation(String input){
		permutation("", input); 
	}
	/* *
	 *  Recursive method which actually prints all permutations 
	 *  of given String, but since we are passing an empty String as current permutation  
	 *  to start with, * I have made this method private and didn't exposed it to client. 
	 */
	private static void permutation(String output, String input) {		
		if(input.isEmpty()){
			permutations = permutations +output+"," ;
		} else {
			for (int i = 0; i < input.length(); i++) {
			// current calculated perm = perm + world.chatAt(i);
				permutation(output + input.charAt(i),input.substring(0, i) + input.substring(i + 1, input.length()));
			}
		}		
	}
}
