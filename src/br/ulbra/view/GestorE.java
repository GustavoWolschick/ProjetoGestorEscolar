/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import java.awt.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.JOptionPane;

/**
 *
 * @author s.lucas
 */
public class GestorE extends javax.swing.JFrame {

    /**
     * Creates new form GestorE
     */
    public GestorE() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        Painel = new javax.swing.JPanel();
        lbTituloR = new javax.swing.JLabel();
        lbAlunoT = new javax.swing.JLabel();
        lbNota1T = new javax.swing.JLabel();
        lbNota2T = new javax.swing.JLabel();
        lbNota3T = new javax.swing.JLabel();
        lbMediaT = new javax.swing.JLabel();
        lbNomeR = new javax.swing.JLabel();
        lbNota1R = new javax.swing.JLabel();
        lbNota2R = new javax.swing.JLabel();
        lbNota3R = new javax.swing.JLabel();
        lbMedia = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        lbOAluno = new javax.swing.JLabel();
        lbNomeB = new javax.swing.JLabel();
        lbEsta = new javax.swing.JLabel();
        lbResposta = new javax.swing.JLabel();
        lbComMedia = new javax.swing.JLabel();
        lbMediaB = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbNota1 = new javax.swing.JLabel();
        lbNota2 = new javax.swing.JLabel();
        lbNota3 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        btnGerar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setText("GESTOR ESCOLAR");

        Painel.setBackground(new java.awt.Color(102, 102, 102));

        lbTituloR.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbTituloR.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloR.setText("BOLETIM");

        lbAlunoT.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbAlunoT.setForeground(new java.awt.Color(255, 255, 255));
        lbAlunoT.setText("ALUNO");

        lbNota1T.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbNota1T.setForeground(new java.awt.Color(255, 255, 255));
        lbNota1T.setText("NOTA 1:");

        lbNota2T.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbNota2T.setForeground(new java.awt.Color(255, 255, 255));
        lbNota2T.setText("NOTA 2:");

        lbNota3T.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbNota3T.setForeground(new java.awt.Color(255, 255, 255));
        lbNota3T.setText("NOTA 3:");

        lbMediaT.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbMediaT.setForeground(new java.awt.Color(255, 255, 255));
        lbMediaT.setText("MÉDIA:");

        lbNomeR.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbNomeR.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeR.setText("???");

        lbNota1R.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbNota1R.setForeground(new java.awt.Color(255, 255, 255));
        lbNota1R.setText("???");

        lbNota2R.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbNota2R.setForeground(new java.awt.Color(255, 255, 255));
        lbNota2R.setText("???");

        lbNota3R.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbNota3R.setForeground(new java.awt.Color(255, 255, 255));
        lbNota3R.setText("???");

        lbMedia.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbMedia.setForeground(new java.awt.Color(255, 255, 255));
        lbMedia.setText("???");

        lbResultado.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbResultado.setForeground(new java.awt.Color(255, 255, 255));
        lbResultado.setText("RESULTADO");

        lbOAluno.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbOAluno.setForeground(new java.awt.Color(255, 255, 255));
        lbOAluno.setText("O ALUNO");

        lbNomeB.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        lbNomeB.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeB.setText("           ???");

        lbEsta.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbEsta.setForeground(new java.awt.Color(255, 255, 255));
        lbEsta.setText("ESTÁ");

        lbResposta.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        lbResposta.setForeground(new java.awt.Color(255, 255, 255));
        lbResposta.setText("???");

        lbComMedia.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        lbComMedia.setForeground(new java.awt.Color(255, 255, 255));
        lbComMedia.setText("COM MÉDIA");

