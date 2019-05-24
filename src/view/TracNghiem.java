package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.BienChuongTrinh;
import model.BoTuVung;

/**
 * đại diện cho chức năng ôn từ bằng trắc nghiệm câu hỏi
 *
 * @author Phương Anh Tuấn
 */
public class TracNghiem extends javax.swing.JFrame {

    //Biến xét trạng thái trắc nghiệm xuôi hay ngược
    boolean isInvert = false;

    //Bộ từ vựng dùng làm biến nhớ tạm
    BoTuVung boTV = new BoTuVung();

    //Số lượng câu đã hỏi
    int soluongcauHoi = 0;

    //Số lượng câu trả lời sai
    int soluongcauSai = 0;

    //Vị trí đáp án chứa kết quả đúng
    int nutTrue = -1;

    //Vị trí đấp án trong danh sách từ
    int dung = -1;

    //Vị trí đáp án sai thứ nhất
    int sai1 = -1;

    //Vị trí đáp án sai thứ hai
    int sai2 = -1;

    //Vị trí đáp án sai thứ ba
    int sai3 = -1;

    //Vị trí từ dùng làm biến tạm
    int index;

    //Xét xem 1 nút đáp án đã được click hay chưa
    boolean isClicked = false;

    /**
     * Hàm khởi tạo câu hỏi mới
     */
    public void TaoCauHoi() {

        //Thiết lập giá trị cho đáp án đúng và các đáp án sai
        do {
            do {
                index = (int) (Math.random() * boTV.getSoluongTu());
            } while (boTV.getList().get(index).isIsRead() == false);

        } while (boTV.getList().get(index).isAsked == true);

        dung = index;
        do {
            sai1 = (int) (Math.random() * boTV.getSoluongTu());

        } while (sai1 == dung);
        do {
            sai2 = (int) (Math.random() * boTV.getSoluongTu());

        } while (sai2 == sai1 || sai2 == dung);
        do {
            sai3 = (int) (Math.random() * boTV.getSoluongTu());

        } while (sai3 == sai2 || sai3 == sai1 || sai3 == dung);

        //Thiết lập vị trí nút chứa đáp án đúng trong 4 nút đáp án
        nutTrue = (int) (Math.random() * 4);

        //Ghi thông tin cho câu hỏi và các đáp án
        switch (nutTrue) {
            case 0:
                if (isInvert == true) {
                    da1Button.setText(boTV.getList().get(dung).getEnglish());
                    da2Button.setText(boTV.getList().get(sai1).getEnglish());
                    da3Button.setText(boTV.getList().get(sai2).getEnglish());
                    da4Button.setText(boTV.getList().get(sai3).getEnglish());
                    cauhoiLabel.setText(boTV.getList().get(dung).getVietnamese());
                } else {
                    da1Button.setText(boTV.getList().get(dung).getVietnamese());
                    da2Button.setText(boTV.getList().get(sai1).getVietnamese());
                    da3Button.setText(boTV.getList().get(sai2).getVietnamese());
                    da4Button.setText(boTV.getList().get(sai3).getVietnamese());
                    cauhoiLabel.setText(boTV.getList().get(dung).getEnglish());
                }
                break;
            case 1:
                if (isInvert == true) {
                    da1Button.setText(boTV.getList().get(sai1).getEnglish());
                    da2Button.setText(boTV.getList().get(dung).getEnglish());
                    da3Button.setText(boTV.getList().get(sai2).getEnglish());
                    da4Button.setText(boTV.getList().get(sai3).getEnglish());
                    cauhoiLabel.setText(boTV.getList().get(dung).getVietnamese());
                } else {
                    da1Button.setText(boTV.getList().get(sai1).getVietnamese());
                    da2Button.setText(boTV.getList().get(dung).getVietnamese());
                    da3Button.setText(boTV.getList().get(sai2).getVietnamese());
                    da4Button.setText(boTV.getList().get(sai3).getVietnamese());
                    cauhoiLabel.setText(boTV.getList().get(dung).getEnglish());
                }
                break;
            case 2:
                if (isInvert == true) {
                    da1Button.setText(boTV.getList().get(sai1).getEnglish());
                    da2Button.setText(boTV.getList().get(sai2).getEnglish());
                    da3Button.setText(boTV.getList().get(dung).getEnglish());
                    da4Button.setText(boTV.getList().get(sai3).getEnglish());
                    cauhoiLabel.setText(boTV.getList().get(dung).getVietnamese());
                } else {
                    da1Button.setText(boTV.getList().get(sai1).getVietnamese());
                    da2Button.setText(boTV.getList().get(sai2).getVietnamese());
                    da3Button.setText(boTV.getList().get(dung).getVietnamese());
                    da4Button.setText(boTV.getList().get(sai3).getVietnamese());
                    cauhoiLabel.setText(boTV.getList().get(dung).getEnglish());
                }
                break;
            case 3:
                if (isInvert == true) {
                    da1Button.setText(boTV.getList().get(sai1).getEnglish());
                    da2Button.setText(boTV.getList().get(sai2).getEnglish());
                    da3Button.setText(boTV.getList().get(sai3).getEnglish());
                    da4Button.setText(boTV.getList().get(dung).getEnglish());
                    cauhoiLabel.setText(boTV.getList().get(dung).getVietnamese());
                } else {
                    da1Button.setText(boTV.getList().get(sai1).getVietnamese());
                    da2Button.setText(boTV.getList().get(sai2).getVietnamese());
                    da3Button.setText(boTV.getList().get(sai3).getVietnamese());
                    da4Button.setText(boTV.getList().get(dung).getVietnamese());
                    cauhoiLabel.setText(boTV.getList().get(dung).getEnglish());
                }
                break;
            default:
                System.out.println("Có lỗi trong quá trình tạo câu hỏi.");
                break;
        }
        cauLabel.setText("Câu " + (soluongcauHoi + 1) + "/ " + boTV.getNumberLearnt() + ": ");
    }

