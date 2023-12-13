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
public class MuseumVisitors {
    
    ArrayList<MuseumVisitor> museumVisitorList = new ArrayList<>();

    public ArrayList<MuseumVisitor> getMuseumVisitorList() {
        return museumVisitorList;
    }

    public void setMuseumVisitorList(ArrayList<MuseumVisitor> museumVisitorList) {
        this.museumVisitorList = museumVisitorList;
    }

    public ArrayList<MuseumVisitor> getVisitorsForMuseum(int museumId) {
        ArrayList<MuseumVisitor> visitors = new ArrayList<>();
        for(MuseumVisitor mv: museumVisitorList)
        {
            if(mv.getMuseumId() == museumId)
                visitors.add(mv);
        }
        return visitors;
    }
    
    
    
}
