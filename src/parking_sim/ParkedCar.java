package parking_sim;

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    public ParkedCar(ParkedCar obj) {
        this.make = obj.make;
        this.model = obj.model;
        this.color = obj.color;
        this.licenseNumber = obj.licenseNumber;
        this.minutesParked = obj.minutesParked;
    }

    public ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setLicenseNumber(String newLicenseNumber) {
        this.licenseNumber = newLicenseNumber;
    }

    public void setMinutesParked(int newMinutesParked) {
        this.minutesParked = newMinutesParked;
    }

    @Override
    public String toString() {
        return "Make: " + make + "\nModel: " + model + "\nColor: " + "License number: " + licenseNumber
                + "\nMinutes parked: " + minutesParked;
    }
}
