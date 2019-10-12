package sportscard;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raian
 */
public class secondInnings extends javax.swing.JFrame {

    /**
     * Creates new form secondInnings
     */
    Database db = new Database();
    String matchID;
    int run =0;
    int ball_no = 0;
    int wkt =0;
    int maxW ;
    int maxO;
    int targe;
    int type;
    public secondInnings() {
        initComponents();
        midLabel.setText("hudai");
        maxO = 2;
        maxW = 2;
        cRunLabel.setText("0");
        wicketLabel.setText("0");
        overLabel.setText("0.0");
        this.targe=15;
        target.setText(Integer.toString(targe));
        reqrun.setText(Integer.toString(targe-0));
        rr.setText(Float.toString((float) ((1.0*(targe-run)/((maxO*6.0)-ball_no))*6.0)));
    }
    
    public secondInnings(String givenID,int maxWkt,int maxover,int tar,int ty) throws SQLException
    {
        initComponents();
        this.matchID = givenID;
        this.maxW = maxWkt;
        this.maxO = maxover;
        this.targe = tar+1;
        target.setText(Integer.toString(targe));
        reqrun.setText(Integer.toString(targe-0));
        rr.setText(Float.toString((float) ((1.0*(targe-run)/((maxO*6.0)-ball_no))*6.0)));
        midLabel.setText(givenID);
        cRunLabel.setText("0");
        wicketLabel.setText("0");
        overLabel.setText("0.0");
        this.type = ty;
        if(ty==0)
        {
            tName.setText(db.selectAwayTeamName(matchID));
            
        }
        else
        {
            tName.setText(db.selectHomeTeamName(matchID));
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

        jLabel1 = new javax.swing.JLabel();
        legalButton = new javax.swing.JRadioButton();
        illegalButton = new javax.swing.JRadioButton();
        dismissalButton = new javax.swing.JRadioButton();
        runBox = new javax.swing.JComboBox<>();
        midLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inningsLabel = new javax.swing.JLabel();
        tName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cRunLabel = new javax.swing.JLabel();
        dismissalBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        wide = new javax.swing.JRadioButton();
        noball = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        wicketLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        overLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        target = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        reqrun = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setText("Match ID");

        legalButton.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        legalButton.setText("Legal Delivery");
        legalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legalButtonActionPerformed(evt);
            }
        });

        illegalButton.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        illegalButton.setText("NO / WIDE DELIVERY");
        illegalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                illegalButtonActionPerformed(evt);
            }
        });

        dismissalButton.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        dismissalButton.setText("Dismissal");

        runBox.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        runBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 RUNs", "1 RUN", "2 RUNs", "3 RUNs", "4 RUNs", "5 RUNs", "6 RUNs", "7 RUNs" }));

        midLabel.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel2.setText("Innings");

        inningsLabel.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        inningsLabel.setText("Second");

        tName.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        tName.setText("team 2");

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel5.setText("Run");

        cRunLabel.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        dismissalBox.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        dismissalBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOWLED", "LEG BEFORE", "CAUGHT", "RUN-OUT", "OTHERS" }));

        jButton2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        wide.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        wide.setText("Wide");
        wide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wideActionPerformed(evt);
            }
        });

        noball.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        noball.setText("No Ball");
        noball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noballActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jButton3.setText("Reset Selection");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel6.setText("Wicket");

        wicketLabel.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel7.setText("Over");

        overLabel.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel3.setText("Target");

        target.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel8.setText("Required Run");

        reqrun.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel9.setText("Req Run rate");

        rr.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cRunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(target, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(wicketLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reqrun, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(inningsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(legalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(illegalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dismissalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(runBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dismissalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wide)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noball))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(overLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(midLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inningsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(midLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                        .addComponent(cRunLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(wicketLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(overLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(reqrun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addComponent(target, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addGap(8, 8, 8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legalButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(illegalButton)
                    .addComponent(wide)
                    .addComponent(noball))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dismissalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dismissalButton))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void legalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legalButtonActionPerformed
        // TODO add your handling code here:
        if(illegalButton.isSelected())  illegalButton.setSelected(false);
    }//GEN-LAST:event_legalButtonActionPerformed

    private void illegalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_illegalButtonActionPerformed
        // TODO add your handling code here:
        if(legalButton.isSelected())    legalButton.setSelected(false);
    }//GEN-LAST:event_illegalButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        boolean flag = true;
        if(legalButton.isSelected() || illegalButton.isSelected())
        {
            if(illegalButton.isSelected() && flag)
            {
                flag = wide.isSelected() || noball.isSelected() && flag;
                if(dismissalButton.isSelected() && flag)
                {
                    flag = dismissalBox.getSelectedIndex() == 3;
                }
            }
            if(legalButton.isSelected() && dismissalButton.isSelected() && flag)
            {

                flag = !((dismissalBox.getSelectedIndex() < 3) && (runBox.getSelectedIndex() != 0));
            }

        }
        else flag = false;
        if(flag == false)
        {
            JOptionPane.showMessageDialog(rootPane, "Score input is not correct");

        }
        else
        {
            int ind = runBox.getSelectedIndex();
            int cr = 0;
            switch(ind){
                case 0:
                cr = 0;
                break;
                case 1:
                cr = 1;
                break;
                case 2:
                cr = 2;
                break;
                case 3:
                cr = 3;
                break;
                case 4:
                cr = 4;
                break;
                case 5:
                cr = 5;
                break;
                case 6:
                cr = 6;
                break;
                default:
                cr = 7;
            }
            String tm1 = null,tm2 = null;
            String team1=null,team2=null;
            int winner = -1;
            if(type==0)
            {
                try {
                    tm1 = db.selectHomeTeamName(matchID);
                    team1 = db.selectHomeTeam(matchID);
                } catch (SQLException ex) {
                    Logger.getLogger(secondInnings.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tm2 = db.selectAwayTeamName(matchID);
                    team2 = db.selctAwayTeam(matchID);
                } catch (SQLException ex) {
                    Logger.getLogger(secondInnings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else 
            {
                try {
                    tm2 = db.selectHomeTeamName(matchID);
                    team2 =  db.selectHomeTeam(matchID);
                } catch (SQLException ex) {
                    Logger.getLogger(secondInnings.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tm1 = db.selectAwayTeamName(matchID);
                    team1 = db.selctAwayTeam(matchID);
                } catch (SQLException ex) {
                    Logger.getLogger(secondInnings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(legalButton.isSelected())
            {
                if(dismissalButton.isSelected())
                {
                    run = run + cr;
                    wkt = wkt + 1;
                    if(wkt >= maxW)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Innings over");
                        if(run<targe-1)
                        {
                            JOptionPane.showMessageDialog(rootPane, tm1 + " won");
                            winner =1;
                        }
                        else if(run>targe-1)
                        { 
                           JOptionPane.showMessageDialog(rootPane, tm2 +" won");
                           winner = 2;
                           
                        }
                        else 
                        {
                           JOptionPane.showMessageDialog(rootPane,"Match tied");
                           winner = 0;
                        }
                        // go to next innings
                    }
                }
                else{
                    run = run + cr;
                }
                
                ball_no = ball_no + 1;
                if(run > targe-1) 
                {
                    JOptionPane.showMessageDialog(rootPane, tm2+" won");
                    winner = 2;
                }
                if(maxO*6 <= ball_no )
                {
                    
                    JOptionPane.showMessageDialog(rootPane,"Innings over and team1 won");
                    if(run<targe-1)
                        {
                            JOptionPane.showMessageDialog(rootPane,tm1 +" won");
                            winner = 1;
                        }
                        else if(run>targe-1)
                        { 
                           JOptionPane.showMessageDialog(rootPane,tm2 + " won");
                           winner = 2;
                        }
                        else 
                        {
                           JOptionPane.showMessageDialog(rootPane,"Match tied");
                           winner = 0;
                        }
                    // go to next innings
                }
            }
            else if(illegalButton.isSelected())
            {
                run = run + cr;
                if(wide.isSelected() || noball.isSelected())
                {
                    run = run + 1;
                }
                if(run > targe-1) 
                {
                    JOptionPane.showMessageDialog(rootPane,tm2 + "won");
                    winner = 2;
                }
                if(dismissalButton.isSelected())
                {
                    wkt = wkt + 1;
                    if(wkt >= maxW)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Innings over and " + tm1 + " won");
                        winner = 1;
                    }
                    if(run<targe-1)
                        {
                            JOptionPane.showMessageDialog(rootPane,tm1 + " won");
                            winner = 1;
                        }
                        else if(run>targe-1)
                        { 
                           JOptionPane.showMessageDialog(rootPane,tm2 + " won");
                           winner = 2;
                        }
                        else 
                        {
                           JOptionPane.showMessageDialog(rootPane,"Match tied"); 
                           winner = 0;
                        }
                }
            }
            if(winner != -1)
            {
                //match ended
                switch (winner) {
                    case 0:
                {
                    try {
                        db.updateResult(matchID,"matchTied");
                    } catch (SQLException ex) {
                        Logger.getLogger(secondInnings.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    db.updatePoint(team1, 1);
                    db.updatePoint(team2,1);
                }
                        break;
                    case 1:
                {
                    try {
                        db.updateResult(matchID,tm1);
                    } catch (SQLException ex) {
                        Logger.getLogger(secondInnings.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                        break;
                    default:
                {
                    try {
                        db.updateResult(matchID,tm2);
                    } catch (SQLException ex) {
                        Logger.getLogger(secondInnings.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                        break;
                }
                JOptionPane.showMessageDialog(rootPane, "Going Back to tournament Page");
                TournamentExplorer obj = new TournamentExplorer();
                obj.setVisible(true);
                dispose();
            }
            cRunLabel.setText(Integer.toString(run));
            wicketLabel.setText(Integer.toString(wkt));
            String oo = Integer.toString(ball_no/6);
            oo = oo + "." + Integer.toString(ball_no%6);
            overLabel.setText(oo);
           // target.setText(Integer.toString(targe));
             reqrun.setText(Integer.toString(targe-run));
            rr.setText(Float.toString((float) ((1.0*(targe-run)/((maxO*6.0)-ball_no))*6.0)));

            legalButton.setSelected(false);
            illegalButton.setSelected(false);
            wide.setSelected(false);
            noball.setSelected(false);
            dismissalButton.setSelected(false);
            runBox.setSelectedIndex(0);
            dismissalBox.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void wideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wideActionPerformed
        // TODO add your handling code here:
        if(!illegalButton.isSelected()) wide.setSelected(false);
        if(noball.isSelected())     noball.setSelected(false);
    }//GEN-LAST:event_wideActionPerformed

    private void noballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noballActionPerformed
        // TODO add your handling code here:
        if(!illegalButton.isSelected()) noball.setSelected(false);
        if(wide.isSelected())       wide.setSelected(false);
    }//GEN-LAST:event_noballActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        legalButton.setSelected(false);
        illegalButton.setSelected(false);
        wide.setSelected(false);
        noball.setSelected(false);
        dismissalButton.setSelected(false);
        runBox.setSelectedIndex(0);
        dismissalBox.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(secondInnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secondInnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secondInnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secondInnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secondInnings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cRunLabel;
    private javax.swing.JComboBox<String> dismissalBox;
    private javax.swing.JRadioButton dismissalButton;
    private javax.swing.JRadioButton illegalButton;
    private javax.swing.JLabel inningsLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton legalButton;
    private javax.swing.JLabel midLabel;
    private javax.swing.JRadioButton noball;
    private javax.swing.JLabel overLabel;
    private javax.swing.JLabel reqrun;
    private javax.swing.JLabel rr;
    private javax.swing.JComboBox<String> runBox;
    private javax.swing.JLabel tName;
    private javax.swing.JLabel target;
    private javax.swing.JLabel wicketLabel;
    private javax.swing.JRadioButton wide;
    // End of variables declaration//GEN-END:variables
}
