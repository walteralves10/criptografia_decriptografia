/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Criptocando;

import java.security.InvalidKeyException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author walte
 */
public class CasinhaDoDecriptoCao extends javax.swing.JFrame {

    /**
     * Creates new form CasinhaDoDecriptoCao
     */
    public CasinhaDoDecriptoCao() {
        initComponents();
    }
    CriptoCodigo02 cpD = new CriptoCodigo02();
    
    CasinhaDoCriptoCao c = new CasinhaDoCriptoCao();    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoCriptografado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chaveCliente = new javax.swing.JTextField();
        bDescriptografar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        criptoText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(380, 450));

        jLabel1.setText("Texto criptografado");

        jLabel2.setText("Chave Para Criptografia");

        chaveCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaveClienteActionPerformed(evt);
            }
        });

        bDescriptografar.setText("Descriptografar");
        bDescriptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDescriptografarActionPerformed(evt);
            }
        });

        criptoText.setColumns(20);
        criptoText.setRows(5);
        jScrollPane1.setViewportView(criptoText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(bDescriptografar)
                    .addComponent(textoCriptografado)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(chaveCliente))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoCriptografado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(chaveCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(bDescriptografar)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bDescriptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDescriptografarActionPerformed
        String a = new String(c.cp.getKey());
        
        JOptionPane.showMessageDialog(null, "" + a);
        
        try {
            cpD.setKey(chaveCliente.getText());
        } catch (InvalidKeyException ex) {
            Logger.getLogger(CasinhaDoDecriptoCao.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        if(cpD.getKey().equals(cpD.getKey())){
            String textoNormalizado = new String(cpD.decriptografa(textoCriptografado.getText().toCharArray()));
            criptoText.setText(textoNormalizado);
        }else{
            JOptionPane.showMessageDialog(null, "Ta errada a chave, o Waltão!");
        }

    }//GEN-LAST:event_bDescriptografarActionPerformed

    private void chaveClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaveClienteActionPerformed
//        
//        try {
//            cpD.setKeyD(chaveCliente.getText());
//        } catch (InvalidKeyException ex) {
//            Logger.getLogger(CasinhaDoDecriptoCao.class.getName()).log(Level.SEVERE, null, ex);
//        }   
        
    }//GEN-LAST:event_chaveClienteActionPerformed

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
            java.util.logging.Logger.getLogger(CasinhaDoDecriptoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasinhaDoDecriptoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasinhaDoDecriptoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasinhaDoDecriptoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CasinhaDoDecriptoCao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDescriptografar;
    private javax.swing.JTextField chaveCliente;
    private javax.swing.JTextArea criptoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textoCriptografado;
    // End of variables declaration//GEN-END:variables
}
