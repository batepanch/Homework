package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a = 4;
		double b = 5;
		double c = 6;
		double reshenie;
		reshenie = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + b;
		System.out.println("Znachenie vyrazheniya = " + reshenie);

	}

}
