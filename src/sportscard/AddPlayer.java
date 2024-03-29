/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportscard;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author raian
 * @author rizvi_hasan
 * @author abdullah_al_farhad
 * @author shahriar_nur_nahin
 * 
 */
public class AddPlayer extends javax.swing.JFrame {
    String tourniName;
    String teamName;
    String pl_na;
    int pl_no;
    String pl_id;
    String pl_cat; 
    int res44;
    boolean f = false;
    /**
     * Creates new form AddPlayer
     */
    public AddPlayer() {
        initComponents();
    }
    public AddPlayer(String to_name,String te_name)
    {
        initComponents();
        this.tourniName = to_name;
        this.teamName = te_name;
        tournament_name.setText(tourniName);
        team_name.setText(teamName);
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
        jLabel2 = new javax.swing.JLabel();
        tournament_name = new javax.swing.JLabel();
        hudai = new javax.swing.JLabel();
        pl_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ShirtNo = new javax.swing.JSpinner();
        player_catagory = new javax.swing.JLabel();
        CatagoryBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        team_name = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PlayerID = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        verifyButton = new javax.swing.JButton();
        addNewPlayerButton = new javax.swing.JButton();
        addNewTeam = new javax.swing.JButton();
        minimumRemaining = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Player");

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Player ");

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        jLabel2.setText("Tournament Name");

        hudai.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        hudai.setText("Player Name");

        pl_name.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        pl_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pl_nameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        jLabel3.setText("Shirt No");

        ShirtNo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        player_catagory.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        player_catagory.setText("Catagory");

        CatagoryBox.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        CatagoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Batsman", "Bowler", "WicketKeeper", "All-Rounder" }));
        CatagoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatagoryBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel4.setText("Team Name");

        team_name.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        jLabel6.setText("Player ID");

        PlayerID.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        verifyButton.setText("Verify and Add to List");
        verifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyButtonActionPerformed(evt);
            }
        });

        addNewPlayerButton.setText("Add New Player");
        addNewPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewPlayerButtonActionPerformed(evt);
            }
        });

        addNewTeam.setText("Add New Team");
        addNewTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewTeamActionPerformed(evt);
            }
        });

        minimumRemaining.setFont(new java.awt.Font("Felix Titling", 2, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(197, 197, 197))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tournament_name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(player_catagory, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CatagoryBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(hudai, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(66, 66, 66)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PlayerID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(ShirtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(team_name, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minimumRemaining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addNewTeam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(resetButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(verifyButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addNewPlayerButton)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tournament_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(team_name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hudai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pl_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ShirtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player_catagory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CatagoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(PlayerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetButton)
                            .addComponent(verifyButton)
                            .addComponent(addNewPlayerButton))
                        .addGap(13, 13, 13)
                        .addComponent(addNewTeam)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minimumRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pl_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pl_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pl_nameActionPerformed

    private void CatagoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatagoryBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CatagoryBoxActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        tournament_name.setText(tourniName);
        team_name.setText(teamName);
        hudai.setText("");
        PlayerID.setText("");
        CatagoryBox.setSelectedIndex(1);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void verifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyButtonActionPerformed
        // first set all values
        this.pl_na = pl_name.getText();
        this.pl_no = (int)ShirtNo.getValue();
        this.pl_cat = CatagoryBox.getSelectedItem().toString();
        System.out.println(pl_na + " " + pl_no + " " + pl_cat);
        Player newPlayer = null;
        try {
            newPlayer = new Player(pl_na ,pl_cat ,pl_no,this.teamName,true);
        } catch (InterruptedException ex) {
            Logger.getLogger(AddPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(newPlayer.getAns() == 0) 
        {
            JOptionPane.showMessageDialog(rootPane,"Player already exists (change either player name or shirtNo");
        }
        else
        {
            PlayerID.setText(newPlayer.getP_ID());  
            JOptionPane.showMessageDialog(rootPane,"Player added succesfully");
        }
    }//GEN-LAST:event_verifyButtonActionPerformed

    private void addNewPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewPlayerButtonActionPerformed
        // TODO add your handling code here:
        tournament_name.setText(tourniName);
        team_name.setText(teamName);
        pl_name.setText("");
        PlayerID.setText("");
        CatagoryBox.setSelectedIndex(1);
        //CHECK FOR MINIMUM PLAYERS REQUIRED 
        
        String query1 = "select count(playerid) from player where teamID = '" + this.teamName  + "'";
        System.out.println(query1);
        Database db1 = new Database();
        int r1 = 0;
        r1 = db1.getCountfromTable(query1);
        String query2 = "select minimumplayer from tournament where tournamentID = '" + this.tourniName + "'";
        System.out.println(query1);
        int r2 = 0;
        r2 = db1.getCountfromTable(query2);
        this.res44 = r2-r1;
        
        String message = this.res44 + " players remaining" ;
        minimumRemaining.setText(message);
    }//GEN-LAST:event_addNewPlayerButtonActionPerformed

    private void addNewTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewTeamActionPerformed
        // TODO add your handling code here:
        if(this.res44<=0)   
        {
            JOptionPane.showMessageDialog(rootPane, "Players Added for this team");
            JOptionPane.showMessageDialog(rootPane, "Proceding to add new team");
            AddTeams obj = new AddTeams(tourniName);
            obj.setVisible(true);
            dispose();
        }
        else      
        {
            JOptionPane.showMessageDialog(rootPane, "Add minimum number of players");
            
            JOptionPane.showMessageDialog(rootPane, "Click on Add New Player to add more");
            
        }
    }//GEN-LAST:event_addNewTeamActionPerformed

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
            java.util.logging.Logger.getLogger(AddPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CatagoryBox;
    private javax.swing.JLabel PlayerID;
    private javax.swing.JSpinner ShirtNo;
    private javax.swing.JButton addNewPlayerButton;
    private javax.swing.JButton addNewTeam;
    private javax.swing.JLabel hudai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel minimumRemaining;
    private javax.swing.JTextField pl_name;
    private javax.swing.JLabel player_catagory;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel team_name;
    private javax.swing.JLabel tournament_name;
    private javax.swing.JButton verifyButton;
    // End of variables declaration//GEN-END:variables
}
