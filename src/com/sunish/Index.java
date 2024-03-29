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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Sunish
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    Connection con;
    Statement stm;
    ResultSet rs;
    Color myGreen = new Color(51, 204, 0);

    public Index() {
        initComponents();
        setVisible(true);
        BookIDText.requestFocus();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int Jframewidth = this.getSize().width;
        int Jframeheight = this.getSize().height;
        int x = (dim.width - Jframewidth) / 2;
        int y = (dim.height - Jframeheight) / 2;
        setLocation(x, y);
        setSize(Jframewidth, Jframeheight);
        JRootPane rootPane = SwingUtilities.getRootPane(SubmitButton);
        rootPane.setDefaultButton(SubmitButton);
        TablePanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeadingLabel = new javax.swing.JLabel();
        AuthorLabel = new javax.swing.JLabel();
        BookIDLabel = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        BookIDText = new javax.swing.JTextField();
        BookTitleText = new javax.swing.JTextField();
        AuthorNameText = new javax.swing.JTextField();
        DirectCheckOutButton = new javax.swing.JButton();
        CheckInButton = new javax.swing.JButton();
        NewUserButton = new javax.swing.JButton();
        StatusLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        TablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        //private static final long serialVersionUID = 1L;
        SearchResultTable = new javax.swing.JTable();
        CheckOutButton = new javax.swing.JButton();
        FineButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management Studio");

        HeadingLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        HeadingLabel.setForeground(new java.awt.Color(51, 51, 255));
        HeadingLabel.setText("Library Home");

        AuthorLabel.setText("Author:");

        BookIDLabel.setText("Book ID.:");

        TittleLabel.setText("Book Tittle:");

        DirectCheckOutButton.setText("Direct Check Out");
        DirectCheckOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectCheckOutButtonActionPerformed(evt);
            }
        });

        CheckInButton.setText("Check In");
        CheckInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInButtonActionPerformed(evt);
            }
        });

        NewUserButton.setText("New User");
        NewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserButtonActionPerformed(evt);
            }
        });

        StatusLabel.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        StatusLabel.setForeground(new java.awt.Color(51, 204, 0));
        StatusLabel.setText("Search for a new book and Check Out.");

        SubmitButton.setText("Search");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        JCheckBox BookSelectCheckBox = new javax.swing.JCheckBox();
        SearchResultTable.setModel(new javax.swing.table.DefaultTableModel(
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
        DefaultTableModel model = (DefaultTableModel) SearchResultTable.getModel();
        TableColumn includeColumn = SearchResultTable.getColumnModel().getColumn(6);
        // includeColumn.setCellEditor(new DefaultCellEditor(new JCheckBox()));
        includeColumn.setCellEditor(SearchResultTable.getDefaultEditor(Boolean.class));
        includeColumn.setCellRenderer(SearchResultTable.getDefaultRenderer(Boolean.class));
        //columnModel.getColumn(6).setCellEditor(SearchResultTable.getDefaultEditor(Boolean.class)).setCellRenderer(SearchResultTable.getDefaultRenderer(Boolean.class));
        jScrollPane2.setViewportView(SearchResultTable);

        CheckOutButton.setText("Check Out");
        CheckOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout TablePanelLayout = new org.jdesktop.layout.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(TablePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2)
                    .add(TablePanelLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(CheckOutButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 218, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .add(18, 18, 18)
                .add(CheckOutButton)
                .addContainerGap())
        );

        FineButton.setText("Fine Check");
        FineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FineButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(HeadingLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 25, Short.MAX_VALUE)
                        .add(FineButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(2, 2, 2)
                        .add(NewUserButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(2, 2, 2)
                        .add(CheckInButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(2, 2, 2)
                        .add(DirectCheckOutButton))
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(BookIDLabel)
                            .add(TittleLabel)
                            .add(AuthorLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(AuthorNameText)
                            .add(BookTitleText)
                            .add(BookIDText)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, TablePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(SubmitButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 218, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(StatusLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 731, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .add(45, 45, 45))
        );

        layout.linkSize(new java.awt.Component[] {CheckInButton, DirectCheckOutButton, FineButton, NewUserButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(DirectCheckOutButton)
                        .add(CheckInButton)
                        .add(NewUserButton)
                        .add(FineButton))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, HeadingLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 30, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(BookIDLabel)
                    .add(BookIDText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(TittleLabel)
                    .add(BookTitleText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(AuthorLabel)
                    .add(AuthorNameText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(SubmitButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(TablePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 28, Short.MAX_VALUE)
                .add(StatusLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutButtonActionPerformed
        // TODO add your handling code here:
        int count = 0;
        int index = 0;
        for (int i = 0; i < SearchResultTable.getRowCount(); i++) {
            boolean isChecked = (Boolean) SearchResultTable.getValueAt(i, 6);

            if (isChecked) {
                //get the values of the columns you need.
                count++;
            }

        }
        Object a[][];
        a = new Object[count][6];
        count = 0;
        for (int i = 0; i < SearchResultTable.getRowCount(); i++) {
            boolean isChecked = (Boolean) SearchResultTable.getValueAt(i, 6);

            if (isChecked) {
                a[count][0] = SearchResultTable.getValueAt(i, 0);
                a[count][1] = SearchResultTable.getValueAt(i, 1);
                a[count][2] = SearchResultTable.getValueAt(i, 2);
                a[count][3] = SearchResultTable.getValueAt(i, 3);
                a[count][4] = SearchResultTable.getValueAt(i, 4);
                a[count][5] = SearchResultTable.getValueAt(i, 5);
                count++;
            }

        }

        if (a.length == 0) {
            StatusLabel.setText("Please select books from the list.");
            StatusLabel.setForeground(Color.red);
        } else {
            dispose();
            StatusLabel.setText("Search for a new book and Check Out.");
            StatusLabel.setForeground(myGreen);
            new Checkout(a, index);
        }

    }//GEN-LAST:event_CheckOutButtonActionPerformed

    private void NewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUserButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new NewUser();
    }//GEN-LAST:event_NewUserButtonActionPerformed

    private void CheckInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new CheckIn();
    }//GEN-LAST:event_CheckInButtonActionPerformed

    private void DirectCheckOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectCheckOutButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new DirectCheckOut();
    }//GEN-LAST:event_DirectCheckOutButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        TablePanel.setVisible(true);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            stm = (Statement) con.createStatement();
            String BookId = BookIDText.getText().toString().trim();
            String BookTitle = BookTitleText.getText().toString().trim();
            String Author = AuthorNameText.getText().toString().trim();
            int flag = 0;
            int flag1 = 0;
            //String sql = "(select b.book_id, b.title, ba.author_name, bc.branch_id, bc.no_of_copies, bc.No_of_copies as no_of_available_copies, date_in from (book as b NATURAL JOIN book_authors as ba NATURAL JOIN book_copies as bc) Left Join book_loans as bl on b.book_id = bl.book_id and bc.branch_id = bl.branch_id where b.book_id = '0805057579' and (loan_id IS NULL OR (loan_id IS NOT NULL and date_in is not null)) group by b.book_id, bc.branch_id) UNION (select b.book_id, b.title, ba.author_name, bc.branch_id, bc.no_of_copies,bc.no_of_copies - count(*) as no_of_available_copies, date_in from (book as b NATURAL JOIN book_authors as ba NATURAL JOIN book_copies as bc) Left Join book_loans as bl on b.book_id = bl.book_id and bc.branch_id = bl.branch_id where b.book_id = '0805057579' and loan_id IS NOT NULL and date_in is null group by b.book_id, bc.branch_id) order by branch_id;";
            String sql = "(select b.book_id, b.title, ba.author_name, bc.branch_id, bc.no_of_copies, bc.No_of_copies as no_of_available_copies, date_in from "
                    + "(book as b NATURAL JOIN book_authors as ba NATURAL JOIN book_copies as bc) "
                    + "Left Join book_loans as bl on b.book_id = bl.book_id and bc.branch_id = bl.branch_id where ";
            if (BookTitle.length() > 0) {
                sql = sql + "(b.title like '% " + BookTitle + " %' or b.title like '" + BookTitle + " %' or b.title like '% " + BookTitle + "') ";
                flag = 1;
            }
            if (BookId.length() > 0) {
                if (flag == 1) {
                    sql = sql + "and";
                }
                sql = sql + " b.book_id ='" + BookId + "' ";
                flag = 1;
            }
            if (Author.length() > 0) {
                if (flag == 1) {
                    sql = sql + "and";
                }
                sql = sql + "(ba.author_name like '% " + Author + " %' or ba.author_name like '" + Author + " %' or ba.author_name like '% " + Author + "')";
                flag = 1;
            }
            if (flag != 0) {
                sql = sql + " and (loan_id IS NULL OR (loan_id IS NOT NULL and date_in is not null)) group by b.book_id, bc.branch_id) UNION (select b.book_id, b.title, ba.author_name, bc.branch_id, bc.no_of_copies,bc.no_of_copies - count(*) as no_of_available_copies, date_in from (book as b NATURAL JOIN book_authors as ba NATURAL JOIN book_copies as bc) Left Join book_loans as bl on b.book_id = bl.book_id and bc.branch_id = bl.branch_id where ";
                if (BookTitle.length() > 0) {
                    sql = sql + "(b.title like '% " + BookTitle + " %' or b.title like '" + BookTitle + " %' or b.title like '% " + BookTitle + "') ";
                    flag1 = 1;
                }
                if (BookId.length() > 0) {
                    if (flag1 == 1) {
                        sql = sql + "and";
                    }
                    sql = sql + " b.book_id ='" + BookId + "' ";
                    flag1 = 1;
                }
                if (Author.length() > 0) {
                    if (flag1 == 1) {
                        sql = sql + "and";
                    }
                    sql = sql + "(ba.author_name like '% " + Author + " %' or ba.author_name like '" + Author + " %' or ba.author_name like '% " + Author + "')";
                    flag1 = 1;
                }
                if (flag1 != 0) {
                    sql = sql + "and loan_id IS NOT NULL and date_in is null group by b.book_id, bc.branch_id) order by branch_id;";
                }
            }
            if ((flag == 0)) {
                sql = sql + "1=1)";
            }
            sql = sql + ";";
            System.out.println(sql);
            PreparedStatement stt = con.prepareStatement(sql);
            ResultSet rs = stt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) SearchResultTable.getModel();
            int rowCount = SearchResultTable.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            TableColumn includeColumn = SearchResultTable.getColumnModel().getColumn(6);
            includeColumn.setCellEditor(SearchResultTable.getDefaultEditor(Boolean.class));
            includeColumn.setCellRenderer(SearchResultTable.getDefaultRenderer(Boolean.class));
            while (rs.next()) {
                Object[] row = {rs.getObject(1), rs.getObject(2), rs.getObject(3), rs.getObject(4), rs.getObject(5), rs.getObject(6), Boolean.FALSE};
                model.addRow(row);

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
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void FineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FineButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new Fines("0");
    }//GEN-LAST:event_FineButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JTextField AuthorNameText;
    private javax.swing.JLabel BookIDLabel;
    private javax.swing.JTextField BookIDText;
    private javax.swing.JTextField BookTitleText;
    private javax.swing.JButton CheckInButton;
    private javax.swing.JButton CheckOutButton;
    private javax.swing.JButton DirectCheckOutButton;
    private javax.swing.JButton FineButton;
    private javax.swing.JLabel HeadingLabel;
    private javax.swing.JButton NewUserButton;
    private javax.swing.JTable SearchResultTable;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
