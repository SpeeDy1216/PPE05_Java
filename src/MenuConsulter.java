
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SpeeDy1216
 */
public class MenuConsulter extends javax.swing.JFrame {
    private int i=0;
    private JOptionPane jop;
    OffreStage stage;
    /**
     * Creates new form MenuConsulter
     */
    public MenuConsulter() {
        this.stage = MainProjet.lesOffres.get(0);
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

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrp = new javax.swing.JTextArea();
        btnPrecedent = new javax.swing.JButton();
        btnSuivant = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();
        nomE = new javax.swing.JTextField();
        ville = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        domaine = new javax.swing.JTextField();
        libelle = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        duree = new javax.swing.JTextField();

        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CONSULTER DES OFFRES DE STAGE");

        jLabel2.setText("Nom de l'entreprise");

        jLabel3.setText("Mail contact");

        jLabel4.setText("Libellé de l'offre");

        jLabel5.setText("Date de début du stage");

        jLabel6.setText("Ville du stage");

        jLabel7.setText("Domaine du stage");

        jLabel8.setText("Durée du stage");

        jLabel9.setText("Descriptif du stage");

        descrp.setEditable(false);
        descrp.setColumns(20);
        descrp.setRows(5);
        descrp.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                descrpPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(descrp);

        btnPrecedent.setText("Précedent");
        btnPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecedentActionPerformed(evt);
            }
        });

        btnSuivant.setText("Suivant");
        btnSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantActionPerformed(evt);
            }
        });

        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        nomE.setEditable(false);
        nomE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomEActionPerformed(evt);
            }
        });
        nomE.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nomEPropertyChange(evt);
            }
        });

        ville.setEditable(false);
        ville.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                villePropertyChange(evt);
            }
        });

        mail.setEditable(false);
        mail.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mailPropertyChange(evt);
            }
        });

        domaine.setEditable(false);
        domaine.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                domainePropertyChange(evt);
            }
        });

        libelle.setEditable(false);
        libelle.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                libellePropertyChange(evt);
            }
        });

        date.setEditable(false);
        date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePropertyChange(evt);
            }
        });

        duree.setEditable(false);
        duree.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dureePropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(libelle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnPrecedent)
                        .addGap(32, 32, 32)
                        .addComponent(btnSuivant)
                        .addGap(18, 18, 18)
                        .addComponent(btnFermer)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mail)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nomE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ville, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(domaine)
                    .addComponent(duree, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(nomE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(libelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuivant)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrecedent)
                        .addComponent(btnFermer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

    private void nomEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomEActionPerformed

    }//GEN-LAST:event_nomEActionPerformed

    private void nomEPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nomEPropertyChange
       nomE.setText(this.stage.getEntreprise().getNom());
    }//GEN-LAST:event_nomEPropertyChange

    private void villePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_villePropertyChange
       ville.setText(this.stage.getEntreprise().getAdresseVilleEntreprise());
    }//GEN-LAST:event_villePropertyChange

    private void libellePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_libellePropertyChange
        libelle.setText(MainProjet.lesOffres.get(i).getLibelleOffre());
    }//GEN-LAST:event_libellePropertyChange

    private void domainePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_domainePropertyChange
        domaine.setText(MainProjet.lesOffres.get(i).getDomaineOffre());
    }//GEN-LAST:event_domainePropertyChange

    private void datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePropertyChange
        date.setText(MainProjet.lesOffres.get(i).getDateDebutOffre());
    }//GEN-LAST:event_datePropertyChange

    private void dureePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dureePropertyChange
        duree.setText(MainProjet.lesOffres.get(i).getDureeOffre());
    }//GEN-LAST:event_dureePropertyChange

    private void descrpPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_descrpPropertyChange
        descrp.setText(MainProjet.lesOffres.get(i).getDescriptifOffre());
    }//GEN-LAST:event_descrpPropertyChange

    private void mailPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_mailPropertyChange
        mail.setText(this.stage.getEntreprise().getMail());
    }//GEN-LAST:event_mailPropertyChange

    private void btnSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantActionPerformed
       if(i+1 >= MainProjet.lesOffres.size()){
           jop.showMessageDialog(null, "Plus d'offre");
       }else{
            i++;
            
            OffreStage suivant = MainProjet.lesOffres.get(i);
            
            date.setText(suivant.getDateDebutOffre());
            descrp.setText(suivant.getDescriptifOffre());
            domaine.setText(suivant.getDomaineOffre());
            duree.setText(suivant.getDureeOffre());
            libelle.setText(suivant.getLibelleOffre());
            mail.setText(suivant.getEntreprise().getMail());
            nomE.setText(suivant.getEntreprise().getNom());
            ville.setText(suivant.getEntreprise().getAdresseVilleEntreprise());
       }
    }//GEN-LAST:event_btnSuivantActionPerformed

    private void btnPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecedentActionPerformed
        if(i-1 == -1){
           jop.showMessageDialog(null, "Plus d'offre");
       }else{
            i--;
            
            OffreStage precedent = MainProjet.lesOffres.get(i);
            
            date.setText(precedent.getDateDebutOffre());
            descrp.setText(precedent.getDescriptifOffre());
            domaine.setText(precedent.getDomaineOffre());
            duree.setText(precedent.getDureeOffre());
            libelle.setText(precedent.getLibelleOffre());
            mail.setText(precedent.getEntreprise().getMail());
            nomE.setText(precedent.getEntreprise().getNom());
            ville.setText(precedent.getEntreprise().getAdresseVilleEntreprise());
       }
    }//GEN-LAST:event_btnPrecedentActionPerformed

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
            java.util.logging.Logger.getLogger(MenuConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConsulter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnPrecedent;
    private javax.swing.JButton btnSuivant;
    private javax.swing.JTextField date;
    private javax.swing.JTextArea descrp;
    private javax.swing.JTextField domaine;
    private javax.swing.JTextField duree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField libelle;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField nomE;
    private javax.swing.JTextField ville;
    // End of variables declaration//GEN-END:variables
}
