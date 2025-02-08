package FireDepartment;

import java.util.ArrayList;
import java.util.List;

public class Firefighter implements IMedicalPersonnel, IRescuer {

    private static ArrayList<Firefighter> firefighterList = new ArrayList<>();
    private String name;
    private double experience;
    int interventions = 2;

    public Firefighter(String name) {
        this.name = name;
        firefighterList.add(this);
    }

    public static List<Firefighter> getFirefighterList() {
        return firefighterList;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void performRescue() throws RescueUnsuccessfulException {
        for (int i = 0; i < interventions; i++) {
            boolean rescueSuccessful = Math.random() < 0.8;

            if (rescueSuccessful) {
                experience += 2.5;
            } else {
                experience = 0;
                throw new RescueUnsuccessfulException("Rescue by " + name + " was unsuccessful.");
            }
        }
    }

    public double getInterventions() {
        return interventions;
    }

    @Override
    public String toString() {
        return "Firefighter: " + name + ", Experience: " + experience + " interventions";
    }
}
