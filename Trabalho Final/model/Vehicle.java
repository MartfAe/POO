package app.model;
import java.util.ArrayList;
import java.util.List;

import app.DAO.VehicleDAO;
public class Vehicle {


    // Attributes
    private String type;
    private String model;
    private String make;
    private int year;
    private int mileage;
    private String fuelType;
    private String transmission;

    private VehicleDAO status;


    // Getters and Setters
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getMileage(){
        return mileage;
    }
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public String getFuelType(){
        return fuelType;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    public String getTransmission(){
        return transmission;
    }
    public void setTransmission(String transmission){
        this.transmission = transmission;
    }

    public VehicleDAO getStatus() {
        return status;
    }
    public void setStatus(VehicleDAO status) {
        this.status = status;
    }
    


    // Constructors
    public Vehicle(String type, String model, String make, int year, int mileage, String fuelType, String transmission, VehicleDAO status) {
        this.type = type;
        this.model = model;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.status = status;

    }

    public Vehicle(String type, String model, String make, int year, int mileage, String fuelType) {
        this(type, model, make, year, mileage, fuelType, "Indefinido", VehicleDAO.AVAILABLE);
    }

    public Vehicle(String type, String model, String make, int year, int mileage) {
        this(type, model, make, year, mileage, "Indefinido", "Indefinido", VehicleDAO.AVAILABLE);
    }

    public Vehicle(){
    }


}
