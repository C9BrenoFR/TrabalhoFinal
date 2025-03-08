import java.time.LocalDate;

public abstract class Employee extends Person{
    private Branch branch;
    private double grossSalary;

    public Employee(String name, LocalDate birthDay, Branch branch, double grossSalary) {
        super(name, birthDay);
        this.branch = branch;
        this.grossSalary = grossSalary;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
}
