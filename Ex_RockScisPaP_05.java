/*
 * 
 * Player = 가위(0) , 바위(1), 보(2)
 * 
 * 
 * Computer = 가위(0) , 바위(1), 보(2)
 * 
 * 
 * 일때 --
 * 
 * Player - Computer == -2 || Player - Computer == 1 ---> Player 승!
 * Player - Computer == 2 || Player - Computer == -1 ---> Computer 승!
 * 
 * 
 */


package day03_project;

import java.util.Random;
import java.util.Scanner;

public class Ex_RockScisPaP_05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		int win = 0;
		int lose = 0;

		while (true) {

			System.out.println("가위(0) , 바위(1), 보(2) 입력 : ");

			int num = sc.nextInt();
			int ran = random.nextInt(3);


			if (num == 0 && num == ran) {
				System.out.println("Player : 가위");
				System.out.println("컴퓨터 : 가위");
				System.out.println("비겼습니다.");
				System.out.println("Player ===> " + win + "승" + lose + "패");
				System.out.println("재대결(1) , 종료(0)");
				
				int again = sc.nextInt();
				if(again == 0 ) {
					break;
				}
				
			} else if (num == 1 && num == ran) {
				System.out.println("Player : 바위");
				System.out.println("컴퓨터 : 바위");
				System.out.println("비겼습니다.");
				System.out.println("Player ===> " + win + "승" + lose + "패");
				System.out.println("재대결(1) , 종료(0)");
				int again = sc.nextInt();
				if(again == 0 ) {
					break;
				}
				
			} else if (num == 2 && num == ran) {
				System.out.println("Player : 보");
				System.out.println("컴퓨터 : 보");
				System.out.println("비겼습니다.");
				System.out.println("Player ===> " + win + "승" + lose + "패");
				System.out.println("재대결(1) , 종료(0)");
				int again = sc.nextInt();
				if(again == 0 ) {
					break;
				}
			} else if (num == 0 && ran == 2) {
				System.out.println("Player : 가위");
				System.out.println("컴퓨터 : 보");
				System.out.println("이겼습니다.");
				win++;
				System.out.println("Player ===> " + win + "승" + lose + "패");
				System.out.println("재대결(1) , 종료(0)");
				int again = sc.nextInt();
				if(again == 0 ) {
					break;
				}
			} else if (num == 0 && ran == 1) {
				System.out.println("Player : 가위");
				System.out.println("컴퓨터 : 바위");
				System.out.println("졌습니다.");
				lose++;
				System.out.println("Player ===> " + win + "승" + lose + "패");
				System.out.println("재대결(1) , 종료(0)");
				int again = sc.nextInt();
				if(again == 0 ) {
					break;
				}

			} else if (num == 1 && ran == 0) {
				System.out.println("Player : 바위");
				System.out.println("컴퓨터 : 가위");
				System.out.println("이겼습니다.");
				win++;
				System.out.println("Player ===> " + win + "승" + lose + "패");
				System.out.println("재대결(1) , 종료(0)");
				int again = sc.nextInt();
				if(again == 0 ) {
					break;
				}
			} else if (num == 1 && ran == 2) {
				System.out.println("Player : 바위");
				System.out.println("컴퓨터 : 보");
				System.out.println("졌습니다.");
				lose++;
				System.out.println("Player ===> " + win + "승" + lose + "패");
				System.out.println("재대결(1) , 종료(0)");
				int again = sc.nextInt();
				if(again == 0 ) {
					break;
				}
			} else if (num == 2 && ran == 0) {
				System.out.println("Player : 보");
				System.out.println("컴퓨터 : 가위");
				System.out.println("졌습니다.");
				lose++;
				System.out.println("Player ===> " + win + "승" + lose + "패");
				System.out.println("재대결(1) , 종료(0)");
				int again = sc.nextInt();
				if(again == 0 ) {
					break;
				}
			} else if (num == 2 && ran == 1) {
				System.out.println("Player : 보");
				System.out.println("컴퓨터 : 바위");
				System.out.println("이겼습니다.");
				win++;
				System.out.println("Player ===> " + win + "승" + lose + "패");
				System.out.println("재대결(1) , 종료(0)");
				int again = sc.nextInt();
				if(again == 0 ) {
					break;
				}
			}

		}

	}
}
