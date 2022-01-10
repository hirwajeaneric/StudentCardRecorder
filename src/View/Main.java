
package View;

import Controller.CardDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Card;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author liliane
 */
public class Main extends javax.swing.JFrame {

    int cardId;
    int selectedRow;
    byte[] person_image;
    FileInputStream fileinputstream;
    String thePathOfTheImage;
    File theimage, selectedImage;    
    byte[] imagePhotoFileFromDatabase;    
    String imageFilePath = null;
    
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
                takenCards(),
                myCards.getImage()
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
        imageLabel.setIcon(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        resetButton1 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        browseImageButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        departmentComboBox = new javax.swing.JComboBox<>();
        regNoTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        howOftenTakenTextField = new javax.swing.JTextField();
        programTextField = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        facultyComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUCA - Student Card Recorder");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardTable.setBackground(new java.awt.Color(51, 51, 51));
        cardTable.setForeground(new java.awt.Color(255, 255, 255));
        cardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CardId", "Name", "Faculty", "Department", "RegNo", "Program", "Number of Cards", "Photo"
            }
        ));
        cardTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cardTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 890, 190));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("ADVENNTIST UNIVERSITY OF CENTRAL AFRICA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addGap(314, 314, 314)
                .addComponent(jLabel6)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 120));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Search anything from the space bellow");

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 0, 0));
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        refreshButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(0, 0, 0));
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 400, 110));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Commands", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        saveButton.setForeground(new java.awt.Color(0, 0, 0));
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        updateButton.setForeground(new java.awt.Color(0, 0, 0));
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        resetButton1.setBackground(new java.awt.Color(255, 255, 255));
        resetButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        resetButton1.setForeground(new java.awt.Color(0, 0, 0));
        resetButton1.setText("RESET");
        resetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButton1ActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(resetButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 400, 100));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Image", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        browseImageButton.setBackground(new java.awt.Color(255, 255, 255));
        browseImageButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        browseImageButton.setForeground(new java.awt.Color(0, 0, 0));
        browseImageButton.setText("BROWSE IMAGE");
        browseImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseImageButtonActionPerformed(evt);
            }
        });
        jPanel7.add(browseImageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageLabel.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 170));

        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 170));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 190, 240));

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Card Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        departmentComboBox.setBackground(new java.awt.Color(255, 255, 255));
        departmentComboBox.setForeground(new java.awt.Color(0, 0, 0));
        departmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Management", "Networking and Telecommunication", "Software Engineering" }));
        jPanel9.add(departmentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 139, -1));
        jPanel9.add(regNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 139, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("How often");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        howOftenTakenTextField.setEditable(false);
        howOftenTakenTextField.setBackground(new java.awt.Color(255, 255, 255));
        howOftenTakenTextField.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        howOftenTakenTextField.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.add(howOftenTakenTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 139, -1));

        programTextField.setBackground(new java.awt.Color(255, 255, 255));
        programTextField.setForeground(new java.awt.Color(0, 0, 0));
        programTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "Evening" }));
        jPanel9.add(programTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 139, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Faculty");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Department");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Reg.No");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Program");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        jPanel9.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 139, -1));

        facultyComboBox.setBackground(new java.awt.Color(255, 255, 255));
        facultyComboBox.setForeground(new java.awt.Color(0, 0, 0));
        facultyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Technology", "Education", "Business Administration", "Nursing", "Theology" }));
        facultyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyComboBoxActionPerformed(evt);
            }
        });
        jPanel9.add(facultyComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 139, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 280, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
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
            studentCard.setImage(person_image);
            
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
            studentCard.setCardId(cardId);
            studentCard.setName(nameTextField.getText());
            studentCard.setFaculty(facultyComboBox.getSelectedItem().toString());
            studentCard.setDepartment(departmentComboBox.getSelectedItem().toString());
            int regNumber = Integer.parseInt(regNoTextField.getText());
            studentCard.setRegNo(regNumber);
            studentCard.setProgram(programTextField.getSelectedItem().toString());
            person_image=imagePhotoFileFromDatabase;
            studentCard.setImage(person_image);
            
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

        studentCard.setCardId(cardId);
        studentCard.setName(nameTextField.getText());
        studentCard.setFaculty(facultyComboBox.getSelectedItem().toString());
        studentCard.setDepartment(departmentComboBox.getSelectedItem().toString());
        int regNumber = Integer.parseInt(regNoTextField.getText());
        studentCard.setRegNo(regNumber);
        studentCard.setProgram(programTextField.getSelectedItem().toString());
        person_image=imagePhotoFileFromDatabase;
        studentCard.setImage(person_image);

        cardDao.delete(studentCard);

        getCardList();
        displayInTable(listOfCards);
        clearFields();

        JOptionPane.showMessageDialog(null,"Card Data Deleted!","Success",JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void cardTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) cardTable.getModel();
        int row = cardTable.getSelectedRow();
        
        cardId = (int) model.getValueAt(row, 0);
        nameTextField.setText(model.getValueAt(row, 1).toString());
        facultyComboBox.setSelectedItem(model.getValueAt(row, 2).toString());
        departmentComboBox.setSelectedItem(model.getValueAt(row, 3).toString());
        regNoTextField.setText(model.getValueAt(row, 4).toString());
        programTextField.setSelectedItem(model.getValueAt(row, 5).toString());
        howOftenTakenTextField.setText(model.getValueAt(row, 6).toString());
        imageFilePath = model.getValueAt(row, 7).toString();
        imagePhotoFileFromDatabase = (byte[]) model.getValueAt(row, 7);
        
        displayImage(imagePhotoFileFromDatabase);
    }//GEN-LAST:event_cardTableMouseClicked

    private void browseImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseImageButtonActionPerformed
        JFileChooser imageChooser = new JFileChooser();
        imageChooser.showOpenDialog(null);
        selectedImage = imageChooser.getSelectedFile();
        thePathOfTheImage = selectedImage.getAbsolutePath();
        imageFilePath = thePathOfTheImage;
        theimage = new File(thePathOfTheImage);
       
        convertImageFileIntoByteArray(theimage);
        displaySelectedImage(thePathOfTheImage);
    }//GEN-LAST:event_browseImageButtonActionPerformed

    public byte[] convertImageFileIntoByteArray(File image) {
        try {
            fileinputstream = new FileInputStream(theimage);
            
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            
            byte[] buf = new byte[2048];
            for(int readNum; (readNum = fileinputstream.read(buf))!=-1;){
                byteArrayOutputStream.write(buf,0,readNum);
            }
            person_image = byteArrayOutputStream.toByteArray();
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return person_image;
    }
    
    public void displaySelectedImage(String thePathOfTheImage1){
        ImageIcon image = new ImageIcon(thePathOfTheImage1);
        Image im = image.getImage();
        Image myImg = im.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(myImg);
        imageLabel.setIcon(newImage);
    }
    
    public void displayImage(byte[] imagePhotoFileFromDatabase){
        ImageIcon image = new ImageIcon(imagePhotoFileFromDatabase);
        Image im = image.getImage();
        Image myImg = im.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(myImg);
        imageLabel.setIcon(newImage);
    }    
    private void facultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyComboBoxActionPerformed
        if(facultyComboBox.getSelectedItem().equals("Information Technology")){
            departmentComboBox.removeAllItems();
            departmentComboBox.addItem("Information Management");
            departmentComboBox.addItem("Networks and Telecommunication Systems");
            departmentComboBox.addItem("Software Engineering");
        }else if(facultyComboBox.getSelectedItem().equals("Education")){
            departmentComboBox.removeAllItems();
            departmentComboBox.addItem("Geography & History");
            departmentComboBox.addItem("English & literature");
            departmentComboBox.addItem("Accounting & IT");
        }else if(facultyComboBox.getSelectedItem().equals("Business Administration")){
            departmentComboBox.removeAllItems();
            departmentComboBox.addItem("Management");
            departmentComboBox.addItem("Accounting");
            departmentComboBox.addItem("Finance");
            departmentComboBox.addItem("Marketing");
        }else if(facultyComboBox.getSelectedItem().equals("Nursing")){
            departmentComboBox.removeAllItems();
            departmentComboBox.addItem("Nursing");
        }else if(facultyComboBox.getSelectedItem().equals("Theology")){
            departmentComboBox.removeAllItems();
            departmentComboBox.addItem("Theology");}
    }//GEN-LAST:event_facultyComboBoxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if ("".equals(searchTextField.getText())) {
            JOptionPane.showMessageDialog(this, "No Registration number to search!","Error",JOptionPane.ERROR_MESSAGE);
        } else {
            String searchedItem = searchTextField.getText();
            
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

    private void resetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButton1ActionPerformed
        clearFields();
    }//GEN-LAST:event_resetButton1ActionPerformed

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
    private javax.swing.JButton browseImageButton;
    private javax.swing.JTable cardTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> departmentComboBox;
    private javax.swing.JComboBox<String> facultyComboBox;
    private javax.swing.JTextField howOftenTakenTextField;
    private javax.swing.JLabel imageLabel;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox<String> programTextField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField regNoTextField;
    private javax.swing.JButton resetButton1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
