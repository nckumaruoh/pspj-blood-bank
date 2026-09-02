/** Week 10: validate inventory requests with clear exceptions. Academic simulation only. */
public class BloodWeek10 {
    static class InvalidRequestException extends Exception {
        InvalidRequestException(String message) { super(message); }
    }

    static int validateUnits(String raw) throws InvalidRequestException {
        try {
            int units = Integer.parseInt(raw);
            if (units < 1 || units > 4) {
                throw new InvalidRequestException("Requested units must be from 1 to 4.");
            }
            return units;
        } catch (NumberFormatException exception) {
            throw new InvalidRequestException("Requested units must be a whole number.");
        }
    }

    static void check(String group, String rawUnits) {
        try {
            System.out.println("Accepted request: " + group + " x" + validateUnits(rawUnits));
        } catch (InvalidRequestException exception) {
            System.out.println("Rejected request '" + group + " x" + rawUnits + "': " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        check("O-", "2");
        check("O-", "0");
        check("B+", "unknown");
    }
}
