/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class AlertMedicalPersonnal extends javax.swing.JFrame {

    /**
     * Creates new form AlertMedicalPersonnal
     */
    public AlertMedicalPersonnal() {
        initComponents();
    }
    GlucoseRecord P1 = new GlucoseRecord("P173941", 0, "20/10/2021", " ");
    Patient Pa1 = new Patient("P173941", "Momosuke", "Male", "20/7/2001");
    
    MedicalPersonnal Dr = new MedicalPersonnal("MP136954", "Dr.Stonk");
    
        class Glucose1 extends TimerTask{
        private int times = 1;
        @Override
        public void run(){
            ThreadLocalRandom tlr = ThreadLocalRandom.current();
            if(times > 0){
                times++;
                P1.setLevelGlu(tlr.nextInt(89, 131 + 1));//90-130
                int y = P1.QuickAlert(P1.getLevelGlu());
                
                if(y == 1){
                    P1.setLevelGlu(tlr.nextInt(69, 89 + 1));//70-89
                    y = P1.EmergencyAlert(P1.getLevelGlu());
                    if(y == 1){
                        P1.setLevelGlu(tlr.nextInt(50, 69 + 1));//50-69
                        Patient1.setText("Patient in Dangerous " + P1.getLevelGlu());
                        Patient1.setBackground(Color.RED);
                        JOptionPane.showMessageDialog(null, "Patient in Dangerous");
                        times =0-1;
                    }
                }
                
                if(y == 2){
                    P1.setLevelGlu(tlr.nextInt(131, 161 + 1));//131-160
                    y = P1.EmergencyAlert(P1.getLevelGlu());
                    if(y == 2){
                        P1.setLevelGlu(tlr.nextInt(161, 180 + 1));//161-180
                        Patient1.setText("Patient in Dangerous " + P1.getLevelGlu());
                        Patient1.setBackground(Color.RED);
                        JOptionPane.showMessageDialog(null, "Patient in Dangerous");
                        times =0-1;
                    }
                }
                
                    if(y == 3){
                    Patient1.setText("Safe " + P1.getLevelGlu());
                    Patient1.setBackground(Color.WHITE);
                }
                
            }
            
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

        jLabel1 = new javax.swing.JLabel();
        Patient1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText(Dr.getMPName());

        Patient1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Patient1.setText("Patient Glucose Level");
        Patient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Patient1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText(Pa1.getName());

        jButton1.setText("Emergency");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Patient1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Patient1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Patient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Patient1ActionPerformed
        // TODO add your handling code here:
        Timer timer = new Timer("Simulator");
        Glucose1 t1 = new Glucose1();
        timer.schedule(t1,0,10000);
    }//GEN-LAST:event_Patient1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AlertMedicalPersonnal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlertMedicalPersonnal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlertMedicalPersonnal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlertMedicalPersonnal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlertMedicalPersonnal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Patient1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
