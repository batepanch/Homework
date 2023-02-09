package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Vvedite znachenie a:");
		double a = in.nextDouble();
		System.out.println("Vvedite znachenie b:");
		double b = in.nextDouble();
		System.out.println("vvedite znachenie c:");
		double c = in.nextDouble();
		double formula;
		formula = Math.pow(a, 2) - Math.pow((b - c), 2) + Math.log(Math.pow(b, 2) + 1);
		System.out.println("Znachenie vyrazhenia = " + formula);
		in.close();
		

	}

}
