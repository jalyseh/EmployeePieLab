
import java.util.ArrayList;
import java.util.Collections;

public class HumanResources{


    public void issueBadge(Employee[] employee){

        for(Employee currentEmp : employee){
            if(currentEmp instanceof SalariedEmployee){
                currentEmp.printBadge();
            }
            else if(currentEmp instanceof HourlyEmployee){
                currentEmp.printBadge();
            }
            else{
                System.out.println("You don't work here!");
            }
        }
    }
    public void printPaymentInfo(Person payablePerson){


        System.out.println(payablePerson.getClass().getSimpleName() + " should be paid: " +
                payablePerson.calculatePay());

    }
    public void payPerson(Person[] personArray) {


        for (Person currentPerson : personArray) {
            System.out.println(currentPerson.getName() + " should be paid : " + currentPerson.calculatePay());

        }
    }
     public void sortPeopleByIncome(ArrayList<Person> payablePeople) {

         Collections.sort(payablePeople, new Compari());


         for(Person eachPerson : payablePeople) {
             System.out.println(eachPerson.getName() + " should be paid : " + eachPerson.calculatePay());
         }

        }
     }

