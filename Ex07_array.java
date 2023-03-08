/*
 * 		int arr[] = new int[5];      <---  5  는  얼마나 배열 값을 가질건지 정해준다는 의미.
 *							---  안에 있는 값은 0으로 초기화 되있음. int[5] === {0,0,0,0,0}
 *
 *		System.out.println(Arrays.toString(color));			// 바로 배열에있는 값을 출력가능!
 *
 *
 */

package day03_project;

import java.util.Arrays;

public class Ex07_array {

	public static void main(String[] args) {

		int arr[] = new int[5]; // {0,0,0,0,0}

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;

			System.out.println(arr[i]);

		}

		// String 배열 생성 -> 빨강, 노랑, 파랑, 초록, 보라

		String color[] = { "빨강", "노랑", "파랑", "초록", "보라" };

		System.out.println(Arrays.toString(color)); // 바로 배열에있는 값을 출력가능!

	}

}
