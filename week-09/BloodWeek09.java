/** Week 9: model donor records and a registry. Academic simulation only. */
public class BloodWeek09 {
    static class Donor {
        private final String id;
        private final String name;
        private final String group;

        Donor(String id, String name, String group) {
            this.id = id;
            this.name = name;
            this.group = group;
        }
    }

    static class DonorRegistry {
        private final Donor[] donors = new Donor[5];
        private int count;

        void register(Donor donor) {
            donors[count++] = donor;
        }

        Donor findSameGroup(String group) {
            for (int index = 0; index < count; index++) {
                if (donors[index].group.equalsIgnoreCase(group)) return donors[index];
            }
            return null;
        }

        int size() { return count; }
    }

    public static void main(String[] args) {
        DonorRegistry registry = new DonorRegistry();
        registry.register(new Donor("D101", "Asha", "A+"));
        registry.register(new Donor("D102", "Ravi", "O-"));
        Donor match = registry.findSameGroup("O-");
        System.out.println("Registered donors: " + registry.size());
        System.out.println("O- donor match: " + match.name + " (" + match.id + ")");
    }
}
