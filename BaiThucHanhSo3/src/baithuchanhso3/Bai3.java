/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithuchanhso3;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Bai3 extends javax.swing.JFrame {

    
    List<String> arr1 = new ArrayList<>();
    List<String> arr2 = new ArrayList<>();
    int stt1 = -1, stt2 = -1;
    String add = null;
    String tensl, tens2;
    public Bai3() 
    {
        initComponents();
        ListModel dsTen = LstMon.getModel();
        for(int i = 0; i <= LstMon.getLastVisibleIndex(); i++)
        {
            String ten = dsTen.getElementAt(i).toString();
            arr1.add(ten);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstMonyeuthich = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        LstMon = new javax.swing.JList();
        Bremoveall = new javax.swing.JButton();
        Bthem = new javax.swing.JButton();
        Badd = new javax.swing.JButton();
        Baddall = new javax.swing.JButton();
        Bremove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ListView Bai3");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LstMonyeuthich.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LstMonyeuthich.setToolTipText("Danh sách môn ưa thích");
        LstMonyeuthich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LstMonyeuthichMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LstMonyeuthich);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 110, 180));

        LstMon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LstMon.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Bóng đá", "Bóng chuyền", "Bóng rổ" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        LstMon.setToolTipText("Danh sách môn thể thao");
        LstMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LstMonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(LstMon);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, 180));

        Bremoveall.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bremoveall.setText("<<");
        Bremoveall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BremoveallActionPerformed(evt);
            }
        });
        jPanel2.add(Bremoveall, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 60, -1));

        Bthem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bthem.setText("+");
        Bthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BthemActionPerformed(evt);
            }
        });
        jPanel2.add(Bthem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 50, -1));

        Badd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Badd.setText(">");
        Badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddActionPerformed(evt);
            }
        });
        jPanel2.add(Badd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 60, -1));

        Baddall.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Baddall.setText(">>");
        Baddall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddallActionPerformed(evt);
            }
        });
        jPanel2.add(Baddall, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 60, -1));

        Bremove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bremove.setText("<");
        Bremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BremoveActionPerformed(evt);
            }
        });
        jPanel2.add(Bremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 60, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Môn yêu thích");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("DS Môn thể thao");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LstMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LstMonMouseClicked
        // TODO add your handling code here:
        ListModel dsTen = LstMon.getModel();
        stt1 = LstMon.getSelectedIndex();
        tensl = dsTen.getElementAt(stt1).toString();
    }//GEN-LAST:event_LstMonMouseClicked

    private void LstMonyeuthichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LstMonyeuthichMouseClicked
        // TODO add your handling code here:
        ListModel dsTen = LstMonyeuthich.getModel();
        stt2 = LstMonyeuthich.getSelectedIndex();
        tens2 = dsTen.getElementAt(stt2).toString();
    }//GEN-LAST:event_LstMonyeuthichMouseClicked

    private void BthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BthemActionPerformed
        // TODO add your handling code here:
        add = JOptionPane.showInputDialog(this, "Nhập tên môn thể thao:");
        if(!add.equals("") || !add.equals(null))
        {
            //cảnh báo dữ liệu đã tồn tại
            if(arr1.contains(add))
            {
                JOptionPane.showConfirmDialog(this, "Không thể thêm dữ liệu Đã tồn tại","Cảnh báo!",JOptionPane.WARNING_MESSAGE);
            }
            //ô nhập hợp lệ
            else
            {
                //thêm vào ArrayList
                arr1.add(add);
                // chuyển sang kiểu mảng để đưa vào JList
                Object[] mTen = arr1.toArray();
                LstMon.setListData(mTen);
            }
        }
    }//GEN-LAST:event_BthemActionPerformed

    private void BaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddActionPerformed
        // TODO add your handling code here:
        if(LstMon.getLastVisibleIndex() != -1)
        {
           if(stt1 != -1)
            {
                arr2.add(tensl);
                arr1.remove(tensl);
                Object[] mTen2 = arr2.toArray();
                LstMonyeuthich.setListData(mTen2);
                Object[] mTen1 = arr1.toArray();
                LstMon.setListData(mTen1);
                stt1 = -1;
            }
            else
                JOptionPane.showMessageDialog(this, "Vui lòng chọn Chính Xác dữ liệu cần dùng!","Cảnh báo Null Selection!",JOptionPane.WARNING_MESSAGE); 
        }
        else
                JOptionPane.showMessageDialog(this, "Không có dữ liệu!","Cảnh báo Null Data!",JOptionPane.WARNING_MESSAGE); 
    }//GEN-LAST:event_BaddActionPerformed

    private void BaddallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddallActionPerformed
        // TODO add your handling code here:
        if(LstMon.getLastVisibleIndex() != -1)
        {
            ListModel dsTen = LstMon.getModel();
            for(int i = 0; i <= LstMon.getLastVisibleIndex(); i++)
            {
                String ten = dsTen.getElementAt(i).toString();
                arr2.add(ten);
                arr1.remove(ten);
            }
            Object[] mTen2 = arr2.toArray();
            LstMonyeuthich.setListData(mTen2);
            Object[] mTen1 = arr1.toArray();
            LstMon.setListData(mTen1);
        }
        else
                JOptionPane.showMessageDialog(this, "Không có dữ liệu!","Cảnh báo Null Data!",JOptionPane.WARNING_MESSAGE); 
        
    }//GEN-LAST:event_BaddallActionPerformed

    private void BremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BremoveActionPerformed
        // TODO add your handling code here:
        if(LstMonyeuthich.getLastVisibleIndex() != -1)
        {
            if(stt2 != -1)
            {
                arr1.add(tens2);
                arr2.remove(tens2);
                Object[] mTen1 = arr1.toArray();
                LstMon.setListData(mTen1);
                Object[] mTen2 = arr2.toArray();
                LstMonyeuthich.setListData(mTen2);
                stt1 = -1;
            }
            else
                JOptionPane.showMessageDialog(this, "Vui lòng chọn Chính Xác dữ liệu cần dùng!","Cảnh báo Null Selection!",JOptionPane.WARNING_MESSAGE);
        }
        else
                JOptionPane.showMessageDialog(this, "Không có dữ liệu!","Cảnh báo Null Data!",JOptionPane.WARNING_MESSAGE); 
        
    }//GEN-LAST:event_BremoveActionPerformed

    private void BremoveallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BremoveallActionPerformed
        // TODO add your handling code here:
        if(LstMonyeuthich.getLastVisibleIndex() != -1)
        {
            ListModel dsTen = LstMonyeuthich.getModel();
            for(int i = 0; i <= LstMonyeuthich.getLastVisibleIndex(); i++)
            {
                String ten = dsTen.getElementAt(i).toString();
                arr1.add(ten);
                arr2.remove(ten);
            }
            Object[] mTen1 = arr1.toArray();
            LstMon.setListData(mTen1);
            Object[] mTen2 = arr2.toArray();
            LstMonyeuthich.setListData(mTen2);
        }
        else
                JOptionPane.showMessageDialog(this, "Không có dữ liệu!","Cảnh báo Null Data!",JOptionPane.WARNING_MESSAGE); 
        
    }//GEN-LAST:event_BremoveallActionPerformed

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
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Badd;
    private javax.swing.JButton Baddall;
    private javax.swing.JButton Bremove;
    private javax.swing.JButton Bremoveall;
    private javax.swing.JButton Bthem;
    private javax.swing.JList LstMon;
    private javax.swing.JList LstMonyeuthich;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}