package view;

import controller.IOExcel;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.BienChuongTrinh;
import model.BoTuVung;
import model.TuVung;
import org.jdesktop.swingx.autocomplete.*;

/**
 * Lớp giao diện thức hiện chức năng quản lý từ
 *
 * @author Phương Anh Tuấn + Nguyễn Ngọc Tú
 */
public class QuanLyTuVung extends javax.swing.JFrame {

    //Mẫu mặc định cho bảng
    DefaultTableModel modelTV = new DefaultTableModel();

    //Chủ đề của bảng
    String chudeTB;

    //Số thứ tự của chủ đề
    int STTchudeTB;

    //1 bộ từ vựng chức năng nhớ trung gian
    BoTuVung BTV = new BoTuVung();

    //Lưu giá trị thứ tự dòng của bảng
    int index;

    //Biến trạng thái click cho nút
    boolean isClick = false;

    //Từ dùng làm biến trung gian
    TuVung tempWord = new TuVung();

    //Trạng thái đã tìm thấy từ nào chưa
    boolean isFound = false;

    /**
     * Tạo form QuanLyTu
     */
    public QuanLyTuVung() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
        capnhatButton.setVisible(false);
        xoaButton.setVisible(false);
        anhLabel.setVisible(false);

        jScrollPane1.setOpaque(false);
        tuvungTable.setOpaque(false);
        ((DefaultTableCellRenderer) tuvungTable.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        label.setBackground(new Color(255, 255, 255, 55));
        englabel.setBackground(new Color(0, 0, 0, 50));
        vieLabel.setBackground(new Color(0, 0, 0, 50));
        imgLabel.setBackground(new Color(0, 0, 0, 50));
        phatamText.setBackground(new Color(0, 0, 0, 50));
        tuloaiText.setBackground(new Color(0, 0, 0, 50));
        viduText.setBackground(new Color(0, 0, 0, 50));
        timTextField.setBackground(new Color(0, 0, 0, 50));
        xoaButton.setBackground(new Color(255, 0, 0, 150));
        capnhatButton.setBackground(new Color(255, 255, 255, 100));
        themButton.setBackground(new Color(0, 102, 204, 150));
        dahocButton.setBackground(new Color(255, 255, 255, 100));
        excelButton.setBackground(new Color(255, 255, 255, 100));
        xuatButton.setBackground(new Color(255, 255, 255, 100));
        timButton.setBackground(new Color(255, 255, 255, 100));

        modelTV = (DefaultTableModel) tuvungTable.getModel();
        chudeTB = BienChuongTrinh.chudehientai;
        label.setText("Từ vựng chủ đề: " + chudeTB);
        for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
            if (BienChuongTrinh.dulieutuvung.getBook().get(i).getChude().compareTo(chudeTB) == 0) {
                BTV = BienChuongTrinh.dulieutuvung.getBook().get(i);
                STTchudeTB = BienChuongTrinh.dulieutuvung.getBook().get(i).getSoThuTu();
            }
        }

        HienThi();

        ArrayList<String> list = new ArrayList<>();
        for (TuVung TV : BTV.getList()) {
            list.add(TV.getEnglish());
            list.add(TV.getVietnamese());
        }

