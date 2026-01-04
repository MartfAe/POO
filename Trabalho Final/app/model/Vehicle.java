package model;
import model.enums.VehicleStatus;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private String type;
    private String fuelType;
    private String transmission;
    private VehicleStatus status;

    // Getters and Setters
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public VehicleStatus getStatus() {
        return status;
    }
    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
    // Constructors
    public Vehicle(String make, String model, int year, int mileage, String type, String fuelType, String transmission, VehicleStatus status) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.type = type;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.status = status;
    }

    public Vehicle(String make, String model, int year) {
        this(make, model, year, 0, "Unknown", "Unknown", "Unknown", VehicleStatus.AVAILABLE);
    }

}
