/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.berta.calculator;

/**
 *
 * @author berta
 */
public class Calculator extends javax.swing.JFrame {

//    double firstNum;
//    double secondNum;
//    double result;
//    String operation="";
    private double result = 0;
    private double firstNum = 0; // Stores the first number
    private double secondNum = 0; // Stores the second number
    private String operation = ""; // Stores the current operation
    private boolean isNewInput = true; // Indicates if a new number is being entered
    private boolean isAllClear = true; // Tracks whether the button is C or AC
//    private boolean isNewInput = true; // Tracks if the next input should reset the display

    /**
     * Creates new form Calculator
     */
    public Calculator() {

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

        jTxtDisplay = new javax.swing.JTextField();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnNegativeNum = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtnSum = new javax.swing.JButton();
        jBtnResult = new javax.swing.JButton();
        jBtnMinus = new javax.swing.JButton();
        jBtnMultiplication = new javax.swing.JButton();
        jBtnDivision = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTxtDisplay.setEditable(false);
        jTxtDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jTxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtDisplay.setText("0");
        jTxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDisplayActionPerformed(evt);
            }
        });

        jBtn1.setBackground(new java.awt.Color(64, 64, 64));
        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn1.setForeground(new java.awt.Color(172, 230, 0));
        jBtn1.setText("1");
        jBtn1.setAlignmentY(0.0F);
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setBackground(new java.awt.Color(64, 64, 64));
        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn2.setForeground(new java.awt.Color(172, 230, 0));
        jBtn2.setText("2");
        jBtn2.setAlignmentY(0.0F);
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setBackground(new java.awt.Color(64, 64, 64));
        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn3.setForeground(new java.awt.Color(172, 230, 0));
        jBtn3.setText("3");
        jBtn3.setAlignmentY(0.0F);
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn4.setBackground(new java.awt.Color(64, 64, 64));
        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn4.setForeground(new java.awt.Color(172, 230, 0));
        jBtn4.setText("4");
        jBtn4.setAlignmentY(0.0F);
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setBackground(new java.awt.Color(64, 64, 64));
        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn5.setForeground(new java.awt.Color(172, 230, 0));
        jBtn5.setText("5");
        jBtn5.setAlignmentY(0.0F);
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setBackground(new java.awt.Color(64, 64, 64));
        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn6.setForeground(new java.awt.Color(172, 230, 0));
        jBtn6.setText("6");
        jBtn6.setAlignmentY(0.0F);
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn7.setBackground(new java.awt.Color(64, 64, 64));
        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn7.setForeground(new java.awt.Color(172, 230, 0));
        jBtn7.setText("7");
        jBtn7.setAlignmentY(0.0F);
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setBackground(new java.awt.Color(64, 64, 64));
        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn8.setForeground(new java.awt.Color(172, 230, 0));
        jBtn8.setText("8");
        jBtn8.setAlignmentY(0.0F);
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setBackground(new java.awt.Color(64, 64, 64));
        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn9.setForeground(new java.awt.Color(172, 230, 0));
        jBtn9.setText("9");
        jBtn9.setAlignmentY(0.0F);
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtn0.setBackground(new java.awt.Color(64, 64, 64));
        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn0.setForeground(new java.awt.Color(172, 230, 0));
        jBtn0.setText("0");
        jBtn0.setAlignmentY(0.0F);
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnNegativeNum.setBackground(new java.awt.Color(64, 64, 64));
        jBtnNegativeNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnNegativeNum.setForeground(new java.awt.Color(0, 172, 230));
        jBtnNegativeNum.setText("+/-");
        jBtnNegativeNum.setAlignmentY(0.0F);
        jBtnNegativeNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNegativeNumActionPerformed(evt);
            }
        });

        jBtnDot.setBackground(new java.awt.Color(64, 64, 64));
        jBtnDot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnDot.setForeground(new java.awt.Color(0, 172, 230));
        jBtnDot.setText(".");
        jBtnDot.setAlignmentY(0.0F);
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });

        jBtnClear.setBackground(new java.awt.Color(64, 64, 64));
        jBtnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnClear.setForeground(new java.awt.Color(0, 172, 230));
        jBtnClear.setText("C");
        jBtnClear.setAlignmentY(0.0F);
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtnSum.setBackground(new java.awt.Color(64, 64, 64));
        jBtnSum.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnSum.setForeground(new java.awt.Color(255, 51, 51));
        jBtnSum.setText("+");
        jBtnSum.setAlignmentY(0.0F);
        jBtnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSumActionPerformed(evt);
            }
        });

        jBtnResult.setBackground(new java.awt.Color(64, 64, 64));
        jBtnResult.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jBtnResult.setForeground(new java.awt.Color(172, 230, 0));
        jBtnResult.setText("=");
        jBtnResult.setAlignmentY(0.0F);
        jBtnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResultActionPerformed(evt);
            }
        });

        jBtnMinus.setBackground(new java.awt.Color(64, 64, 64));
        jBtnMinus.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtnMinus.setForeground(new java.awt.Color(255, 51, 51));
        jBtnMinus.setText("-");
        jBtnMinus.setAlignmentY(0.0F);
        jBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinusActionPerformed(evt);
            }
        });

        jBtnMultiplication.setBackground(new java.awt.Color(64, 64, 64));
        jBtnMultiplication.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jBtnMultiplication.setForeground(new java.awt.Color(255, 51, 51));
        jBtnMultiplication.setText("*");
        jBtnMultiplication.setAlignmentY(0.0F);
        jBtnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMultiplicationActionPerformed(evt);
            }
        });

        jBtnDivision.setBackground(new java.awt.Color(64, 64, 64));
        jBtnDivision.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnDivision.setForeground(new java.awt.Color(255, 51, 51));
        jBtnDivision.setText("÷");
        jBtnDivision.setAlignmentY(0.0F);
        jBtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivisionActionPerformed(evt);
            }
        });

        btnPercent.setBackground(new java.awt.Color(64, 64, 64));
        btnPercent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPercent.setForeground(new java.awt.Color(0, 172, 230));
        btnPercent.setText("%");
        btnPercent.setAlignmentY(0.0F);
        btnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTxtDisplay)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnNegativeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnNegativeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDisplayActionPerformed

    private void appendNumber(String number) {
//        if (isNewInput) {
//            jTxtDisplay.setText(number); // Start fresh for new input
//            isNewInput = false;
//        } else {
//            jTxtDisplay.setText(jTxtDisplay.getText() + number); // Append to existing input
//        }
        String currentDisplay = jTxtDisplay.getText();

        if (isNewInput) {
            // Start fresh for new input after an operator
            if (number.equals("0")) {
                // If the new number is "0", keep the display as "0"
                jTxtDisplay.setText("0");
            } else {
                // Replace the display with the new number
                jTxtDisplay.setText(number);
            }
            isNewInput = false; // Reset new input flag
        } else {
            // Append the number to the existing input
            if (currentDisplay.equals("0") && !number.equals("0")) {
                // Replace "0" if the number is not "0"
                jTxtDisplay.setText(number);
            } else if (!currentDisplay.equals("0")) {
                // Otherwise, append the number
                jTxtDisplay.setText(currentDisplay + number);
            }
        }

        isAllClear = false; // Set to "C" mode
        updateClearButtonLabel();
    }

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed

        appendNumber("1");

