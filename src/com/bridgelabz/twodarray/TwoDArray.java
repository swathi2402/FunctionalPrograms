package com.bridgelabz.twodarray;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {

		int rowValue = 0;
		int columnValue = 0;
		int twoDArray[][];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value for row : ");
		rowValue = scanner.nextInt();
		System.out.print("Enter the value for column : ");
		columnValue = scanner.nextInt();

		twoDArray = new int[rowValue][columnValue];

		for (int i = 0; i < rowValue; i++) {
			for (int j = 0; j < columnValue; j++) {
				System.out.print("Enter element for row = " + (i + 1) + " column = " + (j + 1) + " : ");
				twoDArray[i][j] = scanner.nextInt();
			}
		}

		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < rowValue; i++) {
			for (int j = 0; j < columnValue; j++) {
				writer.write(twoDArray[i][j] + " ");
				writer.flush();
			}
			System.out.println();
		}
		writer.close();
		scanner.close();
	}
}
