package javaapplication1;


//import .*;
import javaapplication1.existing;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import static javaapplication1.existing.id;


public class index extends javax.swing.JFrame {

   
    protected static String name,sex,str;
    protected static int id,rate;
    protected static double income,otherincome,deduction,taxableamount,incometax,grossincome;
   
    public index() {
        initComponents();
        tid.setFocusable(true);
        tname.setFocusable(true);
        tsex.setFocusable(true);
        tincome.setFocusable(true);
        tincomeo.setFocusable(true);
        tded.setFocusable(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ltaxcal = new javax.swing.JLabel();
        lid = new javax.swing.JLabel();
        lsex = new javax.swing.JLabel();
        lincomes = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        tname = new javax.swing.JTextField();
        tincome = new javax.swing.JTextField();
        bcal = new javax.swing.JButton();
        ltax = new javax.swing.JLabel();
        ttax = new javax.swing.JTextField();
        lincomeo = new javax.swing.JLabel();
        lded = new javax.swing.JLabel();
        tincomeo = new javax.swing.JTextField();
        tded = new javax.swing.JTextField();
        lgincome = new javax.swing.JLabel();
        ltamount = new javax.swing.JLabel();
        tgincome = new javax.swing.JTextField();
        ttamount = new javax.swing.JTextField();
        bclear = new javax.swing.JButton();
        lrate = new javax.swing.JLabel();
        trate = new javax.swing.JTextField();
        tsex = new javax.swing.JTextField();
        bexisting = new javax.swing.JButton();
        bdownload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(224, 38, 60));
        setForeground(java.awt.Color.red);

        ltaxcal.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 24)); // NOI18N
        ltaxcal.setText("INCOME TAX CALCULATOR");

        lid.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        lid.setText("USER ID");

        lsex.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        lsex.setText("SEX");

        lincomes.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        lincomes.setText("INCOME FROM SALARY");

        lname.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        lname.setText("NAME");

        tid.setFont(new java.awt.Font("Ubuntu Medium", 1, 15)); // NOI18N
        tid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tidFocusLost(evt);
            }
        });
        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });

        tname.setFont(new java.awt.Font("Ubuntu Medium", 1, 15)); // NOI18N
        tname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tnameFocusLost(evt);
            }
        });
        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });

        tincome.setFont(new java.awt.Font("Ubuntu Medium", 1, 15)); // NOI18N
        tincome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tincomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tincomeFocusLost(evt);
            }
        });
        tincome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tincomeActionPerformed(evt);
            }
        });

        bcal.setBackground(new java.awt.Color(142, 155, 154));
        bcal.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        bcal.setForeground(new java.awt.Color(51, 40, 218));
        bcal.setText("CALCULATE & SAVE");
        bcal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcalActionPerformed(evt);
            }
        });

        ltax.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        ltax.setText("INCOME TAX");

        ttax.setFont(new java.awt.Font("Ubuntu Medium", 1, 15)); // NOI18N

        lincomeo.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        lincomeo.setText("INCOME FROM OTHER SOURCES");

        lded.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        lded.setText("DEDUCTIONS");

        tincomeo.setFont(new java.awt.Font("Ubuntu Medium", 1, 15)); // NOI18N
        tincomeo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tincomeoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tincomeoFocusLost(evt);
            }
        });
        tincomeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tincomeoActionPerformed(evt);
            }
        });

        tded.setFont(new java.awt.Font("Ubuntu Medium", 1, 15)); // NOI18N
        tded.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tdedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tdedFocusLost(evt);
            }
        });

        lgincome.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        lgincome.setText("TOTAL GROSS INCOME");

        ltamount.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        ltamount.setText("TAXABLE AMOUNT");

        tgincome.setFont(new java.awt.Font("Ubuntu Medium", 1, 15)); // NOI18N
        tgincome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgincomeActionPerformed(evt);
            }
        });

        ttamount.setFont(new java.awt.Font("Ubuntu Medium", 1, 15)); // NOI18N
        ttamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttamountActionPerformed(evt);
            }
        });

        bclear.setBackground(new java.awt.Color(142, 155, 154));
        bclear.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        bclear.setForeground(new java.awt.Color(63, 25, 207));
        bclear.setText("CLEAR");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });

        lrate.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        lrate.setText("INCOME RATE");

        trate.setFont(new java.awt.Font("Ubuntu Medium", 1, 15)); // NOI18N
        trate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trateActionPerformed(evt);
            }
        });

        tsex.setFont(new java.awt.Font("Ubuntu Medium", 1, 15)); // NOI18N
        tsex.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tsexFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tsexFocusLost(evt);
            }
        });

        bexisting.setBackground(new java.awt.Color(142, 155, 154));
        bexisting.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        bexisting.setForeground(new java.awt.Color(101, 23, 201));
        bexisting.setText("EXISTING USER");
        bexisting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexistingActionPerformed(evt);
            }
        });

        bdownload.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        bdownload.setForeground(new java.awt.Color(51, 40, 218));
        bdownload.setText("DOWNLOAD");
        bdownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdownloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(ltaxcal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lid)
                            .addComponent(lname)
                            .addComponent(lsex)
                            .addComponent(lincomes)
                            .addComponent(ltax)
                            .addComponent(lincomeo)
                            .addComponent(lded)
                            .addComponent(lgincome)
                            .addComponent(ltamount)
                            .addComponent(lrate))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tname)
                            .addComponent(tincome)
                            .addComponent(ttax)
                            .addComponent(tincomeo)
                            .addComponent(tded)
                            .addComponent(tgincome)
                            .addComponent(ttamount, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(trate)
                            .addComponent(tsex)
                            .addComponent(tid)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(bclear)
                        .addGap(84, 84, 84)
                        .addComponent(bcal)
                        .addGap(82, 82, 82)
                        .addComponent(bexisting))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(bdownload, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ltaxcal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lsex)
                    .addComponent(tsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lincomes)
                    .addComponent(tincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lincomeo)
                    .addComponent(tincomeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lded)
                    .addComponent(tded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcal)
                    .addComponent(bclear)
                    .addComponent(bexisting, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lgincome)
                    .addComponent(tgincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lrate))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltamount))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(bdownload)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        name=tname.getText();
        
    }//GEN-LAST:event_tnameActionPerformed

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        
        id=Integer.valueOf(tid.getText());
       
    }//GEN-LAST:event_tidActionPerformed

    private void bcalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcalActionPerformed
        id=Integer.valueOf(tid.getText());
        
        income=Double.valueOf(tincome.getText());
         otherincome=Double.valueOf(tincomeo.getText());
        grossincome=income+otherincome;
        taxableamount=grossincome-Double.valueOf(tded.getText());
       str = String.valueOf(grossincome);
        Connection con = null;
        ResultSet rs=null;  
       Statement stmt=null;
        PreparedStatement stmt1=null;
        try{  
              Class.forName("com.mysql.jdbc.Driver");  
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/incometable","root","root");    
               stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
              

                  if(taxableamount<Double.valueOf(250000))
                  {
                        rs=stmt.executeQuery("select * from incomerecord");  
                        rs.absolute(1);  
                        rate=rs.getInt(2);
                         incometax=(taxableamount*rate)/100;
                        
                  }
                  else if(taxableamount<Double.valueOf(500000) && taxableamount>Double.valueOf(250000))
                  {
                        rs=stmt.executeQuery("select * from incomerecord");  
                        rs.absolute(2);  
                        rate=rs.getInt(2); 
                         incometax=((taxableamount-250000)*rate)/100;
                       
                  }
                  else if(taxableamount<Double.valueOf(1000000) && taxableamount>Double.valueOf(500000))
                  {
                        rs=stmt.executeQuery("select * from incomerecord");  
                        rs.absolute(3);  
                        rate=rs.getInt(2); 
                        incometax=((taxableamount-50000)*rate)/100+25000;
                     
                  }
                  else
                  {
                      rate=30;
                      incometax=((taxableamount-50000)*rate)/100+125000;
                  }
                  trate.setText(String.valueOf(rate));
                   tgincome.setText(str);
                    ttamount.setText(String.valueOf(taxableamount));
                  ttax.setText(String.valueOf(incometax));
                        tgincome.setEditable(false);
                 tincome.setEditable(false);
                 ttamount.setEditable(false);
                 ttax.setEditable(false);
                 trate.setEditable(false);
                   JOptionPane.showMessageDialog(null,"successfull!!");
                   
                    String Query="INSERT INTO userrecord(USER_ID,NAME,SEX,INCOME_FROM_SALARY,INCOME_FROM_OTHER_SOURCES,DEDUCTIONS,TOTAL_GROSS_INCOME,INCOME_RATE,TAXABLE_AMOUNT,INCOME_TAX) VALUES ('"+tid.getText()+"','"+tname.getText()+"','"+tsex.getText()+"','"+tincome.getText()+"','"+tincomeo.getText()+"','"+tded.getText()+"','"+tgincome.getText()+"','"+trate.getText()+"','"+ttamount.getText()+"','"+ttax.getText()+"')";
                    stmt.execute(Query);
                    JOptionPane.showMessageDialog(null,"data saved successfully!!");
                            
            
        

            }catch(Exception e)
            {
                System.out.println(e);
              
            } 
              finally
        {
            //STEP 5 : Closing The DB Resources
  
            //Closing the PreparedStatement object
             
            try
            {
                if(stmt!=null)
                {
                    stmt.close();
                    stmt=null;
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
  
            //Closing the Connection object
  
            try
            {
                if(con!=null)
                {
                    con.close();
                    con=null;
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
           
        }
        
        
    }//GEN-LAST:event_bcalActionPerformed

    private void tincomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tincomeActionPerformed
       
    }//GEN-LAST:event_tincomeActionPerformed

    private void tincomeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tincomeoActionPerformed
         
    }//GEN-LAST:event_tincomeoActionPerformed

    private void tgincomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgincomeActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tgincomeActionPerformed

    private void ttamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttamountActionPerformed
        
    }//GEN-LAST:event_ttamountActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
       tid.setText(null);
       tname.setText(null);
       tsex.setText(null);
       tincome.setText(null);
       tincomeo.setText(null);
       tded.setText(null);
       tgincome.setText(null);
       ttamount.setText(null);
       trate.setText(null);
       ttax.setText(null);
    }//GEN-LAST:event_bclearActionPerformed
