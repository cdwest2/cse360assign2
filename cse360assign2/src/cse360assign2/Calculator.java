package cse360assign2;
/* Name: Collin West
 * Class ID: 586
 * Assignment #2
 * Description: A simple calculator application that makes various calculations
 * to a specific int variable. 
 */
public class Calculator 
{
	private int total;
	private String history = "0";
	
	//Initial constructor
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	//Returns the total value after all calculations.
	public int getTotal () 
	{
		return total;
	}
	//Adds an int parameter to the total.
	public void add (int value) 
	{
		total = total + value;
		history += (" + " + value);
	}
	//Subtracts an int parameter from the total.
	public void subtract (int value) 
	{
		total = total - value;
		history += (" - " + value);
	}
	//Multiplies an int parameter by the total.
	public void multiply (int value) 
	{
		total = total*value;
		history += (" * " + value);
	}
	//Divides the total by an int parameter. 
	public void divide (int value) 
	{
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = total/value;
		}
		history += (" / " + value);
	}
	//Returns a history of all calculations made in the form of a string
	//formatted similar to: "0 + 3 - 5 * 4".
	public String getHistory () 
	{
		return history;
	}
}

