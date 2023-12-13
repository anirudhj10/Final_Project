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
public class ParkVisitors {
    
    ArrayList<ParkVisitor> visitorList = new ArrayList<>();

    public ArrayList<ParkVisitor> getVisitorList() {
        return visitorList;
    }

    public void setVisitorList(ArrayList<ParkVisitor> visitorList) {
        this.visitorList = visitorList;
    }

    public ArrayList<ParkVisitor> findVisitorsForPark(int parkId) {
        ArrayList<ParkVisitor> visitors = new ArrayList<>();
        for(ParkVisitor pv: visitorList)
        {
            if(pv.getParkId() == parkId)
                visitors.add(pv);
        }
        return visitors;
    }
    
    
    
}
