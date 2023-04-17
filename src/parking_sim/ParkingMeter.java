package parking_sim;

public class ParkingMeter {
    private int minutesPurchased;

    ParkingMeter(ParkingMeter obj) {
        this.minutesPurchased = obj.minutesPurchased;
    }

    ParkingMeter(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }

    public void setMinutesPurchased(int newMinutesPurchased) {
        this.minutesPurchased = newMinutesPurchased;
    }

    public String toString() {
        return "String";
    }
}
