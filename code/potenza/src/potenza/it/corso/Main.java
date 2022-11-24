package potenza.it.corso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("inserisci 2 numeri");
		int numero;
		int elevazione;
		int risultato;
		//int potenza = 2;
		
		numero= input.nextInt();
		elevazione= input.nextInt();
		/*
		for (int i = 0; i < elevazione; i++) {
			potenza = numero * potenza;
			System.out.println(potenza);
		} 

		int iw = 0;
		potenza = 2;
		while (iw < elevazione) {
			iw++;
			potenza = numero * potenza;
			System.out.println(potenza);
		}  */

		risultato = calcola(numero, elevazione);
		System.out.println(risultato);
		
	} 
	
	public static int calcola(int numero, int elevazione){
		int potenza = numero;
		for (int i = 1; i < elevazione; i++) {
			potenza = numero * potenza;
			//System.out.println(potenza);
		}
		return potenza;		
	}
}
