/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.MuseumRep;

import java.util.ArrayList;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author anirudh
 */
public class MuseumRepDirectory {
    
        ArrayList <MuseumRep> museumRepList = new ArrayList<>();
        public static MuseumRep currentMuseumRep;

    public ArrayList<MuseumRep> getMuseumRepList() {
        return museumRepList;
    }

    public void setMuseumRepList(ArrayList<MuseumRep> museumRepList) {
        this.museumRepList = museumRepList;
    }
    
    
    public MuseumRep canLogin(String username, String password)
    {
        for(MuseumRep rep: museumRepList)
        {
            if(rep.getUsername().equals(username) && BCrypt.checkpw(password, rep.getPassword()))
            {
                return rep;
            }
        }
        return null;
    }

    public MuseumRep findRepForMuseum(int id) {
        
        for(MuseumRep mr: museumRepList)
        {
            if(mr.getMuseumId() == id)
                return mr;
        }
        
        return null;
        
    }
        
        

    
}
