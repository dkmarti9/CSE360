package cse360assign2;

import java.util.ArrayList;

/**
 * Assignment 2: Adding Machine Class
 * <p>
 * Class Id: 70641
 * <p>
 * Program to add or subtract inputs and then print
 * out the formula used to find the total.
 * @author Dax Martineau
 * 
 */

public class AddingMachine{

	private int total;
	private ArrayList<String> addingMachineTracker = new ArrayList<String>();
	
	
	/**
	 * Constructor for class AddingMachine.
	 */
	public AddingMachine(){
		total = 0;
	}
	
	
	public int getTotal(){
		return total;
	}
	
	
	/**
	 * Adds an integer value to the total and saves the value in an ArrayList.
	 * @param value An integer value to be added to the total value;
	 */
	public void add(int value){
		String valueSaver;
		valueSaver = " + " +value;
		addingMachineTracker.add(valueSaver);
		
		total = total + value;	
	}
	
	
	/**
	 * Subtracts an integer value from the total and saves the value in an ArrayList.
	 * @param value An integer value to be subtracted from the total value;
	 */
	public void subtract(int value){
		String valueSaver;
		valueSaver = " - " +value;
		addingMachineTracker.add(valueSaver);
		
		total = total - value;	
	}
	
	
	public String toString(){
		String totalString = "0";
		for(int i = 0; i<addingMachineTracker.size(); ++i) {
			totalString = totalString + addingMachineTracker.get(i);
		}
		
		return totalString;
	}

	
	/**
	 * Removes all elements in the ArrayList and sets the total equal to 0.
	 */
	public void clear(){
		addingMachineTracker.clear();
		total = 0;
	}

}
