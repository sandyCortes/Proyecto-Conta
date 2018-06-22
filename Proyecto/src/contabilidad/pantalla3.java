package contabilidad;

import clases.Datos;
import javax.swing.JOptionPane;

public class pantalla3 extends javax.swing.JFrame {
    public pantalla3() {
        initComponents();
        for(int a =1 ; a <= 31; a++){ 
            jComboBDIa.addItem(a);
        }
        for(int b = 1; b <= 12; b++){
            jComboBoxMes.addItem(b);
        }
        for(int c =1992; c <= 2018; c++){
            jComboBoxAno.addItem(c);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNomEmpres = new javax.swing.JLabel();
        jTextFieldNomEmpres = new javax.swing.JTextField();
        jLabelDia = new javax.swing.JLabel();
        jLabelCosVentas = new javax.swing.JLabel();
        jLabelGasVentas = new javax.swing.JLabel();
        jLabelProFinancieros = new javax.swing.JLabel();
        jLabelGasFinancieros = new javax.swing.JLabel();
        jLabelOtrosGastos = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldVentas = new javax.swing.JTextField();
        jTextFieldCosVetas = new javax.swing.JTextField();
        jTextFieldGasVentas = new javax.swing.JTextField();
        jTextFieldGasAdimin = new javax.swing.JTextField();
        jTextFieldGasFinancieros = new javax.swing.JTextField();
        jTextFieldProducFinancieros = new javax.swing.JTextField();
        jTextFieldOtrosGastos = new javax.swing.JTextField();
        jTextFieldOtrosProuc = new javax.swing.JTextField();
        jLabelFirmaElavoracion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFirmAuroriz = new javax.swing.JTextField();
        jTextFieldFirmaElab = new javax.swing.JTextField();
        jButtonGenerar = new javax.swing.JButton();
        jButtonGenerar1 = new javax.swing.JButton();
        jComboBDIa = new javax.swing.JComboBox();
        jLabelVentas1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxAno = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNomEmpres.setText("Empresa");
        getContentPane().add(jLabelNomEmpres, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));
        getContentPane().add(jTextFieldNomEmpres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 323, -1));

        jLabelDia.setText("dd:");
        getContentPane().add(jLabelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabelCosVentas.setText("Cost. ventas");
        getContentPane().add(jLabelCosVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 209, -1, -1));

