/*
 * !!!!!!!!로또 예제!!!!!!!!!!
 * 
 * 1. 로또 번호를 담아둘 길이가 6개인 정수 타입의 배열 변수 새엇ㅇ
 * 2. 1~45 까지의 번호 중에 하나를 뽑는다.
 * 3. 만약 뽑은 번호가 배열에 있다면 다시뽑고, 없다면 배열에 넣는다.
 * 4. 6개의 번호를 다 뽑을 때까지 반복한다.
 * 5. 6개의 번호를 출력한다.
 * 
 * 
 */

package day03_project;

import java.util.Arrays;
import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {

		Random random = new Random();

		int lotto[] = new int[6];

		int index = 0;

		while (true) {

			int ran = random.nextInt(45) + 1;

			boolean check = true;

			for (int i = 0; i < index; i++) {
				if (lotto[i] == ran) {
					check = false;
					break;
				}
			}

			if (check == true) {
				lotto[index] = ran;
				index++;

				if (index == 6) {
					System.out.println(Arrays.toString(lotto));
					break;
				}
			}
		}
	}
}
