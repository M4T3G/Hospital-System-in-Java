package FireDepartment;

import java.util.LinkedList;


public class Victim implements IMedicalPersonnel {
    private String name;
    private LinkedList<EmergencyProcedure> emergencyprocedure; 
    public Victim(String name) {
        this.name = name;
        this.emergencyprocedure = new LinkedList<>();
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Victim: " + name;
    }

    public LinkedList<EmergencyProcedure> getEmergencyProcedure() {
    	return emergencyprocedure;
    }
}
