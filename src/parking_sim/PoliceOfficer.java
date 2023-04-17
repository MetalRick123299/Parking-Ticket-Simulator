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

    public ParkingTicket writeParkingTicket(ParkingMeter meter, ParkedCar car) {
        final int minutesOver = car.getMinutesParked() - meter.getMinutesPurchased();
        final double fine = 100.00 + (Math.max(minutesOver, 0) * 0.10);
        return new ParkingTicket(this, car, fine);
    }

    public boolean isParkedCarExpired(ParkingMeter meter, ParkedCar car) {
        return car.getMinutesParked() > meter.getMinutesPurchased();
    }

    @Override
    public String toString() {
        return "Officer Name: " + name + "\n" + "Badge Number: " + badgeNumber;
    }
}
