/** Week 8: recursively locate a same-group sample donor. Academic simulation only. */
public class BloodWeek08 {
    static int findDonor(String[] groups, String requestedGroup, int index) {
        if (index == groups.length) return -1;
        if (groups[index].equalsIgnoreCase(requestedGroup)) return index;
        return findDonor(groups, requestedGroup, index + 1);
    }

    public static void main(String[] args) {
        String[] donorIds = {"D101", "D102", "D103"};
        String[] names = {"Asha", "Ravi", "Meera"};
        String[] groups = {"A+", "O-", "B+"};
        int match = findDonor(groups, "O-", 0);
        System.out.println("Requested group: O-");
        System.out.println("Matched donor: " + donorIds[match] + " (" + names[match] + ")");
    }
}
