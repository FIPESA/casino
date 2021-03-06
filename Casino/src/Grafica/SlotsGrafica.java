/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Exceptions.ImposibleJugar;
import Usuarios.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import Casino.*;
import Exceptions.RentaException;
import Juegos.Slots.Frutas;
import Juegos.Slots.Jugar_Slots;
import Juegos.Slots.Slots;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;



public class SlotsGrafica extends javax.swing.JFrame implements ActionListener{
    private Casino fipesa;
    private Jugar_Slots slots;
    private JFrame root;
    Timer timer;
    int indice;
   
    public SlotsGrafica(Casino casino, JFrame root) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.root =root;
        this.fipesa = casino;
        this.slots = fipesa.getSlots();
        this.setExtendedState(MAXIMIZED_BOTH);
        
        this.Fruta_1.setIcon(Frutas.PLATANO.toIcon());
        this.Fruta_4.setIcon(Frutas.SIETE.toIcon());
        this.Fruta_7.setIcon(Frutas.CEREZA.toIcon());
        this.Fruta_2.setIcon(Frutas.PLATANO.toIcon());
        this.Fruta_5.setIcon(Frutas.SIETE.toIcon());
        this.Fruta_8.setIcon(Frutas.CEREZA.toIcon());
        this.Fruta_3.setIcon(Frutas.PLATANO.toIcon());
        this.Fruta_6.setIcon(Frutas.SIETE.toIcon());
        this.Fruta_9.setIcon(Frutas.CEREZA.toIcon());
        this.String_Fondos.setText(Double.toString(fipesa.getUsuario().getMonedero().getFondos()));
        timer = new Timer(20, this);
    }
    
    private void principal(){        
        Frutas fruta1;
        Frutas fruta2;
        Frutas fruta3;
        Frutas fruta4;
        Frutas fruta5;
        Frutas fruta6;
        Frutas fruta7;
        Frutas fruta8;
        Frutas fruta9;

        if(slots.getSlots().getResultado1() == 0){
                fruta1 = Slots.ROLLO[44];
                fruta4 = slots.getSlots().getFruta1();
                fruta7 = Slots.ROLLO[slots.getSlots().getResultado1()+1];
            } else if(slots.getSlots().getResultado1() == 44){
                fruta1 = Slots.ROLLO[slots.getSlots().getResultado1()-1];
                fruta4 = slots.getSlots().getFruta1();
                fruta7 = Slots.ROLLO[0];
            } else {
                fruta1 = Slots.ROLLO[slots.getSlots().getResultado1()-1];
                fruta4 = slots.getSlots().getFruta1();
                fruta7 = Slots.ROLLO[slots.getSlots().getResultado1()+1];                
            }

            if(slots.getSlots().getResultado2() == 0){
                fruta2 = Slots.ROLLO[44];
                fruta5 = slots.getSlots().getFruta2();
                fruta8 = Slots.ROLLO[slots.getSlots().getResultado2()+1];
            } else if(slots.getSlots().getResultado2() == 44){
                fruta2 = Slots.ROLLO[slots.getSlots().getResultado2()-1];
                fruta5 = slots.getSlots().getFruta2();
                fruta8 = Slots.ROLLO[0];
            } else {
                fruta2 = Slots.ROLLO[slots.getSlots().getResultado2()-1];
                fruta5 = slots.getSlots().getFruta2();
                fruta8 = Slots.ROLLO[slots.getSlots().getResultado2()+1];
            }

            if(slots.getSlots().getResultado3() == 0){
                fruta3 = Slots.ROLLO[44];
                fruta6 = slots.getSlots().getFruta3();
                fruta9 = Slots.ROLLO[slots.getSlots().getResultado3()+1];
            } else if(slots.getSlots().getResultado3() == 44){
                fruta3 = Slots.ROLLO[slots.getSlots().getResultado3()-1];
                fruta6 = slots.getSlots().getFruta3();
                fruta9 = Slots.ROLLO[0];
            } else {
                fruta3 = Slots.ROLLO[slots.getSlots().getResultado3()-1];
                fruta6 = slots.getSlots().getFruta3();
                fruta9 = Slots.ROLLO[slots.getSlots().getResultado3()+1];
            }
            this.Fruta_1.setIcon(fruta1.toIcon());
            this.Fruta_2.setIcon(fruta2.toIcon());
            this.Fruta_3.setIcon(fruta3.toIcon());
            this.Fruta_4.setIcon(fruta4.toIcon());
            this.Fruta_5.setIcon(fruta5.toIcon());
            this.Fruta_6.setIcon(fruta6.toIcon());
            this.Fruta_7.setIcon(fruta7.toIcon());
            this.Fruta_8.setIcon(fruta8.toIcon());
            this.Fruta_9.setIcon(fruta9.toIcon());

            if(slots.comprobar()){
                this.String_Texto.setText("PREMIO");
                this.String_Premio.setText(Double.toString(slots.premios()));
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
        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();
        Fruta_1 = new javax.swing.JLabel();
        Fruta_2 = new javax.swing.JLabel();
        Fruta_3 = new javax.swing.JLabel();
        Fruta_4 = new javax.swing.JLabel();
        Fruta_5 = new javax.swing.JLabel();
        Fruta_6 = new javax.swing.JLabel();
        Fruta_7 = new javax.swing.JLabel();
        Fruta_8 = new javax.swing.JLabel();
        Fruta_9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        String_Texto = new javax.swing.JTextField();
        String_Premio = new javax.swing.JTextField();
        String_Fondos = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SLOTS");

        jPanel1.setLayout(null);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slots/slot-machine.png"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(100, 100));
        Fondo.setMinimumSize(new java.awt.Dimension(100, 100));
        Fondo.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(Fondo);
        Fondo.setBounds(0, 0, 530, 340);

        Fruta_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slots/Siete.png"))); // NOI18N
        jPanel1.add(Fruta_1);
        Fruta_1.setBounds(50, 10, 100, 110);

        Fruta_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slots/Siete.png"))); // NOI18N
        jPanel1.add(Fruta_2);
        Fruta_2.setBounds(220, 10, 100, 110);

        Fruta_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slots/Siete.png"))); // NOI18N
        jPanel1.add(Fruta_3);
        Fruta_3.setBounds(380, 10, 100, 110);

        Fruta_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slots/Siete.png"))); // NOI18N
        jPanel1.add(Fruta_4);
        Fruta_4.setBounds(50, 120, 100, 110);

        Fruta_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slots/Siete.png"))); // NOI18N
        jPanel1.add(Fruta_5);
        Fruta_5.setBounds(220, 120, 100, 110);

        Fruta_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slots/Siete.png"))); // NOI18N
        jPanel1.add(Fruta_6);
        Fruta_6.setBounds(380, 120, 100, 110);

        Fruta_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slots/Siete.png"))); // NOI18N
        jPanel1.add(Fruta_7);
        Fruta_7.setBounds(50, 230, 100, 110);

        Fruta_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slots/Siete.png"))); // NOI18N
        jPanel1.add(Fruta_8);
        Fruta_8.setBounds(380, 230, 100, 110);

        Fruta_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slots/Siete.png"))); // NOI18N
        jPanel1.add(Fruta_9);
        Fruta_9.setBounds(220, 230, 100, 110);

        jButton1.setText("Lanzar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        String_Texto.setEditable(false);

        String_Premio.setEditable(false);

        String_Fondos.setEditable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slots/premios.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 35, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(String_Texto)
                            .addComponent(String_Premio)
                            .addComponent(String_Fondos)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(String_Fondos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(String_Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(String_Premio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(88, 88, 88))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.jButton1.setEnabled(false);
        this.String_Premio.setText("");
        this.String_Texto.setText("");
        
        boolean bandera = true;
        
        try { 
            slots.jugar();
            this.String_Fondos.setText(Double.toString(fipesa.getUsuario().getMonedero().getFondos()));
            
            this.indice = 0;
            timer.start();
        } catch (ImposibleJugar ex) {
            JOptionPane.showMessageDialog(rootPane, "¡¡¡NO HAY FONDOS!!!", "¡AVISO!", JOptionPane.ERROR_MESSAGE);
        } catch (RentaException ex) {
            JOptionPane.showMessageDialog(rootPane, "¡¡¡ TE HAS PASADO SEGUN TU RENTA!!!", "¡AVISO!", JOptionPane.ERROR_MESSAGE);
        } finally {            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        root.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SlotsGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotsGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotsGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotsGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotsGrafica(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fruta_1;
    private javax.swing.JLabel Fruta_2;
    private javax.swing.JLabel Fruta_3;
    private javax.swing.JLabel Fruta_4;
    private javax.swing.JLabel Fruta_5;
    private javax.swing.JLabel Fruta_6;
    private javax.swing.JLabel Fruta_7;
    private javax.swing.JLabel Fruta_8;
    private javax.swing.JLabel Fruta_9;
    private javax.swing.JTextField String_Fondos;
    private javax.swing.JTextField String_Premio;
    private javax.swing.JTextField String_Texto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {        
        if(this.indice <50){
            Random aleatorio = new Random();
            this.Fruta_1.setIcon(slots.getSlots().ROLLO[aleatorio.nextInt(45)].toIcon());
            this.Fruta_2.setIcon(slots.getSlots().ROLLO[aleatorio.nextInt(45)].toIcon());
            this.Fruta_3.setIcon(slots.getSlots().ROLLO[aleatorio.nextInt(45)].toIcon());
            this.Fruta_4.setIcon(slots.getSlots().ROLLO[aleatorio.nextInt(45)].toIcon());
            this.Fruta_5.setIcon(slots.getSlots().ROLLO[aleatorio.nextInt(45)].toIcon());
            this.Fruta_6.setIcon(slots.getSlots().ROLLO[aleatorio.nextInt(45)].toIcon());
            this.Fruta_7.setIcon(slots.getSlots().ROLLO[aleatorio.nextInt(45)].toIcon());
            this.Fruta_8.setIcon(slots.getSlots().ROLLO[aleatorio.nextInt(45)].toIcon());
            this.Fruta_9.setIcon(slots.getSlots().ROLLO[aleatorio.nextInt(45)].toIcon());
            this.indice++;
        } else if (this.indice == 50){
            this.principal();
            this.jButton1.setEnabled(true);
            timer.stop();
        }
    }
}
