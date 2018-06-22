/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabilidad;

import clases.Datos;

/**
 *
 * @author sandy
 */
public class Sumas extends javax.swing.JFrame {

    
    public Sumas() {
        initComponents();
        Datos.Operacion();
        jLabeltitulo.setText("La empresa " + Datos.nomEmpres + " S.A de CV");
        jLabelFechA.setText("Estado de resuldato del " + Datos.Dia + " Al " + 
                Datos.Ultim()+  " de " + Datos.MES() + " del " + (int)Datos.matriz[0][Datos.año]);
        
        jLabelV.setText("" + Datos.matriz[0][Datos.ventas]);
        jLabelCV.setText("" + Datos.matriz[0][Datos.cosVenta]);
        jLabelUTB.setText("" + Datos.matriz[0][Datos.utilBrut]);
        jLabelGV2.setText("" + Datos.matriz[0][Datos.gasVentas]);
        jLabelGAd.setText("" + Datos.matriz[0][Datos.gasAdmon]);
        jLabelUO.setText("" + Datos.matriz[0][Datos.utilOpera]);
        jLabelGFin.setText(""+ Datos.matriz[0][Datos.gasFinan]);
        jLabelPFinan.setText("" + Datos.matriz[0][Datos.proFinan]);
        jLabelOPro.setText("" + Datos.matriz[0][Datos.otrosP]);
        OtrosG.setText("" + Datos.matriz[0][Datos.otrosG]);
        jLabelUAI.setText("" + Datos.matriz[0][Datos.utilAnHimp]);
        jLabelIS3.setText("" + Datos.matriz[0][Datos.ISR]);
        jLabelPT1.setText("" + Datos.matriz[0][Datos.ptu]);
        jLabelUEjer.setText("" + Datos.matriz[0][Datos.utilEjer]);
        
      
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabeltitulo = new javax.swing.JLabel();
        jLabelFechA = new javax.swing.JLabel();
        jLabelVentas = new javax.swing.JLabel();
        jLabelCosoVen = new javax.swing.JLabel();
        jLabelUtilidadB = new javax.swing.JLabel();
        jLabelGasVen = new javax.swing.JLabel();
        jLabelGasAdmon = new javax.swing.JLabel();
        jLabelUtiOp = new javax.swing.JLabel();
        jLabelGasFin = new javax.swing.JLabel();
        jLabelPorFin = new javax.swing.JLabel();
        jLabelotGas = new javax.swing.JLabel();
        jLabel1OtProd = new javax.swing.JLabel();
        jLabelUtiaIm = new javax.swing.JLabel();
        jLabelISR = new javax.swing.JLabel();
        jLabelPTU = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelV = new javax.swing.JLabel();
        jLabelCV = new javax.swing.JLabel();
        jLabelUTB = new javax.swing.JLabel();
        jLabelGV = new javax.swing.JLabel();
        jLabelGAd = new javax.swing.JLabel();
        jLabelUO = new javax.swing.JLabel();
        jLabelGFin = new javax.swing.JLabel();
        jLabelPFinan = new javax.swing.JLabel();
        OtrosG = new javax.swing.JLabel();
        jLabelOPro = new javax.swing.JLabel();
        jLabelUAI = new javax.swing.JLabel();
        jLabelIS3 = new javax.swing.JLabel();
        jLabelPT1 = new javax.swing.JLabel();
        jLabelUEjer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelGV2 = new javax.swing.JLabel();
        txtFima1 = new javax.swing.JTextField();
        txtFirma2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabeltitulo.setText("jLabel1");
        getContentPane().add(jLabeltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabelFechA.setText("jLabel2");
        getContentPane().add(jLabelFechA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 240, 30));

        jLabelVentas.setText("Ventas");
        getContentPane().add(jLabelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabelCosoVen.setText("-Costo de Ventas");
        getContentPane().add(jLabelCosoVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabelUtilidadB.setText("=Utilidad Bruta");
        getContentPane().add(jLabelUtilidadB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabelGasVen.setText("-Gasto de Venta");
        getContentPane().add(jLabelGasVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabelGasAdmon.setText("-Gasto de Admon");
        getContentPane().add(jLabelGasAdmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabelUtiOp.setText("=Utilidad de Operación");
        getContentPane().add(jLabelUtiOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabelGasFin.setText("-Gastos Financieros");
        getContentPane().add(jLabelGasFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabelPorFin.setText("+Productos Financieros");
        getContentPane().add(jLabelPorFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabelotGas.setText("-Otros Gastos");
        getContentPane().add(jLabelotGas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel1OtProd.setText("+Otros Productos");
        getContentPane().add(jLabel1OtProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabelUtiaIm.setText("=Utilidad antes ");
        getContentPane().add(jLabelUtiaIm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, 20));

        jLabelISR.setText("-ISR 30%");
        getContentPane().add(jLabelISR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabelPTU.setText("-PTU 10%");
        getContentPane().add(jLabelPTU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel16.setText("=Utilidad de Ejercicio");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabelV.setBackground(new java.awt.Color(255, 255, 255));
        jLabelV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelV, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 90, 20));

        jLabelCV.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 90, 20));

        jLabelUTB.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUTB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelUTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 90, 20));
        getContentPane().add(jLabelGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabelGAd.setBackground(new java.awt.Color(255, 255, 255));
        jLabelGAd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelGAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 90, 20));

        jLabelUO.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelUO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 90, 20));

        jLabelGFin.setBackground(new java.awt.Color(255, 255, 255));
        jLabelGFin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelGFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 90, 20));

        jLabelPFinan.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPFinan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPFinan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 90, 20));

        OtrosG.setBackground(new java.awt.Color(255, 255, 255));
        OtrosG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(OtrosG, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 90, 20));

        jLabelOPro.setBackground(new java.awt.Color(255, 255, 255));
        jLabelOPro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelOPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 90, 20));

        jLabelUAI.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUAI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelUAI, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 90, 30));

        jLabelIS3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelIS3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelIS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 90, 20));

        jLabelPT1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPT1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 90, 20));

        jLabelUEjer.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUEjer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelUEjer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 90, 20));

        jLabel1.setText("de Impuestos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabelGV2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelGV2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelGV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 90, 20));
        getContentPane().add(txtFima1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, -1));
        getContentPane().add(txtFirma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 120, -1));

        jLabel2.setText("Firma de Elaboración");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 150, 20));

        jLabel3.setText("Firma de Autorización");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 150, 20));

        pack();
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
            java.util.logging.Logger.getLogger(Sumas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sumas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sumas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sumas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sumas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OtrosG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel1OtProd;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCV;
    private javax.swing.JLabel jLabelCosoVen;
    private javax.swing.JLabel jLabelFechA;
    private javax.swing.JLabel jLabelGAd;
    private javax.swing.JLabel jLabelGFin;
    private javax.swing.JLabel jLabelGV;
    private javax.swing.JLabel jLabelGV2;
    private javax.swing.JLabel jLabelGasAdmon;
    private javax.swing.JLabel jLabelGasFin;
    private javax.swing.JLabel jLabelGasVen;
    private javax.swing.JLabel jLabelIS3;
    private javax.swing.JLabel jLabelISR;
    private javax.swing.JLabel jLabelOPro;
    private javax.swing.JLabel jLabelPFinan;
    private javax.swing.JLabel jLabelPT1;
    private javax.swing.JLabel jLabelPTU;
    private javax.swing.JLabel jLabelPorFin;
    private javax.swing.JLabel jLabelUAI;
    private javax.swing.JLabel jLabelUEjer;
    private javax.swing.JLabel jLabelUO;
    private javax.swing.JLabel jLabelUTB;
    private javax.swing.JLabel jLabelUtiOp;
    private javax.swing.JLabel jLabelUtiaIm;
    private javax.swing.JLabel jLabelUtilidadB;
    private javax.swing.JLabel jLabelV;
    private javax.swing.JLabel jLabelVentas;
    private javax.swing.JLabel jLabelotGas;
    private javax.swing.JLabel jLabeltitulo;
    private javax.swing.JTextField txtFima1;
    private javax.swing.JTextField txtFirma2;
    // End of variables declaration//GEN-END:variables
}
