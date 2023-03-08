package day03_project;

import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean b = true;

		while (b) {

			System.out.println("숫자를 입력하세요오.");
			int num = sc.nextInt();

			if (num == 0) {
				b = false;
			}

		}

	}

}
