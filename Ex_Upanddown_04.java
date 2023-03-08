package day03_project;

import java.util.Random;
import java.util.Scanner;

public class Ex_Upanddown_04 {

	public static void main(String[] args) {

		Random random = new Random();

		Scanner sc = new Scanner(System.in);

		int ran = random.nextInt(100) + 1; // ** while문 안으로 들어가면 값이 계속 바뀜

		int cnt = 0; // *** while문 안으로 들어가면 계속 0으로 초기화됨.

		while (true) {

			System.out.print("1 ~ 100 숫자를 입력해주세요 : ");
			int num = sc.nextInt();

			if (num > ran) {
				System.out.println("Down");
				cnt++;
			} else if (num < ran) {
				System.out.println("Up");
				cnt++;
			} else if (num == ran) {
				System.out.println("정답입니다. " + (cnt + 1) + "번만에 맞추셨습니다.");
				break;
			}

		}
	}

}
