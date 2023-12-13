/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.VehicleRep;

import Business.EcoSystem;
import UserInterface.Homepage.MainJFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import UserInterface.Analyst.AnalyzeMarketJpanel;

/**
 *
 * @author anirudh
 */
public class VehicleRepDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VehicleRepDashboardJPanel
     */
    EcoSystem system;
    public VehicleRepDashboardJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        
          //method for click-response action buttons
        ArrayList<JButton> buttonList = new ArrayList<>();
        buttonList.add(btnUpdatePrice);
        buttonList.add(btnViewDets);
        
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
        btnViewDets = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnUpdatePrice = new javax.swing.JButton();
        jPanel2 = new AnalyzeMarketJpanel.jPanelGradient();

        jSplitPane1.setDividerLocation(160);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        btnViewDets.setText("View Details");
        btnViewDets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetsActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(102, 102, 102));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/logoutNew20.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLogout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/logout_filled20.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnUpdatePrice.setText("Update Price");
        btnUpdatePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnViewDets, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdatePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnViewDets)
                .addGap(53, 53, 53)
                .addComponent(btnUpdatePrice)
                .addGap(66, 66, 66)
                .addComponent(btnLogout)
                .addContainerGap(394, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1323, Short.MAX_VALUE)
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

    private void btnViewDetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetsActionPerformed
        // TODO add your handling code here:
        VehicleRepViewJpanel panel = new VehicleRepViewJpanel(system);
        jSplitPane1.setRightComponent(panel);
        
    }//GEN-LAST:event_btnViewDetsActionPerformed

    private void btnUpdatePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePriceActionPerformed
        // TODO add your handling code here:
        VehicleRepUpdateJPanel panel = new VehicleRepUpdateJPanel(system);
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnUpdatePriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdatePrice;
    private javax.swing.JButton btnViewDets;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
