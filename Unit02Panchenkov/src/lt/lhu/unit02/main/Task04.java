package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите значение d: ");
		int d = in.nextInt();
		System.out.println("Введите значение e: ");
		int e = in.nextInt();
		System.out.println("Введите значение f: ");
		int f = in.nextInt();
		System.out.println("d = " + d + ";" + "e = " + e + ";" + "f = " + f + ";");
		int sum = d + e + f;
		System.out.println("Сумма значений (d + e + f) = " + sum);
		in.close();

	}

}