        AutoCompleteDecorator.decorate(timTextField, list, true);

    }

    /**
     * Hiển thị thông tin từ vựng ra bảng
     */
    public final void HienThi() {
        modelTV.setRowCount(0);

        for (int i = 0; i < BTV.getSoluongTu(); i++) {
            modelTV.addRow(BTV.getList().get(i).toObject());
        }
        soluongtuLabel.setText("Danh sách gồm: " + BTV.getSoluongTu() + " từ");
    }

    /**
     * thiết lập nội dung từ tìm thấy cho bảng
     *
     */
    public void HienThiTuDaTim() {
        modelTV.setRowCount(0);
        //Vòng lặp tìm kiếm từ
        for (int i = 0; i < BTV.getSoluongTu(); i++) {
            //Nếu đang ở danh sách từ cũ thì tìm trong các từ cũ
            if (isClick == true) {
                if (BTV.getList().get(i).isIsRead() == true) {
                    String temp1 = BTV.getList().get(i).getEnglish().toLowerCase();
                    String temp2 = timTextField.getText().trim().toLowerCase();
                    String temp3 = BTV.getList().get(i).getVietnamese().toLowerCase();
                    if (temp1.compareTo(temp2) == 0 || temp3.compareTo(temp2) == 0) {
                        modelTV.addRow(BTV.getList().get(i).toObject());
                        tempWord = BTV.getList().get(i);
                        isFound = true;
                        break;
                    }
                }
                //Nếu không thì tìm ở toàn bộ từ
            } else {
                String temp1 = BTV.getList().get(i).getEnglish().toLowerCase();
                String temp2 = timTextField.getText().trim().toLowerCase();
                String temp3 = BTV.getList().get(i).getVietnamese().toLowerCase();
                if (temp1.compareTo(temp2) == 0 || temp3.compareTo(temp2) == 0) {
                    modelTV.addRow(BTV.getList().get(i).toObject());
                    tempWord = BTV.getList().get(i);
                    isFound = true;
                    break;
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tuvungTable = new javax.swing.JTable();
        englabel = new javax.swing.JTextField();
        vieLabel = new javax.swing.JTextField();
        imgLabel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phatamText = new javax.swing.JTextField();
        tuloaiText = new javax.swing.JTextField();
        viduText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        anhLabel = new javax.swing.JLabel();
        soluongtuLabel = new javax.swing.JLabel();
        timTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        capnhatButton = new javax.swing.JLabel();
        xoaButton = new javax.swing.JLabel();
        themButton = new javax.swing.JLabel();
        timButton = new javax.swing.JLabel();
        dahocButton = new javax.swing.JLabel();
        xuatButton = new javax.swing.JLabel();
        excelButton = new javax.swing.JLabel();
        thoatButton = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        lammoiButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(300, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tuvungTable.setBackground(new java.awt.Color(51, 0, 51));
        tuvungTable.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tuvungTable.setForeground(new java.awt.Color(51, 51, 51));
        tuvungTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "English", "Nghĩa", "Phát âm", "Từ loại", "Ví dụ minh họa", "Ảnh minh họa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tuvungTable.setGridColor(new java.awt.Color(255, 255, 255));
        tuvungTable.setOpaque(false);
        tuvungTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tuvungTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tuvungTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tuvungTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 1110, 260));

        englabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        englabel.setForeground(new java.awt.Color(255, 255, 255));
        englabel.setBorder(null);
        englabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englabelActionPerformed(evt);
            }
        });
        getContentPane().add(englabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 208, 30));

        vieLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        vieLabel.setForeground(new java.awt.Color(255, 255, 255));
        vieLabel.setBorder(null);
        getContentPane().add(vieLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 208, 30));

        imgLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        imgLabel.setForeground(new java.awt.Color(255, 255, 255));
        imgLabel.setBorder(null);
        getContentPane().add(imgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 208, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Tiếng anh:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Tiếng việt:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Link ảnh:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 70, 30));

        phatamText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phatamText.setForeground(new java.awt.Color(255, 255, 255));
        phatamText.setBorder(null);
        getContentPane().add(phatamText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 206, 30));

        tuloaiText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tuloaiText.setForeground(new java.awt.Color(255, 255, 255));
        tuloaiText.setBorder(null);
        getContentPane().add(tuloaiText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 206, 30));

        viduText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        viduText.setForeground(new java.awt.Color(255, 255, 255));
        viduText.setBorder(null);
        getContentPane().add(viduText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 206, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Phát âm:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 96, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Từ loại:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 96, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Ví dụ:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 96, 30));
        getContentPane().add(anhLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 100, 100));

        soluongtuLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        soluongtuLabel.setForeground(new java.awt.Color(102, 102, 102));
        soluongtuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soluongtuLabel.setText("Danh sách gồm: từ");
        getContentPane().add(soluongtuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 590, 190, -1));

        timTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        timTextField.setForeground(new java.awt.Color(255, 255, 255));
        timTextField.setBorder(null);
        timTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timTextFieldMouseClicked(evt);
            }
        });
        timTextField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                timTextFieldInputMethodTextChanged(evt);
            }
        });
        getContentPane().add(timTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 400, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Tìm:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 87, 60, 30));

        capnhatButton.setBackground(new java.awt.Color(51, 51, 51));
        capnhatButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        capnhatButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        capnhatButton.setText("Cập nhật");
        capnhatButton.setOpaque(true);
        capnhatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capnhatButtonMouseClicked(evt);
            }
        });
        getContentPane().add(capnhatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 100, 30));

        xoaButton.setBackground(new java.awt.Color(204, 0, 0));
        xoaButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        xoaButton.setForeground(new java.awt.Color(255, 255, 255));
        xoaButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xoaButton.setText("Xóa từ này");
        xoaButton.setOpaque(true);
        xoaButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                xoaButtonMouseMoved(evt);
            }
        });
        xoaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xoaButtonMouseClicked(evt);
            }
        });
        getContentPane().add(xoaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 100, 30));

        themButton.setBackground(new java.awt.Color(0, 102, 204));
        themButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        themButton.setForeground(new java.awt.Color(255, 255, 255));
        themButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        themButton.setText("Thêm từ mới");
        themButton.setOpaque(true);
        themButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themButtonMouseClicked(evt);
            }
        });
        getContentPane().add(themButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 110, 30));

        timButton.setBackground(new java.awt.Color(51, 51, 51));
        timButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        timButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timButton.setText("Tìm");
        timButton.setOpaque(true);
        timButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timButtonMouseClicked(evt);
            }
        });
        getContentPane().add(timButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 60, 30));

        dahocButton.setBackground(new java.awt.Color(51, 51, 51));
        dahocButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dahocButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dahocButton.setText("Danh sách đã học");
        dahocButton.setOpaque(true);
        dahocButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dahocButtonMouseClicked(evt);
            }
        });
        getContentPane().add(dahocButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 410, 150, 30));

        xuatButton.setBackground(new java.awt.Color(51, 51, 51));
        xuatButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        xuatButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xuatButton.setText("Xuất ra Excel");
        xuatButton.setOpaque(true);
        xuatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xuatButtonMouseClicked(evt);
            }
        });
        getContentPane().add(xuatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 460, 130, 30));

        excelButton.setBackground(new java.awt.Color(51, 51, 51));
        excelButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        excelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        excelButton.setText("Thêm từ excel");
        excelButton.setOpaque(true);
        excelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excelButtonMouseClicked(evt);
            }
        });
        getContentPane().add(excelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 130, 30));

        thoatButton.setBackground(new java.awt.Color(0, 0, 0));
        thoatButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        thoatButton.setForeground(new java.awt.Color(255, 255, 255));
        thoatButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thoatButton.setText("X");
        thoatButton.setOpaque(true);
        thoatButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                thoatButtonMouseMoved(evt);
            }
        });
        thoatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thoatButtonMouseClicked(evt);
            }
        });
        getContentPane().add(thoatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 30, 30));

        label.setBackground(new java.awt.Color(255, 0, 0));
        label.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label.setForeground(new java.awt.Color(51, 51, 51));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("DANH SÁCH TỪ VỰNG CHỦ ĐỀ..");
        label.setOpaque(true);
        label.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labelMouseMoved(evt);
            }
        });
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 80));

        lammoiButton.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lammoiButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lammoiButton.setText("Làm mới");
        lammoiButton.setOpaque(true);
        lammoiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lammoiButtonMouseClicked(evt);
            }
        });
        getContentPane().add(lammoiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgquanlytu.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void englabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englabelActionPerformed

    }//GEN-LAST:event_englabelActionPerformed

    /**
     * Sự kiện khi click vào 1 từ trong bảng
     *
     * @param evt là sự kiện
     */
    private void tuvungTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuvungTableMouseClicked
        if (isFound == true) {
            englabel.setText(tempWord.getEnglish());
            vieLabel.setText(tempWord.getVietnamese());
            imgLabel.setText(tempWord.getExampleImage());
            phatamText.setText(tempWord.getVoice());
            tuloaiText.setText(tempWord.getType());
            viduText.setText(tempWord.getExampleCase());
            Icon icon = new ImageIcon(tempWord.getExampleImage());
            anhLabel.setIcon(icon);
            capnhatButton.setVisible(true);
            xoaButton.setVisible(true);
            anhLabel.setVisible(true);
            return;
        }
        index = -1;
        index = tuvungTable.getSelectedRow();
        if (index != -1) {
            englabel.setText(BTV.getList().get(index).getEnglish());
            vieLabel.setText(BTV.getList().get(index).getVietnamese());
            imgLabel.setText(BTV.getList().get(index).getExampleImage());
            phatamText.setText(BTV.getList().get(index).getVoice());
            tuloaiText.setText(BTV.getList().get(index).getType());
            viduText.setText(BTV.getList().get(index).getExampleCase());
            Icon icon = new ImageIcon(BTV.getList().get(index).getExampleImage());
            anhLabel.setIcon(icon);
            capnhatButton.setVisible(true);
            xoaButton.setVisible(true);
            anhLabel.setVisible(true);
        }
    }//GEN-LAST:event_tuvungTableMouseClicked

    private void capnhatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capnhatButtonMouseClicked
        xoaButton.setVisible(false);
        if (englabel.getText().trim().length() == 0 || vieLabel.getText().trim().length() == 0 || imgLabel.getText().trim().length() == 0 || phatamText.getText().trim().length() == 0 || tuloaiText.getText().trim().length() == 0 || viduText.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin!");
        } else {
            BienChuongTrinh.dulieutuvung.getBook().get(STTchudeTB).getList().get(index).setEnglish(englabel.getText());
            BienChuongTrinh.dulieutuvung.getBook().get(STTchudeTB).getList().get(index).setVietnamese(vieLabel.getText());
            BienChuongTrinh.dulieutuvung.getBook().get(STTchudeTB).getList().get(index).setVoice(phatamText.getText());
            BienChuongTrinh.dulieutuvung.getBook().get(STTchudeTB).getList().get(index).setType(tuloaiText.getText());
            BienChuongTrinh.dulieutuvung.getBook().get(STTchudeTB).getList().get(index).setExampleCase(viduText.getText());
            BienChuongTrinh.dulieutuvung.getBook().get(STTchudeTB).getList().get(index).setExampleImage(imgLabel.getText());
            HienThi();
        }
        themButton.setVisible(true);
        capnhatButton.setVisible(false);
        anhLabel.setVisible(false);
        englabel.setText("");
        vieLabel.setText("");
        imgLabel.setText("");
        phatamText.setText("");
        tuloaiText.setText("");
        viduText.setText("");
    }//GEN-LAST:event_capnhatButtonMouseClicked

    private void xoaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaButtonMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa từ này?") == 0) {
            index = tuvungTable.getSelectedRow();
            BienChuongTrinh.dulieutuvung.getBook().get(STTchudeTB).removeW(index);
            HienThi();
        }
    }//GEN-LAST:event_xoaButtonMouseClicked

    private void themButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themButtonMouseClicked
        if (englabel.getText().length() == 0 || vieLabel.getText().length() == 0 || imgLabel.getText().length() == 0 || phatamText.getText().trim().length() == 0 || tuloaiText.getText().trim().length() == 0 || viduText.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin!");
        } else {
            if (BienChuongTrinh.dulieutuvung.getBook().get(STTchudeTB).Search(englabel.getText()) == false) {
                BienChuongTrinh.dulieutuvung.getBook().get(STTchudeTB).addW(englabel.getText(), vieLabel.getText(), phatamText.getText(), tuloaiText.getText(), viduText.getText(), imgLabel.getText());
                HienThi();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Từ bị trùng tên!");
            }
        }
    }//GEN-LAST:event_themButtonMouseClicked

    private void timButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timButtonMouseClicked
        capnhatButton.setVisible(false);
        xoaButton.setVisible(false);
        dahocButton.setVisible(false);
        excelButton.setVisible(false);
        xuatButton.setVisible(false);
        englabel.setText("");
        vieLabel.setText("");
        imgLabel.setText("");
        phatamText.setText("");
        tuloaiText.setText("");
        viduText.setText("");
        anhLabel.setVisible(false);
        if (timTextField.getText().trim().length() == 0) {
            isFound = false;
            dahocButton.setVisible(true);
            excelButton.setVisible(true);
            xuatButton.setVisible(true);
            HienThi();
        } else {
            HienThiTuDaTim();
        }
    }//GEN-LAST:event_timButtonMouseClicked

    private void dahocButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dahocButtonMouseClicked
        capnhatButton.setVisible(false);
        anhLabel.setVisible(false);
        xoaButton.setVisible(false);
        englabel.setText("");
        vieLabel.setText("");
        imgLabel.setText("");
        phatamText.setText("");
        tuloaiText.setText("");
        viduText.setText("");
        if (isClick == false) {
            modelTV.setRowCount(0);
            for (int i = 0; i < BTV.getSoluongTu(); i++) {
                if (BTV.getList().get(i).isIsRead() == true) {
                    modelTV.addRow(BTV.getList().get(i).toObject());
                }
            }
            soluongtuLabel.setText("Danh sách gồm: " + BTV.getNumberLearnt() + " từ");
            dahocButton.setText("Trở lại");
            excelButton.setVisible(false);
            xuatButton.setVisible(false);
            themButton.setVisible(false);
            timButton.setVisible(false);
            lammoiButton.setVisible(false);
            isClick = true;
        } else {
            excelButton.setVisible(true);
            xuatButton.setVisible(true);
            themButton.setVisible(true);
            timButton.setVisible(true);
            lammoiButton.setVisible(true);
            dahocButton.setText("Danh sách đã học");
            HienThi();
            isClick = false;
        }
    }//GEN-LAST:event_dahocButtonMouseClicked

    private void xuatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xuatButtonMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xuất chủ đề này ra file Excel định dạng .xlsx?") == 0) {
            try {
                IOExcel.OutputToExcel(BTV);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(QuanLyTuVung.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(QuanLyTuVung.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(rootPane, "Xuất thành công! File tạo ra nằm cùng thư mục với chương trình chính");
        }
    }//GEN-LAST:event_xuatButtonMouseClicked

    private void excelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelButtonMouseClicked
        new MauFileExcel().setVisible(true);
    }//GEN-LAST:event_excelButtonMouseClicked

    private void xoaButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaButtonMouseMoved

    }//GEN-LAST:event_xoaButtonMouseMoved

    private void thoatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatButtonMouseClicked
        this.dispose();
        new QuanLy().setVisible(true);
    }//GEN-LAST:event_thoatButtonMouseClicked

    private void labelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseMoved
        thoatButton.setBackground(Color.black);
    }//GEN-LAST:event_labelMouseMoved

    private void thoatButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatButtonMouseMoved
        thoatButton.setBackground(Color.red);
    }//GEN-LAST:event_thoatButtonMouseMoved

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved


    }//GEN-LAST:event_jLabel1MouseMoved

    private void timTextFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_timTextFieldInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_timTextFieldInputMethodTextChanged

    private void timTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timTextFieldMouseClicked


    }//GEN-LAST:event_timTextFieldMouseClicked

    private void lammoiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lammoiButtonMouseClicked
        isFound = false;
        dahocButton.setVisible(true);
        excelButton.setVisible(true);
        xuatButton.setVisible(true);
        HienThi();

    }//GEN-LAST:event_lammoiButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anhLabel;
    private javax.swing.JLabel capnhatButton;
    private javax.swing.JLabel dahocButton;
    private javax.swing.JTextField englabel;
    private javax.swing.JLabel excelButton;
    private javax.swing.JTextField imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lammoiButton;
    private javax.swing.JTextField phatamText;
    private javax.swing.JLabel soluongtuLabel;
    private javax.swing.JLabel themButton;
    private javax.swing.JLabel thoatButton;
    private javax.swing.JLabel timButton;
    private javax.swing.JTextField timTextField;
    private javax.swing.JTextField tuloaiText;
    private javax.swing.JTable tuvungTable;
    private javax.swing.JTextField viduText;
    private javax.swing.JTextField vieLabel;
    private javax.swing.JLabel xoaButton;
    private javax.swing.JLabel xuatButton;
    // End of variables declaration//GEN-END:variables
}
