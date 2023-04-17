package parking_sim;

public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    PoliceOfficer(PoliceOfficer obj) {
        this.name = obj.name;
        this.badgeNumber = obj.badgeNumber;
    }

    PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public String getName() {
        return name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void getName(String newName) {
        this.name = newName;
    }

    public void getBadgeNumber(String newBadgeNumber) {
        this.badgeNumber = newBadgeNumber;
    }

    public String toString() {
        return "String";
    }
}
