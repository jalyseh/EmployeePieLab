import java.util.Comparator;

public class Compari implements Comparator<Person>
{
    public int compare(Person o1, Person o2) {

        if(o1.calculatePay() > o2.calculatePay()){
            return 1;
        }
       else{
           return -1;
        }
    }
}


