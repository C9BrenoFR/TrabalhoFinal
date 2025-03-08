import java.time.LocalDate;
import java.util.ArrayList;

public class Attendant extends Employee {
    private Manager manager;
    private ArrayList<Ocurrence> ocurrences;

    public Attendant(String name, LocalDate birthDay, Branch branch, double grossSalary, Manager manager) {
        super(name, birthDay, branch, grossSalary);
        this.manager = manager;
        ocurrences = new ArrayList<>();
    }

    public Manager getManager() {
        return manager;
    }

    public String getManagerName(){
        return manager.getName();
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

    public void addOcurence(Ocurrence ocurrence){
        ocurrences.add(ocurrence);
    }

    public double getNetSalary(){
        double netSalary = getGrossSalary();
        for(Ocurrence ocurrence: ocurrences){
            if(ocurrence.getDate().getMonthValue() == LocalDate.now().getMonthValue() && ocurrence.getDate().getYear() == LocalDate.now().getYear()) {
                netSalary += ocurrence.getValue();
            }
        }
        return netSalary;
    }
}
