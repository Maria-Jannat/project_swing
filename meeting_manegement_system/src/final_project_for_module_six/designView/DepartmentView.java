package final_project_for_module_six.designView;

import final_project_for_module_six.connection.DatabaseConnection;
import final_project_for_module_six.utils.DashboardMenu;
import final_project_for_module_six.pojo.Department;
import final_project_for_module_six.service.CommonService;
import final_project_for_module_six.serviceImplementation.DepartmentServiceImplementation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author user
 */
public class DepartmentView extends javax.swing.JFrame {

    /**
     * Creates new form Design
     */
    public DepartmentView() {
        initComponents();
        displayDataIntoTable();
        setJMenuBar(DashboardMenu.displayMenu(this));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    CommonService commonService = new DepartmentServiceImplementation();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        btnClearForm = new javax.swing.JButton();
        btnClearTable = new javax.swing.JButton();
        btnDeleteData = new javax.swing.JButton();
        btnEditData = new javax.swing.JButton();
        btnShowDataFromFile = new javax.swing.JButton();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbDepartment = new javax.swing.JComboBox<>();
        btnAddDepartment = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDescription = new javax.swing.JTextArea();
        txtDepartmentId = new javax.swing.JTextField();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 6, true));

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51)));
        kGradientPanel1.setkEndColor(new java.awt.Color(102, 0, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 51));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("<html> <b>MJ's</b> Meeting Management System & Technology");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Simultaneously we set colossal difference");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 1252, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51)));
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 0, 51));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 51));

        btnClearForm.setBackground(new java.awt.Color(102, 0, 51));
        btnClearForm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClearForm.setForeground(new java.awt.Color(255, 255, 255));
        btnClearForm.setText("Clear Data From Registration Form");
        btnClearForm.setPreferredSize(new java.awt.Dimension(230, 35));
        btnClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFormActionPerformed(evt);
            }
        });

        btnClearTable.setBackground(new java.awt.Color(102, 0, 51));
        btnClearTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClearTable.setForeground(new java.awt.Color(255, 255, 255));
        btnClearTable.setText("Clear Data From Table");
        btnClearTable.setPreferredSize(new java.awt.Dimension(230, 35));
        btnClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableActionPerformed(evt);
            }
        });

        btnDeleteData.setBackground(new java.awt.Color(102, 0, 51));
        btnDeleteData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeleteData.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteData.setText("Delete Data");
        btnDeleteData.setPreferredSize(new java.awt.Dimension(230, 35));
        btnDeleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDataActionPerformed(evt);
            }
        });

        btnEditData.setBackground(new java.awt.Color(102, 0, 51));
        btnEditData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditData.setForeground(new java.awt.Color(255, 255, 255));
        btnEditData.setText("Update Data");
        btnEditData.setPreferredSize(new java.awt.Dimension(230, 35));
        btnEditData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDataActionPerformed(evt);
            }
        });

        btnShowDataFromFile.setBackground(new java.awt.Color(102, 0, 51));
        btnShowDataFromFile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnShowDataFromFile.setForeground(new java.awt.Color(255, 255, 255));
        btnShowDataFromFile.setText("Show Data From Database");
        btnShowDataFromFile.setPreferredSize(new java.awt.Dimension(230, 35));
        btnShowDataFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDataFromFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditData, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShowDataFromFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearTable, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowDataFromFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClearTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        kGradientPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51)));
        kGradientPanel3.setkEndColor(new java.awt.Color(102, 0, 51));
        kGradientPanel3.setkStartColor(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Department:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Department Id");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Department Name");

        cmbDepartment.setEditable(true);
        cmbDepartment.setForeground(new java.awt.Color(51, 51, 51));
        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select:", "Accounts ", "Analysis", "Customer Care", "Emergency Response Team", "Finance", "Human Resource Management", "Information Technology (IT)", "Marketing ", "Production", "Purchasing", "Research and Development (R&D)" }));
        cmbDepartment.setPreferredSize(new java.awt.Dimension(250, 25));

        btnAddDepartment.setBackground(new java.awt.Color(102, 0, 51));
        btnAddDepartment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddDepartment.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDepartment.setText("Add Department");
        btnAddDepartment.setPreferredSize(new java.awt.Dimension(300, 35));
        btnAddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDepartmentActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Remark");

        txtAreaDescription.setColumns(20);
        txtAreaDescription.setRows(5);
        txtAreaDescription.setPreferredSize(new java.awt.Dimension(250, 25));
        jScrollPane2.setViewportView(txtAreaDescription);

        txtDepartmentId.setEditable(false);
        txtDepartmentId.setPreferredSize(new java.awt.Dimension(250, 25));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(30, 30, 30)
                                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cmbDepartment, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDepartmentId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51), new java.awt.Color(102, 0, 51)));
        kGradientPanel4.setkEndColor(new java.awt.Color(102, 0, 51));
        kGradientPanel4.setkStartColor(new java.awt.Color(0, 0, 51));

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department Id", "Department Name", "Remark"
            }
        ));
        tblDisplay.setSelectionBackground(new java.awt.Color(102, 0, 51));
        tblDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisplay);

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1295, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clear() {
        txtDepartmentId.setText(null);
        cmbDepartment.setSelectedIndex(0);
        txtAreaDescription.setText(null);
    }

    public void displayDataIntoTable() {
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        List<Department> list = commonService.getList();
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getDepartmentId();
            row[1] = list.get(i).getDepartmentName();
            row[2] = list.get(i).getRemark();
            model.addRow(row);
        }
    }

    private void btnAddDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDepartmentActionPerformed
        String departmentName = cmbDepartment.getSelectedItem().toString();
        String remark = txtAreaDescription.getText().trim();

        //////////// validation started/////////////
        if (departmentName.equalsIgnoreCase("Please Select:")) {
            JOptionPane.showMessageDialog(rootPane, "Select the Department");
        } else if (remark.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "You must put a remark");
        } else if (remark.length() < 11) {
            JOptionPane.showMessageDialog(rootPane, "Enter at Least 10 Characters in Remark");
        } else {
            Department department = new Department(departmentName, remark);
            commonService.save(department);
            displayDataIntoTable();
            clear();
            JOptionPane.showMessageDialog(rootPane, "Data Successfully Added into Table");
        }
    }//GEN-LAST:event_btnAddDepartmentActionPerformed

    private void btnShowDataFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDataFromFileActionPerformed
