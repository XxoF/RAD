/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.Color;
/**
 *
 * @author Admin
 */
public class AlertPhysician extends javax.swing.JFrame {
    GlucoseRecord P1 = new GlucoseRecord("P173941", 0, "20/10/2021", " ");
    Patient Pa1 = new Patient("P173941", "Momosuke", "Male", "20/7/2001");
    
    GlucoseRecord P2 = new GlucoseRecord("P13596", 0, "10/01/2021", " ");
    Patient Pa2 = new Patient("P13596", "Moana", "Female", "29/4/2000");
    
    GlucoseRecord P3 = new GlucoseRecord("P17374", 0, "08/12/2021", " ");
    Patient Pa3 = new Patient("P17374", "Elizabelt", "Female", "30/2/1995");
    
    GlucoseRecord P4 = new GlucoseRecord("P19635", 0, "30/11/2021", " ");
    Patient Pa4 = new Patient("P19635", "Yamoto", "Male", "20/5/1983");
    
    Physician Phy = new Physician("N136954", "Mori");
    /**
     * Creates new form AlertPhysician
     */
    public AlertPhysician() {
        initComponents();
    }
    
    class Glucose1 extends TimerTask{
        private int times = 1;
        @Override
        public void run(){
            times++;
            ThreadLocalRandom tlr = ThreadLocalRandom.current();
            if(times > 0){
                P1.setLevelGlu(tlr.nextInt(89, 131 + 1));//90-130
                int y = P1.QuickAlert(P1.getLevelGlu());
                
                if(y == 3){
                    Patient1.setText("Safe " + P1.getLevelGlu());
                    Patient1.setBackground(Color.WHITE);
                }
                
                if(y == 1){
                    P1.setLevelGlu(tlr.nextInt(69, 89 + 1));//70-89
                    y = P1.EmergencyAlert(P1.getLevelGlu());
                    if(y == 1){
                        P1.setLevelGlu(tlr.nextInt(50, 69 + 1));//50-69
                        Patient1.setText("Dangerous " + P1.getLevelGlu());
                        Patient1.setBackground(Color.RED);
                    }else if(y == 3){
                        Patient1.setText("Under Average " + P1.getLevelGlu());
                        Patient1.setBackground(Color.YELLOW);
                    }
                }
                
                if(y == 2){
                    P1.setLevelGlu(tlr.nextInt(131, 161 + 1));//131-160
                    y = P1.EmergencyAlert(P1.getLevelGlu());
                    if(y == 2){
                        P1.setLevelGlu(tlr.nextInt(161, 180 + 1));//161-180
                        Patient1.setText("Dangerous " + P1.getLevelGlu());
                        Patient1.setBackground(Color.RED);
                    }else if(y == 3){
                        Patient1.setText("Above Average " + P1.getLevelGlu());
                        Patient1.setBackground(Color.YELLOW);
                    }
                }
            }
            
        }
    }
    
    class Glucose2 extends TimerTask{
        private int times = 1;
        @Override
        public void run(){
            times++;
            ThreadLocalRandom tlr = ThreadLocalRandom.current();
            if(times > 0){
                P2.setLevelGlu(tlr.nextInt(89, 131 + 1));//90-130
                int y = P2.QuickAlert(P2.getLevelGlu());
                
                if(y == 3){
                    Patient2.setText("Safe " + P2.getLevelGlu());
                    Patient2.setBackground(Color.WHITE);
                }
                
                if(y == 1){
                    P2.setLevelGlu(tlr.nextInt(69, 89 + 1));//70-89
                    y = P2.EmergencyAlert(P2.getLevelGlu());
                    if(y == 1){
                        P2.setLevelGlu(tlr.nextInt(50, 69 + 1));//50-69
                        Patient2.setText("Dangerous " + P2.getLevelGlu());
                        Patient2.setBackground(Color.RED);
                    }else if(y == 3){
                        Patient2.setText("Under Average " + P2.getLevelGlu());
                        Patient2.setBackground(Color.YELLOW);
                    }
                }
                
                if(y == 2){
                    P2.setLevelGlu(tlr.nextInt(131, 161 + 1));//131-160
                    y = P2.EmergencyAlert(P2.getLevelGlu());
                    if(y == 2){
                        P2.setLevelGlu(tlr.nextInt(161, 180 + 1));//161-180
                        Patient2.setText("Dangerous " + P2.getLevelGlu());
                        Patient2.setBackground(Color.RED);
                    }else if(y == 3){
                        Patient2.setText("Above Average " + P2.getLevelGlu());
                        Patient2.setBackground(Color.YELLOW);
                    }
                }
            }
            
        }
    }
    
