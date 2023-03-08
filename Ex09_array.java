/*
 * 
 * 로또 번호 6자리 출력하기
 * 
 * 이거 꼭 집가서 복습....
 * 
 * 
 */

package day03_project;

import java.util.Arrays;
import java.util.Random;

public class Ex09_array {

	public static void main(String[] args) {

		Random random = new Random();

		int lotto[] = new int[6];

		int index = 0;

		while (true) {

			int num = random.nextInt(45) + 1;

			boolean insert = true;		// check 용으로 사용됩니다.			// false 가 되면 이쪽에서 다시 true 로 전환해준다.

			for (int j = 0; j < index; j++) {		// 중복 숫자 처리용 for문

				if (lotto[j] == num) {
					insert = false;
					break;
				}
			}

			if (insert == true) {		// 로또 index 번째 숫자 입력

				lotto[index] = num;
				index++;			// 여기서 index 를 올려야 , 위에 lotto[index] <- 배열을 채워줄수있기때문임.

			}

			if (index == 6) {		// 6번째 까지 나오면 while문에서 나온다.
				break;
			}

		}

		for (int i = 0; i < lotto.length; i++) {

			System.out.println(lotto[i]);
			
			
			
		}
		System.out.println(Arrays.toString(lotto));
	}
}
