/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunish;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Sunish
 */
public class Checkout extends javax.swing.JFrame {

    /**
     * Creates new form Checkout
     */
    Connection con;
    Statement stm;
    ResultSet rs;
    Color myGreen = new Color(51, 204, 0);
    int enterCardNoFlag = 0;
    String CardNo;
    int NumberOfCheckedBook = 0;
    int width;

    public Checkout(Object a[][], int index) {
        initComponents();
        setVisible(true);
        CardNoText.requestFocus();
        JRootPane rootPane = SwingUtilities.getRootPane(ConfirmButton);
        rootPane.setDefaultButton(ConfirmButton);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int Jframewidth = this.getSize().width;
        int Jframeheight = this.getSize().height;
        int x = (dim.width - Jframewidth) / 2;
        int y = (dim.height - Jframeheight) / 2;
        setLocation(x, y);
        setSize(Jframewidth, Jframeheight);
        /*for (int i = 0; i < a.length; i++) {
         System.out.print(a[i][0] + " ");
         System.out.print(a[i][1] + " ");
         System.out.print(a[i][2] + " ");
         System.out.print(a[i][3] + " ");
         System.out.print(a[i][4] + " ");
         System.out.println(a[i][5] + " ");
         }*/
        initializeTable(a, index);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomeButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        CardNoLabel = new javax.swing.JLabel();
        CardNoText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CheckOutConformTable = new javax.swing.JTable();
        ConfirmButton = new javax.swing.JButton();
        StatusLabel = new javax.swing.JLabel();
        HeadingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management Studio");
        setMinimumSize(new java.awt.Dimension(739, 485));
        setPreferredSize(new java.awt.Dimension(795, 552));

        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        RegisterButton.setText("New User");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        CardNoLabel.setText("Card No.:");

        CardNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardNoTextActionPerformed(evt);
            }
        });
        CardNoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CardNoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CardNoTextFocusLost(evt);
            }
        });

        CheckOutConformTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Author Name", "Branch ID", "No of Copies", "Availability","Checkbox"}

        ){
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            public boolean isCellEditable(int row, int column) {
                if (column < 6) {
                    return false;//This causes all cells to be not editable
                } else {
                    return true;
                }
            }
        });
        //SearchResultTable.getColumn("Select").setCellEditor(new DefaultCellEditor(BookSelectCheckBox));

        DefaultTableModel model = (DefaultTableModel) CheckOutConformTable.getModel();
        TableColumn includeColumn = CheckOutConformTable.getColumnModel().getColumn(6);
        // includeColumn.setCellEditor(new D)efaultCellEditor(new JCheckBox()));
    includeColumn.setCellEditor(CheckOutConformTable.getDefaultEditor(Boolean.class));
    includeColumn.setCellRenderer(CheckOutConformTable.getDefaultRenderer(Boolean.class));
    //columnModel.getColumn(6).setCellEditor(SearchResultTable.getDefaultEditor(Boolean.class)).setCellRenderer(SearchResultTable.getDefaultRenderer(Boolean.class));
    Object[] row = {"Name", "rowData[8]", "deleteIcon", "12","123","12312", Boolean.TRUE};
    model.addRow(row);
    jScrollPane1.setViewportView(CheckOutConformTable);

    ConfirmButton.setText("Confirm");
    ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ConfirmButtonActionPerformed(evt);
        }
    });

    StatusLabel.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
    StatusLabel.setForeground(new java.awt.Color(51, 204, 0));
    StatusLabel.setText("Confirm the Check Out.");

    HeadingLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
    HeadingLabel.setForeground(new java.awt.Color(51, 51, 255));
    HeadingLabel.setText("Check Out Books");

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(ConfirmButton))
                .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                    .addContainerGap()
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(HeadingLabel)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(RegisterButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(HomeButton))
                        .add(layout.createSequentialGroup()
                            .add(45, 45, 45)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(layout.createSequentialGroup()
                                    .add(CardNoLabel)
                                    .add(18, 18, 18)
                                    .add(CardNoText))
                                .add(jScrollPane1))))))
            .add(45, 45, 45))
        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
            .add(15, 15, 15)
            .add(StatusLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 710, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(14, Short.MAX_VALUE))
    );

    layout.linkSize(new java.awt.Component[] {ConfirmButton, HomeButton, RegisterButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

    layout.setVerticalGroup(
        layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(layout.createSequentialGroup()
            .add(20, 20, 20)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(HomeButton)
                .add(RegisterButton)
                .add(HeadingLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 30, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(CardNoLabel)
                .add(CardNoText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
            .add(22, 22, 22)
            .add(ConfirmButton)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(StatusLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CardNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardNoTextActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new NewUser();
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new Index();
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        // TODO add your handling code here:
        if (enterCardNoFlag == 0) {
            EnterButton();
        }
        int flagavailable = 1;
        int available =  1;
        NumberOfCheckedBook = 0;
        int flagCheckout = 0;
        if (enterCardNoFlag == 1) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
                stm = (Statement) con.createStatement();
                String sql = "select count(*) from book_loans where card_no = " + CardNo + " and Date_in is Null group by card_no;";
                for (int i = 0; i < CheckOutConformTable.getRowCount(); i++) {
                    boolean isChecked = (Boolean) CheckOutConformTable.getValueAt(i, 6);

                    if (isChecked) {
                        //get the values of the columns you need.
                        NumberOfCheckedBook++;
                    }

                }
                //System.out.println(sql);
                PreparedStatement stt = con.prepareStatement(sql);
                ResultSet rs = stt.executeQuery();
                int ididentifier = 0;
                while (rs.next()) {
                    ididentifier = rs.getInt(1);
                }
                //System.out.println(ididentifier);
                if (NumberOfCheckedBook > 3) {
                    StatusLabel.setText("The student cannot check out more than 3 books");
                    StatusLabel.setForeground(Color.red);
                    flagCheckout = 1;
                } else if (ididentifier == 3) {
                    StatusLabel.setText("The student already has 3 books checked out");
                    StatusLabel.setForeground(Color.red);
                    flagCheckout = 1;
                } else if (NumberOfCheckedBook + ididentifier > 3) {
                    StatusLabel.setText("<html>The student already has " + ididentifier + " books checked out. Now you are checking out " + NumberOfCheckedBook + " books. More than 3 check outs for one student is not possible</html>");
                    StatusLabel.setForeground(Color.red);
                    flagCheckout = 1;
                } else {
                    flagCheckout = 0;
                }
            } catch (Exception err) {
                err.printStackTrace();
            } finally {
                if (stm != null) {
                    try {
                        stm.close();
                    } catch (SQLException sqlex) {
                        // ignore -- as we can't do anything about it here           
                    }
                    stm = null;
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException sqlex) {
                        // ignore -- as we can't do anything about it here     
                    }
                    con = null;
                }
            }
            if (flagCheckout == 0) {
                for (int i = 0; i < CheckOutConformTable.getRowCount(); i++) {
                    boolean isChecked = (Boolean) CheckOutConformTable.getValueAt(i, 6);
                    if (isChecked) {
                        available = (int) CheckOutConformTable.getValueAt(i, 5);
                        if (available == 0) {
                            flagavailable = 0;
                            StatusLabel.setText("Your selected book are not available right now. Please select the books which are available ");
                            StatusLabel.setForeground(Color.red);
                        }
                    }
                }
                if (flagavailable == 1) {
                    StatusLabel.setText("Confirm the Check Out.");
                    StatusLabel.setForeground(myGreen);
                    try {
                        int count = 0;
                        for (int i = 0; i < CheckOutConformTable.getRowCount(); i++) {
                            boolean isChecked = (Boolean) CheckOutConformTable.getValueAt(i, 6);

                            if (isChecked) {
                                //get the values of the columns you need.
                                count++;
                            }

                        }
                        Object a[][];
                        a = new Object[count][6];
                        count = 0;
                        for (int i = 0; i < CheckOutConformTable.getRowCount(); i++) {
                            boolean isChecked = (Boolean) CheckOutConformTable.getValueAt(i, 6);

                            if (isChecked) {
                                a[count][0] = CheckOutConformTable.getValueAt(i, 0);
                                a[count][1] = CheckOutConformTable.getValueAt(i, 1);
                                a[count][2] = CheckOutConformTable.getValueAt(i, 2);
                                a[count][3] = CheckOutConformTable.getValueAt(i, 3);
                                a[count][4] = CheckOutConformTable.getValueAt(i, 4);
                                a[count][5] = CheckOutConformTable.getValueAt(i, 5);
                                count++;
                            }
                        }
                        if (a.length == 0) {
                            StatusLabel.setText("Please select books from the list.");
                            StatusLabel.setForeground(Color.red);
                        } else {
                            for (int i = 0; i < a.length; i++) {
                                int LastLoanId = 0;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
                                stm = (Statement) con.createStatement();
                                String sql1 = "SELECT Loan_id FROM Book_loans ORDER BY Loan_id DESC LIMIT 1;";
                                PreparedStatement stt = con.prepareStatement(sql1);
                                ResultSet rs = stt.executeQuery();
                                while (rs.next()) {
                                    LastLoanId = rs.getInt(1);
                                }
                                LastLoanId = LastLoanId + 1;
                                String sql2 = "INSERT INTO Book_Loans values(" + LastLoanId + ",'" + a[i][0] + "'," + a[i][3] + "," + CardNo + ",CURDATE(),DATE_ADD(CURDATE(),INTERVAL 14 DAY),null);";
                                System.out.println(sql2);
                                stt = con.prepareStatement(sql2);
                                stt.executeUpdate();
                            }
                            dispose();
                            new Index();
                            JOptionPane.showMessageDialog(null, "Your Checkout is successfull", "Information", 1);
                            StatusLabel.setText("Confirm the Check Out.");
                            StatusLabel.setForeground(myGreen);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            }
        } else {
            //StatusLabel.setText("Enter a card number");
            StatusLabel.setForeground(Color.red);
        }

    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void CardNoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CardNoTextFocusLost
        // TODO add your handling code here:
        EnterButton();
    }//GEN-LAST:event_CardNoTextFocusLost

    private void CardNoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CardNoTextFocusGained
        // TODO add your handling code here:
        enterCardNoFlag = 0;
    }//GEN-LAST:event_CardNoTextFocusGained
    private void EnterButton() {
        CardNo = CardNoText.getText();
        int flag = 0;
        if ("".equals(CardNo)) {
            flag = 1;
            StatusLabel.setText("Enter a card number");
            StatusLabel.setForeground(Color.red);

        } else {
            StatusLabel.setText("Confirm the Check Out.");
            StatusLabel.setForeground(myGreen);

            flag = 0;
        }
        for (int i = 0; i < CardNo.length(); i++) {
            //If we find a non-digit character we return false.
            if (!Character.isDigit(CardNo.charAt(i))) {
                StatusLabel.setText("Card Number should be Numeric");
                StatusLabel.setForeground(Color.red);
                flag = 1;

                break;
            } else {
                StatusLabel.setText("Confirm the Check Out.");
                StatusLabel.setForeground(myGreen);
                flag = 0;

            }
        }
        if (flag == 0) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
                stm = (Statement) con.createStatement();
                String sql = "select Card_no from Borrower where card_no = " + CardNo + ";";
                //System.out.print(sql);
                PreparedStatement stt = con.prepareStatement(sql);
                ResultSet rs = stt.executeQuery();
                int ididentifier = 0;
                while (rs.next()) {
                    ididentifier = rs.getInt(1);
                }
                if (ididentifier == 0) {
                    StatusLabel.setText("Card Number is invalid");
                    StatusLabel.setForeground(Color.red);
                    enterCardNoFlag = 0;
                } else {
                    String check = "select f.paid from Book_loans b Natural Join Fines f where card_no = " + CardNo + ";";
                    //System.out.print(sql);
                    PreparedStatement stt1 = con.prepareStatement(check);
                    ResultSet rs1 = stt1.executeQuery();
                    int i = 0;
                    while (rs1.next()) {
                        i++;
                    }
                    if (i > 0) {
                        enterCardNoFlag = 0;
                        dispose();
                        new Fines(CardNo);
                        JOptionPane.showMessageDialog(null, "The student must first clear all the fines before any further Check Out", "Information", 1);

                    } else {
                        StatusLabel.setText("Confirm the Check Out.");
                        StatusLabel.setForeground(myGreen);
                        enterCardNoFlag = 1;
                    }
                }
            } catch (Exception err) {
                err.printStackTrace();
            } finally {
                if (stm != null) {
                    try {
                        stm.close();
                    } catch (SQLException sqlex) {
                        // ignore -- as we can't do anything about it here           
                    }

                    stm = null;
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException sqlex) {
                        // ignore -- as we can't do anything about it here     
                    }
                    con = null;
                }
            }
        }
    }

    private void initializeTable(Object a[][], int index) {
        DefaultTableModel model = (DefaultTableModel) CheckOutConformTable.getModel();
        int rowCount = CheckOutConformTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        TableColumn includeColumn = CheckOutConformTable.getColumnModel().getColumn(6);
        includeColumn.setCellEditor(CheckOutConformTable.getDefaultEditor(Boolean.class));
        includeColumn.setCellRenderer(CheckOutConformTable.getDefaultRenderer(Boolean.class));
        for (int i = 0; i < a.length; i++) {
            if (index == 0) {
                Object[] row = {a[i][0], a[i][1], a[i][2], a[i][3], a[i][4], a[i][5], Boolean.TRUE};
                model.addRow(row);
            } else {
                Object[] row = {a[i][0], a[i][1], a[i][2], a[i][3], a[i][4], a[i][5], Boolean.FALSE};
                model.addRow(row);
            }
            //Object[] row = {a[i][0], a[i][1], a[i][2], a[i][3], a[i][4], a[i][5], Boolean.FALSE};  
        }
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
            java.util.logging.Logger.getLogger(Checkout.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Checkout().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CardNoLabel;
    private javax.swing.JTextField CardNoText;
    private javax.swing.JTable CheckOutConformTable;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel HeadingLabel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
