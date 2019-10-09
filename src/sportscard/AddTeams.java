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
 */
public final  class AddTeams extends javax.swing.JFrame {

    /**
     * Creates new form AddTeams
     */
    
    // tournament name and other values ;
    private Tournament newTournament = new Tournament();
    boolean  flag = false;
    private  String name = "";
    private String tournamentID;
    private String teamID;
    
    public AddTeams() {
        initComponents();
        showTournamentName();
        
    }
    void setTournamentID(String tournamentID)
    {
        this.tournamentID = tournamentID;
    }
    String getTournamentID()
    {
        return this.tournamentID;
    }
    void setTeamID(String te_id)
    {
        this.teamID = te_id;
    }
    String getTeamID()
    {
        return this.teamID;
    }
    public AddTeams(String tournamentID)
    {
        initComponents();
        t_name.setText(tournamentID);
        TeamID.setText("");
        setTournamentID(tournamentID);
       // tourn.setText("Add New Teams");
       // tourn.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TournamentName = new javax.swing.JLabel();
        teamName = new javax.swing.JLabel();
        TeamName = new javax.swing.JTextField();
        Validate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        some = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ShortName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TeamID = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Teams");

        teamName.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        teamName.setText("Team Name");

        TeamName.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N

        Validate.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        Validate.setText("Validate and add");
        Validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidateActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        jButton2.setText("Add players");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        some.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        jLabel1.setText("Short Name");

        ShortName.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Felix Titling", 3, 12)); // NOI18N
        jLabel2.setText("TeamID");

        t_name.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        t_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TeamID.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        jButton1.setText("Go Back To Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Validate)
                .addGap(232, 232, 232))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(some, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TeamName, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TeamID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ShortName))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(TournamentName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(TournamentName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(some, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t_name, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ShortName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TeamID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Validate)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidateActionPerformed
        // TODO add your handling code here:
        String t_name1 = TeamName.getText();
        String shortName = ShortName.getText();
        System.out.println( "this id " +getTournamentID());
        Teams newTeam = null;
        try {
            newTeam = new Teams(t_name1,shortName,getTournamentID(),true);
        } catch (InterruptedException ex) {
            Logger.getLogger(AddTeams.class.getName()).log(Level.SEVERE, null, ex);
        }
        setTeamID(newTeam.getTeamID());
        int res = newTeam.getnum();
        if(res==0)
        {
            JOptionPane.showMessageDialog(rootPane,"Error in inserting or team already exists");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Added Successfully");
            TeamID.setText(newTeam.getTeamID());
            this.flag = true;
        }
    }//GEN-LAST:event_ValidateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(this.flag == true)
        {
            //JOptionPane.showMessageDialog(rootPane,"Added to database");
           AddPlayer newPlayer = new AddPlayer(getTournamentID(),getTeamID());
           newPlayer.setVisible(true);
           dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // check for remaining team 
        // if ok then go back to home 
        // else add more 
         int count =0;
            String query = "select count(teamid) from team where tournamentid = '" + getTournamentID()+  "'";
            Database db = new Database();
        try {
            count =db.getCountfromTable(query);
        } catch (InterruptedException ex) {
            Logger.getLogger(AddTeams.class.getName()).log(Level.SEVERE, null, ex);
        }
      //      Database db2 = new Database();
            query = "select numberofteams from tournament where tournamentid = '" + getTournamentID() + "'";
            int c2 = 0;
        try {
            c2 = db.getCountfromTable(query);
        } catch (InterruptedException ex) {
            Logger.getLogger(AddTeams.class.getName()).log(Level.SEVERE, null, ex);
        }
            int cc = c2-count;
            //if(cc==0)   JOptionPane.showMessageDialog(rootPane, "Done adding");
            JOptionPane.showMessageDialog(rootPane,Integer.toString(cc) + "remaining");
            if(cc==0)
            {
                JOptionPane.showMessageDialog(rootPane,"ALL TEAMS ADDED");
                JOptionPane.showMessageDialog(rootPane,"Going Back to Home");
                //go back to tournament profile 
                tournamentProfile obj = new tournamentProfile(tournamentID);
                obj.setVisible(true);
                dispose();
            }
            else 
            {
                TeamID.setText("");
                TeamName.setText("");
                ShortName.setText("");
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    void showTournamentName()
    {
        t_name.setText(newTournament.getTournamentID());
    }
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
            java.util.logging.Logger.getLogger(AddTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeams().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ShortName;
    private javax.swing.JLabel TeamID;
    private javax.swing.JTextField TeamName;
    private javax.swing.JLabel TournamentName;
    private javax.swing.JButton Validate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel some;
    private javax.swing.JLabel t_name;
    private javax.swing.JLabel teamName;
    // End of variables declaration//GEN-END:variables
}