/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paket;

/**
 *
 * @author my acer
 */
public class panelformempat extends javax.swing.JPanel {

    /**
     * Creates new form panelformempat
     */
    public panelformempat() {
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PEMBAGIAN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 22, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Bilangan ke satu :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 117, 64, 32));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Bilangan ke dua :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 89, -1, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 117, 70, 32));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("/");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("HASIL ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double inputkesatu=Double.valueOf(jTextField1.getText());
        double inputkedua=Double.valueOf(jTextField2.getText());
        double H_akhir=inputkesatu/inputkedua;
     jTextField3.setText(""+H_akhir);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
