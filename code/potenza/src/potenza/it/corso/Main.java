package potenza.it.corso;

public class Main {

	public static void main(String[] args) {
		int numero = 2;
		int potenza = 2;

		int i1=0;
		for (int i = 0; i < 15; i++) {
			potenza = numero * potenza;
			System.out.println(potenza);
		}

		int iw =0;
		potenza = 2;
		while (iw < 15) {
			iw++;
			potenza = numero * potenza;
			System.out.println(potenza);
		}

		
	}
}
