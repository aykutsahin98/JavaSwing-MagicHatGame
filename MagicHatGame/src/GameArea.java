
public class GameArea extends javax.swing.JFrame {

    public GameArea() {
        initComponents();
        panelGameArea.setVisible(false);
        buttonNewPlayer.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlayer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonPlay = new javax.swing.JButton();
        txt_name = new javax.swing.JTextField();
        panelGameArea = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelPlayerName = new javax.swing.JLabel();
        labelPlayerScore = new javax.swing.JLabel();
        buttonTry = new javax.swing.JButton();
        buttonNewPlayer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPlayer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Player Name: ");

        buttonPlay.setBackground(new java.awt.Color(0, 204, 51));
        buttonPlay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonPlay.setText("Play");
        buttonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPlayerLayout = new javax.swing.GroupLayout(panelPlayer);
        panelPlayer.setLayout(panelPlayerLayout);
        panelPlayerLayout.setHorizontalGroup(
            panelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(buttonPlay)
                .addContainerGap())
        );
        panelPlayerLayout.setVerticalGroup(
            panelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGameArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Game Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png"))); // NOI18N
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png"))); // NOI18N
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kapali.png"))); // NOI18N
        b0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Status:");

        labelStatus.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        labelStatus.setText("Congratulations First Time Found 150 Points");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("SCORE");

        labelPlayerName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPlayerName.setText("Player: ");

        labelPlayerScore.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPlayerScore.setText("0");

        buttonTry.setBackground(new java.awt.Color(255, 102, 0));
        buttonTry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonTry.setForeground(new java.awt.Color(255, 255, 255));
        buttonTry.setText("Try Again");
        buttonTry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGameAreaLayout = new javax.swing.GroupLayout(panelGameArea);
        panelGameArea.setLayout(panelGameAreaLayout);
        panelGameAreaLayout.setHorizontalGroup(
            panelGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGameAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelGameAreaLayout.createSequentialGroup()
                        .addComponent(b0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2))
                    .addGroup(panelGameAreaLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGameAreaLayout.createSequentialGroup()
                        .addGroup(panelGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGameAreaLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelGameAreaLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(labelPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPlayerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGameAreaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonTry, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelGameAreaLayout.setVerticalGroup(
            panelGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGameAreaLayout.createSequentialGroup()
                .addGroup(panelGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGameAreaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b0)
                            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelGameAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPlayerName)
                            .addComponent(labelPlayerScore))
                        .addGap(18, 18, 18)
                        .addComponent(buttonTry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buttonNewPlayer.setBackground(new java.awt.Color(0, 51, 153));
        buttonNewPlayer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonNewPlayer.setForeground(new java.awt.Color(255, 255, 255));
        buttonNewPlayer.setText("New Player");
        buttonNewPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewPlayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNewPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelGameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonNewPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int whereBall = 0;
    int number = 0;
    int point = 0;
    String name = "";
    private void buttonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlayActionPerformed
        whereBall = (int) (Math.random() * 3 + 1);
        number = 0;
        labelPlayerScore.setText(String.valueOf(point));
        labelStatus.setText("Let's Try It.");
        name = txt_name.getText();
        labelPlayerName.setText(name);

        //1 ise button 1      //2 ise button 2  //3 button 3
        b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/kapali.png")));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/kapali.png")));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/kapali.png")));

        txt_name.setEnabled(false);
        buttonPlay.setEnabled(false);
        panelGameArea.setVisible(true);
        buttonNewPlayer.setVisible(true);

    }//GEN-LAST:event_buttonPlayActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        number++;
        if (whereBall == 1) {
            b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/dolu.png")));
            Control();
        } else {
            b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/bos.png")));
        }
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        number++;
        if (whereBall == 2) {
            b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/dolu.png")));
            Control();
        } else {
            b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/bos.png")));
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        number++;
        if (whereBall == 3) {
            b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/dolu.png")));
            Control();
        } else {
            b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/bos.png")));
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void buttonNewPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewPlayerActionPerformed
        txt_name.setEnabled(true);
        buttonPlay.setEnabled(true);
        point = 100;
        number = 0;
        panelGameArea.setVisible(false);
    }//GEN-LAST:event_buttonNewPlayerActionPerformed

    private void buttonTryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTryActionPerformed
        whereBall = (int)(Math.random()*3+1);
        number = 0;
        labelPlayerScore.setText(String.valueOf(point));
        labelStatus.setText("Let's Try It.");
        
        //1 ise button 1      //2 ise button 2  //3 button 3
        b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/kapali.png")));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/kapali.png")));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/kapali.png")));
    }//GEN-LAST:event_buttonTryActionPerformed
    public void Control() {
        if (number == 1) {
            point += 150;
            labelStatus.setText("Congratulations! You Found It First Time, You Earned 150 Points");
        } else if (number == 2) {
            point += 50;
            labelStatus.setText("Congratulations! You Found On The Second Time, You Earned 50 Points");
        } else if (number == 3) {
            point -= 100;
            labelStatus.setText("Sorry, You Got It Last Time. Lose 100 Points");
        }
        labelPlayerScore.setText(String.valueOf(point));
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
            java.util.logging.Logger.getLogger(GameArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton buttonNewPlayer;
    private javax.swing.JButton buttonPlay;
    private javax.swing.JButton buttonTry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelPlayerName;
    private javax.swing.JLabel labelPlayerScore;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JPanel panelGameArea;
    private javax.swing.JPanel panelPlayer;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
