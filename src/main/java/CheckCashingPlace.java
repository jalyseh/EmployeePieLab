import java.util.ArrayList;
import java.util.Collections;

public class CheckCashingPlace {

    public static void main(String[] args) {

        Entrepreneur entrepreneur = new Entrepreneur("Bob", 20000);

        HireDate jamesHireDate = new HireDate(2,30,2020);
        SalariedEmployee salariedEmployee = new SalariedEmployee("James", jamesHireDate,1000);

        HireDate mikeHireDate = new HireDate(3,19,1999);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mike", mikeHireDate, 40, 10);

        HumanResources humanResources = new HumanResources();

        Person[] payablePeople = new Person[3];
        payablePeople[0] = entrepreneur;
        payablePeople[1] = salariedEmployee;
        payablePeople[2] = hourlyEmployee;

        Employee[] payableEmployees = new Employee[2];
        payableEmployees[0] = salariedEmployee;
        payableEmployees[1] = hourlyEmployee;

        humanResources.issueBadge(payableEmployees);
        System.out.println();
        System.out.println("Prior to sorting by pay...");

        humanResources.payPerson(payablePeople);

        ArrayList<Person> unSorted = new ArrayList<Person>();
        unSorted.add(entrepreneur);
        unSorted.add(hourlyEmployee);
        unSorted.add(salariedEmployee);

        System.out.println();

        System.out.println("After sorting by pay...");
        humanResources.sortPeopleByIncome(unSorted);







    }
}
