/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Customer;

import Business.EcoSystem;
import UserInterface.Homepage.MainJFrame;
import UserInterface.MedicalHelp.HospitalsNearbyJPanel;
import UserInterface.Analyst.AnalyzeMarketJpanel;
import UserInterface.Park.CustomerExploreParkJPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import UserInterface.Customer.CustomerExlporeActivitieJPanel;

/**
 *
 * @author anirudh
 */
public class CustomerDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerDashboardJPanel
     */
    EcoSystem system;
    public CustomerDashboardJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        //method for click-response action buttons
        ArrayList<JButton> buttonList = new ArrayList<>();
        buttonList.add(btnEmerServices);
        buttonList.add(btnExpActivities);
        buttonList.add(btnExpRest);
        buttonList.add(btnExpShopping);
        buttonList.add(btnRentVehicles);
        
        ActionListener buttonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                for (JButton btn : buttonList) {
                    btn.setForeground(Color.BLACK); 
                    btn.setBackground(Color.DARK_GRAY);
                    Font originalFont = btn.getFont();
                    Font plainFont = originalFont.deriveFont(Font.PLAIN);
                    btn.setFont(plainFont);
                }
                clickedButton.setForeground(Color.red); 
                clickedButton.setBackground(Color.white);
                Font originalFont = clickedButton.getFont();
                Font boldFont = originalFont.deriveFont(Font.BOLD);
                clickedButton.setFont(boldFont);
            }
        };
        for (JButton btn : buttonList) {
        btn.addActionListener(buttonActionListener);
}
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnExpRest = new javax.swing.JButton();
        btnEmerServices = new javax.swing.JButton();
        btnExpShopping = new javax.swing.JButton();
        btnExpActivities = new javax.swing.JButton();
        btnRentVehicles = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new AnalyzeMarketJpanel.jPanelGradient();

        jSplitPane1.setDividerLocation(200);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        btnExpRest.setText("Explore Restaurants");
        btnExpRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpRestActionPerformed(evt);
            }
        });

        btnEmerServices.setText("Emergency Services");
        btnEmerServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmerServicesActionPerformed(evt);
            }
        });

        btnExpShopping.setText("Explore Shopping");
        btnExpShopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpShoppingActionPerformed(evt);
            }
        });

        btnExpActivities.setText("Explore Activities");
        btnExpActivities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActivitiesActionPerformed(evt);
            }
        });

        btnRentVehicles.setText("Rent Vehicles");
        btnRentVehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentVehiclesActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(102, 102, 102));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExpRest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmerServices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExpShopping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExpActivities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRentVehicles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnEmerServices)
                .addGap(60, 60, 60)
                .addComponent(btnExpRest)
                .addGap(63, 63, 63)
                .addComponent(btnExpShopping)
                .addGap(69, 69, 69)
                .addComponent(btnExpActivities)
                .addGap(81, 81, 81)
                .addComponent(btnRentVehicles)
                .addGap(146, 146, 146)
                .addComponent(btnLogout)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1289, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        MainJFrame.changeScreen(MainJFrame.LandinPageJPanel);
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExpRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpRestActionPerformed
        // TODO add your handling code here:
        CustomerExploreFoodJpanel panel = new CustomerExploreFoodJpanel(system);
        jSplitPane1.setRightComponent(panel);
                
        
    }//GEN-LAST:event_btnExpRestActionPerformed

    private void btnExpShoppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpShoppingActionPerformed
        // TODO add your handling code here:
        CustomerExploreShoppingJPanel panel = new CustomerExploreShoppingJPanel(system);
        jSplitPane1.setRightComponent(panel);
                
    }//GEN-LAST:event_btnExpShoppingActionPerformed

    private void btnEmerServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmerServicesActionPerformed
        // TODO add your handling code here:
        CustomerRequestHelpJPanel panel = new CustomerRequestHelpJPanel(system);
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnEmerServicesActionPerformed

    private void btnExpActivitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActivitiesActionPerformed
        // TODO add your handling code here:
        CustomerExlporeActivitieJPanel panel = new CustomerExlporeActivitieJPanel(system);
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnExpActivitiesActionPerformed

    private void btnRentVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentVehiclesActionPerformed
        // TODO add your handling code here:
        CustomerExploreVehicleBooking panel = new CustomerExploreVehicleBooking(system);
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnRentVehiclesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmerServices;
    private javax.swing.JButton btnExpActivities;
    private javax.swing.JButton btnExpRest;
    private javax.swing.JButton btnExpShopping;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRentVehicles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
