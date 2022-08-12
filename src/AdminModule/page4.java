/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminModule;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author mm
 */
public class page4 extends javax.swing.JFrame  {

    /**
     * Creates new form ManagerProdcut
     */
    public page4() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        Category = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ProdId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ExpDate = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Category1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        ExpDate1 = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "HouseWare", " " }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory Managment System");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Product");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(0, 102, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("ProdId");

        ProdId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 102, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Name");

        jLabel5.setBackground(new java.awt.Color(0, 102, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Quantity");

        jLabel7.setBackground(new java.awt.Color(0, 102, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Category");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProdId", "Name", "Quantity", "ProductionDate", "ExpDate", "Category"
            }
        ));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(24);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        AddBtn.setBackground(new java.awt.Color(0, 102, 255));
        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(0, 102, 255));
        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("Update");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(0, 102, 255));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        HomeBtn.setBackground(new java.awt.Color(0, 102, 255));
        HomeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("Home");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Product LIst");

        jLabel9.setBackground(new java.awt.Color(0, 102, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("ExpirationDate");

        ExpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpDateActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        Category1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Category1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item1", "item2", "item3", " " }));
        Category1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Category1MouseClicked(evt);
            }
        });
        Category1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Category1ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 102, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("ProductionDate");

        ExpDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpDate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Category1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EditBtn)
                                .addGap(12, 12, 12)
                                .addComponent(DeleteBtn))
                            .addComponent(HomeBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ExpDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(188, 188, 188))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ProdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ExpDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Category1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(EditBtn)
                            .addComponent(DeleteBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HomeBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
             DefaultTableModel tblModel= (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount()==1){
            String ProdID=ProdId.getText();
            String name=Name.getText();
            String QuantitY=Quantity.getText();
            String prodDate=ExpDate1.getText();
            String Expdate=ExpDate.getText();
            String Cate=Category1.getSelectedItem().toString();
            tblModel.setValueAt(ProdID, jTable1.getSelectedRow(),0);
            tblModel.setValueAt(name, jTable1.getSelectedRow(),1);
            tblModel.setValueAt(QuantitY, jTable1.getSelectedRow(),2);
            tblModel.setValueAt(prodDate, jTable1.getSelectedRow(),3);
            tblModel.setValueAt(Expdate, jTable1.getSelectedRow(),4);
            tblModel.setValueAt(Cate, jTable1.getSelectedRow(),5);
             JOptionPane.showMessageDialog(this,"Update successfully");
        }
        else{
            if(jTable1.getSelectedRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table Empty");
            }else{
                JOptionPane.showMessageDialog(this,"Please Select Single Row For Update");
            }
           String filepath = "D:\\files\\sss.txt";
        File file = new File(filepath);
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i<jTable1.getRowCount();i++){
                for(int j=0;j<jTable1.getColumnCount();j++){
                    bw.write(jTable1.getValueAt(i, j).toString()+"  ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(page4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }  
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        DefaultTableModel tblModel= (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount()==1){
            tblModel.removeRow(jTable1.getSelectedRow());
        }
        else{
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty");
//                System.out.print("Table is Empty");
            }
            else{
                JOptionPane.showMessageDialog(this,"please select single row for delete");
                }
                
        }     
           String filepath = "D:\\files\\sss.txt";
        File file = new File(filepath);
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i<jTable1.getRowCount();i++){
                for(int j=0;j<jTable1.getColumnCount();j++){
                    bw.write(jTable1.getValueAt(i, j).toString()+"  ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(page4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        if(ProdId.getText().equals("")||Name.getText().equals("")||Quantity.getText().equals("")||ExpDate.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter All Data");
        }else{
            String Data[]={ProdId.getText(),Name.getText(),Quantity.getText(),ExpDate1.getText(),ExpDate.getText(),Category1.getSelectedItem().toString()};
            DefaultTableModel tblModel2= (DefaultTableModel) jTable1.getModel();
            tblModel2.addRow(Data);
            JOptionPane.showMessageDialog(this,"Add Data is Successfully");
            ProdId.setText("");
            Name.setText("");
            Quantity.setText("");
            ExpDate1.setText("");
            ExpDate.setText("");
        }
              String filepath = "D:\\files\\sss.txt";
        File file = new File(filepath);
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i<jTable1.getRowCount();i++){
                for(int j=0;j<jTable1.getColumnCount();j++){
                    bw.write(jTable1.getValueAt(i, j).toString()+"  ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(page4.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_AddBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:    
        DefaultTableModel tblModel= (DefaultTableModel) jTable1.getModel();
        
        String tblProdId=tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
        String tblName=tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String tblQuantity=tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
        String tblExpDate=tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        String tblExpDate1=tblModel.getValueAt(jTable1.getSelectedRow(),4).toString();
        String tblCombo=tblModel.getValueAt(jTable1.getSelectedRow(),5).toString();
        ProdId.setText(tblProdId);
        Name.setText(tblName);
        Quantity.setText(tblQuantity);
        ExpDate1.setText(tblExpDate1);
        ExpDate.setText(tblExpDate);
        Category1.setSelectedItem(tblCombo);
    }//GEN-LAST:event_jTable1MouseClicked

    private void Category1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Category1ActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_Category1ActionPerformed

    private void Category1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Category1MouseClicked
        // TODO add your handling code here:
            String filepath = "D:\\files\\sss.txt";
        File file = new File(filepath);
        try{
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine=br.readLine().trim();
            String[] columnsName=firstLine.split("");
            DefaultTableModel model= (DefaultTableModel) Category1.getModel();
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines=br.lines().toArray();
           
            
            for(int i=0; i<tableLines.length;i++)
                {
                   String line=tableLines[i].toString().trim();
                   String [] dataRow=line.split("/");
                   model.addRow(dataRow);
                }
        } catch (IOException ex) {
            Logger.getLogger(page4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Category1MouseClicked
//  public javax.swing.JTextField getValueExpDate1(){
//        return ExpDate1;
//    }
//   public void setValueExpDate1(javax.swing.JTextField ExpDate1){
//        this.ExpDate1=ExpDate1;
//    }
//   public void setValueExpDate(javax.swing.JTextField ExpDate){
//       this.ExpDate=ExpDate;
//    }
//     public javax.swing.JTextField getValueExpDate(){
//        return ExpDate;
//    }
    private void ExpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpDateActionPerformed
        // TODO add your handling code here:
//     ExpDate.setValueExpDate( ExpDate1.getValueExpDate1());
        
    }//GEN-LAST:event_ExpDateActionPerformed
  
    private void ExpDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExpDate1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(page4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JComboBox<String> Category1;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField ExpDate;
    private javax.swing.JTextField ExpDate1;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField ProdId;
    private javax.swing.JTextField Quantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
