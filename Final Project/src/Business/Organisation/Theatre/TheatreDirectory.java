/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Theatre;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class TheatreDirectory {
    
    ArrayList<Theatre> theatreList = new ArrayList<>();

    public ArrayList<Theatre> getTheatreList() {
        return theatreList;
    }

    public void setTheatreList(ArrayList<Theatre> theatreList) {
        this.theatreList = theatreList;
    }

    public ArrayList<Theatre> theatresForACity(String city) {
        ArrayList<Theatre> theatres = new ArrayList<>();
        for(Theatre t: theatreList)
        {
            if(t.getLocation() == city)
                theatres.add(t);
        }
        return theatres;
    }

    public Theatre getTheatreByName(String theatreName) {
        for(Theatre t: theatreList)
        {
            if(t.getName().equals(theatreName))
            {
                System.out.println(t.getName());
                return t;
            }
        }
        return null;
    }
    
    
    
}
