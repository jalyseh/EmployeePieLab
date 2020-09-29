public class Entrepreneur extends Person{

    private int income;

    public Entrepreneur(){

    }

    public Entrepreneur(String name, int income) {
        super(name);
        this.income = income;
    }
    @Override
    public double calculatePay(){
        return income;
    }

    public void sortPeopleByIncome(){

    }
}
