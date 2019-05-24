package view;

import controller.IOFile;
import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.BienChuongTrinh;
import model.BoTuVung;

/**
 * Lớp giao diện thực hiện chức năng quản lý bìa bộ từ vựng
 *
 * @author Phương Anh Tuấn + Nguyễn Ngọc Tú
 */
public class QuanLy extends javax.swing.JFrame {

    //Vị trí bộ từ ghép 1 mặc định la -1
    int index1 = -1;

    //Vị trí bộ từ ghép 2 mặc định la -1
    int index2 = -1;

    //Trạng thái có đang ghép hay không
    boolean isUp = false;

    /**
     * Tạo form QuanLyBoTu
     */
    public QuanLy() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
        tenmoiLabel.setVisible(false);
        tenchudeTextField.setBackground(new Color(0, 0, 0, 50));
        duongdanText.setBackground(new Color(0, 0, 0, 50));
        moButton.setBackground(new Color(255, 255, 255, 100));
        xoaButton.setBackground(new Color(255, 0, 0, 150));
        capnhatButton.setBackground(new Color(255, 255, 255, 100));
        themButton.setBackground(new Color(255, 255, 255, 100));
        datlaiButton.setBackground(new Color(255, 0, 0, 150));
        ghepButton.setBackground(new Color(255, 255, 255, 100));
        chonButton.setBackground(new Color(255, 255, 255, 100));
        label.setBackground(new Color(255, 255, 255, 55));

