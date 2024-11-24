
public class Calculator extends javax.swing.JFrame {

    private double result = 0;
    private double firstNum = 0; // Stores the first number
    private double secondNum = 0; // Stores the second number
    private String operation = ""; // Stores the current operation
    private boolean isNewInput = true; // Indicates if a new number is being entered
    private boolean isAllClear = true; // Tracks whether the button is C or AC
    private double currentSum = 0;
    
    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnResult = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnMinus = new javax.swing.JButton();
        jBtnSum = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnDivision = new javax.swing.JButton();
        jBtnMultiplication = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        jBtnNegativeNum = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        txtDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jBtnResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnResult.setText("=");
        jBtnResult.setAlignmentY(0.0F);
        jBtnResult.setBorder(null);
        jBtnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResultActionPerformed(evt);
            }
        });

        jBtnDot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnDot.setText(".");
        jBtnDot.setAlignmentY(0.0F);
        jBtnDot.setBorder(null);
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn0.setText("0");
        jBtn0.setAlignmentY(0.0F);
        jBtn0.setBorder(null);
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn7.setText("7");
        jBtn7.setAlignmentY(0.0F);
        jBtn7.setBorder(null);
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn8.setText("8");
        jBtn8.setAlignmentY(0.0F);
        jBtn8.setBorder(null);
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn9.setText("9");
        jBtn9.setAlignmentY(0.0F);
        jBtn9.setBorder(null);
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnMinus.setBackground(new java.awt.Color(255, 153, 0));
        jBtnMinus.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtnMinus.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMinus.setText("-");
        jBtnMinus.setAlignmentY(0.0F);
        jBtnMinus.setBorder(null);
        jBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinusActionPerformed(evt);
            }
        });

        jBtnSum.setBackground(new java.awt.Color(255, 153, 0));
        jBtnSum.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnSum.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSum.setText("+");
        jBtnSum.setAlignmentY(0.0F);
        jBtnSum.setBorder(null);
        jBtnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSumActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn6.setText("6");
        jBtn6.setAlignmentY(0.0F);
        jBtn6.setBorder(null);
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn5.setText("5");
        jBtn5.setAlignmentY(0.0F);
        jBtn5.setBorder(null);
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn4.setText("4");
        jBtn4.setAlignmentY(0.0F);
        jBtn4.setBorder(null);
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn1.setText("1");
        jBtn1.setAlignmentY(0.0F);
        jBtn1.setBorder(null);
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn2.setText("2");
        jBtn2.setAlignmentY(0.0F);
        jBtn2.setBorder(null);
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn3.setText("3");
        jBtn3.setAlignmentY(0.0F);
        jBtn3.setBorder(null);
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtnDivision.setBackground(new java.awt.Color(255, 153, 0));
        jBtnDivision.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnDivision.setForeground(new java.awt.Color(255, 255, 255));
        jBtnDivision.setText("÷");
        jBtnDivision.setAlignmentY(0.0F);
        jBtnDivision.setBorder(null);
        jBtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivisionActionPerformed(evt);
            }
        });

        jBtnMultiplication.setBackground(new java.awt.Color(255, 153, 0));
        jBtnMultiplication.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jBtnMultiplication.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMultiplication.setText("*");
        jBtnMultiplication.setAlignmentY(0.0F);
        jBtnMultiplication.setBorder(null);
        jBtnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMultiplicationActionPerformed(evt);
            }
        });

        btnPercent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPercent.setText("%");
        btnPercent.setAlignmentY(0.0F);
        btnPercent.setBorder(null);
        btnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentActionPerformed(evt);
            }
        });

        jBtnNegativeNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnNegativeNum.setText("+/-");
        jBtnNegativeNum.setAlignmentY(0.0F);
        jBtnNegativeNum.setBorder(null);
        jBtnNegativeNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNegativeNumActionPerformed(evt);
            }
        });

        jBtnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnClear.setText("AC");
        jBtnClear.setAlignmentY(0.0F);
        jBtnClear.setBorder(null);
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        txtDisplay.setBackground(new java.awt.Color(0, 0, 0));
        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDisplay.setForeground(new java.awt.Color(242, 242, 242));
        txtDisplay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtDisplay.setText("0");
        txtDisplay.setToolTipText("");
        txtDisplay.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnNegativeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnNegativeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appendNumber(String number) {
        String currentDisplay = txtDisplay.getText();

        if (isNewInput) {
            txtDisplay.setText(number.equals("0") ? "0" : number);
            isNewInput = false; // Reset new input flag
        } else {
            if (currentDisplay.equals("0") && !number.equals("0")) {
                txtDisplay.setText(number);
            } else if (!currentDisplay.equals("0")) {
                txtDisplay.setText(currentDisplay + number);
            }
        }

        isAllClear = false; // Set to "C" mode
        updateClearButtonLabel();
    }
    

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        appendNumber("1");
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        appendNumber("2");
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        appendNumber("3");
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        appendNumber("4");
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        appendNumber("5");
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        appendNumber("6");
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        appendNumber("7");
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        appendNumber("8");
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        appendNumber("9");
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        appendNumber("0");
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnNegativeNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNegativeNumActionPerformed
        double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        ops = ops * (-1);
        txtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnNegativeNumActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        String currentText = txtDisplay.getText();
        if (currentText.isEmpty() || currentText.equals(".")) {
            txtDisplay.setText("0.");
        } else if (!currentText.contains(".")) {
            txtDisplay.setText(currentText + ".");
        }
    }//GEN-LAST:event_jBtnDotActionPerformed

    private void updateClearButtonLabel() {
        jBtnClear.setText(isAllClear ? "AC" : "C");
    }


    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        if (isAllClear) {
            // AC: Reset everything
            firstNum = 0;
            operation = "";
            txtDisplay.setText("0"); // Reset to 0
            isAllClear = true; // Ensure the next press stays in AC mode
        } else {
            // C: Clear only the current display
            txtDisplay.setText("0");
            isAllClear = true; // Change back to AC mode after clearing current input
        }
        updateClearButtonLabel();
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSumActionPerformed
        firstNum = Double.parseDouble(txtDisplay.getText()); // Store the first number
        if (!operation.isEmpty()) {
            // Perform the current operation
            switch (operation) {
                case "+":
                    currentSum += firstNum;
                    break;
                case "-":
                    currentSum -= firstNum;
                    break;
                case "*":
                    currentSum *= firstNum;
                    break;
                case "/":
                    if (firstNum == 0) {
                        txtDisplay.setText("Error");
                        return;
                    }
                    currentSum /= firstNum;
                    break;
            }
        } else {
            currentSum = firstNum;
        }

        // Update display
        if (currentSum % 1 == 0) {
            txtDisplay.setText(String.format("%.0f", currentSum));
        } else {
            txtDisplay.setText(String.valueOf(currentSum));
        }

        operation = "+";
        isNewInput = true;
    }//GEN-LAST:event_jBtnSumActionPerformed

    private void jBtnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResultActionPerformed
         secondNum = Double.parseDouble(txtDisplay.getText()); 
         
        if (operation != null && !operation.isEmpty()) {
            switch (operation) {
                case "*":
                   currentSum *= secondNum;
                    break;
                case "/":
                    if (secondNum == 0) {
                        txtDisplay.setText("Error"); 
                        return;
                    }
                    currentSum /= secondNum;
                    break;
                case "+":
                     currentSum += secondNum;
                    break;
                case "-":
                     currentSum -= secondNum;
                    break;
                default:
                    return; 
            }

            if (currentSum % 1 == 0) { 
                txtDisplay.setText(String.format("%.0f", currentSum)); 
            } else {
                txtDisplay.setText(String.valueOf(currentSum));
            }

            // Manage persistent values
            if (result == 0) { 
                result = currentSum; 
            }

            firstNum = result; 
            operation = ""; 
            isNewInput = true; 
        }
    }//GEN-LAST:event_jBtnResultActionPerformed

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinusActionPerformed
        firstNum = Double.parseDouble(txtDisplay.getText()); // Store the first number
        if (!operation.isEmpty()) {
            switch (operation) {
                case "+":
                    currentSum += firstNum;
                    break;
                case "-":
                    currentSum -= firstNum;
                    break;
                case "*":
                    currentSum *= firstNum;
                    break;
                case "/":
                    if (firstNum == 0) {
                        txtDisplay.setText("Error");
                        return;
                    }
                    currentSum /= firstNum;
                    break;
            }
        } else {
            currentSum = firstNum;
        }

        // Update display
        if (currentSum % 1 == 0) {
            txtDisplay.setText(String.format("%.0f", currentSum));
        } else {
            txtDisplay.setText(String.valueOf(currentSum));
        }

        operation = "-";
        isNewInput = true;

    }//GEN-LAST:event_jBtnMinusActionPerformed

    private void jBtnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMultiplicationActionPerformed
        firstNum = Double.parseDouble(txtDisplay.getText()); // Store the first number
        if (!operation.isEmpty()) {
            switch (operation) {
                case "+":
                    currentSum += firstNum;
                    break;
                case "-":
                    currentSum -= firstNum;
                    break;
                case "*":
                    currentSum *= firstNum;
                    break;
                case "/":
                    if (firstNum == 0) {
                        txtDisplay.setText("Error");
                        return;
                    }
                    currentSum /= firstNum;
                    break;
            }
        } else {
            currentSum = firstNum;
        }

        // Update display
        if (currentSum % 1 == 0) {
            txtDisplay.setText(String.format("%.0f", currentSum));
        } else {
            txtDisplay.setText(String.valueOf(currentSum));
        }

        operation = "*";
        isNewInput = true;

    }//GEN-LAST:event_jBtnMultiplicationActionPerformed

    private void jBtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivisionActionPerformed
        firstNum = Double.parseDouble(txtDisplay.getText()); // Store the first number
        if (!operation.isEmpty()) {
            switch (operation) {
                case "+":
                    currentSum += firstNum;
                    break;
                case "-":
                    currentSum -= firstNum;
                    break;
                case "*":
                    currentSum *= firstNum;
                    break;
                case "/":
                    if (firstNum == 0) {
                        txtDisplay.setText("Error");
                        return;
                    }
                    currentSum /= firstNum;
                    break;
            }
        } else {
            currentSum = firstNum;
        }

        // Update display
        if (currentSum % 1 == 0) {
            txtDisplay.setText(String.format("%.0f", currentSum));
        } else {
            txtDisplay.setText(String.valueOf(currentSum));
        }

        operation = "/";
        isNewInput = true;
    }//GEN-LAST:event_jBtnDivisionActionPerformed

    private void btnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentActionPerformed
        try {
            double number = Double.parseDouble(txtDisplay.getText());
            number = number / 100;
            txtDisplay.setText(String.valueOf(number));
        } catch (NumberFormatException e) {
            txtDisplay.setText("Error");
        }
    }//GEN-LAST:event_btnPercentActionPerformed

    public static void main(String args[]) {
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtDisplay;
    // End of variables declaration//GEN-END:variables
}
