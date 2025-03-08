import java.time.LocalDate;
import java.util.ArrayList;

public class Attendant extends Employee {
    private Manager manager;
    private ArrayList<Ocurrence> ocurrences;

    public Attendant(String name, LocalDate birthDay, Branch branch, double grossSalary, Manager manager, ArrayList<Ocurrence> ocurrences) {
        super(name, birthDay, branch, grossSalary);
        this.manager = manager;
        this.ocurrences = ocurrences;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public ArrayList<Ocurrence> getOcurrences() {
        return ocurrences;
    }

    public void setOcurrences(ArrayList<Ocurrence> ocurrences) {
        this.ocurrences = ocurrences;
    }
}
