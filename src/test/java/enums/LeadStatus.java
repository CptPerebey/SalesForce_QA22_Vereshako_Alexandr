package enums;

public enum LeadStatus {
    NEW("New"), CONTACTED("Contacted"), WORKING("Working"),
    QUALIFIELD("Qualified"), UNQUALIFIELD("Unqualified");

    private final String name;

    LeadStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static LeadStatus fromString(String value) {
        for (LeadStatus leadStatus : LeadStatus.values()) {
            if (leadStatus.getName().equals(value)) {
                return leadStatus;
            }
        }
        return null;
    }
}
