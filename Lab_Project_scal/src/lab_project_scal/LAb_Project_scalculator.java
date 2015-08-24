/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_project_scal;
import java.math.*;
import javax.swing.ButtonGroup;
/**
 *
 * @author Turjo
 */
public class LAb_Project_scalculator extends javax.swing.JFrame {
    
    private double total1=0.0;
    private double total2=0.0;
    private double b;
    private double out;
    private char operator;
    private boolean dotp;
    private boolean sh;
            
    
    private void getOperator(String btntxt)
    {
        operator =btntxt.charAt(0);
        total1=total1+ Double.parseDouble(display_txt.getText());
        display_txt.setText(" ");
    }
    
    
    /**
     * Creates new form LAb_Project_scalculator
     */
    public LAb_Project_scalculator() {
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

        buttonGroup4 = new javax.swing.ButtonGroup();
        display_txt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnsin = new javax.swing.JButton();
        btncos = new javax.swing.JButton();
        btntan = new javax.swing.JButton();
        btnplus = new javax.swing.JButton();
        btnminus = new javax.swing.JButton();
        btnmult = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnpowertwo = new javax.swing.JButton();
        btnpowerthree = new javax.swing.JButton();
        btnsroot = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnsh = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        btnone = new javax.swing.JButton();
        btntwo = new javax.swing.JButton();
        btnthree = new javax.swing.JButton();
        btnfour = new javax.swing.JButton();
        btnfive = new javax.swing.JButton();
        btnsix = new javax.swing.JButton();
        btnseven = new javax.swing.JButton();
        btneight = new javax.swing.JButton();
        btnnine = new javax.swing.JButton();
        btnzero = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_txtActionPerformed(evt);
            }
        });

        btnsin.setText("sin");
        btnsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinActionPerformed(evt);
            }
        });

        btncos.setText("cos");
        btncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncosActionPerformed(evt);
            }
        });

        btntan.setText("tan");
        btntan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntanActionPerformed(evt);
            }
        });

        btnplus.setText("+");
        btnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusActionPerformed(evt);
            }
        });

        btnminus.setText("-");
        btnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminusActionPerformed(evt);
            }
        });

        btnmult.setText("*");
        btnmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultActionPerformed(evt);
            }
        });

        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        btnpowertwo.setText("x²");
        btnpowertwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpowertwoActionPerformed(evt);
            }
        });

        btnpowerthree.setText("x³");
        btnpowerthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpowerthreeActionPerformed(evt);
            }
        });

        btnsroot.setText("√x");
        btnsroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsrootActionPerformed(evt);
            }
        });

        btnsh.setText("Shift");
        btnsh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnshMouseClicked(evt);
            }
        });
        btnsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addComponent(btnsh, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnsh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btncos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnmult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btntan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnpowertwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnpowerthree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsroot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsin)
                    .addComponent(btncos)
                    .addComponent(btntan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnminus)
                            .addComponent(btnpowertwo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnpowerthree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndiv)
                            .addComponent(btnsroot)))
                    .addComponent(btnplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnone.setText("1");
        btnone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoneActionPerformed(evt);
            }
        });

        btntwo.setText("2");
        btntwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntwoActionPerformed(evt);
            }
        });

        btnthree.setText("3");
        btnthree.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnthreeFocusGained(evt);
            }
        });
        btnthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthreeActionPerformed(evt);
            }
        });

        btnfour.setText("4");
        btnfour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfourActionPerformed(evt);
            }
        });

        btnfive.setText("5");
        btnfive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiveActionPerformed(evt);
            }
        });

        btnsix.setText("6");
        btnsix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsixActionPerformed(evt);
            }
        });

        btnseven.setText("7");
        btnseven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsevenActionPerformed(evt);
            }
        });

        btneight.setText("8");
        btneight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneightActionPerformed(evt);
            }
        });

        btnnine.setText("9");
        btnnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnineActionPerformed(evt);
            }
        });

        btnzero.setText("0");
        btnzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnzeroActionPerformed(evt);
            }
        });

        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });

        btnclear.setText("C");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnequal.setText("=");
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnzero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnseven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnfour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnone, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btneight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnnine, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(btndot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnfive, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(btntwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnthree, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(btnsix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnone)
                    .addComponent(btntwo)
                    .addComponent(btnthree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnfive, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnfour)
                        .addComponent(btnsix)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnseven)
                    .addComponent(btneight)
                    .addComponent(btnnine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnzero)
                    .addComponent(btndot)
                    .addComponent(btnclear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnequal))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(display_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoneActionPerformed
        // TODO add your handling code here:
        String btnoneText = display_txt.getText() + btnone.getText();
        display_txt.setText(btnoneText);
    }//GEN-LAST:event_btnoneActionPerformed

    private void btntwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntwoActionPerformed
        // TODO add your handling code here:
        String btntwoText = display_txt.getText() + btntwo.getText();
        display_txt.setText(btntwoText);
    }//GEN-LAST:event_btntwoActionPerformed

    private void btnthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthreeActionPerformed
        // TODO add your handling code here:
        String btnthreeText = display_txt.getText() + btnthree.getText();
        display_txt.setText(btnthreeText);
    }//GEN-LAST:event_btnthreeActionPerformed

    private void btnfourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfourActionPerformed
        // TODO add your handling code here:
        String btnfourText = display_txt.getText() + btnfour.getText();
        display_txt.setText(btnfourText);
    }//GEN-LAST:event_btnfourActionPerformed

    private void btnfiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiveActionPerformed
        // TODO add your handling code here:
        String btnfiveText = display_txt.getText() + btnfive.getText();
        display_txt.setText(btnfiveText);
    }//GEN-LAST:event_btnfiveActionPerformed

    private void btnsixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsixActionPerformed
        // TODO add your handling code here:
        String btnsixText = display_txt.getText() + btnsix.getText();
        display_txt.setText(btnsixText);
    }//GEN-LAST:event_btnsixActionPerformed

    private void btnsevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsevenActionPerformed
        // TODO add your handling code here:
        String btnsevenText = display_txt.getText() + btnseven.getText();
        display_txt.setText(btnsevenText);
    }//GEN-LAST:event_btnsevenActionPerformed

    private void btneightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneightActionPerformed
        // TODO add your handling code here:
        String btneightText = display_txt.getText() + btneight.getText();
        display_txt.setText(btneightText);
    }//GEN-LAST:event_btneightActionPerformed

    private void btnnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnineActionPerformed
        // TODO add your handling code here:
        String btnnineText = display_txt.getText() + btnnine.getText();
        display_txt.setText(btnnineText);
    }//GEN-LAST:event_btnnineActionPerformed

    private void btnzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnzeroActionPerformed
        // TODO add your handling code here:
        String btnzeroText = display_txt.getText() + btnzero.getText();
        display_txt.setText(btnzeroText);
    }//GEN-LAST:event_btnzeroActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        // TODO add your handling code here:
        if (!dotp)
        {
        display_txt.setText(display_txt.getText()+ btndot.getText());
        dotp=true;
        }
    }//GEN-LAST:event_btndotActionPerformed

    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalActionPerformed
        // TODO add your handling code here:
        switch(operator)
        {
            case'+':
                total2=total1 + Double.parseDouble(display_txt.getText());
                break;
            case'-':
                total2= total1 - Double.parseDouble(display_txt.getText());
                break;
            case'/':
                total2= total1 / Double.parseDouble(display_txt.getText());
                break;
            case'*':
                total2=total1 * Double.parseDouble(display_txt.getText());
                break;
        }
       
        display_txt.setText(Double.toString(total2));
        total1=0;
        
    }//GEN-LAST:event_btnequalActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        total2=0;
        display_txt.setText(" ");
        
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusActionPerformed
        // TODO add your handling code here:
        String btntxt=btnplus.getText();
        getOperator(btntxt);
        
        
    }//GEN-LAST:event_btnplusActionPerformed

    private void btnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminusActionPerformed
        // TODO add your handling code here:
        String btntxt=btnminus.getText();
        getOperator(btntxt);
    }//GEN-LAST:event_btnminusActionPerformed

    private void btnmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultActionPerformed
        // TODO add your handling code here:
        String btntxt=btnmult.getText();
        getOperator(btntxt);
        
    }//GEN-LAST:event_btnmultActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        // TODO add your handling code here:
        String btntxt=btndiv.getText();
        getOperator(btntxt);
        
    }//GEN-LAST:event_btndivActionPerformed

    private void btnsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsinActionPerformed
        // TODO add your handling code here:
        b=Double.parseDouble(String.valueOf(display_txt.getText()));
        
        if(!sh)
            {          
                out=Math.sin(b);
            }
            else
            { 
                out=Math.sinh(b);
            }
        display_txt.setText(String.valueOf(out));
              
        out=0;
       
            
            
   
    }//GEN-LAST:event_btnsinActionPerformed

    private void btnthreeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnthreeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnthreeFocusGained

    private void btnpowertwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpowertwoActionPerformed
        // TODO add your handling code here:
        b= Double.parseDouble(String.valueOf(display_txt.getText()));
        out=b*b;
        if (out >-100000000 && out < 100000000)
            display_txt.setText(String.valueOf(out));
    }//GEN-LAST:event_btnpowertwoActionPerformed

    private void btnpowerthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpowerthreeActionPerformed
        // TODO add your handling code here:
        b= Double.parseDouble(String.valueOf(display_txt.getText()));
        out=b*b*b;
        if (out >-100000000 && out < 100000000)
            display_txt.setText(String.valueOf(out));
    }//GEN-LAST:event_btnpowerthreeActionPerformed

    private void btnsrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsrootActionPerformed
        // TODO add your handling code here:
        b=Double.parseDouble(String.valueOf(display_txt.getText()));
        out=Math.sqrt(b);
        
        display_txt.setText(String.valueOf(out));
        
        out=0;
            
        
    }//GEN-LAST:event_btnsrootActionPerformed

    private void display_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_display_txtActionPerformed

    private void btncosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncosActionPerformed
        // TODO add your handling code here:
        b=Double.parseDouble(String.valueOf(display_txt.getText()));
        
        if(!sh)
        {
            out=Math.cos(b);
        }
            else
            { 
                out=Math.cosh(b);
            }
        display_txt.setText(String.valueOf(out));
        out=0;
       
    }//GEN-LAST:event_btncosActionPerformed

    private void btntanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntanActionPerformed
        // TODO add your handling code here:
        b=Double.parseDouble(String.valueOf(display_txt.getText()));
        
        if(!sh)
        {
            out=Math.tan(b);
        }
        else
         { 
            out=Math.tanh(b);
        }
        display_txt.setText(String.valueOf(out));
        
        out=0;
       
    }//GEN-LAST:event_btntanActionPerformed

    private void btnshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnshMouseClicked
        // TODO add your handling code here:
        if (!sh)
        {
            sh=true;
        }
        else
            sh=false;
    }//GEN-LAST:event_btnshMouseClicked

    private void btnshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAb_Project_scalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LAb_Project_scalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LAb_Project_scalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LAb_Project_scalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LAb_Project_scalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btncos;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btneight;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btnfive;
    private javax.swing.JButton btnfour;
    private javax.swing.JButton btnminus;
    private javax.swing.JButton btnmult;
    private javax.swing.JButton btnnine;
    private javax.swing.JButton btnone;
    private javax.swing.JButton btnplus;
    private javax.swing.JButton btnpowerthree;
    private javax.swing.JButton btnpowertwo;
    private javax.swing.JButton btnseven;
    private javax.swing.JToggleButton btnsh;
    private javax.swing.JButton btnsin;
    private javax.swing.JButton btnsix;
    private javax.swing.JButton btnsroot;
    private javax.swing.JButton btntan;
    private javax.swing.JButton btnthree;
    private javax.swing.JButton btntwo;
    private javax.swing.JButton btnzero;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField display_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

