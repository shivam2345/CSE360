
package cse360assign2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "" + total;
	}
	
	public int getTotal () {
		return 0;
	}                                                                                                                                                                  
	
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}
	
	public void multiply (int value) {
		total *= value;
		history = history + " * " + total;
	}
	
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total /= value;
		}
		history = history + " / " + value;
	}
	
	public String getHistory () {
		return history;
	}
}