/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Car_Features;
import Model.Car_ServiceRecord;
import Model.ServiceDetails;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Pavithra Ramkumar
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    Car_Features car_Features;
    Car_ServiceRecord history;
    
    
    public ViewJPanel(Car_Features car_Features, Car_ServiceRecord history) {
        initComponents();
        this.car_Features = car_Features;
        this.history = history;
        displayCar_Features();
        populateTable();
        
        
    }

    //ViewJPanel(Car_Features car_Features, Car_ServiceRecord history) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblOwnerEmailAddress = new javax.swing.JLabel();
        LblServiceRecord = new javax.swing.JLabel();
        LblImage = new javax.swing.JLabel();
        TxtBrand = new javax.swing.JTextField();
        LblBrand = new javax.swing.JLabel();
        TxtModel = new javax.swing.JTextField();
        LblModel = new javax.swing.JLabel();
        TxtColor = new javax.swing.JTextField();
        LblColor = new javax.swing.JLabel();
        TxtYear = new javax.swing.JTextField();
        LblYear = new javax.swing.JLabel();
        LblEngineNo = new javax.swing.JLabel();
        TxtEngineNo = new javax.swing.JTextField();
        TxtSeatsNumber = new javax.swing.JTextField();
        LblSeatsNumber = new javax.swing.JLabel();
        TxtLicensePlate = new javax.swing.JTextField();
        TxtOwnerName = new javax.swing.JTextField();
        LblOwnerName = new javax.swing.JLabel();
        LblTitle = new javax.swing.JLabel();
        TxtOwnerTelephoneNo = new javax.swing.JTextField();
        TxtOwnerEmailAddress = new javax.swing.JTextField();
        TxtServiceRecord = new javax.swing.JTextField();
        LblOwnerTelephoneNo = new javax.swing.JLabel();
        LblLicensePlate = new javax.swing.JLabel();
        LblOwnerSSN = new javax.swing.JLabel();
        TxtOwnerSSN = new javax.swing.JTextField();
        LblOwnerAddress = new javax.swing.JLabel();
        TxtOwnerAddress = new javax.swing.JTextField();
        LblWarrantyYear = new javax.swing.JLabel();
        TxtWarrantyYear = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblSR = new javax.swing.JTable();
        BtImageView = new javax.swing.JButton();
        LblSRTitle = new javax.swing.JLabel();

        LblOwnerEmailAddress.setText("Owner Email Address:");

        LblServiceRecord.setText("Service Record:");

        TxtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBrandActionPerformed(evt);
            }
        });

        LblBrand.setText("Brand:");

        TxtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtModelActionPerformed(evt);
            }
        });

        LblModel.setText("Model:");

        TxtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtColorActionPerformed(evt);
            }
        });

        LblColor.setText("Color:");

        TxtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtYearActionPerformed(evt);
            }
        });

        LblYear.setText("Year:");

        LblEngineNo.setText("Engine No:");

        TxtEngineNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEngineNoActionPerformed(evt);
            }
        });

        TxtSeatsNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSeatsNumberActionPerformed(evt);
            }
        });

        LblSeatsNumber.setText("Seats No:");

        TxtLicensePlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLicensePlateActionPerformed(evt);
            }
        });

        TxtOwnerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOwnerNameActionPerformed(evt);
            }
        });

        LblOwnerName.setText("OwnerName:");

        LblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitle.setText("Car Profile");

        TxtOwnerTelephoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOwnerTelephoneNoActionPerformed(evt);
            }
        });

        TxtOwnerEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOwnerEmailAddressActionPerformed(evt);
            }
        });

        TxtServiceRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtServiceRecordActionPerformed(evt);
            }
        });

        LblOwnerTelephoneNo.setText("Owner Telephone Number:");

        LblLicensePlate.setText("License Plate:");

        LblOwnerSSN.setText("Owner SSN:");

        TxtOwnerSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOwnerSSNActionPerformed(evt);
            }
        });

        LblOwnerAddress.setText("Owner Address:");

        TxtOwnerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOwnerAddressActionPerformed(evt);
            }
        });

        LblWarrantyYear.setText("Warranty Year:");

        TxtWarrantyYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtWarrantyYearActionPerformed(evt);
            }
        });

        TblSR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Water Wash", "Paint", "Wheel Alignment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblSR);

        BtImageView.setText("View Image");
        BtImageView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtImageViewActionPerformed(evt);
            }
        });

        LblSRTitle.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        LblSRTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblSRTitle.setText("Service Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblSRTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblOwnerSSN)
                            .addComponent(LblServiceRecord)
                            .addComponent(LblWarrantyYear)
                            .addComponent(LblOwnerAddress)
                            .addComponent(LblOwnerEmailAddress)
                            .addComponent(LblOwnerTelephoneNo)
                            .addComponent(LblOwnerName)
                            .addComponent(LblLicensePlate)
                            .addComponent(LblSeatsNumber)
                            .addComponent(LblEngineNo)
                            .addComponent(LblYear)
                            .addComponent(LblColor)
                            .addComponent(LblModel)
                            .addComponent(LblBrand))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TxtOwnerEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtOwnerTelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtOwnerSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtServiceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BtImageView)
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(LblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(15, 15, 15)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblBrand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblModel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblColor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblYear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblEngineNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblSeatsNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblLicensePlate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblOwnerName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtOwnerTelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblOwnerTelephoneNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtOwnerEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblOwnerEmailAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtOwnerSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblOwnerSSN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblOwnerAddress)
                            .addComponent(TxtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblServiceRecord)
                            .addComponent(TxtServiceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblWarrantyYear)
                            .addComponent(TxtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(LblSRTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtImageView)
                        .addGap(26, 26, 26)
                        .addComponent(LblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LblTitle)
                    .addContainerGap(849, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBrandActionPerformed

    private void TxtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtModelActionPerformed

    private void TxtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtColorActionPerformed

    private void TxtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtYearActionPerformed

    private void TxtEngineNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEngineNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEngineNoActionPerformed

    private void TxtSeatsNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSeatsNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSeatsNumberActionPerformed

    private void TxtLicensePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLicensePlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLicensePlateActionPerformed

    private void TxtOwnerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOwnerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOwnerNameActionPerformed

    private void TxtOwnerTelephoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOwnerTelephoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOwnerTelephoneNoActionPerformed

    private void TxtOwnerEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOwnerEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOwnerEmailAddressActionPerformed

    private void TxtServiceRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtServiceRecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtServiceRecordActionPerformed

    private void TxtOwnerSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOwnerSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOwnerSSNActionPerformed

    private void TxtOwnerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOwnerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOwnerAddressActionPerformed

    private void TxtWarrantyYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtWarrantyYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtWarrantyYearActionPerformed

    private void BtImageViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtImageViewActionPerformed
    // TODO add your handling code here:
    Image image = car_Features.getImage();
       if(image != null){ LblImage.setIcon(new ImageIcon(image));}
    }//GEN-LAST:event_BtImageViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtImageView;
    private javax.swing.JLabel LblBrand;
    private javax.swing.JLabel LblColor;
    private javax.swing.JLabel LblEngineNo;
    private javax.swing.JLabel LblImage;
    private javax.swing.JLabel LblLicensePlate;
    private javax.swing.JLabel LblModel;
    private javax.swing.JLabel LblOwnerAddress;
    private javax.swing.JLabel LblOwnerEmailAddress;
    private javax.swing.JLabel LblOwnerName;
    private javax.swing.JLabel LblOwnerSSN;
    private javax.swing.JLabel LblOwnerTelephoneNo;
    private javax.swing.JLabel LblSRTitle;
    private javax.swing.JLabel LblSeatsNumber;
    private javax.swing.JLabel LblServiceRecord;
    private javax.swing.JLabel LblTitle;
    private javax.swing.JLabel LblWarrantyYear;
    private javax.swing.JLabel LblYear;
    private javax.swing.JTable TblSR;
    private javax.swing.JTextField TxtBrand;
    private javax.swing.JTextField TxtColor;
    private javax.swing.JTextField TxtEngineNo;
    private javax.swing.JTextField TxtLicensePlate;
    private javax.swing.JTextField TxtModel;
    private javax.swing.JTextField TxtOwnerAddress;
    private javax.swing.JTextField TxtOwnerEmailAddress;
    private javax.swing.JTextField TxtOwnerName;
    private javax.swing.JTextField TxtOwnerSSN;
    private javax.swing.JTextField TxtOwnerTelephoneNo;
    private javax.swing.JTextField TxtSeatsNumber;
    private javax.swing.JTextField TxtServiceRecord;
    private javax.swing.JTextField TxtWarrantyYear;
    private javax.swing.JTextField TxtYear;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void displayCar_Features() {
       TxtBrand.setText(car_Features.getBrand());
       TxtModel.setText(car_Features.getModel());
       TxtColor.setText(car_Features.getColor());
       TxtYear.setText(car_Features.getYear());
       TxtEngineNo.setText(car_Features.getEngineNo());
       TxtSeatsNumber.setText(car_Features.getSeatsNumber());
       TxtLicensePlate.setText(car_Features.getLicensePlate());
       TxtOwnerName.setText(car_Features.getOwner_Name());
       TxtOwnerTelephoneNo.setText(car_Features.getOwner_TelephoneNO());
       TxtOwnerEmailAddress.setText(car_Features.getOwner_EmailAddress());
       TxtOwnerSSN.setText(car_Features.getOwner_SSN());
       TxtOwnerAddress.setText(car_Features.getOwner_Address());
       TxtServiceRecord.setText(car_Features.getServiceRecord());
       TxtWarrantyYear.setText(car_Features.getWarrantyYear());
       //LblImage.setText(filename);
       
       
       
  
    }

    private void populateTable() {
        DefaultTableModel model =(DefaultTableModel)TblSR.getModel();
        model.setRowCount(0);
        
        for (ServiceDetails sd : history.getHistory()){
            
            Object[] row = new Object[4];
            row[0] = sd.getDate();
            row[1] = sd.getWaterWash();
            row[2] = sd.getPaint();
            row[3] = sd.getWheelAlignment();
            
            model.addRow(row);
            
        }
       
        
        
        
    }

  
   
}