package FireDepartment;

import java.util.ArrayList;
import java.util.List;

public class FireDepartment {

	private ArrayList<Firefighter> rescuePersonnelList;
	
	    public FireDepartment() {
	        rescuePersonnelList = new ArrayList<>();
	    }
	
	    public void addRescuePersonnel(Firefighter personnel) {
	        rescuePersonnelList.add(personnel);
	    }
	
	    public void assignVictimToFirefighter(Firefighter firefighter, Victim victim, EmergencyProcedure emergencyProcedure) {
	        rescuePersonnelList.add(firefighter);
	        double dailyFee = 50.0;
	        double totalFee;
	        
	        try {
	            firefighter.performRescue();
	
	            for (int i = 0; i < firefighter.getInterventions(); i++) {
	                System.out.println(firefighter.getName() + " performed successful intervention on " + victim);
	                System.out.println("Prescribed Emergency Procedure: " + emergencyProcedure);
	
	                int durationOfStay = (int) (Math.random() * 5) + 1;
	                EmergencyRoom emergencyRoom = new EmergencyRoom(durationOfStay);
	                System.out.println("Allocated Emergency Room: " + emergencyRoom);
	
	                emergencyRoom.addEmergencyProcedure(emergencyProcedure);
	                System.out.println("Daily Fee for " + victim + ": $" + dailyFee);
	
	                totalFee = durationOfStay * dailyFee;
	                System.out.println("Total Fee for " + victim + ": $" + totalFee);
	                System.out.println("****** Emergency Procedure End ******\n");
	            }
	
	        } catch (RescueUnsuccessfulException e) {
	            System.out.println(e.getMessage());
	            System.out.println("Victim " + victim + " was not successfully rescued.");
	
	            totalFee = 0.0;
	            System.out.println("Total Fee for " + victim + ": $" + totalFee);
	            System.out.println("***** Emergency Procedure Fail*****\n");
	        }
	    }
	
	    public static <Z> void showList(List<Z> firefighters) {
	        for (Z x : firefighters)
	            System.out.println(x);
	    }
	}
