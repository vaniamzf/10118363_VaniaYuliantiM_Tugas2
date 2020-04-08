/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_3_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author ACER
 */
public class praktikum_3_2 extends javax.swing.JFrame {

    /**
     * Creates new form praktikum_3_2
     */
    public praktikum_3_2() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbhuruf = new javax.swing.JComboBox<>();
        cbukuran = new javax.swing.JComboBox<>();
        cbwarna = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtoutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Praktikum 3.2");

        jLabel2.setText("Jenis Huruf");

        jLabel3.setText("Ukuran");

        jLabel4.setText("Warna");

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String huruf[] = ge.getAvailableFontFamilyNames();
        cbhuruf.setModel(new javax.swing.DefaultComboBoxModel(huruf));
        cbhuruf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbhurufItemStateChanged(evt);
            }
        });

        cbukuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14", "16", "18" }));
        cbukuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbukuranActionPerformed(evt);
            }
        });

        cbwarna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Merah", "Biru", "Hijau" }));
        cbwarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbwarnaActionPerformed(evt);
            }
        });

        txtoutput.setColumns(20);
        txtoutput.setRows(5);
        jScrollPane1.setViewportView(txtoutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbhuruf, 0, 77, Short.MAX_VALUE)
                            .addComponent(cbukuran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbwarna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbhuruf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbukuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbwarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbhurufItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbhurufItemStateChanged
        // TODO add your handling code here:
        txtoutput.setFont(new Font(cbhuruf.getSelectedItem().toString(),Font.PLAIN,
                Integer.valueOf(cbukuran.getSelectedItem().toString())));
    }//GEN-LAST:event_cbhurufItemStateChanged

    private void cbukuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbukuranActionPerformed
        // TODO add your handling code here:
        if(cbukuran.getSelectedItem()=="14")
        {
            txtoutput.setFont(new Font("",Font.PLAIN,14));
        }
        else if(cbukuran.getSelectedItem()=="16")
        {
            txtoutput.setFont(new Font("",Font.PLAIN,16));
        }
        else if(cbukuran.getSelectedItem()=="18")
        {
            txtoutput.setFont(new Font("",Font.PLAIN,18));
        }
    }//GEN-LAST:event_cbukuranActionPerformed

    private void cbwarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbwarnaActionPerformed
        // TODO add your handling code here:
        if(cbwarna.getSelectedItem()=="Merah")
        {
          //  Font huruf=new Font("",Font.PLAIN,14);
            txtoutput.setForeground(Color.red);
        }
        else if(cbwarna.getSelectedItem()=="Biru")
        {
          //  Font huruf=new Font("",Font.PLAIN,14);
            txtoutput.setForeground(Color.blue);
        }
        else if(cbwarna.getSelectedItem()=="Hijau")
        {
          //  Font huruf=new Font("",Font.PLAIN,14);
            txtoutput.setForeground(Color.green);
        }
    }//GEN-LAST:event_cbwarnaActionPerformed

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
            java.util.logging.Logger.getLogger(praktikum_3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(praktikum_3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(praktikum_3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(praktikum_3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new praktikum_3_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbhuruf;
    private javax.swing.JComboBox<String> cbukuran;
    private javax.swing.JComboBox<String> cbwarna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtoutput;
    // End of variables declaration//GEN-END:variables
}
