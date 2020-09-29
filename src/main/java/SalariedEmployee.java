public class SalariedEmployee extends Employee{

    private int salary;

    public SalariedEmployee(){

    }

    public SalariedEmployee(String name, HireDate hireDate, int salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public void printBadge(){

        System.out.println("Name: " + this.getName());
        System.out.println("Type of employee: SalariedEmployee");
        System.out.println("Hire Date: " + this.getHireDate());
    }

    @Override
    public double calculatePay() {
        return salary;
    }
    public void sortPeopleByIncome(){

    }

}
