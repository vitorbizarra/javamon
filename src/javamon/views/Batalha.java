/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javamon.views;

import java.awt.*;
import javamon.models.Pokemon;
import javax.swing.*;

/**
 *
 * @author aluno
 */
public class Batalha extends javax.swing.JFrame {

    private String nomeSeuPokemon;
    private String tipoSeuPokemon;
    private int levelSeuPokemon;
    private int vidaSeuPokemon;
    private int ataqueSeuPokemon;
    private int defesaSeuPokemon;
    private String spriteSeuPokemon;

    private String nomeOutroPokemon;
    private String tipoOutroPokemon;
    private int levelOutroPokemon;
    private int vidaOutroPokemon;
    private int ataqueOutroPokemon;
    private int defesaOutroPokemon;
    private String spriteOutroPokemon;

    /**
     * Creates new form Batalha
     */
    public Batalha(String nomeSeuPoke, String nomeOutroPoke) {
        initComponents();

        ImageIcon imgBg = new ImageIcon(getClass().getResource("/javamon/assets/battle_bg.jpg"));
        lblBg.setIcon(new ImageIcon(imgBg.getImage().getScaledInstance(lblBg.getWidth(), lblBg.getHeight(), Image.SCALE_DEFAULT)));

        //Seu Pokemon
        Pokemon seuPokemon = new Pokemon(nomeSeuPoke, 1, true);
        seuPokemon.calculaAtributos();
        this.nomeSeuPokemon = seuPokemon.getNome();
        this.tipoSeuPokemon = seuPokemon.getTipo();
        this.levelSeuPokemon = seuPokemon.getLevel();
        this.vidaSeuPokemon = seuPokemon.getVida();
        this.ataqueSeuPokemon = seuPokemon.getAtaque();
        this.defesaSeuPokemon = seuPokemon.getDefesa();
        this.spriteSeuPokemon = seuPokemon.getSprite();

        ImageIcon imgSeuPokemon = new ImageIcon(getClass().getResource(this.spriteSeuPokemon));
        lblSeuPokemon.setIcon(new ImageIcon(imgSeuPokemon.getImage().getScaledInstance(lblSeuPokemon.getWidth(), lblSeuPokemon.getHeight(), Image.SCALE_DEFAULT)));
        lblNomeSeuPokemon.setText(this.nomeSeuPokemon);
        lblTipoSeuPokemon.setText(this.tipoSeuPokemon);

        //Pokemon Adversário
        Pokemon outroPokemon = new Pokemon(nomeOutroPoke, 1, false);
        outroPokemon.calculaAtributos();

        this.nomeOutroPokemon = outroPokemon.getNome();
        this.tipoOutroPokemon = outroPokemon.getTipo();
        this.levelOutroPokemon = outroPokemon.getLevel();
        this.vidaOutroPokemon = outroPokemon.getVida();
        this.ataqueOutroPokemon = outroPokemon.getAtaque();
        this.defesaOutroPokemon = outroPokemon.getDefesa();
        this.spriteOutroPokemon = outroPokemon.getSprite();

        ImageIcon imgOutroPokemon = new ImageIcon(getClass().getResource(this.spriteOutroPokemon));
        lblOutroPokemon.setIcon(new ImageIcon(imgOutroPokemon.getImage().getScaledInstance(lblOutroPokemon.getWidth(), lblOutroPokemon.getHeight(), Image.SCALE_DEFAULT)));
        lblNomeOutroPokemon.setText(this.nomeOutroPokemon);
        lblTipoOutroPokemon.setText(this.tipoOutroPokemon);

        setTextStats();
    }

