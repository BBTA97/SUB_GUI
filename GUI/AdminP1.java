package GUI;

import Class.DataManager;
import Class.Movie;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdminP1 extends javax.swing.JPanel {
    private int selectedIndex = -1;
    private String selectedImagePath = "";

    public AdminP1() {
    initComponents();
    DataManager.loadAll();
    loadMovieList();
    }             

    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Label_name = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Label_date = new javax.swing.JLabel();
        Label_time = new javax.swing.JLabel();
        Label_Image = new javax.swing.JLabel();
        ChooseImageButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        startDateField = new javax.swing.JTextField();
        startDateField.setText("Input Start Date (dd/MM/yy)");

        endDateField = new javax.swing.JTextField();
        endDateField.setText("Input End Date (dd/MM/yy)");
        PanelMain = new javax.swing.JPanel();
        ImgMovie1 = new javax.swing.JButton();
        ImgMovie2 = new javax.swing.JButton();
        ImgMovie4 = new javax.swing.JButton();
        ImgMovie3 = new javax.swing.JButton();
        ImgMovie5 = new javax.swing.JButton();
        ImgMovie7 = new javax.swing.JButton();
        ImgMovie6 = new javax.swing.JButton();
        ImgMovie8 = new javax.swing.JButton();
        PanelButtons1 = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        ImgMovie9 = new javax.swing.JButton();
        ImgMovie10 = new javax.swing.JButton();
        ImgMovie11 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(111, 21, 21));

        jPanel3.setBackground(new java.awt.Color(221, 208, 133));
        jPanel3.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(111, 21, 21));
        jLabel1.setText("Movie Detail");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(221, 208, 133));

        Label_name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label_name.setText("Name:");

        jTextField1.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jTextField1.setText("Input Name");

        Label_date.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label_date.setText("Date:");

        Label_time.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label_time.setText("Time:");

        Label_Image.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label_Image.setText("Image:");

        ChooseImageButton.setBackground(new java.awt.Color(204, 204, 204));
        ChooseImageButton.setForeground(new java.awt.Color(204, 204, 204));
        ChooseImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseImageButtonActionPerformed(evt);
            }
        });

        jCheckBox1.setText("10:00");

        jCheckBox2.setText("11:00");

        jCheckBox3.setText("12:00");

        jCheckBox4.setText("13:00");

        jCheckBox5.setText("14:00");

        jCheckBox6.setText("15:00");

        jCheckBox7.setText("16:00");

        jCheckBox8.setText("17:00");

        jCheckBox9.setText("18:00");

        jCheckBox10.setText("19:00");

        jCheckBox11.setText("20:00");

        jCheckBox12.setText("21:00");

        jCheckBox13.setText("22:00");

        startDateField.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        startDateField.setText("Input Date Start");

        endDateField.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        endDateField.setText("Input Date End");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChooseImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_date, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_time, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox7))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox13))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(endDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox13))
                .addGap(5, 5, 5)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChooseImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelMain.setBackground(new java.awt.Color(111, 21, 21));

        ImgMovie1.setBackground(new java.awt.Color(204, 204, 204));

        ImgMovie2.setBackground(new java.awt.Color(204, 204, 204));

        ImgMovie4.setBackground(new java.awt.Color(204, 204, 204));

        ImgMovie3.setBackground(new java.awt.Color(204, 204, 204));

        ImgMovie5.setBackground(new java.awt.Color(204, 204, 204));

        ImgMovie7.setBackground(new java.awt.Color(204, 204, 204));

        ImgMovie6.setBackground(new java.awt.Color(204, 204, 204));

        ImgMovie8.setBackground(new java.awt.Color(204, 204, 204));

        PanelButtons1.setBackground(new java.awt.Color(111, 21, 21));

        AddButton.setBackground(new java.awt.Color(221, 208, 133));
        AddButton.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        AddButton.setForeground(new java.awt.Color(111, 21, 21));
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        RemoveButton.setBackground(new java.awt.Color(221, 208, 133));
        RemoveButton.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        RemoveButton.setForeground(new java.awt.Color(111, 21, 21));
        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        SaveButton.setBackground(new java.awt.Color(221, 208, 133));
        SaveButton.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(111, 21, 21));
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelButtons1Layout = new javax.swing.GroupLayout(PanelButtons1);
        PanelButtons1.setLayout(PanelButtons1Layout);
        PanelButtons1Layout.setHorizontalGroup(
            PanelButtons1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelButtons1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelButtons1Layout.setVerticalGroup(
            PanelButtons1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelButtons1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelButtons1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(RemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        ImgMovie9.setBackground(new java.awt.Color(204, 204, 204));

        ImgMovie10.setBackground(new java.awt.Color(204, 204, 204));

        ImgMovie11.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PanelMainLayout = new javax.swing.GroupLayout(PanelMain);
        PanelMain.setLayout(PanelMainLayout);
        PanelMainLayout.setHorizontalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelButtons1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImgMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgMovie9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImgMovie6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgMovie2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgMovie10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImgMovie7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgMovie11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImgMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgMovie8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        PanelMainLayout.setVerticalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMainLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMainLayout.createSequentialGroup()
                        .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImgMovie2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImgMovie6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgMovie7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgMovie8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImgMovie9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgMovie10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgMovie11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    //=========================================================
    private void loadMovieList() {
    // โหลดหนังทั้งหมดจาก DataManager
    /*List<Movie> movies = DataManager.getMovies();

    JButton[] buttons = { ImgMovie1, ImgMovie2, ImgMovie3, ImgMovie4, ImgMovie5, ImgMovie6, ImgMovie7, ImgMovie8, ImgMovie9, ImgMovie10, ImgMovie11};
        for (int i = 0; i < buttons.length; i++) {
            if (i < movies.size()) {
                Movie m = movies.get(i);
                setMovieButtonImage(buttons[i], m, i);
            } else {
                buttons[i].setIcon(null);
                buttons[i].setText("Empty");
            }
        }*/
        List<Movie> movies = DataManager.getMovies();
        JButton[] buttons = { ImgMovie1, ImgMovie2, ImgMovie3, ImgMovie4, ImgMovie5, ImgMovie6, ImgMovie7, ImgMovie8, ImgMovie9, ImgMovie10, ImgMovie11 };
        
        for (int i = 0; i < buttons.length; i++) {
            if (i < movies.size()) {
                Movie m = movies.get(i);
                setMovieButtonImage(buttons[i], m, i);
            } else {
                buttons[i].setIcon(null);
                buttons[i].setText("Empty");
            }
        }

        // ✅ แสดง Scrollbar เมื่อมีมากกว่า 3 แถว
        int rows = (int) Math.ceil(movies.size() / 4.0); // 4 ปุ่มต่อแถว
        jScrollBar1.setVisible(rows > 3);
    }

    // ภาพหนังในปุ่ม
    private void setMovieButtonImage(JButton btn, Movie m, int index) {
        try {
            ImageIcon icon = new ImageIcon(m.getImagePath());
            Image scaled = icon.getImage().getScaledInstance(120, 180, Image.SCALE_SMOOTH);
            btn.setIcon(new ImageIcon(scaled));
        } catch (Exception e) {
            btn.setText(m.getName());
        }

        btn.addActionListener(evt -> showMovieDetail(index));
    }

    // แสดงข้อมูลหนังด้านขวา
    private void showMovieDetail(int index) {
        Movie m = DataManager.getMovies().get(index);
        selectedIndex = index;

        List<String> dates = m.getDates();
        List<String> times = m.getTimes();

        //แสดงวันเริ่มต้น และวันสิ้นสุด
        if (dates != null && !dates.isEmpty()) {
            // วันแรก
            startDateField.setText(dates.get(0));

            // วันสุดท้าย
            endDateField.setText(dates.get(dates.size() - 1));
        } else {
            startDateField.setText("");
            endDateField.setText("");
        }

        //เคลียร์ checkbox ทั้งหมดก่อน
        JCheckBox[] checkBoxes = {
            jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5,
            jCheckBox6, jCheckBox7, jCheckBox8, jCheckBox9, jCheckBox10,
            jCheckBox11, jCheckBox12, jCheckBox13,
        };
        for (JCheckBox cb : checkBoxes) {
            cb.setSelected(false);
        }

        //ติ๊ก checkbox ที่เคยเลือกไว้
        if (times != null) {
            for (String t : times) {
                for (JCheckBox cb : checkBoxes) {
                    if (cb.getText().equals(t)) {
                        cb.setSelected(true);
                        break;
                    }
                }
            }
        }

        //แสดงภาพของหนัง
        if (m.getImagePath() != null && !m.getImagePath().isEmpty()) {
            ImageIcon icon = new ImageIcon(m.getImagePath());
            Image scaled = icon.getImage().getScaledInstance(180, 240, Image.SCALE_SMOOTH);
            ChooseImageButton.setIcon(new ImageIcon(scaled));
        } else {
            ChooseImageButton.setIcon(null);
        }
    }

    // ปุ่มเลือกรูปภาพ
    private void chooseImage() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            /*selectedImagePath = f.getAbsolutePath();
            ImageIcon icon = new ImageIcon(f.getAbsolutePath());
            Image scaled = icon.getImage().getScaledInstance(180, 240, Image.SCALE_SMOOTH);
            ChooseImageButton.setIcon(new ImageIcon(scaled));*/

            String fullPath = f.getAbsolutePath();

            // เอาเฉพาะส่วนหลัง "Picture" เป็นต้นไป
            int index = fullPath.lastIndexOf("Picture");
            if (index != -1) {
                selectedImagePath = fullPath.substring(index);
            } else {
                selectedImagePath = fullPath; // กรณีไม่มีคำว่า Picture ใน path
            }
        }
    }                    

    // ================================================
    // สร้างลิสต์วันที่ทั้งหมดระหว่าง start - end
    // ================================================
    // ฟังก์ชันคำนวณวันระหว่าง start-end โดยใช้กฎของคุณ
    private List<String> DateStartToEnd(String startStr, String endStr) {
        List<String> dates = new ArrayList<>();

        // แปลงข้อความจากรูปแบบ dd/MM/yy
        String[] startParts = startStr.split("/");
        String[] endParts = endStr.split("/");

        int startDay = Integer.parseInt(startParts[0]);
        int startMonth = Integer.parseInt(startParts[1]);
        int startYear = Integer.parseInt(startParts[2]);

        int endDay = Integer.parseInt(endParts[0]);
        int endMonth = Integer.parseInt(endParts[1]);
        int endYear = Integer.parseInt(endParts[2]);

        // เริ่มวนลูปตั้งแต่วันเริ่มจนถึงวันสิ้นสุด
        int day = startDay, month = startMonth, year = startYear;

        while (true) {
            // เพิ่มวันที่ใน list (เช่น 31/12/68)
            String dateStr = String.format("%02d/%02d/%02d", day, month, year);
            dates.add(dateStr);

            // ถ้าเจอวันสิ้นสุดแล้วให้หยุด
            if (day == endDay && month == endMonth && year == endYear) break;

            // เพิ่มวัน
            day++;

            // ตรวจสอบจำนวนวันสูงสุดของเดือนนั้น
            int maxDays = getMaxDaysOfMonth(month);

            if (day > maxDays) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
        }

        return dates;
    }

    // กำหนดจำนวนวันต่อเดือนเองตามกฎของคุณ
    private int getMaxDaysOfMonth(int month) {
        switch (month) {
            case 1:  
            case 3:  
            case 5:  
            case 7:  
            case 8:  
            case 10: 
            case 12: 
                return 31;//ลงท้ายคม
            case 4:  
            case 6:  
            case 9:  
            case 11: 
                return 30;//ลงท้านยน
            case 2:  
                return 28;//กุมภาพันธ์
            default:
                return 30;
        }
    }

    // ดึงเวลาที่ติ๊กจาก Checkbox ทั้งหมด
    private List<String> getSelectedTimes() {
        List<String> selectedTimes = new ArrayList<>();
        JCheckBox[] checkBoxes = {
            jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5,
            jCheckBox6, jCheckBox7, jCheckBox8, jCheckBox9, jCheckBox10,
            jCheckBox11, jCheckBox12, jCheckBox13
        };

        for (JCheckBox cb : checkBoxes) {
            if (cb.isSelected()) {
                selectedTimes.add(cb.getText());
            }
        }
        return selectedTimes;
    }
    //=================================================================================
    private void ChooseImageButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        chooseImage();
    }                   
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // SetItem newSet = new SetItem("New Set", 0, "");                                          
        /*List<String> defaultDates = new ArrayList<>(Arrays.asList("Input Date Start", "", ""));
        List<String> defaultTimes = new ArrayList<>(Arrays.asList("Input Date End", "", "", ""));
        Movie newMovie = new Movie("New movie", "", defaultDates, defaultTimes);

        DataManager.getMovies().add(newMovie);
        DataManager.updateMovie(DataManager.getMovies().size() - 1, newMovie);
        loadMovieList();
        JOptionPane.showMessageDialog(this, "Add complete!", "Success", JOptionPane.INFORMATION_MESSAGE);*/
         Movie newMovie = new Movie("New Movie", "", new ArrayList<>(), new ArrayList<>());
        DataManager.getMovies().add(newMovie);

        // โหลดปุ่มภาพใหม่ทั้งหมด
        loadMovieList();

        // เลื่อนไปยังช่องล่าสุด
        selectedIndex = DataManager.getMovies().size() - 1;

        JOptionPane.showMessageDialog(this, "Added new movie slot!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {  
        /*if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please Choose a movie first!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String name = jTextField1.getText().trim();
        List<String> selectedTimes = getSelectedTimes();
        String startStr = startDateField.getText().trim();
        String endStr = endDateField.getText().trim();

        if (startStr.isEmpty() || endStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input both Start and End date.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // ใช้ฟังก์ชันใหม่ที่เขียนเอง
        List<String> dateRange = DateStartToEnd(startStr, endStr);

        Movie m = DataManager.getMovies().get(selectedIndex);
        m.setName(name);
        m.setImagePath(selectedImagePath);
        m.setDates(dateRange);
        m.setTimes(selectedTimes);

        DataManager.updateMovie(selectedIndex, m);
        JOptionPane.showMessageDialog(this, "Movie schedule saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);*/
        DataManager.refresh();
        JOptionPane.showMessageDialog(this, "All movies saved successfully!", "Saved", JOptionPane.INFORMATION_MESSAGE);
    }                     
    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        /*if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please Choose!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DataManager.getMovies().remove(selectedIndex);
        DataManager.refresh();
        loadMovieList();
        //JOptionPane.showMessageDialog(this, "Delete complete!");
        JOptionPane.showMessageDialog(this, "Delete complete!", "Success", JOptionPane.INFORMATION_MESSAGE);*/
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a movie to remove!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Delete this movie?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            DataManager.getMovies().remove(selectedIndex);
            DataManager.refresh();
            loadMovieList();  // โหลดปุ่มภาพใหม่
            selectedIndex = -1;
            JOptionPane.showMessageDialog(this, "Movie removed successfully!", "Deleted", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //=======================================================================

    private javax.swing.JButton AddButton;
    private javax.swing.JButton ChooseImageButton;
    private javax.swing.JButton ImgMovie1;
    private javax.swing.JButton ImgMovie10;
    private javax.swing.JButton ImgMovie11;
    private javax.swing.JButton ImgMovie2;
    private javax.swing.JButton ImgMovie3;
    private javax.swing.JButton ImgMovie4;
    private javax.swing.JButton ImgMovie5;
    private javax.swing.JButton ImgMovie6;
    private javax.swing.JButton ImgMovie7;
    private javax.swing.JButton ImgMovie8;
    private javax.swing.JButton ImgMovie9;
    private javax.swing.JLabel Label_Image;
    private javax.swing.JLabel Label_date;
    private javax.swing.JLabel Label_name;
    private javax.swing.JLabel Label_time;
    private javax.swing.JPanel PanelButtons1;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField startDateField;
    private javax.swing.JTextField endDateField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextField1;        
}