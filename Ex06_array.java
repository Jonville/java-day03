/*
 * int arr[]    <- 컴퓨터 숫자는 0부터 시작한다.
 * 
 * arr[] <-  변수 가 아니라 객체 라고 이해해라.
 * 
 * 배열 은 객체 !
 * 
 * 객체는 => 메소드랑, 변수를 가질수 있다.
 * 
 */

package day03_project;

public class Ex06_array {

	public static void main(String[] args) {
		
		int arr[] = {3, 10, 5,3,6,57,8,98,6,4,2,65,2};
		
		for(int i= 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
