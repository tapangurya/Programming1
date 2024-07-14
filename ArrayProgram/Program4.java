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

public class Program4 {
	public static void main(String[] args) {
		int [] arr = {2, 2 , 3 , 3 , 2};
		int []b=removeDuplicate(arr);
		for(int i=0; i<b.length;i++){
			System.out.print(b[i]+",");
		}
	}

	private static int[] removeDuplicate(int[] arr) {
		int [] newArr= new int[arr.length];
		newArr[0]=arr[0];
		int k =1;
		for(int i=1; i<arr.length; i++){
			int j=0;
			for(;j<k;j++){
				if (arr[i]==newArr[j]) {
					break;
					
				}
			}
			if (j==k) {
				newArr[k]=arr[i];
				k++;
				
			}
		}
		int []b=new int[k];
		for(int i=0; i<k; i++){
			b[i]=newArr[i];
		}
		return b;
	}
    
}
