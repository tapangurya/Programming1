/*
 * Given an array of integers, write a method to remove all 
 * duplicate elements from the array. The method should return 
 * a new array that contains only the unique elements from the 
 * original array, maintaining their original order.
 * 
 * Test Case 1: 

	Input: [4, 5, 9, 1, 5, 9, 3, 4, 6]
	Output: [4, 5, 9, 1, 3, 6]


Test Case 2: 

	Input :   [ 2, 2 , 3 , 3 , 2]
	Output :      [2,3]

 */

 // solve using LinkedHashSet 

import java.util.LinkedHashSet;
public class Program4a {
    public static LinkedHashSet removeDuplicate(int[]arr){
		LinkedHashSet<Integer>l= new LinkedHashSet<>();
		for(int i=0;i<arr.length; i++){
			l.add(arr[i]);
		}
		return l;

	}
	public static void main(String[] args) {
		int[] arr ={4, 5, 9, 1, 5, 9, 3, 4, 6};
		System.out.println(removeDuplicate(arr));
	}
}
