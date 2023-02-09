package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		double a = 5;
		double b = -4;
		double c = 2;
		if (a > 0) {
			a = Math.pow(a, 2);
			System.out.println("Pervoe chislo polozhitel'noe = " + a);
		} else {
			a = Math.pow(a, 4);
			System.out.println("Pervoe chislo otricatel'noe = " + a);
		}
		if (b > 0) {
			b = Math.pow(b, 2);
			System.out.println("Vtoroe chislo polozhitel'noe = " + b);
		} else {
			b = Math.pow(b, 4);
			System.out.println("Vtoroe chislo otricatel'noe = " + b);
		}
		if (c > 0) {
			c = Math.pow(c, 2);
			System.out.println("Tret'e chislo polozhitel'noe = " + c);
		} else {
			c = Math.pow(c, 4);
			System.out.println("Tret'e chislo otricatel'noe = " + c);
		}

	}

}
