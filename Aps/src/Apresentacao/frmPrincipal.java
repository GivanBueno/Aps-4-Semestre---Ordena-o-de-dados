/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

/**
 *
 * @author julio
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblQuantidade = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        btrBubblesort = new javax.swing.JRadioButton();
        btrInsertsort = new javax.swing.JRadioButton();
        btrMergesort = new javax.swing.JRadioButton();
        btrQuicksort = new javax.swing.JRadioButton();
        btnExportarArquivo = new javax.swing.JButton();
        btnExecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblQuantidade.setText("Quantidade de arquivos:");

        lblTempo.setText("Tempo:");

        buttonGroup1.add(btrBubblesort);
        btrBubblesort.setText("Bubblesort");

        buttonGroup1.add(btrInsertsort);
        btrInsertsort.setText("Insertsort");

        buttonGroup1.add(btrMergesort);
        btrMergesort.setText("Mergesort");

        buttonGroup1.add(btrQuicksort);
        btrQuicksort.setText("Quicksort");

        btnExportarArquivo.setText("Exportar Arquivo");
        btnExportarArquivo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExportarArquivoActionPerformed(evt);
            }
        });

        btnExecutar.setText("Executar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExecutar)
                    .addComponent(lblTempo)
                    .addComponent(lblQuantidade)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btrBubblesort)
                            .addComponent(btrInsertsort)
                            .addComponent(btnExportarArquivo))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btrQuicksort)
                            .addComponent(btrMergesort))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(btnExportarArquivo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btrBubblesort)
                    .addComponent(btrMergesort))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btrInsertsort)
                    .addComponent(btrQuicksort))
                .addGap(18, 18, 18)
                .addComponent(lblQuantidade)
                .addGap(18, 18, 18)
                .addComponent(lblTempo)
                .addGap(33, 33, 33)
                .addComponent(btnExecutar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportarArquivoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExportarArquivoActionPerformed
    {//GEN-HEADEREND:event_btnExportarArquivoActionPerformed
        
    }//GEN-LAST:event_btnExportarArquivoActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecutar;
    private javax.swing.JButton btnExportarArquivo;
    private javax.swing.JRadioButton btrBubblesort;
    private javax.swing.JRadioButton btrInsertsort;
    private javax.swing.JRadioButton btrMergesort;
    private javax.swing.JRadioButton btrQuicksort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTempo;
    // End of variables declaration//GEN-END:variables
}
