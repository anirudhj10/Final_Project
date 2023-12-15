/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.ShopRep;

import java.util.ArrayList;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author anirudh
 */
public class ShopRepDirectory {
    
        ArrayList <ShopRep> shopRepList = new ArrayList<>();
        public static ShopRep currentShopRep;

    public ArrayList<ShopRep> getShopRepList() {
        return shopRepList;
    }

    public void setShopRepList(ArrayList<ShopRep> shopRepList) {
        this.shopRepList = shopRepList;
    }
    

    public ShopRep canLogin(String username, String password)
    {
        for(ShopRep rep: shopRepList)
        {
            if(rep.getUsername().equals(username) && BCrypt.checkpw(password, rep.getPassword()))
            {
                return rep;
            }
        }
        return null;
    }    

    public ShopRep getShopRep(int id) {
        for(ShopRep rep: shopRepList)
        {
            if(rep.getShopId() == id)
                return rep;
        }
        return null;
    }


    

        

    
}
