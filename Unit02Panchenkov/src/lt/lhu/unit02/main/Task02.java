package lt.lhu.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		double pervykatet = 3;
		double vtoroykatet = 4;
		double gipotenuza;
		double ploshad;
		gipotenuza = Math.sqrt(Math.pow(pervykatet, 2) + Math.pow(vtoroykatet, 2));
		ploshad = (pervykatet * vtoroykatet) / 2;
		System.out.println("Gipotenuza = " + gipotenuza);
		System.out.println("Ploshad' Pryamougolnika = " + ploshad);

	}

}
