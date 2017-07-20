package com.benwager12.changegetter;

import java.util.Map;
import java.util.Scanner;

public class ChangeGetter {

	public static void main(String[] args) {
		System.out.print("Choose an amount to get change: £");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		s.close();

		double number = 0;

		try {
			number = Double.parseDouble(input);
		} catch (Exception e) {
			System.out.println("That is not an amount of money!");
			return;
		}
		
		Map<Currency, Integer> change = Conversion.getChange(number);
		String print = Conversion.changeConversionString(change);
		
		System.out.println("\nFrom £" + number + ", you'd get:\n" + print);
	}
}
