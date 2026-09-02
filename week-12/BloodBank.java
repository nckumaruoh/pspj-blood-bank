import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/** Final release: same-group stock teaching simulation, not clinical decision support. */
public class BloodBank {
    private final Map<String, Integer> stock = new LinkedHashMap<>();

    private void addStock(String group, int units) {
        if (units < 0) throw new IllegalArgumentException("Units cannot be negative");
        stock.put(group, stock.getOrDefault(group, 0) + units);
    }

    private boolean issueSameGroup(String group, int units) {
        int available = stock.getOrDefault(group, 0);
        if (units <= 0 || available < units) return false;
        stock.put(group, available - units);
        return true;
    }

    private void report() {
        System.out.println("BLOOD BANK INVENTORY & DONOR MATCHER - FINAL RELEASE");
        boolean oNegativeIssued = issueSameGroup("O-", 2);
        boolean bPositiveIssued = issueSameGroup("B+", 4);
        System.out.println("Issue O- x2: " + (oNegativeIssued ? "approved" : "rejected"));
        System.out.println("Issue B+ x4: " + (bPositiveIssued ? "approved" : "rejected"));
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.printf("%s %d unit(s)%n", entry.getKey(), entry.getValue());
        }
        String lowStock = stock.entrySet().stream()
            .filter(entry -> entry.getValue() <= 2)
            .map(Map.Entry::getKey)
            .collect(Collectors.joining(", "));
        System.out.println("Low-stock groups: " + lowStock);
    }

    public static void main(String[] args) {
        BloodBank bank = new BloodBank();
        bank.addStock("O-", 4);
        bank.addStock("A+", 6);
        bank.addStock("B+", 2);
        bank.report();
    }
}
