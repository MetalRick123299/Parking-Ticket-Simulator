package parking_sim;

public class ParkingTicket {
    private PoliceOfficer officer;
    private ParkedCar car;
    private double fine;

    public ParkingTicket(ParkingTicket obj) {
        this.officer = obj.officer;
        this.car = obj.car;
        this.fine = obj.fine;
    }

    public ParkingTicket(PoliceOfficer officer, ParkedCar car, double fine) {
        this.officer = officer;
        this.car = car;
        this.fine = fine;
    }

    public PoliceOfficer getOfficer() {
        return officer;
    }

    public ParkedCar getCar() {
        return car;
    }

    public double getFine() {
        return fine;
    }

    public void setOfficer(PoliceOfficer newPoliceOfficer) {
        this.officer = newPoliceOfficer;
    }

    public void setCar(ParkedCar newCar) {
        this.car = newCar;
    }

    public void setFine(double newFine) {
        this.fine = newFine;
    }

    @Override
    public String toString() {
        return "Parking Ticket:" + "\n    " + officer + "" + car + "\n    " + "Fine: " + fine + "\n";
    }
}
