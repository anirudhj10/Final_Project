/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Shop;

import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class ShoppingAppointments {
    
    ArrayList<ShoppingAppointment> appointmentList = new ArrayList<>();

    public ArrayList<ShoppingAppointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(ArrayList<ShoppingAppointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public ArrayList<ShoppingAppointment> findAppointmentsForRep(int id) {
        ArrayList<ShoppingAppointment> appointments = new ActivatableArrayList<>();
        for(ShoppingAppointment app: appointmentList)
        {
            if(app.getShopId() == id)
            {
                appointments.add(app);
            }
        }
        return appointments;
    }
    
    
    
}
