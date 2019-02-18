package cse360assign2;
	
 	/**
	 * This program will generate a Calculator,
	 * using normal operators for operations(+,-,*,/)
	 * and return it's history starting at 0 value
	 * and through to the last value  
	 * 
	 * @cse360
	 * @professor Debra Callis
	 * @author Delveen Al-Hamka
	 * @since 2019-02-17
	 */
	public class Calculator {
			/**
			 * private int variable for total  
			 */
			private int total;
			/**
			 * public method that will calculate total
			 */
			public Calculator () 
			{
				total = 0;  // not needed - included for clarity
			}
			/**
			 * getTotal method that will return calculated total
			 * @return method that wil get calculated total of the calculator 
			 */
			public int getTotal () 
			{
				return total;
			}
			/**
			 * This method is used to add an integer(s) 
			 * @param value This is a parameter of the add method
			 * 
			 */
			public void add (int value) 
			{
				total += value;
				
			}
			/**
			 * this method is used to subtract an integer or integers 
			 * @param value This is a parameter of the subtract method
			 */
			public void subtract (int value) 
			{
				total -= value;
			}
			/**
			 * This method is used to multiply an integer or integers
			 * @param value This is a parameter of the multiply method
			 */
			public void multiply (int value) 
			{
				total *= value;
			}
			/**
			 * This method is used to divide an integer or integers
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
					}
				}
				
			
			/**
			 * This string get method will get the history of calculator 
			 * @return This string will return the history,
			 * starting from initial value all the way through to the last value 
			 */
			public String getHistory () 
			{
				return "";
			}
		}




