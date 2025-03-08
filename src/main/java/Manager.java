import java.time.LocalDate;
import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Attendant> attendants;

    public Manager(String name, LocalDate birthDay, Branch branch, double grossSalary) {
        super(name, birthDay, branch, grossSalary);
        attendants = new ArrayList<>();
    }

    public ArrayList<Attendant> getAttendants() {
        return attendants;
    }

    public String getAttendantsNames(){
        if(attendants.isEmpty())
            return "Não possui Atendentes";
        StringBuilder names = new StringBuilder();
        for(Attendant attendant : attendants){
            names.append(attendant.getName()).append(",");
        }
        return names.toString();
    }

    public void setAttendants(ArrayList<Attendant> attendants) {
        this.attendants = attendants;
    }

    public void addAttendant(Attendant attendant){
        attendants.add(attendant);
    }

    public void removeAttendant(Attendant attendant){
        attendants.remove(attendant);
    }

    public boolean searchAttendant(Attendant attendant){
        return attendants.contains(attendant);
    }

    public double getNetSalary(){
        return 300 * attendants.size() + getGrossSalary();
    }

}
