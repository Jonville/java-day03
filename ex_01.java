package day03_project;

public class ex_01 {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.println("=========" + i + "단========");

				for (int j = 1; j < 10; j++) {

					System.out.println(i + " x " + j + " = " + (i * j));

				}
			}
		}

	}

}
