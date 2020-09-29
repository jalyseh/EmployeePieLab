public class Employee extends Person {

    private HireDate hireDate;

    public Employee(){

    }
    public Employee(String name, HireDate hireDate) {
        super(name);
        this.hireDate = hireDate;
    }

    public HireDate getHireDate(){
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }
    public void printBadge(){

        System.out.println("Name: " + this.getName());
        System.out.println("Hire Date: " + this.getHireDate());
    }

    public double calculatePay(){
        return 0.0;
    }

    public void sortPeopleByIncome(){

    }
}
