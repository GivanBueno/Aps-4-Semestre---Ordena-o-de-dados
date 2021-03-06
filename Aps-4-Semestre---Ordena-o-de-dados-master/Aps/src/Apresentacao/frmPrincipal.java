
package Apresentacao;
import Modelo.Arquivo;
import Modelo.Controle;
import Modelo.NumeroRandomico;
import Modelo.Ordenacao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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

    private void Executar() throws IOException
    {
        
        Controle controle = new Controle();
        
        if (this.btrBubblesort.isSelected())
        {
            controle.Bubblesort();
            lblTempo.setText(String.valueOf(controle.tempoBubblesort) + " ms");
            //lblQtd.setText(String.valueOf(controle.));
        }
        else
        {
            if(this.btrInsertsort.isSelected())
            {
                controle.Insertsort();
                lblTempo.setText(String.valueOf(controle.tempoInsertsort) + " ms");
            }
            else
            {
                if(this.btrMergesort.isSelected())
                {
                    controle.Mergesort();
                    lblTempo.setText(String.valueOf(controle.tempoMergesort) + " ms");
                }
                else
                {
                    if(this.btrQuicksort.isSelected())
                    {
                        controle.Quicksort();
                        lblTempo.setText(String.valueOf(controle.tempoQuicksort) + " ms");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Selecione uma das opções acima");
                    }
                }
            }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTempoTotalEmMilisegundos = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        btrBubblesort = new javax.swing.JRadioButton();
        btrInsertsort = new javax.swing.JRadioButton();
        btrMergesort = new javax.swing.JRadioButton();
        btrQuicksort = new javax.swing.JRadioButton();
        btnExecutar = new javax.swing.JButton();
        lblQtdArquivo = new javax.swing.JLabel();
        lblQtd = new javax.swing.JLabel();
        lblObservacao = new javax.swing.JLabel();
        btnBatTeste = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordenação de Dados");

        lblTempoTotalEmMilisegundos.setText("Tempo total em milisegundos:");

        buttonGroup1.add(btrBubblesort);
        btrBubblesort.setText("Bubblesort");

        buttonGroup1.add(btrInsertsort);
        btrInsertsort.setText("Insertsort");

        buttonGroup1.add(btrMergesort);
        btrMergesort.setText("Mergesort");

        buttonGroup1.add(btrQuicksort);
        btrQuicksort.setText("Quicksort");

        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        lblQtdArquivo.setText("Quantidade de Arquivos:");

        lblObservacao.setText("* Pode demorar um pouco");

        btnBatTeste.setText("Fazer bateria de testes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBatTeste)
                    .addComponent(lblObservacao)
                    .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTempoTotalEmMilisegundos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btrInsertsort)
                        .addGap(53, 53, 53)
                        .addComponent(btrQuicksort))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btrBubblesort)
                        .addGap(49, 49, 49)
                        .addComponent(btrMergesort))
                    .addComponent(btnExecutar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblQtd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQtdArquivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btrBubblesort)
                    .addComponent(btrMergesort))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btrQuicksort)
                    .addComponent(btrInsertsort))
                .addGap(18, 18, 18)
                .addComponent(lblTempoTotalEmMilisegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQtdArquivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnExecutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBatTeste)
                .addGap(18, 18, 18)
                .addComponent(lblObservacao)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExecutarActionPerformed
    {//GEN-HEADEREND:event_btnExecutarActionPerformed
        
        
            try
            {
                this.Executar();
                
            }
            catch (IOException ex)
            {
                JOptionPane.showMessageDialog(null, "Erro em executar");
            }
            
        
        
            
    }//GEN-LAST:event_btnExecutarActionPerformed

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
    private javax.swing.JButton btnBatTeste;
    private javax.swing.JButton btnExecutar;
    private javax.swing.JRadioButton btrBubblesort;
    private javax.swing.JRadioButton btrInsertsort;
    private javax.swing.JRadioButton btrMergesort;
    private javax.swing.JRadioButton btrQuicksort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblQtdArquivo;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblTempoTotalEmMilisegundos;
    // End of variables declaration//GEN-END:variables
}
