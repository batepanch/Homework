package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a = 2.0;
		double b = 3.0;
		double c = 4.0;
		double result;
		result = ((b + Math.sqrt((b * b) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + b;
		System.out.println("result =" + result);
	}

}