//
   
    
    private void trateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trateActionPerformed

    private void bexistingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexistingActionPerformed
        new existing().setVisible(true);
          this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_bexistingActionPerformed

    private void tidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tidFocusGained

      tid.setForeground(Color.blue);
    }//GEN-LAST:event_tidFocusGained

    private void tidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tidFocusLost

      tid.setForeground(Color.black);
    }//GEN-LAST:event_tidFocusLost

    private void tnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tnameFocusGained
       tname.setForeground(Color.blue);// TODO add your handling code here:
    }//GEN-LAST:event_tnameFocusGained

    private void tnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tnameFocusLost
       tname.setForeground(Color.black); // TODO add your handling code here:
    }//GEN-LAST:event_tnameFocusLost

    private void tsexFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tsexFocusGained
       tsex.setForeground(Color.blue); // TODO add your handling code here:
    }//GEN-LAST:event_tsexFocusGained

    private void tsexFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tsexFocusLost
       tsex.setForeground(Color.black); // TODO add your handling code here:
    }//GEN-LAST:event_tsexFocusLost

    private void tincomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tincomeFocusGained
        tincome.setForeground(Color.blue);// TODO add your handling code here:
    }//GEN-LAST:event_tincomeFocusGained

    private void tincomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tincomeFocusLost
        tincome.setForeground(Color.black); // TODO add your handling code here:
    }//GEN-LAST:event_tincomeFocusLost

    private void tincomeoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tincomeoFocusGained
       tincomeo.setForeground(Color.blue); // TODO add your handling code here:
    }//GEN-LAST:event_tincomeoFocusGained

    private void tincomeoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tincomeoFocusLost
         tincomeo.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_tincomeoFocusLost

    private void tdedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tdedFocusGained
       tded.setForeground(Color.blue); // TODO add your handling code here:
    }//GEN-LAST:event_tdedFocusGained

    private void tdedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tdedFocusLost
      tded.setForeground(Color.black);  // TODO add your handling code here:
    }//GEN-LAST:event_tdedFocusLost

    private void bdownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdownloadActionPerformed
         id=Integer.valueOf(tid.getText());
         pdfGenerator pdf=new pdfGenerator();
        pdf.pdfgen(id);
     
    }//GEN-LAST:event_bdownloadActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcal;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdownload;
    private javax.swing.JButton bexisting;
    private javax.swing.JLabel lded;
    private javax.swing.JLabel lgincome;
    private javax.swing.JLabel lid;
    private javax.swing.JLabel lincomeo;
    private javax.swing.JLabel lincomes;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel lrate;
    private javax.swing.JLabel lsex;
    private javax.swing.JLabel ltamount;
    private javax.swing.JLabel ltax;
    private javax.swing.JLabel ltaxcal;
    private javax.swing.JTextField tded;
    private javax.swing.JTextField tgincome;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tincome;
    private javax.swing.JTextField tincomeo;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField trate;
    private javax.swing.JTextField tsex;
    private javax.swing.JTextField ttamount;
    private javax.swing.JTextField ttax;
    // End of variables declaration//GEN-END:variables
}
