package day10EmployeeWage;

public class EmployeeWage {

	static final int IsPartTime = 0;
	static final int IsFulltime = 1;

	private final String Company;
	private final int WorkingDayInMonth;
	private final int WorkingHourPerMonth;
	private final int WagePerHour;
	private int totalEmpwage;

	public EmployeeWage(String Company, int WagePerHour, int WorkingDayInMonth, int WorkingHourPerMonth) {
		/**
		 * defining final variables
		 * instance variable
		 * generating random number 0, 1, 2 
		 * if o the part time job 
		 * if 1 then present for the job
		 * if 2 then absent 
		 * calculating total working hour and total employee wage for month
		 *
		 */

		this.Company = Company;
		this.WagePerHour = WagePerHour;
		this.WorkingDayInMonth = WorkingDayInMonth;
		this.WorkingHourPerMonth = WorkingHourPerMonth;
	}

	public void Empwage() {
		int EmpHour = 0;
		int workingDay = 0;
		int totalWorkingHoursInMonth = 0;
		while (workingDay <= WorkingDayInMonth && totalWorkingHoursInMonth <= WorkingHourPerMonth) {
			int attendance = (int) Math.floor(Math.random() * 10) % 3;
			workingDay++;
			switch (attendance) {
			case IsPartTime:
				EmpHour = 4;
				break;
			case IsFulltime:
				EmpHour = 8;
				break;
			default:
				EmpHour = 0;
				break;
			}
			totalWorkingHoursInMonth += EmpHour;
			System.out.println("day " + workingDay + " employee hour is " + EmpHour);
		}
		totalEmpwage = totalWorkingHoursInMonth * WagePerHour;
	}

	public String toString() {
		return "Total employee wage for company " + Company + " is " + totalEmpwage;
	}
}
