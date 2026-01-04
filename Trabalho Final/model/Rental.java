package app.model;

import java.time.LocalDate;

public class Rental {

    private LocalDate startDate;
    private LocalDate scheduledEndDate;
    private String pickupLocation;
    private double baseRate; 
    private double insuranceFee;
    private double totalCost;
    private String status;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalId;


    public Rental(LocalDate startDate, LocalDate scheduledEndDate, String pickupLocation, double baseRate, double insuranceFee, String status) {
        this.startDate = startDate;
        this.scheduledEndDate = scheduledEndDate;
        this.pickupLocation = pickupLocation;
        this.baseRate = baseRate;
        this.insuranceFee = insuranceFee;
        this.status = status;
    }

    public Rental(LocalDate startDate, LocalDate scheduledEndDate, String pickupLocation, double baseRate, double insuranceFee) {
        this(startDate, scheduledEndDate, pickupLocation, baseRate, insuranceFee, "AVAILABLE");
    }

    public Rental(){

    }

    // Getters and Setters
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }   
    public LocalDate getScheduledEndDate() {
        return scheduledEndDate;
    }
    public void setScheduledEndDate(LocalDate scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }
    public String getPickupLocation() {
        return pickupLocation;
    }
    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }
    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }
    public double getInsuranceFee() {
        return insuranceFee;
    }
    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public int getRentalId() {
        return rentalId;
    }
    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }



}
