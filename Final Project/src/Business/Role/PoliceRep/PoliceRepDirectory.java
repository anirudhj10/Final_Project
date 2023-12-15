/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.PoliceRep;

import java.util.ArrayList;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author anirudh
 */
public class PoliceRepDirectory {
    
        ArrayList <PoliceRep> policeRepList = new ArrayList<>();
        public static PoliceRep currentPoliceRep;

    public ArrayList<PoliceRep> getPoliceRepList() {
        return policeRepList;
    }

    public void setPoliceRepList(ArrayList<PoliceRep> policeRepList) {
        this.policeRepList = policeRepList;
    }
    
    public PoliceRep canLogin(String username, String password)
    {
        for(PoliceRep rep: policeRepList)
        {
            if(rep.getUsername().equals(username) && BCrypt.checkpw(password, rep.getPassword()))
            {
                return rep;
            }
        }
        return null;
    }

    public PoliceRep returnRepforDepartment(int id) {
        
        for(PoliceRep rep: policeRepList)
        {
            if(rep.getDepartmentId() == id)
            {
                return rep;
            }
        }
        return null;
        
        
    }
        
        

    
}
