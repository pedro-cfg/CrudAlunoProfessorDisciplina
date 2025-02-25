package main;

import crudAluno.AlunoInternalFrame;
import crudDisciplina.DisciplinaInternalFrame;
import crudProfessor.ProfessorInternalFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Pedro Kravetz
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        professorJIF = new ProfessorInternalFrame(this);
        alunoJIF = new AlunoInternalFrame(this);
        disciplinaJIF = new DisciplinaInternalFrame(this);
        initComponents();
        this.getContentPane().add(professorJIF);
        this.getContentPane().add(alunoJIF);
        this.getContentPane().add(disciplinaJIF);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBar = new javax.swing.JMenuBar();
        ArquivoMN = new javax.swing.JMenu();
        SairMNI = new javax.swing.JMenuItem();
        CadastroMN = new javax.swing.JMenu();
        AlunoMNI = new javax.swing.JMenuItem();
        ProfessorMNI = new javax.swing.JMenuItem();
        DisciplinaMNI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ArquivoMN.setText("Arquivo");

        SairMNI.setText("Sair");
        SairMNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairMNIActionPerformed(evt);
            }
        });
        ArquivoMN.add(SairMNI);

        MenuBar.add(ArquivoMN);

        CadastroMN.setText("Cadastro");

        AlunoMNI.setText("Aluno");
        AlunoMNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlunoMNIActionPerformed(evt);
            }
        });
        CadastroMN.add(AlunoMNI);

        ProfessorMNI.setText("Professor");
        ProfessorMNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfessorMNIActionPerformed(evt);
            }
        });
        CadastroMN.add(ProfessorMNI);

        DisciplinaMNI.setText("Disciplina");
        DisciplinaMNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisciplinaMNIActionPerformed(evt);
            }
        });
        CadastroMN.add(DisciplinaMNI);

        MenuBar.add(CadastroMN);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairMNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairMNIActionPerformed
        dispose();
    }//GEN-LAST:event_SairMNIActionPerformed

    private void DisciplinaMNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisciplinaMNIActionPerformed
        disciplinaJIF.setVisible(true);
    }//GEN-LAST:event_DisciplinaMNIActionPerformed

    private void ProfessorMNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfessorMNIActionPerformed
        professorJIF.setVisible(true);
    }//GEN-LAST:event_ProfessorMNIActionPerformed

    private void AlunoMNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlunoMNIActionPerformed
        alunoJIF.setVisible(true);
    }//GEN-LAST:event_AlunoMNIActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private ProfessorInternalFrame professorJIF;
    private AlunoInternalFrame alunoJIF;
    private DisciplinaInternalFrame disciplinaJIF;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlunoMNI;
    private javax.swing.JMenu ArquivoMN;
    private javax.swing.JMenu CadastroMN;
    private javax.swing.JMenuItem DisciplinaMNI;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem ProfessorMNI;
    private javax.swing.JMenuItem SairMNI;
    // End of variables declaration//GEN-END:variables
}
