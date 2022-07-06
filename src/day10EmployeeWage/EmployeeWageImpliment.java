package day10EmployeeWage;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeWageImpliment {
	public static ArrayList company = new ArrayList();
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * creating 3 companies i.e. Reliance, Flipkart, Amazon
		 * generating 3 random values 0,1,2
		 * if 0 it will comes to Reliance, 1 for Flipkart and 2 for Amazon
		 * inside each company using switch case checking employee attendence, daily wage, monthly wages
		 * 
		 */
		EmployeeWage Reliance = new EmployeeWage("Reliance", 80, 9, 5);
		EmployeeWage Flipkart = new EmployeeWage("Flipkart", 70, 7, 3);
		EmployeeWage Amazon = new EmployeeWage("Amazon", 85, 8, 4);
		company.add(Reliance);
		company.add(Flipkart);
		company.add(Amazon);

		while (true) {
			System.out.println("\n1.Reliance\n2.Flipkart\n3.Amazon");
			int input = sc.nextInt();
			if (input == 1) {
				Reliance = (EmployeeWage) company.get(0);
				System.out.println(
						"\n1.For checking employee attendence\n2.For employee daily wage\n3.For monthly wage\n4.Till condition check wages");
				int R_Input = sc.nextInt();
				switch (R_Input) {
				case 1:
					Reliance.present_absent();
					break;
				case 2:
					Reliance.daily_wage();
					break;
				case 3:
					Reliance.monthly_wage();
					break;
				case 4:
					Reliance.wage_till_condition();
					break;
				}
			} else if (input == 2) {
				Flipkart = (EmployeeWage) company.get(1);
				System.out.println(
						"\n1.For checking employee attendence\n2.For employee daily wage\n3.For monthly wage\n4.Till condition check wages");
				int R_Input = sc.nextInt();
				switch (R_Input) {
				case 1:
					Flipkart.present_absent();
					break;
				case 2:
					Flipkart.daily_wage();
					break;
				case 3:
					Flipkart.monthly_wage();
					break;
				case 4:
					Flipkart.wage_till_condition();
					break;
				}
			} else if (input == 3) {
				Amazon = (EmployeeWage) company.get(2);
				System.out.println(
						"\n1.For checking employee attendence\n2.For employee daily wage\n3.For monthly wage\n4.Till condition check wages");
				int A_Input = sc.nextInt();
				switch (A_Input) {
				case 1:
					Amazon.present_absent();
					break;
				case 2:
					Amazon.daily_wage();
					break;
				case 3:
					Amazon.monthly_wage();
					break;
				case 4:
					Amazon.wage_till_condition();
					break;
				}
			}
		}
	}
}
		