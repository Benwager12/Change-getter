package com.benwager12.changegetter;

import java.util.HashMap;
import java.util.Map;

public class Conversion {
	
	/**
	 * The conversion method
	 */
	
	public static String changeConversionString(Map<Currency, Integer> currencies) {
		String endResult = "";
		int amount = 0;

		for (Currency c : currencies.keySet()) {
			String adding = "";
			
			// Adding the singular and plural words for their respective coins
			if (currencies.get(c) == 1)
				adding = "a " + c.getStrValue() + (amount + 2 == currencies.size() ? " and " : ", ");
			else
				adding = currencies.get(c) + " " + c.getStrValue() + "s"
						+ (amount + 2 == currencies.size() ? " and " : ", ");

			endResult += adding;
			amount++;
		}
		
		// Capitalising the first letter of the sentence
		endResult = endResult.substring(0, 1).toUpperCase() + endResult.substring(1, endResult.length() - 2);
		return endResult;
	}
	
	public static Map<Currency, Integer> getChange(double amount) {
		
		// Currencies are in pence so converting the number given to pence
		double changingAmount = amount * 100;
		Map<Currency, Integer> change = new HashMap<Currency, Integer>();
		
		// Loop for getting the change of the values
		for (Currency c : Currency.values()) {
			double value = c.getValue();
			int asd = (int) (changingAmount / value);
			changingAmount = changingAmount - asd * value;
			
			if (!(asd == 0))
				change.put(c, asd);
		}
		
		return change;
	}
}