    /**
     * Khởi tạo Frame trắc nghiệm mới
     */
    public TracNghiem() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
        label.setBackground(new Color(255, 255, 255, 55));
        da1Button.setBackground(Color.GRAY);
        da2Button.setBackground(Color.GRAY);
        da3Button.setBackground(Color.GRAY);
        da4Button.setBackground(Color.GRAY);
        batdauButton.setBackground(new Color(255, 255, 255, 100));
        tiepButton.setVisible(false);
        //Cập nhật cho bảng chọn chủ đề
        for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
            chudeCombo.addItem(BienChuongTrinh.dulieutuvung.getBook().get(i).getChude());
        }
        tracnghiemLayer.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chudeCombo = new javax.swing.JComboBox<>();
        chudeLabel = new javax.swing.JLabel();
        tracnghiemLayer = new javax.swing.JLayeredPane();
        cauLabel = new javax.swing.JLabel();
        cauhoiLabel = new javax.swing.JLabel();
        causaiLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        da1Button = new javax.swing.JLabel();
        da2Button = new javax.swing.JLabel();
        da3Button = new javax.swing.JLabel();
        da4Button = new javax.swing.JLabel();
        tiepButton = new javax.swing.JLabel();
        nguocCheckBox = new javax.swing.JCheckBox();
        batdauButton = new javax.swing.JLabel();
        thoatButton = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chudeCombo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        chudeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        chudeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chudeComboActionPerformed(evt);
            }
        });
        getContentPane().add(chudeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 135, 146, 30));

        chudeLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        chudeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chudeLabel.setText("Chủ đề:");
        getContentPane().add(chudeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 138, 94, -1));

        cauLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cauLabel.setForeground(new java.awt.Color(255, 255, 255));
        cauLabel.setText("Câu 1:");

        cauhoiLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        cauhoiLabel.setForeground(new java.awt.Color(255, 255, 255));
        cauhoiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cauhoiLabel.setText("ENGLISH");

        causaiLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        causaiLabel.setForeground(new java.awt.Color(255, 255, 255));
        causaiLabel.setText("Số câu sai: 0");

        da1Button.setBackground(new java.awt.Color(102, 102, 102));
        da1Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        da1Button.setForeground(new java.awt.Color(255, 255, 255));
        da1Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        da1Button.setText("jLabel1");
        da1Button.setOpaque(true);
        da1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                da1ButtonMouseClicked(evt);
            }
        });

        da2Button.setBackground(new java.awt.Color(102, 102, 102));
        da2Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        da2Button.setForeground(new java.awt.Color(255, 255, 255));
        da2Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        da2Button.setText("jLabel2");
        da2Button.setOpaque(true);
        da2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                da2ButtonMouseClicked(evt);
            }
        });

        da3Button.setBackground(new java.awt.Color(102, 102, 102));
        da3Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        da3Button.setForeground(new java.awt.Color(255, 255, 255));
        da3Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        da3Button.setText("jLabel3");
        da3Button.setOpaque(true);
        da3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                da3ButtonMouseClicked(evt);
            }
        });

        da4Button.setBackground(new java.awt.Color(102, 102, 102));
        da4Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        da4Button.setForeground(new java.awt.Color(255, 255, 255));
        da4Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        da4Button.setText("jLabel4");
        da4Button.setOpaque(true);
        da4Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                da4ButtonMouseClicked(evt);
            }
        });

        tiepButton.setBackground(new java.awt.Color(0, 153, 255));
        tiepButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tiepButton.setForeground(new java.awt.Color(255, 255, 255));
        tiepButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiepButton.setText("Tiếp theo");
        tiepButton.setOpaque(true);
        tiepButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiepButtonMouseClicked(evt);
            }
        });

        tracnghiemLayer.setLayer(cauLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tracnghiemLayer.setLayer(cauhoiLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tracnghiemLayer.setLayer(causaiLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tracnghiemLayer.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tracnghiemLayer.setLayer(da1Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tracnghiemLayer.setLayer(da2Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tracnghiemLayer.setLayer(da3Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tracnghiemLayer.setLayer(da4Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tracnghiemLayer.setLayer(tiepButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout tracnghiemLayerLayout = new javax.swing.GroupLayout(tracnghiemLayer);
        tracnghiemLayer.setLayout(tracnghiemLayerLayout);
        tracnghiemLayerLayout.setHorizontalGroup(
            tracnghiemLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tracnghiemLayerLayout.createSequentialGroup()
                .addGroup(tracnghiemLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tracnghiemLayerLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(tracnghiemLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(da2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(da1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(da3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(da4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tracnghiemLayerLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(tracnghiemLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tracnghiemLayerLayout.createSequentialGroup()
                                .addComponent(cauLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(causaiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tracnghiemLayerLayout.createSequentialGroup()
                                .addComponent(cauhoiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 55, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tracnghiemLayerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tiepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        tracnghiemLayerLayout.setVerticalGroup(
            tracnghiemLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tracnghiemLayerLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tracnghiemLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(causaiLabel)
                    .addComponent(cauLabel))
                .addGap(18, 18, 18)
                .addComponent(cauhoiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(da1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(da2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(da3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(da4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tiepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(tracnghiemLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 196, -1, 340));

        nguocCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        nguocCheckBox.setText("Trắc nghiệm Việt - Anh");
        getContentPane().add(nguocCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 178, 218, 20));

        batdauButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        batdauButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batdauButton.setText("Bắt đầu");
        batdauButton.setOpaque(true);
        batdauButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batdauButtonMouseClicked(evt);
            }
        });
        getContentPane().add(batdauButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 80, 40));

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
        getContentPane().add(thoatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 30, 30));

        label.setBackground(new java.awt.Color(255, 153, 51));
        label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Pass_Fail_64px_1.png"))); // NOI18N
        label.setText("TRẮC NGHIỆM ÔN TẬP");
        label.setOpaque(true);
        label.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labelMouseMoved(evt);
            }
        });
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgtracnghiem.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chudeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chudeComboActionPerformed

    }//GEN-LAST:event_chudeComboActionPerformed

    private void da1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_da1ButtonMouseClicked
        tiepButton.setVisible(true);
        if (isClicked == true) {
            return;
        }
        if (isInvert == false) {
            if (da1Button.getText().compareTo(boTV.getList().get(dung).getVietnamese()) == 0) {
                da1Button.setBackground(Color.GREEN);

            } else {
                da1Button.setBackground(Color.red);
                switch (nutTrue) {
                    case 1:
                        da2Button.setBackground(Color.green);
                        break;
                    case 2:
                        da3Button.setBackground(Color.green);
                        break;
                    case 3:
                        da4Button.setBackground(Color.green);
                        break;
                    default:
                        break;
                }
                soluongcauSai++;
                causaiLabel.setText("Số câu sai: " + soluongcauSai);
            }
        } else {
            if (da1Button.getText().compareTo(boTV.getList().get(dung).getEnglish()) == 0) {
                da1Button.setBackground(Color.GREEN);

            } else {
                da1Button.setBackground(Color.red);
                switch (nutTrue) {
                    case 1:
                        da2Button.setBackground(Color.green);
                        break;
                    case 2:
                        da3Button.setBackground(Color.green);
                        break;
                    case 3:
                        da4Button.setBackground(Color.green);
                        break;
                    default:
                        break;
                }
                soluongcauSai++;
                causaiLabel.setText("Số câu sai: " + soluongcauSai);
            }
        }
        tiepButton.setVisible(true);
        isClicked = true;
    }//GEN-LAST:event_da1ButtonMouseClicked

    private void da2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_da2ButtonMouseClicked
        tiepButton.setVisible(true);
        if (isClicked == true) {
            return;
        }
        if (isInvert == false) {
            if (da2Button.getText().compareTo(boTV.getList().get(dung).getVietnamese()) == 0) {
                da2Button.setBackground(Color.GREEN);

            } else {
                da2Button.setBackground(Color.red);
                switch (nutTrue) {
                    case 0:
                        da1Button.setBackground(Color.green);
                        break;
                    case 2:
                        da3Button.setBackground(Color.green);
                        break;
                    case 3:
                        da4Button.setBackground(Color.green);
                        break;
                    default:
                        break;
                }
                soluongcauSai++;
                causaiLabel.setText("Số câu sai: " + soluongcauSai);
            }
        } else {
            if (da2Button.getText().compareTo(boTV.getList().get(dung).getEnglish()) == 0) {
                da2Button.setBackground(Color.GREEN);

            } else {
                da2Button.setBackground(Color.red);
                switch (nutTrue) {
                    case 0:
                        da1Button.setBackground(Color.green);
                        break;
                    case 2:
                        da3Button.setBackground(Color.green);
                        break;
                    case 3:
                        da4Button.setBackground(Color.green);
                        break;
                    default:
                        break;
                }
                soluongcauSai++;
                causaiLabel.setText("Số câu sai: " + soluongcauSai);
            }
        }

        tiepButton.setVisible(true);
        isClicked = true;
    }//GEN-LAST:event_da2ButtonMouseClicked

    private void da3ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_da3ButtonMouseClicked
        tiepButton.setVisible(true);
        if (isClicked == true) {
            return;
        }
        if (isInvert == false) {
            if (da3Button.getText().compareTo(boTV.getList().get(dung).getVietnamese()) == 0) {
                da3Button.setBackground(Color.GREEN);

            } else {
                da3Button.setBackground(Color.red);
                switch (nutTrue) {
                    case 0:
                        da1Button.setBackground(Color.green);
                        break;
                    case 1:
                        da2Button.setBackground(Color.green);
                        break;
                    case 3:
                        da4Button.setBackground(Color.green);
                        break;
                    default:
                        break;
                }
                soluongcauSai++;
                causaiLabel.setText("Số câu sai: " + soluongcauSai);
            }
        } else {
            if (da3Button.getText().compareTo(boTV.getList().get(dung).getEnglish()) == 0) {
                da3Button.setBackground(Color.GREEN);

            } else {
                da3Button.setBackground(Color.red);
                switch (nutTrue) {
                    case 0:
                        da1Button.setBackground(Color.green);
                        break;
                    case 1:
                        da2Button.setBackground(Color.green);
                        break;
                    case 3:
                        da4Button.setBackground(Color.green);
                        break;
                    default:
                        break;
                }
                soluongcauSai++;
                causaiLabel.setText("Số câu sai: " + soluongcauSai);
            }
        }
        tiepButton.setVisible(true);
        isClicked = true;
    }//GEN-LAST:event_da3ButtonMouseClicked

    private void da4ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_da4ButtonMouseClicked
        tiepButton.setVisible(true);
        if (isClicked == true) {
            return;
        }
        if (isInvert == false) {
            if (da4Button.getText().compareTo(boTV.getList().get(dung).getVietnamese()) == 0) {
                da4Button.setBackground(Color.GREEN);

            } else {
                da4Button.setBackground(Color.red);
                switch (nutTrue) {
                    case 0:
                        da1Button.setBackground(Color.green);
                        break;
                    case 1:
                        da2Button.setBackground(Color.green);
                        break;
                    case 2:
                        da3Button.setBackground(Color.green);
                        break;
                    default:
                        break;
                }
                soluongcauSai++;
                causaiLabel.setText("Số câu sai: " + soluongcauSai);
            }
        } else {
            if (da4Button.getText().compareTo(boTV.getList().get(dung).getEnglish()) == 0) {
                da4Button.setBackground(Color.GREEN);

            } else {
                da4Button.setBackground(Color.red);
                switch (nutTrue) {
                    case 0:
                        da1Button.setBackground(Color.green);
                        break;
                    case 1:
                        da2Button.setBackground(Color.green);
                        break;
                    case 2:
                        da3Button.setBackground(Color.green);
                        break;
                    default:
                        break;
                }
                soluongcauSai++;
                causaiLabel.setText("Số câu sai: " + soluongcauSai);
            }
        }
        tiepButton.setVisible(true);
        isClicked = true;
    }//GEN-LAST:event_da4ButtonMouseClicked

    private void batdauButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batdauButtonMouseClicked
        //Lưu dữ liệu bộ chủ đề đã chọn sang biến trung gian
        if (chudeCombo.getSelectedItem().toString().compareTo("Tất cả") == 0) {
            BoTuVung temp = new BoTuVung();
            temp.setList(BienChuongTrinh.tuontap.getLearntWord());
            temp.setSoluongTu(BienChuongTrinh.tuontap.getSoluongTu());
            temp.setNumberLearnt(BienChuongTrinh.tuontap.getSoluongTu());
            temp.setChude("Tất cả");
            for (int i = 0; i < temp.getSoluongTu(); i++) {
                temp.getList().get(i).setIsRead(true);
            }
            if (temp.getSoluongTu() < 4) {
                JOptionPane.showMessageDialog(rootPane, "Không đủ số lượng từ cũ để tạo câu hỏi!");
                return;
            }
            boTV = temp;
            chudeLabel.setText("Tổng hợp");
        } else {
            for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
                if (BienChuongTrinh.dulieutuvung.getBook().get(i).getChude().compareTo(chudeCombo.getSelectedItem().toString()) == 0) {
                    boTV = BienChuongTrinh.dulieutuvung.getBook().get(i);
                    break;
                }
            }
            chudeLabel.setText(boTV.getChude());
        }
        if (boTV.getSoluongTu() < 4) {
            JOptionPane.showMessageDialog(rootPane, "Không đủ số lượng từ cũ để tạo câu hỏi!");
            return;
        }

        //Reset giá trị thành chưa được hỏi cho tất cả các từ
        for (int i = 0; i < boTV.getSoluongTu(); i++) {
            boTV.getList().get(i).isAsked = false;
        }

        //Thiết lập các nút và label
        tracnghiemLayer.setVisible(true);
        chudeCombo.setVisible(false);
        batdauButton.setVisible(false);

        nguocCheckBox.setVisible(false);
        tiepButton.setVisible(false);

        if (nguocCheckBox.isSelected()) {
            isInvert = true;
        }

        //Tạo câu hỏi
        TaoCauHoi();
    }//GEN-LAST:event_batdauButtonMouseClicked

    private void tiepButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiepButtonMouseClicked
        soluongcauHoi++;

        //Xử lý khi hoàn thành trắc nghiệm
        if (soluongcauHoi >= boTV.getNumberLearnt()) {
            this.dispose();
            new ChonChucNang().setVisible(true);
            HoanThanhTracNghiem HTTN = new HoanThanhTracNghiem(true, soluongcauHoi, soluongcauSai, boTV.getChude(), boTV.getNumberLearnt());
            HTTN.setVisible(true);
        } else {
            boTV.getList().get(index).isAsked = true;
            da1Button.setBackground(Color.GRAY);
            da2Button.setBackground(Color.GRAY);
            da3Button.setBackground(Color.GRAY);
            da4Button.setBackground(Color.GRAY);
            TaoCauHoi();
        }

        isClicked = false;
        tiepButton.setVisible(false);
    }//GEN-LAST:event_tiepButtonMouseClicked

    private void thoatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatButtonMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn thoát?") == 0) {
            this.dispose();
            new ChonChucNang().setVisible(true);
            //Hiện bảng kết quả
            HoanThanhTracNghiem HTTN = new HoanThanhTracNghiem(false, soluongcauHoi, soluongcauSai, boTV.getChude(), boTV.getNumberLearnt());
            HTTN.setVisible(true);
        }
    }//GEN-LAST:event_thoatButtonMouseClicked

    private void thoatButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatButtonMouseMoved
        thoatButton.setBackground(Color.red);
    }//GEN-LAST:event_thoatButtonMouseMoved

    private void labelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseMoved
        thoatButton.setBackground(Color.black);
    }//GEN-LAST:event_labelMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batdauButton;
    private javax.swing.JLabel cauLabel;
    private javax.swing.JLabel cauhoiLabel;
    private javax.swing.JLabel causaiLabel;
    private javax.swing.JComboBox<String> chudeCombo;
    private javax.swing.JLabel chudeLabel;
    private javax.swing.JLabel da1Button;
    private javax.swing.JLabel da2Button;
    private javax.swing.JLabel da3Button;
    private javax.swing.JLabel da4Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label;
    private javax.swing.JCheckBox nguocCheckBox;
    private javax.swing.JLabel thoatButton;
    private javax.swing.JLabel tiepButton;
    private javax.swing.JLayeredPane tracnghiemLayer;
    // End of variables declaration//GEN-END:variables
}
