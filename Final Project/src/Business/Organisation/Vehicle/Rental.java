/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Vehicle;

/**
 *
 * @author anirudh
 */
public class Rental {
    
    private int customerId;
    private String vehicleName;
    private float hourlyPrice;
    private int noOfHours;
    private float totalPrice;
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public float getHourlyPrice() {
        return hourlyPrice;
    }

    public void setHourlyPrice(float hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfDays) {
        this.noOfHours = noOfDays;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
    
    
}
