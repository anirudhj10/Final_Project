/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Park;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class ParkDirectory {
    
    ArrayList<Park> parkList = new ArrayList<>();

    public ArrayList<Park> getParkList() {
        return parkList;
    }

    public void setParkList(ArrayList<Park> parkList) {
        this.parkList = parkList;
    }
    
    public ArrayList<Park> parksForACity(String city)
    {
        ArrayList<Park> parksList = new ArrayList<>();
        for(Park park: parkList)
        {
            if(park.getLocation().equals(city))
                parksList.add(park);

        }
        return parksList;
    }
        
        
    public Park getParkByName(String name)
    {
        int found = 0;
        for(Park park: parkList)
        {
            if(park.getName().equals(name))
            {
                return park;
 
            }
        }
        return null;
    }
    
    
    
}
