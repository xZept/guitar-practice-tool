package com.zept.practicetool.practicetool;

/**
 *
 * @author Allen James Laxamana
 */
public class PracticeTool extends javax.swing.JFrame {

    /**
     * Creates new form PracticeTool
     */
    public PracticeTool() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        pnlStart = new javax.swing.JPanel();
        pnlDifficulty = new javax.swing.JPanel();
        lblDifficulty = new javax.swing.JLabel();
        btnEasy = new javax.swing.JRadioButton();
        btnAverage = new javax.swing.JRadioButton();
        btnHard = new javax.swing.JRadioButton();
        pnlCustom = new javax.swing.JPanel();
        btnCustom = new javax.swing.JRadioButton();
        txtTime = new javax.swing.JTextField();
        txtNotes = new javax.swing.JTextField();
        lblNotes = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        lblHistory = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Practice Tool by Allen");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        tblHistory.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Notes", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHistory);

        pnlStart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnlDifficulty.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDifficulty.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        lblDifficulty.setText("Difficulty");

        buttonGroup1.add(btnEasy);
        btnEasy.setText("Easy");

        buttonGroup1.add(btnAverage);
        btnAverage.setText("Average");

        buttonGroup1.add(btnHard);
        btnHard.setText("Hard");

        pnlCustom.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(btnCustom);
        btnCustom.setText("Custom");

        txtTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNotes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblNotes.setText("No. of Notes");

        lblTime.setText("Time");

        javax.swing.GroupLayout pnlCustomLayout = new javax.swing.GroupLayout(pnlCustom);
        pnlCustom.setLayout(pnlCustomLayout);
        pnlCustomLayout.setHorizontalGroup(
            pnlCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCustomLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(pnlCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNotes)
                    .addComponent(txtNotes, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCustom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTime)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCustomLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblTime)))
                .addGap(10, 10, 10))
        );
        pnlCustomLayout.setVerticalGroup(
            pnlCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCustom)
                .addGap(2, 2, 2)
                .addComponent(lblTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDifficultyLayout = new javax.swing.GroupLayout(pnlDifficulty);
        pnlDifficulty.setLayout(pnlDifficultyLayout);
        pnlDifficultyLayout.setHorizontalGroup(
            pnlDifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDifficultyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHard, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCustom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDifficultyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDifficulty)
                .addGap(66, 66, 66))
        );
        pnlDifficultyLayout.setVerticalGroup(
            pnlDifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDifficultyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDifficulty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDifficultyLayout.createSequentialGroup()
                        .addComponent(btnEasy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAverage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHard)
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(pnlDifficultyLayout.createSequentialGroup()
                        .addComponent(pnlCustom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        btnStart.setBackground(new java.awt.Color(0, 0, 255));
        btnStart.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        btnStart.setText("START PRACTICE");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStartLayout = new javax.swing.GroupLayout(pnlStart);
        pnlStart.setLayout(pnlStartLayout);
        pnlStartLayout.setHorizontalGroup(
            pnlStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStartLayout.createSequentialGroup()
                .addGroup(pnlStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStartLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlStartLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnStart)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStartLayout.setVerticalGroup(
            pnlStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        lblHistory.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblHistory.setText("HISTORY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblHistory)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlStart, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHistory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        ControlHandler control = new ControlHandler(); // Pass the buttongGroup1's model as a parameter
        // Open the NoteGenerator frame if there is a chosen difficulty
        if (control.checkSelectedBtn(buttonGroup1.getSelection()) == true) {
            new NoteGenerator().setVisible(true);
        }
    }//GEN-LAST:event_btnStartActionPerformed

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
            java.util.logging.Logger.getLogger(PracticeTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PracticeTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PracticeTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PracticeTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PracticeTool().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton btnAverage;
    public static javax.swing.JRadioButton btnCustom;
    public static javax.swing.JRadioButton btnEasy;
    public static javax.swing.JRadioButton btnHard;
    private javax.swing.JButton btnStart;
    public javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDifficulty;
    private javax.swing.JLabel lblHistory;
    private javax.swing.JLabel lblNotes;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pnlCustom;
    private javax.swing.JPanel pnlDifficulty;
    private javax.swing.JPanel pnlStart;
    private javax.swing.JTable tblHistory;
    public static javax.swing.JTextField txtNotes;
    public static javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
