
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Antonio Cubero
 */
public class MainWindow extends javax.swing.JFrame {

    protected PanelControl pc;
    protected EncuestaDialog ed;
    private URL hsUrl;
    private HelpSet hs;
    private HelpBroker hb;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        pc = new PanelControl(this, rootPaneCheckingEnabled);
        ed = new EncuestaDialog();
         try {
            hsUrl=HelpSet.findHelpSet(null, "ayuda/ayuda.hs");
            hs  = new HelpSet(null,hsUrl);
            hb = hs.createHelpBroker();
            hb.enableHelpOnButton(jMenuItemAcerca, "aplicacion", hs);
            hb.enableHelpKey(getRootPane(), "aplicacion", hs);
        } catch (HelpSetException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuConfiguracion = new javax.swing.JMenu();
        jMenuItemControl = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemClose = new javax.swing.JMenuItem();
        jMenuEncuesta = new javax.swing.JMenu();
        jMenuItemEncuesta = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuConfiguracion.setText("Configuracion");

        jMenuItemControl.setText("Panel de control");
        jMenuItemControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControlActionPerformed(evt);
            }
        });
        jMenuConfiguracion.add(jMenuItemControl);
        jMenuConfiguracion.add(jSeparator1);

        jMenuItemClose.setText("Salir");
        jMenuConfiguracion.add(jMenuItemClose);

        jMenuBar1.add(jMenuConfiguracion);

        jMenuEncuesta.setText("Encuesta");

        jMenuItemEncuesta.setText("Realizar encuesta");
        jMenuEncuesta.add(jMenuItemEncuesta);

        jMenuBar1.add(jMenuEncuesta);

        jMenuAyuda.setText("Ayuda");

        jMenuItemAcerca.setText("Acerca de");
        jMenuItemAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemAcerca);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControlActionPerformed
       pc.setVisible(true);
    }//GEN-LAST:event_jMenuItemControlActionPerformed

    private void jMenuItemAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaActionPerformed
       
    }//GEN-LAST:event_jMenuItemAcercaActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConfiguracion;
    private javax.swing.JMenu jMenuEncuesta;
    private javax.swing.JMenuItem jMenuItemAcerca;
    private javax.swing.JMenuItem jMenuItemClose;
    private javax.swing.JMenuItem jMenuItemControl;
    private javax.swing.JMenuItem jMenuItemEncuesta;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