        for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
            chudeComboBox.addItem(BienChuongTrinh.dulieutuvung.getBook().get(i).getChude());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        chudeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tenchudeTextField = new javax.swing.JTextField();
        tenmoiLabel = new javax.swing.JLabel();
        duongdanText = new javax.swing.JTextField();
        filedulieuLabel = new javax.swing.JLabel();
        moButton = new javax.swing.JLabel();
        xoaButton = new javax.swing.JLabel();
        themButton = new javax.swing.JLabel();
        datlaiButton = new javax.swing.JLabel();
        capnhatButton = new javax.swing.JLabel();
        chonButton = new javax.swing.JLabel();
        thoatButton = new javax.swing.JLabel();
        ghepButton = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chudeComboBox.setBorder(null);
        chudeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chudeComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(chudeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 131, 220, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Chủ đề:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 134, 77, -1));

        tenchudeTextField.setForeground(new java.awt.Color(255, 255, 255));
        tenchudeTextField.setBorder(null);
        tenchudeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenchudeTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(tenchudeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 212, 220, 30));

        tenmoiLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tenmoiLabel.setForeground(new java.awt.Color(51, 51, 51));
        tenmoiLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tenmoiLabel.setText("Tên mới:");
        getContentPane().add(tenmoiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 215, 77, -1));

        duongdanText.setForeground(new java.awt.Color(255, 255, 255));
        duongdanText.setBorder(null);
        duongdanText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duongdanTextActionPerformed(evt);
            }
        });
        getContentPane().add(duongdanText, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 260, 220, 31));

        filedulieuLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        filedulieuLabel.setForeground(new java.awt.Color(51, 51, 51));
        filedulieuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        filedulieuLabel.setText("File dữ liệu:");
        getContentPane().add(filedulieuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 267, 82, -1));

        moButton.setBackground(new java.awt.Color(51, 51, 51));
        moButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        moButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moButton.setText("Mở");
        moButton.setOpaque(true);
        moButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moButtonMouseClicked(evt);
            }
        });
        getContentPane().add(moButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 60, 30));

        xoaButton.setBackground(new java.awt.Color(255, 0, 0));
        xoaButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        xoaButton.setForeground(new java.awt.Color(255, 255, 255));
        xoaButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xoaButton.setText("Xóa");
        xoaButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
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
        getContentPane().add(xoaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 70, 30));

        themButton.setBackground(new java.awt.Color(51, 51, 51));
        themButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        themButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        themButton.setText("Thêm mới");
        themButton.setOpaque(true);
        themButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themButtonMouseClicked(evt);
            }
        });
        getContentPane().add(themButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 90, 30));

        datlaiButton.setBackground(new java.awt.Color(255, 0, 0));
        datlaiButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        datlaiButton.setForeground(new java.awt.Color(255, 255, 255));
        datlaiButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datlaiButton.setText("Đặt lại trạng thái từ");
        datlaiButton.setOpaque(true);
        datlaiButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                datlaiButtonMouseMoved(evt);
            }
        });
        datlaiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datlaiButtonMouseClicked(evt);
            }
        });
        getContentPane().add(datlaiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 220, 30));

        capnhatButton.setBackground(new java.awt.Color(51, 51, 51));
        capnhatButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        capnhatButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        capnhatButton.setText("Cập nhật");
        capnhatButton.setOpaque(true);
        capnhatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capnhatButtonMouseClicked(evt);
            }
        });
        getContentPane().add(capnhatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 80, 30));

        chonButton.setBackground(new java.awt.Color(51, 51, 51));
        chonButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chonButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chonButton.setText("Chọn");
        chonButton.setOpaque(true);
        chonButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chonButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chonButtonMouseEntered(evt);
            }
        });
        getContentPane().add(chonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 80, 30));

        thoatButton.setBackground(new java.awt.Color(51, 51, 51));
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
        getContentPane().add(thoatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 30, 30));

        ghepButton.setBackground(new java.awt.Color(0, 102, 204));
        ghepButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ghepButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ghepButton.setText("Ghép với..");
        ghepButton.setOpaque(true);
        ghepButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ghepButtonMouseClicked(evt);
            }
        });
        getContentPane().add(ghepButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 130, 30));

        label.setBackground(new java.awt.Color(204, 204, 255));
        label.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label.setForeground(new java.awt.Color(51, 51, 51));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Checklist_64px.png"))); // NOI18N
        label.setText(" QUẢN LÝ");
        label.setOpaque(true);
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 110));

        jLabel3.setBackground(new java.awt.Color(102, 0, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgchonchucnang.png"))); // NOI18N
        jLabel3.setOpaque(true);
        jLabel3.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jLabel3ComponentRemoved(evt);
            }
        });
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Chức năng khi chọn chủ đề ở comboBox
     *
     * @param evt là sự kiện chuột
     */
    private void chudeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chudeComboBoxActionPerformed
        tenchudeTextField.setText(chudeComboBox.getSelectedItem().toString());
        for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
            if (BienChuongTrinh.dulieutuvung.getBook().get(i).getChude().compareTo(chudeComboBox.getSelectedItem().toString()) == 0) {
                duongdanText.setText(BienChuongTrinh.dulieutuvung.getBook().get(i).getDuongdanFile());
                break;
            }
        }
    }//GEN-LAST:event_chudeComboBoxActionPerformed

    private void tenchudeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenchudeTextFieldActionPerformed

    }//GEN-LAST:event_tenchudeTextFieldActionPerformed

    private void duongdanTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duongdanTextActionPerformed

    }//GEN-LAST:event_duongdanTextActionPerformed

    private void jLabel3ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel3ComponentRemoved

    }//GEN-LAST:event_jLabel3ComponentRemoved

    private void moButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moButtonMouseClicked
        BienChuongTrinh.chudehientai = chudeComboBox.getSelectedItem().toString();
        new QuanLyTuVung().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_moButtonMouseClicked

    private void xoaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaButtonMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa chủ đề này? Mọi dữ liệu từ vựng sẽ bị xóa.") == 0) {
            for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
                if (BienChuongTrinh.dulieutuvung.getBook().get(i).getChude().compareTo(chudeComboBox.getSelectedItem().toString()) == 0) {
                    IOFile.removeFile(BienChuongTrinh.dulieutuvung.getBook().get(i).getDuongdanFile());
                    BienChuongTrinh.dulieutuvung.removeBook(i);
                    break;
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Đã xóa thành công!");
            this.dispose();
            new QuanLy().setVisible(true);
        }
    }//GEN-LAST:event_xoaButtonMouseClicked

    private void themButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themButtonMouseClicked
        new ThemChuDe().setVisible(true);
    }//GEN-LAST:event_themButtonMouseClicked

    private void datlaiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datlaiButtonMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "Việc đặt lại trạng thái các từ của bộ từ hiện tại sẽ chuyển tất cả các từ đã học thành từ mới. Bạn có muốn tiếp tục?") == 0) {
            BienChuongTrinh.chudehientai = chudeComboBox.getSelectedItem().toString();
            for (BoTuVung BTV : BienChuongTrinh.dulieutuvung.getBook()) {
                if (BTV.getChude().compareTo(BienChuongTrinh.chudehientai) == 0) {
                    BTV.reset();
                    JOptionPane.showMessageDialog(rootPane, "Đã thiết lập lại trạng thái thành công!");
                }
            }
        }
    }//GEN-LAST:event_datlaiButtonMouseClicked

    private void capnhatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capnhatButtonMouseClicked
        if (tenchudeTextField.getText().trim().length() == 0 || duongdanText.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng không bỏ trống trường văn bản!");
            return;
        }
        for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
            if (BienChuongTrinh.dulieutuvung.getBook().get(i).getChude().compareTo(chudeComboBox.getSelectedItem().toString()) == 0) {
                BienChuongTrinh.dulieutuvung.getBook().get(i).setChude(tenchudeTextField.getText());
                if (BienChuongTrinh.dulieutuvung.getBook().get(i).getDuongdanFile().compareTo(duongdanText.getText()) != 0) {
                    BienChuongTrinh.dulieutuvung.getBook().get(i).setDuongdanFile(duongdanText.getText());
                    BienChuongTrinh.dulieutuvung.getBook().get(i).getList().removeAll(BienChuongTrinh.dulieutuvung.getBook().get(i).getList());
                    BienChuongTrinh.dulieutuvung.getBook().get(i).setSoluongTu(0);
                    BienChuongTrinh.dulieutuvung.getBook().get(i).setNumberLearnt(0);
                    IOFile.InputNewBook(BienChuongTrinh.dulieutuvung.getBook().get(i), duongdanText.getText());
                }
                break;
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Đã cập nhật thành công!");
        this.dispose();
        new QuanLy().setVisible(true);
    }//GEN-LAST:event_capnhatButtonMouseClicked

    private void chonButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chonButtonMouseClicked
        try {
            JFileChooser filechooser = new JFileChooser();
            filechooser.showOpenDialog(null);
            File file = filechooser.getSelectedFile();

            duongdanText.setText(file.getAbsolutePath());

        } catch (java.lang.NullPointerException ex) {
            System.out.println("Không chọn file nào!");
        }
    }//GEN-LAST:event_chonButtonMouseClicked

    private void ghepButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ghepButtonMouseClicked
        if (BienChuongTrinh.dulieutuvung.getSoluongBotuvung() <= 1) {
            JOptionPane.showMessageDialog(rootPane, "Không đủ số lượng bộ từ để ghép!");
            return;
        }
        moButton.setVisible(false);
        xoaButton.setVisible(false);
        themButton.setVisible(false);
        capnhatButton.setVisible(false);
        duongdanText.setVisible(false);
        chonButton.setVisible(false);
        datlaiButton.setVisible(false);
        filedulieuLabel.setVisible(false);

        if (isUp == true) {
            index2 = chudeComboBox.getSelectedIndex();
            if (index2 == index1) {
                JOptionPane.showMessageDialog(rootPane, "Bạn không thể ghép 1 bộ từ với chính nó!");
                return;
            }
            if (JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn ghép 2 chủ đề trên?") == 0) {
                String tenchudemoi = tenchudeTextField.getText();
                BienChuongTrinh.dulieutuvung.getBook().get(index1).Up(BienChuongTrinh.dulieutuvung.getBook().get(index2), tenchudemoi);
                JOptionPane.showMessageDialog(rootPane, "Đã ghép thành công!");
                if (JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa bộ chủ đề " + BienChuongTrinh.dulieutuvung.getBook().get(index2).getChude() + " ?") == 0) {
                    IOFile.removeFile(BienChuongTrinh.dulieutuvung.getBook().get(index2).getDuongdanFile());
                    BienChuongTrinh.dulieutuvung.removeBook(index2);
                }

                this.dispose();
                new QuanLy().setVisible(true);
                return;
            }
        }

        index1 = chudeComboBox.getSelectedIndex();
        JOptionPane.showMessageDialog(rootPane, "Chọn chủ đề để ghép rồi ấn Ghép.");
        ghepButton.setText("Ghép");
        tenmoiLabel.setVisible(true);
        isUp = true;
    }//GEN-LAST:event_ghepButtonMouseClicked

    private void thoatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatButtonMouseClicked
        this.dispose();
        new ChonChucNang().setVisible(true);
    }//GEN-LAST:event_thoatButtonMouseClicked

    private void thoatButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatButtonMouseMoved
        thoatButton.setBackground(Color.red);
    }//GEN-LAST:event_thoatButtonMouseMoved

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        thoatButton.setBackground(Color.black);
    }//GEN-LAST:event_jLabel3MouseMoved

    private void xoaButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaButtonMouseMoved

    }//GEN-LAST:event_xoaButtonMouseMoved

    private void datlaiButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datlaiButtonMouseMoved

    }//GEN-LAST:event_datlaiButtonMouseMoved

    private void chonButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chonButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_chonButtonMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel capnhatButton;
    private javax.swing.JLabel chonButton;
    private javax.swing.JComboBox<String> chudeComboBox;
    private javax.swing.JLabel datlaiButton;
    private javax.swing.JTextField duongdanText;
    private javax.swing.JLabel filedulieuLabel;
    private javax.swing.JLabel ghepButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel moButton;
    private javax.swing.JTextField tenchudeTextField;
    private javax.swing.JLabel tenmoiLabel;
    private javax.swing.JLabel themButton;
    private javax.swing.JLabel thoatButton;
    private javax.swing.JLabel xoaButton;
    // End of variables declaration//GEN-END:variables
}
