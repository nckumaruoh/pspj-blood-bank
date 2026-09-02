/** Week 4: process a loop-driven sample inventory session. Academic simulation only. */
public class BloodWeek04 {
    public static void main(String[] args) {
        String[] groups = {"O-", "B+"};
        int[] stock = {4, 2};
        int[] requested = {2, 4};
        int index = 0;

        System.out.println("=== BLOOD BANK MENU ===");
        System.out.println("1. Add stock");
        System.out.println("2. Issue same-group request");
        System.out.println("3. Report inventory");
        while (index < groups.length) {
            if (requested[index] <= stock[index]) {
                stock[index] -= requested[index];
                System.out.println("Request " + groups[index] + " x" + requested[index]
                    + ": approved; remaining " + stock[index]);
            } else {
                System.out.println("Request " + groups[index] + " x" + requested[index]
                    + ": held; available " + stock[index]);
            }
            index++;
        }
        System.out.println("Requests processed: " + index);
    }
}
