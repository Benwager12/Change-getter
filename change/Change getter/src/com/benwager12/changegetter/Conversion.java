package com.benwager12.changegetter;

import java.util.HashMap;
import java.util.Map;

public class Conversion {
	
	public static String changeConversionString(Map<Currency, Integer> currencies) {
		String endResult = "";
		int amount = 0;

		for (Currency c : currencies.keySet()) {
			String singular = "";
			if (currencies.get(c) == 1)
				singular = "a " + c.getStrValue() + (amount + 2 == currencies.size() ? " and " : ", ");
			else
				singular = currencies.get(c) + " " + c.getStrValue() + "s"
						+ (amount + 2 == currencies.size() ? " and " : ", ");

			endResult += singular;
			amount++;
		}
		
		endResult = endResult.substring(0, 1).toUpperCase() + endResult.substring(1, endResult.length() - 2);
		return endResult;
	}
	
	public static Map<Currency, Integer> getChange(double amount) {
		double changingAmount = amount * 100;
		Map<Currency, Integer> change = new HashMap<Currency, Integer>();

		for (Currency c : Currency.values()) {
			double value = c.getValue();
			int asd = (int) ((int) changingAmount / value);
			changingAmount = changingAmount - asd * value;

			if (!(asd == 0))
				change.put(c, asd);
		}
		
		return change;
	}
}
