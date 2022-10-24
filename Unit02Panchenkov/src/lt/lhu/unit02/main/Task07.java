package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		double a = 2;
		double b = 3;
		double c = -2;
		double newA;
		double newB;
		double newC;

		if (a >= 0) {
			newA = Math.pow(a, 2);
			System.out.println("Значение а = " + newA);
		} else {
			newA = Math.pow(a, 4);
			System.out.println("Значение a отрицательное = " + newA);
		}
		if (b >= 0) {
			newB = Math.pow(b, 2);
			System.out.println("Значение b = " + newB);
		} else {
			newB = Math.pow(b, 4);
			System.out.println("Значение b отрицательное = " + newB);
		}
		if (c >= 0) {
			newC = Math.pow(c, 2);
			System.out.println("Значение c = " + newC);
		} else {
			newC = Math.pow(c, 4);
			System.out.println("Значение c отрицательное = " + newC);

		}

	}

}
