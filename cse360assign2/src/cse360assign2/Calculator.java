package cse360assign2;
	
 	/**
	 * @author Delveen Al-Hamka
	 * @classID 308
	 * @cse360, assignment 2
	 * @professor Debra Callis
	 * @since 2019-02-17
	 * github repository link: https://github.com/delveena/Calculator.git
	 *
	 *This program will generate a calculator,
	 *using normal operators for operations(+,-,*,/)
	 *and return its history starting at 0 value
	 *and through to the last value 
	 */

public class Calculator 
{
	
	/**
	 * private int variable for total
	 * private String for calculatorHistory  
	*/
	private int total;
	private String calculatorHistory;
	
	/**
	 * public calculator method that initializes total and calculatorHistory to zero.
	 */
	public Calculator () 
		{
			total = 0;  // not needed - included for clarity
			calculatorHistory = "0";
		}
	
	/**
	 * getTotal method that will return calculated total
	 * @return method that will get calculated total of the calculator 
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * This method is used to add an integer(s) 
	 * @param value This is a parameter of the add method
	 */
	public void add (int value) 
	{
		total += value;
		calculatorHistory = calculatorHistory.concat(" + " + value);	
	}
	
	/**
	 * this method is used to subtract an integer or integers 
	 * @param value This is a parameter of the subtract method
	 */
	public void subtract (int value) 
	{
		total -= value;
		calculatorHistory = calculatorHistory.concat(" - " + value); 	
	}
	
	/**
	 * This method is used to multiply an integer or integers
	 * @param value This is a parameter of the multiply method
	 */
	public void multiply (int value) 
	{
		total *= value;
		calculatorHistory = calculatorHistory.concat(" * " + value);
	}
	
	/**
	 * This method is used to divide an integer or integers, 
	 * if value is equal to '0',
	 * total will equal '0' because can't divide 0.
	 * @param value This is a parameter of the divide method
	 */
	public void divide (int value) 
	{
		if (value == 0)
			{
				total = 0;
			}
		else 
			{
				total /= value;
				calculatorHistory = calculatorHistory.concat(" / " + value);
			}
	}
	
	/**
	 * This string get method will get the history of calculator 
	 * @return This string will return the history,
	 * starting from initial value all the way through to the last value 
	 */
	public String getHistory () 
	{
		return calculatorHistory;
	}
}

