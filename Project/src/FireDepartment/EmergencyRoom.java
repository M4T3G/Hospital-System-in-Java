package FireDepartment;

import java.util.ArrayList;

public class EmergencyRoom {
    private static int nextEmergencyRoomNumber = 1; 
    private int emergencyRoomNumber;
    private int durationOfStay;
    private ArrayList<EmergencyProcedure> emergencyProcedures; 

    public EmergencyRoom(int durationOfStay) {
        this.emergencyRoomNumber = nextEmergencyRoomNumber++;
        this.durationOfStay = durationOfStay;
        this.emergencyProcedures = new ArrayList<>();
    }

    public int getEmergencyRoomNumber() {
        return emergencyRoomNumber;
    }

    public void addEmergencyProcedure(EmergencyProcedure emergencyProcedure) {
        emergencyProcedures.add(emergencyProcedure);
    }

    @Override
    public String toString() {
        return "Emergency Room: " + emergencyRoomNumber + ", Duration of Stay: " + durationOfStay + " days";
    }
}
