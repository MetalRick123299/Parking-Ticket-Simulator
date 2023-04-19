package parking_sim;

public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    public PoliceOfficer(PoliceOfficer obj) {
        this.name = obj.name;
        this.badgeNumber = obj.badgeNumber;
    }

    public PoliceOfficer(String name, String badgeNumber) {
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

    // which is $25 for the first hour or part of an hour that the car is illegally
    // parked,
    // plus $10 for every additional hour or part of an hour that the car is
    // illegally parked.
    public ParkingTicket writeParkingTicket(ParkingMeter meter, ParkedCar car) {
        final int hoursOver = (car.getMinutesParked() - meter.getMinutesPurchased()) / 60;
        final int fine = 25 + (10 * hoursOver);
        return new ParkingTicket(this, car, fine);
    }

    public boolean isParkedCarExpired(ParkingMeter meter, ParkedCar car) {
        return car.getMinutesParked() > meter.getMinutesPurchased();
    }

    @Override
    public String toString() {
        return "Police Officer: \n\t" + "Officer Name: " + name + "\n\t" + "Badge Number: " + badgeNumber
                + "\n\t";
    }
}
