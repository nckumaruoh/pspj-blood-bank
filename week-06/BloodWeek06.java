/** Week 6: search and analyse same-group stock using arrays. Academic simulation only. */
public class BloodWeek06 {
    static int indexOf(String[] groups, String requested) {
        for (int index = 0; index < groups.length; index++) {
            if (groups[index].equalsIgnoreCase(requested)) return index;
        }
        return -1;
    }

    static int highestStockIndex(int[] units) {
        int highest = 0;
        for (int index = 1; index < units.length; index++) {
            if (units[index] > units[highest]) highest = index;
        }
        return highest;
    }

    public static void main(String[] args) {
        String[] groups = {"O-", "A+", "B+"};
        int[] units = {4, 6, 2};
        int bPositive = indexOf(groups, "B+");
        int highest = highestStockIndex(units);
        System.out.println("Lookup B+: " + units[bPositive] + " units");
        System.out.println("Highest stock: " + groups[highest] + " (" + units[highest] + " units)");
        System.out.println("Groups tracked: " + groups.length);
    }
}
