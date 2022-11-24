package sumAverange.it.corso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("inserisci 2 numeri");
		int n1, n2;
		
		n1= input.nextInt();
		n2= input.nextInt();
		double media =(double) (n1 + n2) / 2;
		System.out.println("somma : ");
		System.out.println( n1 + n2);
		System.out.println("media : " + media);
		
		
	}

}
