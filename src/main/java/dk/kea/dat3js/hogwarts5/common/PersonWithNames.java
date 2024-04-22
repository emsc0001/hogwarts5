package dk.kea.dat3js.hogwarts5.common;

public interface PersonWithNames {
    String getFirstName();
    String getMiddleName();
    String getLastName();

    void setFirstName(String firstName);
    void setMiddleName(String middleName);
    void setLastName(String lastName);

    default void setFullName(String fullName) {
        if (fullName == null) {
            this.firstName = null;
            this.middleName = null;
            this.lastName = null;
        } else {
            int firstSpace = fullName.indexOf(" ");
            int lastSpace = fullName.lastIndexOf(" ");

            if (firstSpace == -1) {
                setFirstName(fullName);
                setMiddleName(null);
                setLastName(null);
            } else if (firstSpace == lastSpace) {
                setFirstName(fullName.substring(0, firstSpace));
                setMiddleName(fullName.substring(firstSpace + 1));
                setLastName(null);
            } else {
                setFirstName(fullName.substring(0, firstSpace));
                setMiddleName(fullName.substring(firstSpace + 1, lastSpace));
                setLastName(fullName.substring(lastSpace + 1));
            }
        }
    }
}
