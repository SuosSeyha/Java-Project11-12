/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FastFoodReport;

/**
 *
 * @author SEYHA
 */
public class AddStockMenu extends javax.swing.JFrame {

    /**
     * Creates new form AddStockMenu
     */
    public AddStockMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        btndrink = new javax.swing.JButton();
        btnfood = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 359));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        btndrink.setBackground(new java.awt.Color(255, 102, 102));
        btndrink.setFont(new java.awt.Font("sansserif", 1, 33)); // NOI18N
        btndrink.setIcon(new javax.swing.ImageIcon("D:\\Java Programming\\Button\\Drink.png")); // NOI18N
        btndrink.setText("ADD DRINK");
        btndrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndrinkActionPerformed(evt);
            }
        });
        jPanel1.add(btndrink);
        btndrink.setBounds(160, 100, 290, 140);

        btnfood.setBackground(new java.awt.Color(255, 102, 102));
        btnfood.setFont(new java.awt.Font("sansserif", 1, 33)); // NOI18N
        btnfood.setIcon(new javax.swing.ImageIcon("D:\\Java Programming\\Button\\Food.png")); // NOI18N
        btnfood.setText(" ADD FOOD");
        btnfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfoodActionPerformed(evt);
            }
        });
        jPanel1.add(btnfood);
        btnfood.setBounds(540, 100, 290, 140);

        btnback.setBackground(new java.awt.Color(255, 51, 51));
        btnback.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback);
        btnback.setBounds(10, 10, 80, 31);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 360);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        Homemenu.main(null);
        dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btndrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndrinkActionPerformed
        AddDrinkStock.main(null);
        dispose();
    }//GEN-LAST:event_btndrinkActionPerformed

    private void btnfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfoodActionPerformed
        AddFoodStock.main(null);
        dispose();
    }//GEN-LAST:event_btnfoodActionPerformed

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
            java.util.logging.Logger.getLogger(AddStockMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStockMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStockMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStockMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStockMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndrink;
    private javax.swing.JButton btnfood;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