//        String newNumber = jTxtDisplay.getText() + jBtn1.getText();
//        jTxtDisplay.setText(newNumber);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed

        appendNumber("2");
//        String newNumber = jTxtDisplay.getText() + jBtn2.getText();
//        jTxtDisplay.setText(newNumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        appendNumber("3");
//        String newNumber = jTxtDisplay.getText() + jBtn3.getText();
//        jTxtDisplay.setText(newNumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        appendNumber("4");
//        String newNumber = jTxtDisplay.getText() + jBtn4.getText();
//        jTxtDisplay.setText(newNumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        appendNumber("5");
//        String newNumber = jTxtDisplay.getText() + jBtn5.getText();
//        jTxtDisplay.setText(newNumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        appendNumber("6");
//        String newNumber = jTxtDisplay.getText() + jBtn6.getText();
//        jTxtDisplay.setText(newNumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        appendNumber("7");
//        String newNumber = jTxtDisplay.getText() + jBtn7.getText();
//        jTxtDisplay.setText(newNumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed

        appendNumber("8");
//        String newNumber = jTxtDisplay.getText() + jBtn8.getText();
//        jTxtDisplay.setText(newNumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        appendNumber("9");

//        String newNumber = jTxtDisplay.getText() + jBtn9.getText();
//        jTxtDisplay.setText(newNumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        appendNumber("0");
//        String newNumber = jTxtDisplay.getText() + jBtn0.getText();
//        jTxtDisplay.setText(newNumber);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnNegativeNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNegativeNumActionPerformed
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = ops * (-1);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnNegativeNumActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        String dotNew = jTxtDisplay.getText() + jBtnDot.getText();
        jTxtDisplay.setText(dotNew);
    }//GEN-LAST:event_jBtnDotActionPerformed

    private void updateClearButtonLabel() {
        jBtnClear.setText(isAllClear ? "AC" : "C");
    }


    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        if (isAllClear) {
            // AC: Reset everything
            firstNum = 0;
            operation = "";
            jTxtDisplay.setText("0"); // Reset to 0
            isAllClear = true; // Ensure the next press stays in AC mode
        } else {
            // C: Clear only the current display
            jTxtDisplay.setText("0");
            isAllClear = true; // Change back to AC mode after clearing current input
        }
        updateClearButtonLabel();
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSumActionPerformed
//        firstNum = Double.parseDouble(jTxtDisplay.getText());
////        jTxtDisplay.setText("");
//        operation = "+";

        firstNum = Double.parseDouble(jTxtDisplay.getText()); // Store the first number
        operation = "+"; // Set the operation
        isNewInput = true; // Prepare for new input
    }//GEN-LAST:event_jBtnSumActionPerformed

    private void jBtnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResultActionPerformed
        /*       
        String answer;
        secondNum = Double.parseDouble(jTxtDisplay.getText());

        if (null != operation)
        switch (operation) {
            case "*":
                result = firstNum * secondNum;
                answer = String.format("%.0f", result);
                jTxtDisplay.setText(answer);
//                operation="";
                break;
            case "/":
                if( secondNum ==0){ result = 0; }
                    else { result = firstNum / secondNum;
                           answer = String.format("%.0f", result);
                           jTxtDisplay.setText(answer);
                    }
//                operation="";
                break;
            case "+":
                result = firstNum + secondNum;
                answer = String.format("%.0f", result);
                jTxtDisplay.setText(answer);
//                operation="";
                break;
            case "-":
                result = firstNum - secondNum;
                answer = String.format("%.0f", result);
                jTxtDisplay.setText(answer);
//                operation="";
                break;
        }*/

        String answer;
        secondNum = Double.parseDouble(jTxtDisplay.getText());

        if (operation != null) {
            switch (operation) {
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    if (secondNum == 0) {
                        jTxtDisplay.setText("Error"); // Division by zero error
                        return;
                    } else {
                        result = firstNum / secondNum;
                    }
                    break;
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                default:
                    return; // Do nothing if no valid operation
            }

            // Format the result with precision to handle decimals
            if (result % 1 == 0) {
                // If result is a whole number, display without decimals
                answer = String.format("%.0f", result);
            } else {
                // If result is a decimal, display up to 10 decimal places
                answer = String.format("%.10f", result).replaceAll("0+$", "").replaceAll("\\.$", "");
            }

            jTxtDisplay.setText(answer);
            operation = null; // Reset operation for the next calculation
        }
    }//GEN-LAST:event_jBtnResultActionPerformed

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinusActionPerformed
        firstNum = Double.parseDouble(jTxtDisplay.getText());