        jLabelGasVentas.setText("gast. ventas");
        getContentPane().add(jLabelGasVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 263, -1, -1));

        jLabelProFinancieros.setText("Pro. financieros");
        getContentPane().add(jLabelProFinancieros, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 209, -1, -1));

        jLabelGasFinancieros.setText("gas.financieros");
        getContentPane().add(jLabelGasFinancieros, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 163, -1, -1));

        jLabelOtrosGastos.setText("otros gastos");
        getContentPane().add(jLabelOtrosGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 263, -1, -1));

        jLabel13.setText("gast. Admi");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 313, -1, -1));

        jLabel2.setText("otros productos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 313, -1, -1));
        getContentPane().add(jTextFieldVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, -1));
        getContentPane().add(jTextFieldCosVetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 100, -1));
        getContentPane().add(jTextFieldGasVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 100, -1));
        getContentPane().add(jTextFieldGasAdimin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 100, -1));
        getContentPane().add(jTextFieldGasFinancieros, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 158, 125, -1));
        getContentPane().add(jTextFieldProducFinancieros, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 204, 125, -1));
        getContentPane().add(jTextFieldOtrosGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 258, 125, -1));
        getContentPane().add(jTextFieldOtrosProuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 308, 125, -1));

        jLabelFirmaElavoracion.setText("Firma de elaboracion");
        getContentPane().add(jLabelFirmaElavoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel3.setText("Firma de autorizacion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));
        getContentPane().add(jTextFieldFirmAuroriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 152, 42));
        getContentPane().add(jTextFieldFirmaElab, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 152, 42));

        jButtonGenerar.setText("Exit");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 140, -1));

        jButtonGenerar1.setText("GENERAR");
        jButtonGenerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGenerar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 140, -1));

        jComboBDIa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBDIaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBDIa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 60, -1));

        jLabelVentas1.setText("Ventas");
        getContentPane().add(jLabelVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 163, -1, -1));

        jLabel1.setText("mm:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        getContentPane().add(jComboBoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 80, -1));

        jLabel4.setText("aa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        getContentPane().add(jComboBoxAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 90, -1));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setText("Estado de resultados");
        jPanel1.add(jLabelTitulo);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 270, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    private void jButtonGenerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerar1ActionPerformed
        if(!"".equals(jTextFieldVentas.getText())  && !"".equals(jTextFieldGasVentas.getText()) && !"".equals(jTextFieldCosVetas.getSelectedText())
                && !"".equals(jTextFieldGasAdimin.getText()) && !"".equals(jTextFieldGasFinancieros.getText()) && !"".equals(jTextFieldProducFinancieros.getText())
                && !"".equals(jTextFieldOtrosProuc.getText()) && !"".equals(jTextFieldFirmaElab.getText())  && !"".equals(jTextFieldFirmAuroriz.getText())
                && !"".equals(jTextFieldNomEmpres.getText())){
                        Datos.nomEmpres = jTextFieldNomEmpres.getText();
                        Datos.firmaA = jTextFieldFirmaElab.getText();
                        Datos.firmElavo = jTextFieldFirmAuroriz.getText();
                        Datos.matriz[0][Datos.cosVenta] = Integer.parseInt(jTextFieldCosVetas.getText());
                        Datos.matriz[0][Datos.gasVentas] = Integer.parseInt(jTextFieldGasVentas.getText());
                        Datos.matriz[0][Datos.gasAdmon] = Integer.parseInt(jTextFieldGasAdimin.getText());
                        Datos.matriz[0][Datos.gasFinan] = Integer.parseInt(jTextFieldGasFinancieros.getText());
                        Datos.matriz[0][Datos.proFinan] = Integer.parseInt(jTextFieldProducFinancieros.getText());
                        Datos.matriz[0][Datos.otrosG] = Integer.parseInt(jTextFieldOtrosGastos.getText());
                        Datos.matriz[0][Datos.otrosP] = Integer.parseInt(jTextFieldOtrosProuc.getText());
                        Datos.matriz[0][Datos.mes] = (int) jComboBoxMes.getSelectedItem();
                        Datos.matriz[0][Datos.Dia] = (int) jComboBDIa.getSelectedItem();
                        Datos.matriz[0][Datos.año] = (int) jComboBoxAno.getSelectedItem();
             Sumas m = new Sumas();
             m.setVisible(true);
             dispose();
        
        }else
         JOptionPane.showMessageDialog(null,"Te hacen falta campos por llenar");
 
          
    }//GEN-LAST:event_jButtonGenerar1ActionPerformed

    private void jComboBDIaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBDIaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBDIaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JButton jButtonGenerar1;
    private javax.swing.JComboBox jComboBDIa;
    private javax.swing.JComboBox jComboBoxAno;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCosVentas;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelFirmaElavoracion;
    private javax.swing.JLabel jLabelGasFinancieros;
    private javax.swing.JLabel jLabelGasVentas;
    private javax.swing.JLabel jLabelNomEmpres;
    private javax.swing.JLabel jLabelOtrosGastos;
    private javax.swing.JLabel jLabelProFinancieros;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelVentas1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCosVetas;
    private javax.swing.JTextField jTextFieldFirmAuroriz;
    private javax.swing.JTextField jTextFieldFirmaElab;
    private javax.swing.JTextField jTextFieldGasAdimin;
    private javax.swing.JTextField jTextFieldGasFinancieros;
    private javax.swing.JTextField jTextFieldGasVentas;
    private javax.swing.JTextField jTextFieldNomEmpres;
    private javax.swing.JTextField jTextFieldOtrosGastos;
    private javax.swing.JTextField jTextFieldOtrosProuc;
    private javax.swing.JTextField jTextFieldProducFinancieros;
    private javax.swing.JTextField jTextFieldVentas;
    // End of variables declaration//GEN-END:variables
}
