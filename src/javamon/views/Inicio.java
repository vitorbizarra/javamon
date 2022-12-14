package javamon.views;

import java.awt.*;
import javamon.models.Pokemon;
import javax.swing.*;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();

        ImageIcon imgBulbasaur = new ImageIcon(getClass().getResource("/javamon/assets/arts/bulbasaur.png"));
        btnBulbasaur.setIcon(new ImageIcon(imgBulbasaur.getImage().getScaledInstance(btnBulbasaur.getWidth(), btnBulbasaur.getHeight(), Image.SCALE_DEFAULT)));

        ImageIcon imgCharmander = new ImageIcon(getClass().getResource("/javamon/assets/arts/charmander.png"));
        btnCharmander.setIcon(new ImageIcon(imgCharmander.getImage().getScaledInstance(btnCharmander.getWidth(), btnCharmander.getHeight(), Image.SCALE_DEFAULT)));

        ImageIcon imgSquirtle = new ImageIcon(getClass().getResource("/javamon/assets/arts/squirtle.png"));
        btnSquirtle.setIcon(new ImageIcon(imgSquirtle.getImage().getScaledInstance(btnSquirtle.getWidth(), btnSquirtle.getHeight(), Image.SCALE_DEFAULT)));

        ImageIcon imgFarfetch = new ImageIcon(getClass().getResource("/javamon/assets/arts/farfetch.png"));
        btnFarfetch.setIcon(new ImageIcon(imgFarfetch.getImage().getScaledInstance(btnFarfetch.getWidth(), btnFarfetch.getHeight(), Image.SCALE_DEFAULT)));

        ImageIcon imgMagikarp = new ImageIcon(getClass().getResource("/javamon/assets/arts/magikarp.png"));
        btnMagikarp.setIcon(new ImageIcon(imgMagikarp.getImage().getScaledInstance(btnMagikarp.getWidth(), btnMagikarp.getHeight(), Image.SCALE_DEFAULT)));

        ImageIcon imgOmanyte = new ImageIcon(getClass().getResource("/javamon/assets/arts/omanyte.png"));
        btnOmanyte.setIcon(new ImageIcon(imgOmanyte.getImage().getScaledInstance(btnOmanyte.getWidth(), btnOmanyte.getHeight(), Image.SCALE_DEFAULT)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPokemon = new javax.swing.ButtonGroup();
        rbSeuPokemon = new javax.swing.JRadioButton();
        rbOutroPokemon = new javax.swing.JRadioButton();
        btnBatalhar = new javax.swing.JButton();
        lblSeuPokemon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnOmanyte = new javax.swing.JButton();
        btnMagikarp = new javax.swing.JButton();
        btnFarfetch = new javax.swing.JButton();
        btnSquirtle = new javax.swing.JButton();
        btnCharmander = new javax.swing.JButton();
        btnBulbasaur = new javax.swing.JButton();
        lblOutroPokemon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnGroupPokemon.add(rbSeuPokemon);
        rbSeuPokemon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSeuPokemon.setSelected(true);
        rbSeuPokemon.setText("Seu Pokemon: ");

        btnGroupPokemon.add(rbOutroPokemon);
        rbOutroPokemon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbOutroPokemon.setText("Outro Pokemon:");

        btnBatalhar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBatalhar.setText("Batalhar");
        btnBatalhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalharActionPerformed(evt);
            }
        });

        btnOmanyte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javamon/assets/arts/omanyte.png"))); // NOI18N
        btnOmanyte.setText("jButton1");
        btnOmanyte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmanyteActionPerformed(evt);
            }
        });

        btnMagikarp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javamon/assets/arts/magikarp.png"))); // NOI18N
        btnMagikarp.setText("jButton1");
        btnMagikarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagikarpActionPerformed(evt);
            }
        });

        btnFarfetch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javamon/assets/arts/farfetch.png"))); // NOI18N
        btnFarfetch.setText("jButton1");
        btnFarfetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarfetchActionPerformed(evt);
            }
        });

        btnSquirtle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javamon/assets/arts/squirtle.png"))); // NOI18N
        btnSquirtle.setText("jButton1");
        btnSquirtle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquirtleActionPerformed(evt);
            }
        });

        btnCharmander.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javamon/assets/arts/charmander.png"))); // NOI18N
        btnCharmander.setText("jButton1");
        btnCharmander.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCharmanderActionPerformed(evt);
            }
        });

        btnBulbasaur.setText("jButton1");
        btnBulbasaur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBulbasaurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFarfetch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMagikarp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOmanyte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBulbasaur, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCharmander, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSquirtle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBulbasaur, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCharmander, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSquirtle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFarfetch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMagikarp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOmanyte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbSeuPokemon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSeuPokemon))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rbOutroPokemon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblOutroPokemon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBatalhar))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSeuPokemon)
                    .addComponent(lblSeuPokemon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBatalhar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbOutroPokemon)
                        .addComponent(lblOutroPokemon)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBulbasaurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBulbasaurActionPerformed
        if (rbSeuPokemon.isSelected()) {
            lblSeuPokemon.setText("Bulbassauro");
        } else if (rbOutroPokemon.isSelected()) {
            lblOutroPokemon.setText("Bulbassauro");
        }
    }//GEN-LAST:event_btnBulbasaurActionPerformed

    private void btnOmanyteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmanyteActionPerformed
        if (rbSeuPokemon.isSelected()) {
            lblSeuPokemon.setText("Omanyte");
        } else if (rbOutroPokemon.isSelected()) {
            lblOutroPokemon.setText("Omanyte");
        }
     }//GEN-LAST:event_btnOmanyteActionPerformed

    private void btnCharmanderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharmanderActionPerformed
        if (rbSeuPokemon.isSelected()) {
            lblSeuPokemon.setText("Charmander");
        } else if (rbOutroPokemon.isSelected()) {
            lblOutroPokemon.setText("Charmander");
        }
    }//GEN-LAST:event_btnCharmanderActionPerformed

    private void btnSquirtleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquirtleActionPerformed
        if (rbSeuPokemon.isSelected()) {
            lblSeuPokemon.setText("Squirtle");
        } else if (rbOutroPokemon.isSelected()) {
            lblOutroPokemon.setText("Squirtle");
        }
    }//GEN-LAST:event_btnSquirtleActionPerformed

    private void btnFarfetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarfetchActionPerformed
        if (rbSeuPokemon.isSelected()) {
            lblSeuPokemon.setText("Farfetch");
        } else if (rbOutroPokemon.isSelected()) {
            lblOutroPokemon.setText("Farfetch");
        }
    }//GEN-LAST:event_btnFarfetchActionPerformed

    private void btnMagikarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagikarpActionPerformed
        if (rbSeuPokemon.isSelected()) {
            lblSeuPokemon.setText("Magikarp");
        } else if (rbOutroPokemon.isSelected()) {
            lblOutroPokemon.setText("Magikarp");
        }
    }//GEN-LAST:event_btnMagikarpActionPerformed

    private void btnBatalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalharActionPerformed
        if (!lblSeuPokemon.getText().equals("") && !lblOutroPokemon.getText().equals("")) {
            String nomeSeuPokemon = lblSeuPokemon.getText();
            String nomeOutroPokemon = lblOutroPokemon.getText();

            this.setVisible(false);

            Batalha batalha = new Batalha(nomeSeuPokemon, nomeOutroPokemon);
            batalha.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione os dois pokemons");
        }
    }//GEN-LAST:event_btnBatalharActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatalhar;
    private javax.swing.JButton btnBulbasaur;
    private javax.swing.JButton btnCharmander;
    private javax.swing.JButton btnFarfetch;
    private javax.swing.ButtonGroup btnGroupPokemon;
    private javax.swing.JButton btnMagikarp;
    private javax.swing.JButton btnOmanyte;
    private javax.swing.JButton btnSquirtle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblOutroPokemon;
    private javax.swing.JLabel lblSeuPokemon;
    private javax.swing.JRadioButton rbOutroPokemon;
    private javax.swing.JRadioButton rbSeuPokemon;
    // End of variables declaration//GEN-END:variables
}
