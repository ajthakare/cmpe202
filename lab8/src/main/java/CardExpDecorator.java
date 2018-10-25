/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CardExpDecorator implements ICardDecorator {

	public CardExpDecorator() {
	}

	public String decorate(String s) {
		StringBuilder expiry = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i == 2)
				expiry.append("/" + s.charAt(i));
			else
				expiry.append(s.charAt(i));
		}
		return expiry.toString();
	}
}