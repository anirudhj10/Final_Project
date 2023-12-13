/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Vehicle;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class VehicleCompany {
    
    int companyId = 1;
    
    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    
    
    public ArrayList<Vehicle> vehiclesForACity(String city) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for(Vehicle vehicle: vehicleList)
        {
            if(vehicle.getLocation().equals(city))
                vehicles.add(vehicle);
        }
        return vehicles;
    }

    public Vehicle getVehicleByName(String vehicleName) {
        for(Vehicle v: vehicleList)
        {
            if(v.getName().equals(vehicleName))
                    return v;
        }
        return null;
    }
    
    
    
    
}
