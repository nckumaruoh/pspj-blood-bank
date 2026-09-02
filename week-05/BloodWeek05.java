/** Week 5: centralise stock decisions in reusable methods. Academic simulation only. */
public class BloodWeek05 {
    static boolean canIssue(int available, int requested) {
        return requested > 0 && requested <= available;
    }

    static int remainingAfterIssue(int available, int requested) {
        return canIssue(available, requested) ? available - requested : available;
    }

    static String stockLabel(int units) {
        return units <= 2 ? "low stock" : "sufficient stock";
    }

    public static void main(String[] args) {
        int oNegative = 4;
        int bPositive = 2;
        System.out.println("O- request x2: " + (canIssue(oNegative, 2) ? "approved" : "held")
            + "; remaining " + remainingAfterIssue(oNegative, 2));
        System.out.println("O- stock label: " + stockLabel(remainingAfterIssue(oNegative, 2)));
        System.out.println("B+ request x4: " + (canIssue(bPositive, 4) ? "approved" : "held")
            + "; remaining " + remainingAfterIssue(bPositive, 4));
    }
}
