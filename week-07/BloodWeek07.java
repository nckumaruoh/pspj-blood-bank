/** Week 7: encapsulate same-group stock updates and their edge cases. Academic simulation only. */
public class BloodWeek07 {
    static class InventoryDesk {
        private int oNegativeUnits;

        void add(int units) {
            if (units <= 0) {
                System.out.println("Rejected addition: units must be positive.");
                return;
            }
            oNegativeUnits += units;
            System.out.println("Added O- x" + units + ".");
        }

        void issue(int units) {
            if (units <= 0) {
                System.out.println("Rejected issue: units must be positive.");
            } else if (units > oNegativeUnits) {
                System.out.println("Held issue: insufficient O- stock.");
            } else {
                oNegativeUnits -= units;
                System.out.println("Issued O- x" + units + "; remaining " + oNegativeUnits + ".");
            }
        }

        void printStatus() {
            System.out.println("O- stock: " + oNegativeUnits + " units");
        }
    }

    public static void main(String[] args) {
        InventoryDesk desk = new InventoryDesk();
        desk.add(4);
        desk.issue(2);
        desk.issue(0); // Edge case: no stock change.
        desk.printStatus();
    }
}
