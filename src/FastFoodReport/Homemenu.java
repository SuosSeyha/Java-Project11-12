package FastFoodReport;
public class Homemenu extends javax.swing.JFrame {
    public Homemenu() {
        initComponents();
      
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnstock = new javax.swing.JButton();
        btnfood = new javax.swing.JButton();
        btndrink = new javax.swing.JButton();
        btnpayment = new javax.swing.JButton();
        btnfood1 = new javax.swing.JButton();
        btnfood2 = new javax.swing.JButton();
        btnfood3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(908, 421));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        btnstock.setBackground(new java.awt.Color(255, 102, 102));
        btnstock.setFont(new java.awt.Font("sansserif", 1, 33)); // NOI18N
        btnstock.setIcon(new javax.swing.ImageIcon("D:\\Java Programming\\Button\\ClassIcon.png")); // NOI18N
        btnstock.setText("STOCK");
        btnstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstockActionPerformed(evt);
            }
        });

        btnfood.setBackground(new java.awt.Color(255, 102, 102));
        btnfood.setFont(new java.awt.Font("sansserif", 1, 33)); // NOI18N
        btnfood.setIcon(new javax.swing.ImageIcon("D:\\Java Programming\\Button\\Food.png")); // NOI18N
        btnfood.setText("  FOOD");
        btnfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfoodActionPerformed(evt);
            }
        });

        btndrink.setBackground(new java.awt.Color(255, 102, 102));
        btndrink.setFont(new java.awt.Font("sansserif", 1, 33)); // NOI18N
        btndrink.setIcon(new javax.swing.ImageIcon("D:\\Java Programming\\Button\\Drink.png")); // NOI18N
        btndrink.setText("DRINK");
        btndrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndrinkActionPerformed(evt);
            }
        });

        btnpayment.setBackground(new java.awt.Color(255, 102, 102));
        btnpayment.setFont(new java.awt.Font("sansserif", 1, 33)); // NOI18N
        btnpayment.setIcon(new javax.swing.ImageIcon("D:\\Java Programming\\Button\\Payment.png")); // NOI18N
        btnpayment.setText("PAYMNET");
        btnpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaymentActionPerformed(evt);
            }
        });

        btnfood1.setBackground(new java.awt.Color(255, 102, 102));
        btnfood1.setFont(new java.awt.Font("sansserif", 1, 33)); // NOI18N
        btnfood1.setIcon(new javax.swing.ImageIcon("D:\\Java Programming\\Button\\Food.png")); // NOI18N
        btnfood1.setText("Total Sale");
        btnfood1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfood1ActionPerformed(evt);
            }
        });

        btnfood2.setBackground(new java.awt.Color(255, 102, 102));
        btnfood2.setFont(new java.awt.Font("sansserif", 1, 33)); // NOI18N
        btnfood2.setIcon(new javax.swing.ImageIcon("D:\\Java Programming\\Button\\Food.png")); // NOI18N
        btnfood2.setText("Saff");

        btnfood3.setBackground(new java.awt.Color(255, 102, 102));
        btnfood3.setFont(new java.awt.Font("sansserif", 1, 33)); // NOI18N
        btnfood3.setIcon(new javax.swing.ImageIcon("D:\\Java Programming\\Button\\Food.png")); // NOI18N
        btnfood3.setText("Booking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndrink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnfood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnfood1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnstock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpayment, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(btnfood2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(btnfood3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndrink, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfood3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfood, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnstock, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfood1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfood2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstockActionPerformed
        AddStockMenu.main(null);
        dispose();
    }//GEN-LAST:event_btnstockActionPerformed

    private void btndrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndrinkActionPerformed
        SaleDrink.main(null);
        dispose();
    }//GEN-LAST:event_btndrinkActionPerformed

    private void btnpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaymentActionPerformed
        Payment.main(null);
        dispose();
    }//GEN-LAST:event_btnpaymentActionPerformed

    private void btnfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfoodActionPerformed
        SaleFood.main(null);
        dispose();
    }//GEN-LAST:event_btnfoodActionPerformed

    private void btnfood1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfood1ActionPerformed
        Totalsale.main(null);
        dispose();
    }//GEN-LAST:event_btnfood1ActionPerformed

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
            java.util.logging.Logger.getLogger(Homemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homemenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndrink;
    private javax.swing.JButton btnfood;
    private javax.swing.JButton btnfood1;
    private javax.swing.JButton btnfood2;
    private javax.swing.JButton btnfood3;
    private javax.swing.JButton btnpayment;
    private javax.swing.JButton btnstock;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
