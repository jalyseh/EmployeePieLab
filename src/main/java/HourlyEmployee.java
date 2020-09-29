public class HourlyEmployee extends Employee{

    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(){

    }

    public HourlyEmployee(String name, HireDate hireDate, int hoursWorked, int hourlyRate) {
        super(name, hireDate);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void printBadge(){
        System.out.println("Name: " + this.getName());
        System.out.println("Type of employee: HourlyEmployee");
        System.out.println("Hire Date: " + this.getHireDate());
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
    public void sortPeopleByIncome(){

    }
}
