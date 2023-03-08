/*
 * 
 * Arrays.sort(arr)		<---- arr[] 의 배열을 오름차로 정렬한다. 
 * 
 * 
 * Arrays.toString(arr)		<---- arr[]의 배열을 나열한다.
 * 
 * 
 */


package day03_project;

import java.util.Arrays;

public class Ex08_array {

	public static void main(String[] args) {

		int arr[] = {5,2,7,6,1,3};
		
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);	// arr [] 이렇게 안씀 , 그냥 arr
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
