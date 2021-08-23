package com.bridgelabz.sumofthreeinteger;

import java.util.Scanner;

public class SumOfThreeInteger {

	public static void main(String[] args) {
		int arrayOfNumbers[];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value for N : ");
		int number = scanner.nextInt();
		arrayOfNumbers = new int[number];
		System.out.println("Enter the N values : ");

		for (int index = 0; index < number; index++) {
			arrayOfNumbers[index] = scanner.nextInt();
		}

		boolean SumZeroExist = false;
		for (int i = 0; i < number - 2; i++) {
			for (int j = i + 1; j < number - 1; j++) {
				for (int k = j + 1; k < number; k++) {
					if (arrayOfNumbers[i] + arrayOfNumbers[j] + arrayOfNumbers[k] == 0) {
						System.out.println("The sum of three integer to zero exist");
						System.out.println(arrayOfNumbers[i] + " " + arrayOfNumbers[j] + " " + arrayOfNumbers[k]);
						SumZeroExist = true;
					}
				}
			}
		}

		if (SumZeroExist == false)
			System.out.println("The sum of three integer to zero not exist ");

		scanner.close();
	}
}
