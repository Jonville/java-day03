/*
 * Random 클래스!
 * 
 * random.nextInt(  범위 숫자 입력  );
 * 
 * random.nextInt( 만약 10 이면 0 ~ 9 까지 );
 * random.nextInt( 만약 7 이면 0 ~ 6 까지 );		(x - 1  의 범위를 갖는다.)
 
 * random.nextInt( 1 부터 9 까지 범위를 정하고싶으면 );	random.nextInt(9)+1    /   1 ~ 9
 * random.nextInt( 2 부터 9 까지 범위를 정하고싶으면 );	random.nextInt(8)+2    /   2 ~ 9
 * 
 * 컴퓨터  숫자는 0부터 시작한다. 
 * 
 */

package day03_project;

import java.util.Random;
import java.util.Scanner;

public class Ex_Random_03 {

	public static void main(String[] args) {

		Random random = new Random();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("문제수를 입력하세요.");
			int cnt = sc.nextInt();

			int correct = 0;

			for (int i = 0; i < cnt; i++) {

				int num1 = random.nextInt(8) + 2;
				int num2 = random.nextInt(9) + 1;
				System.out.print(num1 + " x " + num2 + " = ");

				int sum = sc.nextInt();

				if (sum == num1 * num2) {
					System.out.println("정답입니다.");
					correct++;

				} else {
					System.out.println("오답입니다. 정답은 " + (num1 * num2) + "입니다.");
				}

			}
			System.out.println(cnt + "문제중 " + correct + "문제 정답");
			System.out.println("계속 하시겠습니까 ? 계속(1), 종료(0)");

			int answer = sc.nextInt();

			if (answer == 0) {
				break;
			}

		}
		System.out.println("종료되었습니다.");

	}

}
