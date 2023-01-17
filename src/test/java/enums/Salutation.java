package enums;

public enum Salutation {
    MR("Mr."), MS("Ms."), MRS("Mrs."), DR("Dr."), PROF("Prof.");

    private final String name;

    Salutation(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Salutation fromString(String value) {
        for (Salutation salutation : Salutation.values()) {
            if (salutation.getName().equals(value)) {
                return salutation;
            }
        }
        return null;
    }
}
