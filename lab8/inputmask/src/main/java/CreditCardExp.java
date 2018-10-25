/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler {

	private IKeyEventHandler nextHandler;
	private String date = "";
	ICardDecorator wrapped;


	public void wrapDecorator(ICardDecorator w) {
		this.wrapped = w;
	}

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		if (date.equals(""))
			return "[MM/YY]" + "  ";
		else if (wrapped == null)
			return "[" + date + "]" + "  ";
		else
			return "[" + wrapped.decorate(date) + "]" + "  ";
	}

	public void key(String ch, int cnt) {
		if (cnt >= 17 && cnt <= 20) {
			if (ch.matches("X|x")) {
				if (date.length() > 0)
					date = date.substring(0, date.length() - 1);
			} else
				date += ch;
		} else if (nextHandler != null)
			nextHandler.key(ch, cnt);
	}

	public void addSubComponent(IDisplayComponent c) {
		return; // do nothing
	}

}