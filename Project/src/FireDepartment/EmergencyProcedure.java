package FireDepartment;

class EmergencyProcedure {
    private String procedure;
    private int recoveryPeriodDays;
    private double rescueCost;

    public EmergencyProcedure(String procedure, int recoveryPeriodDays, double rescueCost) {
        this.procedure = procedure;
        this.recoveryPeriodDays = recoveryPeriodDays;
        this.rescueCost = rescueCost;
    }

    @Override
    public String toString() {
        return "Emergency Procedure: " + procedure + ", Recovery Period: " + recoveryPeriodDays + " days, Rescue Cost: $" + rescueCost;
    }
}