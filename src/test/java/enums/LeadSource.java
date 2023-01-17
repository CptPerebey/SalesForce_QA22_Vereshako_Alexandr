package enums;

public enum LeadSource {

    ADVERTISEMENT("Advertisement"), EMPLOYEEREFERRAL("Employee Referral"), EXTERNALREFERRAL("External Referral"),
    INSTORE("In-Store"), ONSITE("On Site");

    private final String name;

    LeadSource(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static LeadSource fromString(String value) {
        for (LeadSource leadSource : LeadSource.values()) {
            if (leadSource.getName().equals(value)) {
                return leadSource;
            }
        }
        return null;
    }
}
