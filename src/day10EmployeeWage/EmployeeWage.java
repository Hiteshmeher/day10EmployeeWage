package day10EmployeeWage;

public class EmployeeWage {
	int empPresent = 1;
	int wagePerHour;
	int fulldayHour;
	int partTimeHour;
	double checkingEmployee;
	String companyName;

// Constructor
	public EmployeeWage(String comp, int empwa, int fulldayhr, int parthr) {
		this.companyName = comp;
		this.wagePerHour = empwa;
		this.fulldayHour = fulldayhr;
		this.partTimeHour = parthr;
		this.checkingEmployee = Math.floor(Math.random() * 10) % 3 + 1;
	}

// Employee Attendence
	public void present_absent() {
		System.out.println("<<<< Welcome to Employee Wage Computation >>>>");
		if (checkingEmployee == empPresent) {
			System.out.println("Employee is present");

		} else if (checkingEmployee == 2) {
			System.out.println("Employee is absent");
		} else {
			System.out.println("Employee is doing part time");
		}
	}

// Calculating Daily wages of Employee	
	public void daily_wage() {
		if (checkingEmployee == empPresent) {
			System.out.println("Employee wage for " + companyName + " for a day is " + wagePerHour * fulldayHour);
		} else if (checkingEmployee == 2) {
			System.out.println("Sorry Employee is absent !!!!");
		} else {
			System.out.println("Employee is doing part time");
			System.out.println("Employee wage of " + companyName + " per day is " + wagePerHour * partTimeHour);
		}
	}

// Calculating Monthly wages of Employee
	public void monthly_wage() {
		int month = 20;
		switch ((int) checkingEmployee) {
		case 1:
			System.out.println("Employee wage of " + companyName + " for the month for full time is "
					+ wagePerHour * fulldayHour * month);
			break;
		case 3:
			System.out.println("Employee wage of " + companyName + "  for the month for part time is "
					+ wagePerHour * partTimeHour * month);
			break;
		case 2:
			System.out.println("Sorry Employee is absent !!!!");
		}
	}

// Calculating Wages of Employee till 20 days or 100 hours in a month
	public void wage_till_condition() {
		int dayCount = 1;
		int hourCount = 0;
		while (dayCount != 20 && hourCount != 100) {
			int checkingEmployee = (int) (Math.floor(Math.random() * 10) % 3 + 1);
			switch (checkingEmployee) {
			case 1:
				dayCount += 1;
				hourCount += fulldayHour;
				break;
			case 3:
				dayCount += 1;
				hourCount += partTimeHour;
				break;
			default:
				continue;
			}
		}
		System.out.println(
				"Employee wage of " + companyName + " with condition is " + wagePerHour * hourCount * dayCount);
	}
}