import java.util.ArrayList;

public class Manager {
    private ArrayList<Attendant> attendants;

    public Manager(ArrayList<Attendant> attendants) {
        this.attendants = attendants;
    }

    public ArrayList<Attendant> getAttendants() {
        return attendants;
    }

    public void setAttendants(ArrayList<Attendant> attendants) {
        this.attendants = attendants;
    }
}