        lbMediaB.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        lbMediaB.setForeground(new java.awt.Color(255, 255, 255));
        lbMediaB.setText("???");

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lbAlunoT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNomeR, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addComponent(lbNota2T)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNota2R, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addComponent(lbNota1T)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNota1R, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lbResultado))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelLayout.createSequentialGroup()
                                        .addComponent(lbNota3T)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbNota3R))
                                    .addGroup(PainelLayout.createSequentialGroup()
                                        .addComponent(lbMediaT)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(lbResposta)
                                .addGap(34, 34, 34)
                                .addComponent(lbComMedia))
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(lbOAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEsta)
                            .addComponent(lbMediaB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(lbTituloR, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeR)
                    .addComponent(lbAlunoT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNota1T)
                    .addComponent(lbNota1R)
                    .addComponent(lbResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNota2T)
                    .addComponent(lbNota2R)
                    .addComponent(lbOAluno)
                    .addComponent(lbNomeB)
                    .addComponent(lbEsta))
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNota3T)
                            .addComponent(lbNota3R))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMediaT)
                            .addComponent(lbMedia)))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbResposta)
                            .addComponent(lbComMedia)
                            .addComponent(lbMediaB))))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        lbNome.setText("ALUNO");

        lbNota1.setText("NOTA 1");

        lbNota2.setText("NOTA 2");

        lbNota3.setText("NOTA 3");

        btnGerar.setText("GERAR BOLETIM");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(lbTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbNome)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(lbNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(lbNota2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbNota3)
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnLimpar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(13, 13, 13)))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnGerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(16, 16, 16)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNota1)
                    .addComponent(lbNota2)
                    .addComponent(lbNota3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerar)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText(null);
        txtNota1.setText(null);
        txtNota2.setText(null);
        txtNota3.setText(null);
        lbNomeR.setText("???");
        lbNota1R.setText("???");
        lbNota2R.setText("???");
        lbNota3R.setText("???");
        lbMedia.setText("???");
        lbNomeB.setText("???");
        lbResposta.setText("???");
        lbMediaB.setText("???");
        JOptionPane.showMessageDialog(null, "campo limpo com sucesso!");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        String nome;
        double n1, n2, n3, media;
        nome = txtNome.getText();
        n1 = Double.parseDouble(txtNota1.getText());
        n2 = Double.parseDouble(txtNota2.getText());
        n3 = Double.parseDouble(txtNota3.getText());
        media = (n1 + n2 + n3) / 3;
        if (media >= 7) {
            lbNomeR.setText(nome);
            lbNota1R.setText(String.valueOf(n1));
            lbNota2R.setText(String.valueOf(n2));
            lbNota3R.setText(String.valueOf(n3));
            lbMedia.setText(String.valueOf(media));
            lbNomeB.setText(nome);
            lbResposta.setText("Aprovado");
            lbMediaB.setText(String.valueOf(media));
            Painel.setBackground(Color.blue);
        } else {
             lbNomeR.setText(nome);
            lbNota1R.setText(String.valueOf(n1));
            lbNota2R.setText(String.valueOf(n2));
            lbNota3R.setText(String.valueOf(n3));
            lbMedia.setText(String.valueOf(media));
            lbNomeB.setText(nome);
            lbResposta.setText("Reprovado");
            lbMediaB.setText(String.valueOf(media));
            Painel.setBackground(Color.red);
        }
    }//GEN-LAST:event_btnGerarActionPerformed

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
            java.util.logging.Logger.getLogger(GestorE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lbAlunoT;
    private javax.swing.JLabel lbComMedia;
    private javax.swing.JLabel lbEsta;
    private javax.swing.JLabel lbMedia;
    private javax.swing.JLabel lbMediaB;
    private javax.swing.JLabel lbMediaT;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeB;
    private javax.swing.JLabel lbNomeR;
    private javax.swing.JLabel lbNota1;
    private javax.swing.JLabel lbNota1R;
    private javax.swing.JLabel lbNota1T;
    private javax.swing.JLabel lbNota2;
    private javax.swing.JLabel lbNota2R;
    private javax.swing.JLabel lbNota2T;
    private javax.swing.JLabel lbNota3;
    private javax.swing.JLabel lbNota3R;
    private javax.swing.JLabel lbNota3T;
    private javax.swing.JLabel lbOAluno;
    private javax.swing.JLabel lbResposta;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTituloR;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    // End of variables declaration//GEN-END:variables
}
