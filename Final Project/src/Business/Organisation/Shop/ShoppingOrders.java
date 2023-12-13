/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Shop;

import Business.Organisation.HotelOrganisation.*;
import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class ShoppingOrders {
    
    ArrayList<ShoppingOrder> orderList = new ArrayList<>();

    public ArrayList<ShoppingOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<ShoppingOrder> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<ShoppingOrder> findOrdersForShop(int shopId) {
        ArrayList<ShoppingOrder> orders = new ArrayList<>();
        for(ShoppingOrder order: orderList)
        {
            if(order.getShopId() == shopId)
                orders.add(order);
    }
    return orders;
    
    
    }

    public ArrayList<ShoppingOrder> ginOrdersForCustomer(int id) {
        ArrayList<ShoppingOrder> custOrders = new ArrayList<>();
        for(ShoppingOrder order: orderList)
        {
            if(order.getCustomerId() == id)
                custOrders.add(order);
        }
        System.out.println(custOrders.size());
        return custOrders;
    }
}
