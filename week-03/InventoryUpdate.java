/** Week 3: update inventory after a compatible-unit issue. */
public class InventoryUpdate {
    public static void main(String[] args) {
        int stock = 6, issued = 2; stock -= issued;
        System.out.println("Issued " + issued + " O+ units; remaining stock: " + stock);
    }
}
