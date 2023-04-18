import parking_sim.ParkedCar;
import parking_sim.ParkingMeter;
import parking_sim.ParkingTicket;
import parking_sim.PoliceOfficer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println();
        ParkedCar car = new ParkedCar("BMW", "12F4", "Blue", "1F4CC41D", 45);
        ParkingMeter meter = new ParkingMeter(10);
        PoliceOfficer officer = new PoliceOfficer("Jimmy", "1254LAPD");
        ParkingTicket ticket = officer.writeParkingTicket(meter, car);

        System.out.println(car);
        System.out.println(meter);
        System.out.println(officer);
        System.out.println(ticket);
    }
}
