package day10EmployeeWage;

public class Wage_for_multiple_companies {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * 
		 * Creating objects for different companies
		 * initializing values for different companies calculating their wages
		 */

		EmployeeWage Reliance = new EmployeeWage("Reliance", 20, 20, 100);
		EmployeeWage Flipkart = new EmployeeWage("Flipkart", 20, 20, 100);
		EmployeeWage Amazon = new EmployeeWage("Amazon", 20, 20, 100);
		
		System.out.println("<<<<<Reliance Data>>>>>");
		Reliance.Empwage();
		System.out.println(Reliance);

		System.out.println("\n<<<<<Flipkart Data>>>>>");
		Flipkart.Empwage();
		System.out.println(Flipkart);

		System.out.println("\n<<<<<Amazon Data>>>>>");
		Amazon.Empwage();
		System.out.println(Amazon);
	}
}