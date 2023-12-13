/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Museum;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class MuseumDirectory {
    
    ArrayList<Museum> museumList = new ArrayList<>();

    public ArrayList<Museum> getMuseumList() {
        return museumList;
    }

    public void setMuseumList(ArrayList<Museum> museumList) {
        this.museumList = museumList;
    }

    public ArrayList<Museum> museumForACity(String city) {
        ArrayList<Museum> museums = new ArrayList<>();
        for(Museum m: museumList)
        {
            if(m.getLocation().equals(city))
                museums.add(m);
        }
        System.out.println(museums.size());
        return museums;
    }

    public Museum getMuseumByName(String museumName) {
        for(Museum museum: museumList)
        {
            if(museum.getName().equals(museumName))
                return museum;
        }
        return null;
    }
    
    public Museum getMuseumById(int id)
    {
        for(Museum m: museumList)
        {
            if(m.getId() == id)
                return m;
        }
        return null;
    }
    
    
    
}