    class Glucose3 extends TimerTask{
        private int times = 1;
        @Override
        public void run(){
            times++;
            ThreadLocalRandom tlr = ThreadLocalRandom.current();
            if(times > 0){
                P3.setLevelGlu(tlr.nextInt(89, 131 + 1));//90-130
                int y = P3.QuickAlert(P3.getLevelGlu());
                
                if(y == 3){
                    Patient3.setText("Safe " + P3.getLevelGlu());
                    Patient3.setBackground(Color.WHITE);
                }
                
                if(y == 1){
                    P3.setLevelGlu(tlr.nextInt(69, 89 + 1));//70-89
                    y = P3.EmergencyAlert(P3.getLevelGlu());
                    if(y == 1){
                        P3.setLevelGlu(tlr.nextInt(50, 69 + 1));//50-69
                        Patient3.setText("Dangerous " + P3.getLevelGlu());
                        Patient3.setBackground(Color.RED);
                    }else if(y == 3){
                        Patient3.setText("Under Average " + P3.getLevelGlu());
                        Patient3.setBackground(Color.YELLOW);
                    }
                }
                
                if(y == 2){
                    P3.setLevelGlu(tlr.nextInt(131, 161 + 1));//131-160
                    y = P3.EmergencyAlert(P3.getLevelGlu());
                    if(y == 2){
                        P3.setLevelGlu(tlr.nextInt(161, 180 + 1));//161-180
                        Patient3.setText("Dangerous " + P3.getLevelGlu());
                        Patient3.setBackground(Color.RED);
                    }else if(y == 3){
                        Patient3.setText("Above Average " + P3.getLevelGlu());
                        Patient3.setBackground(Color.YELLOW);
                    }
                }
            }
            
        }
    }
    
    class Glucose4 extends TimerTask{
        private int times = 1;
        @Override
        public void run(){
            times++;
            ThreadLocalRandom tlr = ThreadLocalRandom.current();
            if(times > 0){
                P3.setLevelGlu(tlr.nextInt(89, 131 + 1));//90-130
                int y = P3.QuickAlert(P3.getLevelGlu());
                
                if(y == 3){
                    Patient4.setText("Safe " + P3.getLevelGlu());
                    Patient4.setBackground(Color.WHITE);
                }
                
                if(y == 1){
                    P3.setLevelGlu(tlr.nextInt(69, 89 + 1));//70-89
                    y = P3.EmergencyAlert(P3.getLevelGlu());
                    if(y == 1){
                        P3.setLevelGlu(tlr.nextInt(50, 69 + 1));//50-69
                        Patient4.setText("Dangerous " + P3.getLevelGlu());
                        Patient4.setBackground(Color.RED);
                    }else if(y == 3){
                        Patient4.setText("Under Average " + P3.getLevelGlu());
                        Patient4.setBackground(Color.YELLOW);
                    }
                }
                
                if(y == 2){
                    P3.setLevelGlu(tlr.nextInt(131, 161 + 1));//131-160
                    y = P3.EmergencyAlert(P3.getLevelGlu());
                    if(y == 2){
                        P3.setLevelGlu(tlr.nextInt(161, 180 + 1));//161-180
                        Patient4.setText("Dangerous " + P3.getLevelGlu());
                        Patient4.setBackground(Color.RED);
                    }else if(y == 3){
                        Patient4.setText("Above Average " + P3.getLevelGlu());
                        Patient4.setBackground(Color.YELLOW);
                    }
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

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Patient2 = new javax.swing.JButton();
        Patient3 = new javax.swing.JButton();
        Patient1 = new javax.swing.JButton();
        Patient4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Show = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jButton4.setText("jButton1");

        jButton6.setText("jButton1");

        jLabel5.setText("jLabel3");

        jLabel7.setText("jLabel3");

        jLabel8.setText("jLabel3");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Patient Glucose Level");

        Patient2.setText("Glucose Level");

        Patient3.setText("Glucose Level");

        Patient1.setText("Glucose Level");

        Patient4.setText("Glucose Level");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText(Phy.getPyName());

        jLabel3.setText(Pa2.getName());

        jLabel4.setText(Pa1.getName());

        jLabel6.setText(Pa4.getName());

        jLabel9.setText(Pa3.getName());

        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient 1", "Patient 2", "Patient 3", "Patient 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setText("Add Messenger");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Patient4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Patient3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Patient2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Patient1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Show, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Patient1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Patient2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Patient3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Patient4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Show, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        // TODO add your handling code here:
        Timer timer = new Timer("Simulator");
        Glucose1 t1 = new Glucose1();
        timer.schedule(t1,0,10000);
        
        Glucose2 t2 = new Glucose2();
        timer.schedule(t2,0,10000);
        
        Glucose3 t3 = new Glucose3();
        timer.schedule(t3,0,10000);
        
        Glucose4 t4 = new Glucose4();
        timer.schedule(t4,0,10000);
    }//GEN-LAST:event_ShowActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(AlertPhysician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlertPhysician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlertPhysician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlertPhysician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlertPhysician().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Patient1;
    private javax.swing.JButton Patient2;
    private javax.swing.JButton Patient3;
    private javax.swing.JButton Patient4;
    private javax.swing.JButton Show;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