//        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
//        Utils.readDataFromFile("Project", model);

        try {
            Connection conn = DatabaseConnection.getInstance();
            PreparedStatement ps = conn.prepareStatement("select * from department");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Object o[] = {rs.getInt("department_id"), rs.getString("department_name"), rs.getString("remark")};
                model.addRow(o);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_btnShowDataFromFileActionPerformed

    private void btnClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnClearTableActionPerformed

    private void tblDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayMouseClicked

        TableModel model = tblDisplay.getModel();
        int i = tblDisplay.getSelectedRow();
        txtDepartmentId.setText(String.valueOf(model.getValueAt(i, 0)));
        cmbDepartment.setSelectedItem(model.getValueAt(i, 1));
        txtAreaDescription.setText(String.valueOf(model.getValueAt(i, 2)));

    }//GEN-LAST:event_tblDisplayMouseClicked

    private void btnClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFormActionPerformed
        clear();
    }//GEN-LAST:event_btnClearFormActionPerformed

    private void btnEditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDataActionPerformed
        Department department = new Department(Integer.parseInt(txtDepartmentId.getText().trim()), cmbDepartment.getSelectedItem().toString(), txtAreaDescription.getText().trim());
        commonService.update(department);
        displayDataIntoTable();
        clear();
        JOptionPane.showMessageDialog(rootPane, "Data Successfully Updated Into Table");
    }//GEN-LAST:event_btnEditDataActionPerformed

    private void btnDeleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDataActionPerformed

        int i = JOptionPane.showConfirmDialog(null, "Are you Sure?");
        if (i == 0) {
            commonService.delete(Integer.parseInt(txtDepartmentId.getText().trim()));
            displayDataIntoTable();
            clear();
            JOptionPane.showMessageDialog(rootPane, "Succeessfully Deleted");
        }
    }//GEN-LAST:event_btnDeleteDataActionPerformed

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
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartmentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDepartment;
    private javax.swing.JButton btnClearForm;
    private javax.swing.JButton btnClearTable;
    private javax.swing.JButton btnDeleteData;
    private javax.swing.JButton btnEditData;
    private javax.swing.JButton btnShowDataFromFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextArea txtAreaDescription;
    private javax.swing.JTextField txtDepartmentId;
    // End of variables declaration//GEN-END:variables
}