    public void setTextStats() {
        lblLevelSeuPokemon.setText(String.valueOf(this.levelSeuPokemon));
        lblVidaSeuPokemon.setText(String.valueOf(this.vidaSeuPokemon));
        lblAtaqueSeuPokemon.setText(String.valueOf(this.ataqueSeuPokemon));
        lblDefesaSeuPokemon.setText(String.valueOf(this.defesaSeuPokemon));

        lblLevelOutroPokemon.setText(String.valueOf(this.levelOutroPokemon));
        lblVidaOutroPokemon.setText(String.valueOf(this.vidaOutroPokemon));
        lblAtaqueOutroPokemon.setText(String.valueOf(this.ataqueOutroPokemon));
        lblDefesaOutroPokemon.setText(String.valueOf(this.defesaOutroPokemon));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblNomeOutroPokemon = new javax.swing.JLabel();
        lbltipo1 = new javax.swing.JLabel();
        lbltipo2 = new javax.swing.JLabel();
        lbltipo3 = new javax.swing.JLabel();
        lbltipo4 = new javax.swing.JLabel();
        lbltipo5 = new javax.swing.JLabel();
        lblTipoOutroPokemon = new javax.swing.JLabel();
        lblLevelOutroPokemon = new javax.swing.JLabel();
        lblVidaOutroPokemon = new javax.swing.JLabel();
        lblAtaqueOutroPokemon = new javax.swing.JLabel();
        lblDefesaOutroPokemon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNomeSeuPokemon = new javax.swing.JLabel();
        btnAtacar = new javax.swing.JButton();
        btnBonus = new javax.swing.JButton();
        lbltipo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTipoSeuPokemon = new javax.swing.JLabel();
        lblLevelSeuPokemon = new javax.swing.JLabel();
        lblVidaSeuPokemon = new javax.swing.JLabel();
        lblAtaqueSeuPokemon = new javax.swing.JLabel();
        lblDefesaSeuPokemon = new javax.swing.JLabel();
        lblOutroPokemon = new javax.swing.JLabel();
        lblSeuPokemon = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNomeOutroPokemon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomeOutroPokemon.setText("Nome do outro pokemon");

        lbltipo1.setText("Tipo:");

        lbltipo2.setText("Level:");

        lbltipo3.setText("Vida:");

        lbltipo4.setText("Ataque:");

        lbltipo5.setText("Defesa:");

        lblTipoOutroPokemon.setText("lblTipoOutroPokemon");

        lblLevelOutroPokemon.setText("lblLevelOutroPokemon");

        lblVidaOutroPokemon.setText("lblVidaOutroPokemon");

        lblAtaqueOutroPokemon.setText("lblAtaqueOutroPokemon");

        lblDefesaOutroPokemon.setText("lblDefesaOutroPokemon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeOutroPokemon)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltipo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVidaOutroPokemon))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltipo4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAtaqueOutroPokemon))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltipo5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDefesaOutroPokemon))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltipo1)
                                    .addComponent(lbltipo2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblTipoOutroPokemon))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblLevelOutroPokemon)))))
                        .addGap(0, 114, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeOutroPokemon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltipo1)
                    .addComponent(lblTipoOutroPokemon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltipo2)
                    .addComponent(lblLevelOutroPokemon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltipo3)
                    .addComponent(lblVidaOutroPokemon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltipo4)
                    .addComponent(lblAtaqueOutroPokemon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltipo5)
                    .addComponent(lblDefesaOutroPokemon))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 300, 150);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblNomeSeuPokemon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomeSeuPokemon.setText("Nome do seu pokemon");

        btnAtacar.setText("Atacar");
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });

        btnBonus.setText("Bonus");
        btnBonus.setEnabled(false);
        btnBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetBonus(evt);
            }
        });

        lbltipo.setText("Tipo:");

        jLabel1.setText("Level:");

        jLabel2.setText("Vida:");

        jLabel3.setText("Ataque:");

        jLabel4.setText("Defesa:");

        lblTipoSeuPokemon.setText("lblTipoSeuPokemon");

        lblLevelSeuPokemon.setText("lblLevelSeuPokemon");

        lblVidaSeuPokemon.setText("lblVidaSeuPokemon");

        lblAtaqueSeuPokemon.setText("lblAtaqueSeuPokemon");

        lblDefesaSeuPokemon.setText("lblDefesaSeuPokemon");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNomeSeuPokemon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtacar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLevelSeuPokemon))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbltipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTipoSeuPokemon))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAtaqueSeuPokemon))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDefesaSeuPokemon)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnBonus))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVidaSeuPokemon)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNomeSeuPokemon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltipo)
                            .addComponent(lblTipoSeuPokemon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblLevelSeuPokemon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblVidaSeuPokemon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblAtaqueSeuPokemon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblDefesaSeuPokemon)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAtacar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBonus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(400, 290, 300, 150);

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

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        this.levelSeuPokemon++;
        this.levelOutroPokemon++;
        int round = this.levelOutroPokemon;

        this.vidaOutroPokemon = this.vidaOutroPokemon - this.ataqueSeuPokemon;

        if (this.vidaOutroPokemon <= 0) {
            this.vidaOutroPokemon = 0;
            setTextStats();
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Vitória de: " + this.nomeSeuPokemon);
        } else {
            setTextStats();
        }

        this.vidaSeuPokemon = this.vidaSeuPokemon - this.ataqueOutroPokemon;
        if (this.vidaSeuPokemon <= 0 && this.vidaOutroPokemon > 0) {
            this.vidaSeuPokemon = 0;
            setTextStats();
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Vitória de: " + this.nomeOutroPokemon);
        }

        new Thread() {
            public void run() {
                try {
                    Thread.sleep(600);
                    System.out.println("Outro Pokemon esta atacando");
                    setTextStats();
                    if (round == 3) {
                        btnBonus.setEnabled(true);
                    }
                } catch (InterruptedException ex) {
                }
            }
        }.start();


    }//GEN-LAST:event_btnAtacarActionPerformed

    private void btnGetBonus(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetBonus
        this.levelSeuPokemon++;
        this.levelOutroPokemon++;

        this.vidaSeuPokemon = this.vidaSeuPokemon + (this.levelSeuPokemon / 2);
        this.ataqueSeuPokemon = this.ataqueSeuPokemon + (this.levelSeuPokemon / 3);
        this.defesaSeuPokemon = this.defesaSeuPokemon + (this.levelSeuPokemon / 4);
        setTextStats();

        this.vidaSeuPokemon = this.vidaSeuPokemon - this.ataqueOutroPokemon;

        new Thread() {
            public void run() {
                try {
                    Thread.sleep(600);
                    System.out.println("Outro Pokemon esta atacando");
                    setTextStats();
                } catch (InterruptedException ex) {
                }
            }
        }.start();
        if (this.vidaSeuPokemon <= 0) {
            this.vidaSeuPokemon = 0;
            setTextStats();
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Vitória de: " + this.nomeOutroPokemon);
        }
    }//GEN-LAST:event_btnGetBonus
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
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnBonus;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAtaqueOutroPokemon;
    private javax.swing.JLabel lblAtaqueSeuPokemon;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblDefesaOutroPokemon;
    private javax.swing.JLabel lblDefesaSeuPokemon;
    private javax.swing.JLabel lblLevelOutroPokemon;
    private javax.swing.JLabel lblLevelSeuPokemon;
    private javax.swing.JLabel lblNomeOutroPokemon;
    private javax.swing.JLabel lblNomeSeuPokemon;
    private javax.swing.JLabel lblOutroPokemon;
    private javax.swing.JLabel lblSeuPokemon;
    private javax.swing.JLabel lblTipoOutroPokemon;
    private javax.swing.JLabel lblTipoSeuPokemon;
    private javax.swing.JLabel lblVidaOutroPokemon;
    private javax.swing.JLabel lblVidaSeuPokemon;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JLabel lbltipo1;
    private javax.swing.JLabel lbltipo2;
    private javax.swing.JLabel lbltipo3;
    private javax.swing.JLabel lbltipo4;
    private javax.swing.JLabel lbltipo5;
    // End of variables declaration//GEN-END:variables
}
