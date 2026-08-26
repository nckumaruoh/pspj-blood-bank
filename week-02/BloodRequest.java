/** Week 2: decide whether a requested blood unit can be issued. */
public class BloodRequest {
    public static void main(String[] args) {
        int availableUnits = 6, requestedUnits = 2;
        System.out.println(requestedUnits <= availableUnits ? "Request approved: issue " + requestedUnits + " units." : "Request pending: insufficient inventory.");
    }
}
