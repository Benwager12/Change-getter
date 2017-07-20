package com.benwager12.changegetter;

public enum Currency {

	fiftyNote(5000, "50 pound note"), twentyNote(2000, "20 pound note"), tenNote(1000, "10 pound note"), fiveNote(500,
			"5 pound note"), twoPound(200, "2 pound coin"), pound(100, "pound coin"), fiftyPence(50,
					"50 pence coin"), twentyPence(20, "20 pence coin"), tenPence(10, "10 pence coin"), fivePence(5,
							"5 pence coin"), twoPence(2, "2 pence coin"), onePence(1, "1 pence coin");

	int value;
	String strValue;

	Currency(int value, String strValue) {
		setValue(value);
		setStrValue(strValue);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getStrValue() {
		return strValue;
	}

	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}
}
