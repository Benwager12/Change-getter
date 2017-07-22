package com.benwager12.changegetter;

import java.util.Map;
import java.util.Scanner;

public class ChangeGetter {
	
	/**
	 * Main method, this is where everything is called.
	 */
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
		
		double rounded = (number*100);
		rounded = (int) rounded;
		rounded = rounded/100;
		
		if (rounded != number)
			System.out.println("That number is more than 2 decimals long so it has been down to £" + rounded);
		
		Map<Currency, Integer> change = Conversion.getChange(number);
		String print = Conversion.changeConversionString(change);
		
		System.out.println("\nFrom £" + rounded + ", you'd get:\n" + print);
	}
}
