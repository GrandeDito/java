package DayNumber.it.corso;

import java.util.Scanner;

public class Giorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		String giorno;
		System.out.println("inserire un numero da 1 a 7");
		n = input.nextInt();
		switch (n) {
		case 1:
			giorno = "lunedì";
			break;
		case 2:
			giorno = "martedì";
			break;
		case 3:
			giorno = "mercoledì";
			break;
		case 4:
			giorno = "giovedì";
			break;
		case 5:
			giorno = "venerdì";
			break;
		case 6:
			giorno = "sabato";
			break;
		case 7:
			giorno = "domenica";
			break;
		default:
			giorno = "Inserire un numero da 1 a 7";
		}
		if (giorno == "Inserire un numero da 1 a 7") {
			System.out.println(giorno);
		} else {
			System.out.println(n + " corrisponde a " + giorno);
		}
	}
}
