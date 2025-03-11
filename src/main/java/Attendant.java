import java.time.LocalDate;
import java.util.ArrayList;

public class Attendant extends Employee {
    private Manager manager;
    private ArrayList<Occurrence> occurrences;

    public Attendant(String name, LocalDate birthDay, Branch branch, double grossSalary, Manager manager) {
        super(name, birthDay, branch, grossSalary);
        this.manager = manager;
        occurrences = new ArrayList<>();
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

    public ArrayList<Occurrence> getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(ArrayList<Occurrence> occurrences) {
        this.occurrences = occurrences;
    }

    public void addOcurence(Occurrence occurrence){
        occurrences.add(occurrence);
    }

    public double getNetSalary(){
        double netSalary = getGrossSalary();
        for(Occurrence occurrence : occurrences){
            if(occurrence.getDate().getMonthValue() == LocalDate.now().getMonthValue() && occurrence.getDate().getYear() == LocalDate.now().getYear()) {
                netSalary += occurrence.getValue();
            }
        }
        return netSalary;
    }
}
