import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person {
    private ArrayList<Purchase> purchases;
    private Rent rent;

    public Customer(String name, LocalDate birthDay) {
        super(name, birthDay);
    }
}
