/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javamon.views;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author aluno
 */
public class Batalha extends javax.swing.JFrame {

    /**
     * Creates new form Batalha
     */
    public Batalha(String nomeSeuPoke, String imgSeuPoke, String nomeOutroPoke, String imgOutroPoke) {
        initComponents();

        ImageIcon imgBg = new ImageIcon(getClass().getResource("/javamon/assets/battle_bg.jpg"));
        lblBg.setIcon(new ImageIcon(imgBg.getImage().getScaledInstance(lblBg.getWidth(), lblBg.getHeight(), Image.SCALE_DEFAULT)));

        nomeSeuPokemon.setText(nomeSeuPoke);
        nomeOutroPokemon.setText(nomeOutroPoke);

        ImageIcon imgSeuPokemon = new ImageIcon(getClass().getResource(imgSeuPoke));
        lblSeuPokemon.setIcon(new ImageIcon(imgSeuPokemon.getImage().getScaledInstance(lblSeuPokemon.getWidth(), lblSeuPokemon.getHeight(), Image.SCALE_DEFAULT)));

        ImageIcon imgOutroPokemon = new ImageIcon(getClass().getResource(imgOutroPoke));
        lblOutroPokemon.setIcon(new ImageIcon(imgOutroPokemon.getImage().getScaledInstance(lblOutroPokemon.getWidth(), lblOutroPokemon.getHeight(), Image.SCALE_DEFAULT)));
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
        nomeOutroPokemon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nomeSeuPokemon = new javax.swing.JLabel();
        lblOutroPokemon = new javax.swing.JLabel();
        lblSeuPokemon = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nomeOutroPokemon.setText("Nome do outro pokemon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeOutroPokemon)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeOutroPokemon)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 300, 110);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        nomeSeuPokemon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeSeuPokemon.setText("Nome do seu pokemon");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeSeuPokemon)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeSeuPokemon)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(390, 320, 300, 110);

        lblOutroPokemon.setText("lblOutroPokemon");
        lblOutroPokemon.setMaximumSize(new java.awt.Dimension(160, 160));
        lblOutroPokemon.setMinimumSize(new java.awt.Dimension(160, 160));
        getContentPane().add(lblOutroPokemon);
        lblOutroPokemon.setBounds(330, 40, 310, 310);

        lblSeuPokemon.setText("SeuPokemon");
        lblSeuPokemon.setMaximumSize(new java.awt.Dimension(160, 160));
        lblSeuPokemon.setMinimumSize(new java.awt.Dimension(160, 160));
        getContentPane().add(lblSeuPokemon);
        lblSeuPokemon.setBounds(50, 170, 310, 310);

        lblBg.setText("jLabel1");
        getContentPane().add(lblBg);
        lblBg.setBounds(0, 0, 720, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblOutroPokemon;
    private javax.swing.JLabel lblSeuPokemon;
    private javax.swing.JLabel nomeOutroPokemon;
    private javax.swing.JLabel nomeSeuPokemon;
    // End of variables declaration//GEN-END:variables
}
