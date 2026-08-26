/** Week 1: establish donor and blood-unit information for the project. */
public class BloodBank {
    public static void main(String[] args) {
        String donor = "Ravi Kumar";
        String bloodGroup = "O+";
        int unitsAvailable = 6;
        System.out.println("=== Blood Bank Inventory & Donor Matcher ===");
        System.out.println("Sample donor: " + donor + " (" + bloodGroup + ")");
        System.out.println("Available " + bloodGroup + " units: " + unitsAvailable);
        System.out.println("Next: validate blood requests in Week 2.");
    }
}
