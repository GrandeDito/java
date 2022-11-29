package com.bubblesort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		int arr[] = new int[10];
		try {
			System.out.println("inserisci 10 numeri: ");
			for (int i = 0; i < 10; i++) {
				n = input.nextInt();
				arr[i] = n;
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("errore :" + e);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("errore :" + e);
		}

		bubbleSort(arr);
		System.out.println("Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
