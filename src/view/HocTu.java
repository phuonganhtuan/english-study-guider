package view;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.BienChuongTrinh;
import model.TuVung;
import model.BoTuVung;

/**
 * Lớp giao diện thực hiện chức năng ôn tập từ vựng
 *
 * @author Phương Anh Tuấn + Nguyễn Ngọc Tú
 */
public class HocTu extends javax.swing.JFrame {

    //Số từ đã học
    int learnCount = 0;

    //Số từ đang học
    int LearningCount = 0;

    //1 bộ từ vựng lưu dữ liệu trung gian
    BoTuVung boTV = new BoTuVung();

    //Vị trí của từ tiếp theo - ban đầu bằng -1
    int defaultIndex = -1;

    //Trạng thái tuần tự hay ngẫu nhiên
    boolean isRandom = false;

    //Trạng thái đang học từ mới hay ôn từ cũ
    boolean isNew = false;

    /**
     * Tạo form Hoctu
     */
    public HocTu() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
        jLayeredPane1.setVisible(false);
        sotudaonLabel.setVisible(false);
        tutieptheoButton.setBackground(new Color(255, 255, 255, 100));
        batdauonButton.setBackground(new Color(255, 255, 255, 100));
        label.setBackground(new Color(255, 255, 255, 55));
        chitiet1.setText("");
        chitiet2.setText("");
        chitiet3.setText("");
        for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
            chudeComboBox.addItem(BienChuongTrinh.dulieutuvung.getBook().get(i).getChude());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        chudeComboBox = new javax.swing.JComboBox<>();
        chudeLabel = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        tiengvietLabel = new javax.swing.JLabel();
        tienganhLabel = new javax.swing.JLabel();
        anhminhhoaLabel = new javax.swing.JLabel();
        chitiet1 = new javax.swing.JLabel();
        chitiet2 = new javax.swing.JLabel();
        chitiet3 = new javax.swing.JLabel();
        traloiButton = new javax.swing.JLabel();
        tutieptheoButton = new javax.swing.JLabel();
        sotudaonLabel = new javax.swing.JLabel();
        thutuCombo = new javax.swing.JComboBox<>();
        chedoComboBox = new javax.swing.JComboBox<>();
        batdauonButton = new javax.swing.JLabel();
        thoatButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setBackground(new java.awt.Color(0, 153, 255));
        label.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Open_Book_64px_1.png"))); // NOI18N
        label.setText(" HỌC VÀ ÔN");
        label.setOpaque(true);
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 133));

        chudeComboBox.setBorder(null);
        chudeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chudeComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(chudeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 134, 30));

        chudeLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        chudeLabel.setForeground(new java.awt.Color(51, 51, 51));
        chudeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chudeLabel.setText("Chủ đề:");
        getContentPane().add(chudeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 156, 130, -1));

        jLayeredPane1.setEnabled(false);

        tiengvietLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tiengvietLabel.setForeground(new java.awt.Color(255, 255, 255));
        tiengvietLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tiengvietLabel.setText("Tiếng việt");

        tienganhLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tienganhLabel.setForeground(new java.awt.Color(51, 51, 51));
        tienganhLabel.setText("Tiếng anh");

        anhminhhoaLabel.setMaximumSize(new java.awt.Dimension(100, 100));
        anhminhhoaLabel.setMinimumSize(new java.awt.Dimension(100, 100));

        chitiet1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chitiet1.setForeground(new java.awt.Color(51, 51, 51));
        chitiet1.setText("jLabel3");

        chitiet2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chitiet2.setForeground(new java.awt.Color(51, 51, 51));
        chitiet2.setText("jLabel4");

        chitiet3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chitiet3.setForeground(new java.awt.Color(255, 255, 255));
        chitiet3.setText("jLabel5");
        chitiet3.setAutoscrolls(true);

        traloiButton.setBackground(new java.awt.Color(0, 102, 204));
        traloiButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        traloiButton.setForeground(new java.awt.Color(255, 255, 255));
        traloiButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        traloiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Checkmark_32px_4.png"))); // NOI18N
        traloiButton.setText("TRẢ LỜI");
        traloiButton.setOpaque(true);
        traloiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                traloiButtonMouseClicked(evt);
            }
        });

        tutieptheoButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tutieptheoButton.setForeground(new java.awt.Color(51, 51, 51));
        tutieptheoButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tutieptheoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Right_32px_3.png"))); // NOI18N
        tutieptheoButton.setText("TIẾP THEO");
        tutieptheoButton.setOpaque(true);
        tutieptheoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutieptheoButtonMouseClicked(evt);
            }
        });

        jLayeredPane1.setLayer(tiengvietLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tienganhLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(anhminhhoaLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chitiet1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chitiet2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chitiet3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(traloiButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tutieptheoButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(traloiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tutieptheoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tienganhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(chitiet3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chitiet1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chitiet2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anhminhhoaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addComponent(tiengvietLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiengvietLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tienganhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(chitiet1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chitiet2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(anhminhhoaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chitiet3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(traloiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tutieptheoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 184, 1010, 400));

        sotudaonLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sotudaonLabel.setForeground(new java.awt.Color(255, 255, 255));
        sotudaonLabel.setText("Số từ đã ôn/học: ");
        getContentPane().add(sotudaonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 150, 20));

        thutuCombo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        thutuCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tuần tự", "Ngẫu nhiên" }));
        getContentPane().add(thutuCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 110, 30));

        chedoComboBox.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        chedoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Học từ mới", "Ôn từ đã học" }));
        chedoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chedoComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(chedoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 127, 30));

        batdauonButton.setBackground(new java.awt.Color(51, 51, 51));
        batdauonButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        batdauonButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batdauonButton.setText("Bắt đầu");
        batdauonButton.setOpaque(true);
        batdauonButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batdauonButtonMouseClicked(evt);
            }
        });
        getContentPane().add(batdauonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 90, 30));

        thoatButton.setBackground(new java.awt.Color(0, 0, 0));
        thoatButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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
        getContentPane().add(thoatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgquanlytu.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chudeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chudeComboBoxActionPerformed

    }//GEN-LAST:event_chudeComboBoxActionPerformed

    private void chedoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chedoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chedoComboBoxActionPerformed

    private void traloiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_traloiButtonMouseClicked
        //Hiển thị thông tin chi tiết của từ
        tiengvietLabel.setText(boTV.getList().get(defaultIndex).getVietnamese());
        Icon icon = new ImageIcon(boTV.getList().get(defaultIndex).getExampleImage());
        anhminhhoaLabel.setVisible(true);
        anhminhhoaLabel.setIcon(icon);
        boTV.getList().get(defaultIndex).isAsked = true;

        chitiet1.setText(boTV.getList().get(defaultIndex).toString());
        chitiet2.setText("Từ loại: " + boTV.getList().get(defaultIndex).getType());
        chitiet3.setText("VD: " + boTV.getList().get(defaultIndex).getExampleCase());
        //Gán giá trị cho các biến
        tutieptheoButton.setVisible(true);
        traloiButton.setVisible(false);

        if (isNew) {
            LearningCount++;
        } else {
            learnCount++;
        }

        if (isNew == true) {
            boTV.getList().get(defaultIndex).setIsRead(true);
            boTV.UpSoLuongCu();
            //Trường hợp đã hoàn thành chủ đề
            if (boTV.getNumberLearnt() >= boTV.getSoluongTu()) {
                JOptionPane.showMessageDialog(rootPane, "Chúc mừng bạn đã hoàn thành chủ đề!");
                BienChuongTrinh.dulieuthongke.getThongke().get(0).update(LearningCount, 0);
                this.setVisible(false);
                new ChonChucNang().setVisible(true);
                return;
            }
        } else {
            if (learnCount == boTV.getNumberLearnt()) {
                JOptionPane.showMessageDialog(rootPane, "Chúc mừng bạn đã hoàn thành ôn tập chủ đề!");
                BienChuongTrinh.dulieuthongke.getThongke().get(0).update(0, learnCount);
                this.setVisible(false);
                new ChonChucNang().setVisible(true);
                return;

            }
        }

        //Xóa từ trùng nhau trong mảng từ cũ để chuẩn bị đưa từ vừa trả lời vào
        for (TuVung W : BienChuongTrinh.tuontap.getLearntWord()) {
            if (W.getEnglish().compareTo(boTV.getList().get(defaultIndex).getEnglish()) == 0) {
                BienChuongTrinh.tuontap.remove(W);
                break;
            }
        }

        //Thêm từ vừa rồi vào danh sách từ cũ
        BienChuongTrinh.tuontap.add(boTV.getList().get(defaultIndex));

        //Sinh số vị trí từ tiếp theo
        if (isRandom == true) {
            do {
                do {
                    defaultIndex = (int) (Math.random() * (boTV.getSoluongTu()));
                } while (boTV.getList().get(defaultIndex).isAsked == true);
            } while (boTV.getList().get(defaultIndex).isIsRead() == isNew);
        } else {
            if (defaultIndex == boTV.getSoluongTu()) {
                defaultIndex = 0;
            }
            do {
                defaultIndex++;
            } while (boTV.getList().get(defaultIndex).isIsRead() == isNew);
        }
        if (isNew) {
            sotudaonLabel.setText("Số từ đã học: " + LearningCount);
        } else {
            sotudaonLabel.setText("Số từ đã ôn: " + learnCount);
        }
    }//GEN-LAST:event_traloiButtonMouseClicked

    private void tutieptheoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutieptheoButtonMouseClicked
        tiengvietLabel.setText("???");
        tienganhLabel.setText(boTV.getList().get(defaultIndex).getEnglish());
        tutieptheoButton.setVisible(false);
        traloiButton.setVisible(true);
        chitiet1.setText("");
        chitiet2.setText("");
        chitiet3.setText("");
        anhminhhoaLabel.setIcon(null);
    }//GEN-LAST:event_tutieptheoButtonMouseClicked

    private void batdauonButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batdauonButtonMouseClicked
        if (chedoComboBox.getSelectedItem().toString().compareTo("Học từ mới") == 0) {
            isNew = true;
        } else {
            isNew = false;
        }

        //Lưu dữ liệu bộ chủ đề đã chọn sang biến trung gian
        for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
            if (BienChuongTrinh.dulieutuvung.getBook().get(i).getChude().compareTo(chudeComboBox.getSelectedItem().toString()) == 0) {
                boTV = BienChuongTrinh.dulieutuvung.getBook().get(i);
                break;
            }
        }
        for (int i = 0; i < boTV.getSoluongTu(); i++) {
            boTV.getList().get(i).isAsked = false;
        }
        if (isNew == true) {
            //Xác nhận học lại khi đã hoàn thành chủ đề
            if (boTV.getNumberLearnt() >= boTV.getSoluongTu()) {
                if (JOptionPane.showConfirmDialog(rootPane, "Chủ đề này đã học xong, bạn có muốn học lại từ đầu?") == 0) {
                    for (TuVung W : boTV.getList()) {
                        W.setIsRead(false);
                    }
                    boTV.setNumberLearnt(0);
                } else {
                    //this.dispose();
                    //new ChonChucNang().setVisible(true);
                    return;
                }
            }
        } else {
            if (boTV.getNumberLearnt() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Chủ đề này còn mới, hãy học chúng trước khi ôn!");
                //this.dispose();
                //new ChonChucNang().setVisible(true);
                return;
            }
        }

        sotudaonLabel.setVisible(true);
        batdauonButton.setVisible(false);
        chudeComboBox.setVisible(false);
        thutuCombo.setVisible(false);
        chedoComboBox.setVisible(false);
        //Hiển thị thông tin các thành phần
        chudeLabel.setText("Chủ đề: " + boTV.getChude());
        jLayeredPane1.setVisible(true);
        tiengvietLabel.setText("???");
        tutieptheoButton.setVisible(false);
        anhminhhoaLabel.setVisible(false);

        //Sinh vị trí của từ ôn
        if (thutuCombo.getSelectedItem()
                .toString().compareTo("Ngẫu nhiên") == 0) {
            isRandom = true;
            do {
                defaultIndex = (int) (Math.random() * (boTV.getSoluongTu()));
            } while (boTV.getList().get(defaultIndex).isIsRead() == isNew);
        } else {
            do {
                defaultIndex++;
            } while (boTV.getList().get(defaultIndex).isIsRead() == isNew);
        }

        tienganhLabel.setText(boTV.getList().get(defaultIndex).getEnglish());
    }//GEN-LAST:event_batdauonButtonMouseClicked

    private void thoatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatButtonMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn kết thúc học?") == 0) {
            BienChuongTrinh.dulieuthongke.getThongke().get(0).update(LearningCount, learnCount);
            this.dispose();
            new ChonChucNang().setVisible(true);
        }
    }//GEN-LAST:event_thoatButtonMouseClicked

    private void thoatButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatButtonMouseMoved
        thoatButton.setBackground(Color.red);
    }//GEN-LAST:event_thoatButtonMouseMoved

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        thoatButton.setBackground(Color.black);
    }//GEN-LAST:event_jLabel1MouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anhminhhoaLabel;
    private javax.swing.JLabel batdauonButton;
    private javax.swing.JComboBox<String> chedoComboBox;
    private javax.swing.JLabel chitiet1;
    private javax.swing.JLabel chitiet2;
    private javax.swing.JLabel chitiet3;
    private javax.swing.JComboBox<String> chudeComboBox;
    private javax.swing.JLabel chudeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel sotudaonLabel;
    private javax.swing.JLabel thoatButton;
    private javax.swing.JComboBox<String> thutuCombo;
    private javax.swing.JLabel tienganhLabel;
    private javax.swing.JLabel tiengvietLabel;
    private javax.swing.JLabel traloiButton;
    private javax.swing.JLabel tutieptheoButton;
    // End of variables declaration//GEN-END:variables
}
