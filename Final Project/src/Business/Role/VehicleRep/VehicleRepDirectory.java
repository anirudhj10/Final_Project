/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.VehicleRep;

import java.util.ArrayList;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author anirudh
 */
public class VehicleRepDirectory {
    
        ArrayList<VehicleRep> vehicleRepList = new ArrayList<>();
        public static VehicleRep currentVehiclerep;
    public ArrayList<VehicleRep> getVehicleRepList() {
        return vehicleRepList;
    }

    public void setVehicleRepList(ArrayList<VehicleRep> vehicleRepList) {
        this.vehicleRepList = vehicleRepList;
    }
    
        public VehicleRep canLogin(String username, String password)
    {
        for(VehicleRep rep: vehicleRepList)
        {
            if(rep.getUsername().equals(username) && BCrypt.checkpw(password, rep.getPassword()))
            {
                return rep;
            }
        }
        return null;
    }
        
        

    
}
