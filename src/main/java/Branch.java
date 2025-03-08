import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Employee> employees;

    public Branch(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String getEmployeesNames(){
        if(employees.isEmpty())
            return "Sem empregados nessa unidade";
        StringBuilder name = new StringBuilder();
        for(Employee employee : employees){
            name.append(employee.getName()).append(",");
        }
        return name.toString();
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public boolean searchEmployee(Employee employee){
        return employees.contains(employee);
    }
}
