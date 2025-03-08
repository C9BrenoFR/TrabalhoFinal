import java.time.LocalDate;
import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Attendant> attendants;

    public Manager(String name, LocalDate birthDay, Branch branch, double grossSalary) {
        super(name, birthDay, branch, grossSalary);
    }

    public ArrayList<Attendant> getAttendants() {
        return attendants;
    }

    public void setAttendants(ArrayList<Attendant> attendants) {
        this.attendants = attendants;
    }
}
