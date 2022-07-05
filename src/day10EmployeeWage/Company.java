package day10EmployeeWage;

public class Company {

	private String companyName;
	private int wagePerHour;
	private int fullDayHour;
	private int partTimeHour;
	private int workingDayInMonth;
	private int workingHourPerMonth;
	public Company(String companyName, int wagePerHour, int fullDayHour, int partTimeHour, int workingDayInMonth,
			int workingHourPerMonth) {
		super();
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.fullDayHour = fullDayHour;
		this.partTimeHour = partTimeHour;
		this.workingDayInMonth = workingDayInMonth;
		this.workingHourPerMonth = workingHourPerMonth;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getWagePerHour() {
		return wagePerHour;
	}
	public void setWagePerHour(int wagePerHour) {
		this.wagePerHour = wagePerHour;
	}
	public int getFullDayHour() {
		return fullDayHour;
	}
	public void setFullDayHour(int fullDayHour) {
		this.fullDayHour = fullDayHour;
	}
	public int getPartTimeHour() {
		return partTimeHour;
	}
	public void setPartTimeHour(int partTimeHour) {
		this.partTimeHour = partTimeHour;
	}
	public int getWorkingDayInMonth() {
		return workingDayInMonth;
	}
	public void setWorkingDayInMonth(int workingDayInMonth) {
		this.workingDayInMonth = workingDayInMonth;
	}
	public int getWorkingHourPerMonth() {
		return workingHourPerMonth;
	}
	public void setWorkingHourPerMonth(int workingHourPerMonth) {
		this.workingHourPerMonth = workingHourPerMonth;
	}
}
