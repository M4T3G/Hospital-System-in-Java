package Hospital;

import java.util.ArrayList;

import java.util.ArrayList;

public class Room {
	    private static int nextRoomNumber = 1; // Static variable to track room numbers
	    private int roomNumber;
	    private int durationOfStay;
	    private ArrayList<Treatment> treatments; // ArrayList for treatments

	    public Room(int durationOfStay) {
	        this.roomNumber = nextRoomNumber++;
	        this.durationOfStay = durationOfStay;
	        this.treatments = new ArrayList<>();
	    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void addTreatment(Treatment treatment) {
        treatments.add(treatment);
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber + ", Duration of Stay: " + durationOfStay + " days";
    }
}