//        jTxtDisplay.setText("");
        operation = "-";
        isNewInput = true;
    }//GEN-LAST:event_jBtnMinusActionPerformed

    private void jBtnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMultiplicationActionPerformed
        firstNum = Double.parseDouble(jTxtDisplay.getText());
//        jTxtDisplay.setText("");
        operation = "*";
        isNewInput = true;
    }//GEN-LAST:event_jBtnMultiplicationActionPerformed

    private void jBtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivisionActionPerformed
        firstNum = Double.parseDouble(jTxtDisplay.getText());
//        jTxtDisplay.setText("");
        operation = "/";
        isNewInput = true;
    }//GEN-LAST:event_jBtnDivisionActionPerformed

    private void btnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentActionPerformed
        try {
            double number = Double.parseDouble(jTxtDisplay.getText());
            number = number / 100;
            jTxtDisplay.setText(String.valueOf(number));
        } catch (NumberFormatException e) {
            jTxtDisplay.setText("Error");
        }
    }//GEN-LAST:event_btnPercentActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnDivision;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnMinus;
    private javax.swing.JButton jBtnMultiplication;
    private javax.swing.JButton jBtnNegativeNum;
    private javax.swing.JButton jBtnResult;
    private javax.swing.JButton jBtnSum;
    private javax.swing.JTextField jTxtDisplay;
    // End of variables declaration//GEN-END:variables
}
