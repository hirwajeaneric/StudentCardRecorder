
package View;

import Controller.CardDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Card;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author liliane
 */
public class Main extends javax.swing.JFrame {

    Card studentCard = new Card();
    CardDao cardDao = new CardDao();
    List<Card> listOfCards, searchResults;
    DefaultTableModel model;
    
    public Main() {
        initComponents();
        getCardList();
        displayInTable(listOfCards);
    }

    public void getCardList(){
        listOfCards = cardDao.CreateCardList();
    }
    
    public int takenCards(){
        int numberOfCardsTaken = 1;
        /*
        if(){
            
        }*/
        return numberOfCardsTaken;
    }
    
    private void displayInTable(List<Card> listOfCards){
        model = (DefaultTableModel) cardTable.getModel();
        model.setRowCount(0);
        
        for (Card myCards : listOfCards) {
            model.insertRow(model.getRowCount(), new Object[]{
                myCards.getCardId(),
                myCards.getName(),
                myCards.getFaculty(),
                myCards.getDepartment(),
                myCards.getRegNo(),
                myCards.getProgram(),
                takenCards()
            });
        }
    }

    private void clearFields(){
        nameTextField.setText(null);
        facultyComboBox.setSelectedIndex(0);
        departmentComboBox.setSelectedIndex(0);
        regNoTextField.setText(null);
        programTextField.setSelectedItem(0);
        searchTextField.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        programTextField = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        facultyComboBox = new javax.swing.JComboBox<>();
        departmentComboBox = new javax.swing.JComboBox<>();
        regNoTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        howOftenTakenTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUCA - Student Card Recorder");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        programTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "Evening" }));
        jPanel1.add(programTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 248, 139, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 123, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Faculty");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 155, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Department");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 181, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Reg.No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Program");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 252, -1, -1));
        jPanel1.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 121, 139, -1));

        facultyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Technology", "Education", "Business Administration", "Nursing", "Theology" }));
        facultyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(facultyComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 151, 139, -1));

        departmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Management", "Networking and Telecommunication", "Software Engineering" }));
        jPanel1.add(departmentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 177, 139, -1));
        jPanel1.add(regNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 218, 139, -1));

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        cardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CardId", "Name", "Faculty", "Department", "RegNo", "Program", "Number of Cards"
            }
        ));
        cardTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cardTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 121, 555, 206));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("ADVENNTIST UNIVERSITY OF CENTRAL AFRICA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STUDENT ID CARD RECORDER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 831, -1));

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 78, -1));

        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("How often");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 285, -1, -1));

        howOftenTakenTextField.setEditable(false);
        jPanel1.add(howOftenTakenTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 283, 139, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Search anything from the space bellow");

        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("REFRESH");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(refreshButton))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 333, 555, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (regNoTextField.getText().length()==5) {
            studentCard.setName(nameTextField.getText());
            studentCard.setFaculty(facultyComboBox.getSelectedItem().toString());
            studentCard.setDepartment(departmentComboBox.getSelectedItem().toString());
            int regNumber = Integer.parseInt(regNoTextField.getText());
            studentCard.setRegNo(regNumber);
            studentCard.setProgram(programTextField.getSelectedItem().toString());

            cardDao.save(studentCard);

            getCardList();
            displayInTable(listOfCards);
            clearFields();

            JOptionPane.showMessageDialog(null,"Card Data saved!","Success",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registration Number should be 5 digits long", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (regNoTextField.getText().length()==5) {
            studentCard.setName(nameTextField.getText());
            studentCard.setFaculty(facultyComboBox.getSelectedItem().toString());
            studentCard.setDepartment(departmentComboBox.getSelectedItem().toString());
            int regNumber = Integer.parseInt(regNoTextField.getText());
            studentCard.setRegNo(regNumber);
            studentCard.setProgram(programTextField.getSelectedItem().toString());

            cardDao.update(studentCard);

            getCardList();
            displayInTable(listOfCards);
            clearFields();

            JOptionPane.showMessageDialog(null,"Card Data Updated!","Success",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registration Number should be 5 digits long", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

//        int dialogResults = JOptionPane.showConfirmDialog(this, "Do you want to delete this card?", "Notice", JOptionPane.YES_NO_OPTION);
//        if(dialogResults == JOptionPane.YES_OPTION){
//            
//        }else {
//            
//        }
        studentCard.setName(nameTextField.getText());
            studentCard.setFaculty(facultyComboBox.getSelectedItem().toString());
            studentCard.setDepartment(departmentComboBox.getSelectedItem().toString());
            int regNumber = Integer.parseInt(regNoTextField.getText());
            studentCard.setRegNo(regNumber);
            studentCard.setProgram(programTextField.getSelectedItem().toString());


            cardDao.delete(studentCard);

            getCardList();
            displayInTable(listOfCards);
            clearFields();

            JOptionPane.showMessageDialog(null,"Card Data Deleted!","Success",JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void cardTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) cardTable.getModel();
        int row = cardTable.getSelectedRow(); //This gives us the number of the selected row.
        
        //Next, We take data from that specific row and put them in the input fields.
        nameTextField.setText(model.getValueAt(row, 1).toString());
        facultyComboBox.setSelectedItem(model.getValueAt(row, 2).toString());
        departmentComboBox.setSelectedItem(model.getValueAt(row, 3).toString());
        regNoTextField.setText(model.getValueAt(row, 4).toString());
        facultyComboBox.setSelectedItem(model.getValueAt(row, 5).toString());
        programTextField.setSelectedItem(model.getValueAt(row, 6).toString());
        //howOftenTakenTextField.setEditable(true);
        //howOftenTakenTextField.setText(model.getValueAt(row, 7).toString());
    }//GEN-LAST:event_cardTableMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        nameTextField.setText(null);
        facultyComboBox.setSelectedIndex(0);
        departmentComboBox.setSelectedIndex(WIDTH);
        regNoTextField.setText(null);
        facultyComboBox.setSelectedIndex(0);
        programTextField.setSelectedIndex(0);
        howOftenTakenTextField.setText(null);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void facultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyComboBoxActionPerformed
        if(facultyComboBox.getSelectedItem().equals("Information Technology")){
            departmentComboBox.removeAllItems();
            departmentComboBox.addItem("Information Management");
            departmentComboBox.addItem("Networks and Telecommunication Systems");
            departmentComboBox.addItem("Software Engineering");
        }else if(facultyComboBox.getSelectedItem().equals("Education")){
            departmentComboBox.removeAllItems();
            departmentComboBox.addItem("Education 1");
            departmentComboBox.addItem("Education 2");
            departmentComboBox.addItem("Education 3");
        }else if(facultyComboBox.getSelectedItem().equals("Business Administration")){
            departmentComboBox.removeAllItems();
            departmentComboBox.addItem("Management");
            departmentComboBox.addItem("Accounting");
            departmentComboBox.addItem("Finance");
        }else if(facultyComboBox.getSelectedItem().equals("Nursing")){
            departmentComboBox.removeAllItems();
            departmentComboBox.addItem("Children health care");
            departmentComboBox.addItem("Nursing 2");
            departmentComboBox.addItem("Nursing 3");
        }else if(facultyComboBox.getSelectedItem().equals("Theology")){
            departmentComboBox.removeAllItems();
            departmentComboBox.addItem("Philosophy");
            departmentComboBox.addItem("Theology and Philosophy");
            departmentComboBox.addItem("Pastorhood");
        }
    }//GEN-LAST:event_facultyComboBoxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if ("".equals(searchTextField.getText())) {
            JOptionPane.showMessageDialog(this, "No Registration number to search!","Error",JOptionPane.ERROR_MESSAGE);
        } else {
            String searchedItem = searchTextField.getText();
            /*
            if(searchedItem.getClass().getSimpleName().equals("Integer")){
                int searchedId = Integer.parseInt(searchedItem);
                searchResults = cardDao.searchIntegers(searchedId);
            }else if(searchedItem.getClass().getSimpleName().equals("String")){
                searchResults = cardDao.searchStrings(searchedItem);
            }*/
            
            Pattern p = Pattern.compile("([0-9])");
            Matcher m = p.matcher(searchedItem);
            
            if (m.find()) {
                int searchedId = Integer.parseInt(searchedItem);
                searchResults = cardDao.searchIntegers(searchedId);
            }else {
                searchResults = cardDao.searchStrings(searchedItem);
            }
            
            
            if (searchResults.isEmpty()) {
                displayInTable(searchResults);
                clearFields();
                JOptionPane.showMessageDialog(this, "Registration number not found!!","Result",JOptionPane.ERROR_MESSAGE);
            } else {
                displayInTable(searchResults);
                clearFields();
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        getCardList();
        displayInTable(listOfCards);
        clearFields();
    }//GEN-LAST:event_refreshButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cardTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> departmentComboBox;
    private javax.swing.JComboBox<String> facultyComboBox;
    private javax.swing.JTextField howOftenTakenTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox<String> programTextField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField regNoTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
