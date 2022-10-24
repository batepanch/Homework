package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите значение а: ");
		double a = in.nextDouble();
		System.out.print("Введите значение b: ");
		double b = in.nextDouble();
		System.out.print("Введите значение c: ");
		double c = in.nextDouble();
		System.out.println("a = " + a + ";" + " b = " + b + ";" + " c = " + c);
		double resultOfExpression = a * a - ((b - c) * (b - c)) + Math.log(b * b + 1);
		System.out.println("Результат выражения = " + resultOfExpression);
		in.close();

	}

}
