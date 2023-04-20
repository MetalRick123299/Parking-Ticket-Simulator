import parking_sim.ParkedCar;
import parking_sim.ParkingMeter;
// import parking_sim.ParkingTicket; <- never used as tickets are created by PoliceOfficer Class
import parking_sim.PoliceOfficer;

public class ParkingTicketSimulator {
    public static void main(String[] args) throws Exception {
        System.out.println();

        final int length = 10;
        ParkedCar[] cars = new ParkedCar[length];
        ParkingMeter[] meters = new ParkingMeter[length];

        // Data for ParkingTicketSimulator \/
        cars[0] = new ParkedCar("Mazda", "CX-5", "blue", "BGT-1357", 60);
        meters[0] = new ParkingMeter(45);

        cars[1] = new ParkedCar("Toyota", "Corolla", "blue", "KLM-4521", 60);
        meters[1] = new ParkingMeter(45);

        cars[2] = new ParkedCar("Ford", "Mustang", "black", "RTF-7890", 30);
        meters[2] = new ParkingMeter(15);

        cars[3] = new ParkedCar("Chevrolet", "Impala", "silver", "YMN-3452", 120);
        meters[3] = new ParkingMeter(90);

        cars[4] = new ParkedCar("Honda", "Civic", "white", "ABC-1234", 20);
        meters[4] = new ParkingMeter(30);

        cars[5] = new ParkedCar("Nissan", "Sentra", "red", "XYZ-9876", 75);
        meters[5] = new ParkingMeter(60);

        cars[6] = new ParkedCar("Dodge", "Challenger", "green", "PQR-5678", 10);
        meters[6] = new ParkingMeter(5);

        cars[7] = new ParkedCar("Kia", "Soul", "gray", "GHT-2468", 25);
        meters[7] = new ParkingMeter(20);

        cars[8] = new ParkedCar("Subaru", "Outback", "orange", "LMN-9876", 90);
        meters[8] = new ParkingMeter(75);

        cars[9] = new ParkedCar("Jeep", "Wrangler", "yellow", "DEF-4567", 45);
        meters[9] = new ParkingMeter(30);

        PoliceOfficer officer = new PoliceOfficer("Jimmy", "B-981-654-3210");
        // Data for ParkingTicketSimulator /\

        System.out.println("------------------------------------------------------------------");

        System.out.println(officer);
        System.out.println("Officer " + officer.getName()
                + " will look through the parking lot and give out tickets if car is illegally parked cars\n");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " " + cars[i]);
            if (officer.isParkedCarExpired(meters[i], cars[i])) {
                System.out.println("Ticket for this car is :\n" +
                        officer.writeParkingTicket(meters[i], cars[i]));
            } else {
                System.out.println("This car is parked legally");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------");
    }
}
