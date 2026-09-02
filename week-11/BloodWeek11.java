import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/** Week 11: persist and restore sample inventory rows. Academic simulation only. */
public class BloodWeek11 {
    private static final Path STORE = Path.of("blood-inventory.csv");

    static int totalUnits(List<String> rows) {
        int total = 0;
        for (int index = 1; index < rows.size(); index++) {
            total += Integer.parseInt(rows.get(index).split(",")[1]);
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        List<String> rows = List.of(
            "group,units",
            "O-,4",
            "A+,6",
            "B+,2"
        );
        Files.write(STORE, rows, StandardCharsets.UTF_8);
        List<String> restored = Files.readAllLines(STORE, StandardCharsets.UTF_8);
        System.out.println("Saved " + (rows.size() - 1) + " inventory rows to " + STORE.getFileName());
        System.out.println("Loaded groups: " + (restored.size() - 1));
        System.out.println("Total stored units: " + totalUnits(restored));
    }
}
