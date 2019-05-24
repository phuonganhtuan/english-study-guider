package view;

import controller.IOFile;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.BienChuongTrinh;
import model.DuLieuTuVung;
import model.TuOnTap;
import model.TuVung;

/**
 * Lớp Frame đồ họa thể hiện các chức năng chính của chương trình
 *
 * @author Phương Anh Tuấn
 */
public class ChonChucNang extends javax.swing.JFrame {

    /**
     * Khởi tạo form Chonchucnang
     */
    public ChonChucNang() {
        initComponents();
        luuHint.setVisible(false);
        khoiphucHint.setVisible(false);

        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());

        label.setBackground(new Color(255, 255, 255, 55));
        hoctuJoin2.setBackground(new Color(255, 255, 255, 65));
        hoctuJoin2.setVisible(false);
        tucuJoin2.setBackground(new Color(255, 255, 255, 65));
        tucuJoin2.setVisible(false);
        tracnghiemJoin2.setBackground(new Color(255, 255, 255, 65));
        tracnghiemJoin2.setVisible(false);
        quanlyJoin2.setBackground(new Color(255, 255, 255, 65));
        quanlyJoin2.setVisible(false);
        thongkeJoin2.setBackground(new Color(255, 255, 255, 65));
        thongkeJoin2.setVisible(false);
        thongtinJoin1.setBackground(new Color(255, 255, 255, 65));
        thongtinJoin1.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        khoiphucLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JLabel();
        khoiphucHint = new javax.swing.JLabel();
        luuHint = new javax.swing.JLabel();
        hoctuLabel = new javax.swing.JLabel();
        dahocLabel = new javax.swing.JLabel();
        tracnghiemLabel = new javax.swing.JLabel();
        quanlyLabel = new javax.swing.JLabel();
        thongkeLabel = new javax.swing.JLabel();
        thongtinLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        thongtinJoin = new javax.swing.JLabel();
        thongtinJoin1 = new javax.swing.JLabel();
        hoctuJoin1 = new javax.swing.JLabel();
        hoctuJoin2 = new javax.swing.JLabel();
        tucuJoin1 = new javax.swing.JLabel();
        tucuJoin2 = new javax.swing.JLabel();
        tracnghiemJoin1 = new javax.swing.JLabel();
        tracnghiemJoin2 = new javax.swing.JLabel();
        quanlyJoin1 = new javax.swing.JLabel();
        quanlyJoin2 = new javax.swing.JLabel();
        thongkeJoin1 = new javax.swing.JLabel();
        thongkeJoin2 = new javax.swing.JLabel();
        thoatButton = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setBackground(new java.awt.Color(102, 0, 153));
        jLabel2.setOpaque(true);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(400, 100));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        khoiphucLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        khoiphucLabel.setForeground(new java.awt.Color(255, 255, 255));
        khoiphucLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        khoiphucLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Reset_24px_1.png"))); // NOI18N
        khoiphucLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                khoiphucLabelMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                khoiphucLabelMouseMoved(evt);
            }
        });
        khoiphucLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khoiphucLabelMouseClicked(evt);
            }
        });
        getContentPane().add(khoiphucLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, 40, 40));

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Restart_24px.png"))); // NOI18N
        saveButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                saveButtonMouseMoved(evt);
            }
        });
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 730, 30, 40));

        khoiphucHint.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        khoiphucHint.setForeground(new java.awt.Color(255, 255, 255));
        khoiphucHint.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        khoiphucHint.setText("Khôi phục dữ liệu");
        getContentPane().add(khoiphucHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 730, 120, 40));

        luuHint.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        luuHint.setForeground(new java.awt.Color(255, 255, 255));
        luuHint.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        luuHint.setText("Lưu dữ liệu");
        getContentPane().add(luuHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 730, 90, 40));

        hoctuLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        hoctuLabel.setForeground(new java.awt.Color(51, 51, 51));
        hoctuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoctuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Open_Book_64px_1.png"))); // NOI18N
        getContentPane().add(hoctuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 90, 80));

        dahocLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dahocLabel.setForeground(new java.awt.Color(51, 51, 51));
        dahocLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dahocLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Book_64px_1.png"))); // NOI18N
        getContentPane().add(dahocLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 80, 80));

        tracnghiemLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tracnghiemLabel.setForeground(new java.awt.Color(51, 51, 51));
        tracnghiemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tracnghiemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Pass_Fail_64px_1.png"))); // NOI18N
        getContentPane().add(tracnghiemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 100, 80));

        quanlyLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        quanlyLabel.setForeground(new java.awt.Color(51, 51, 51));
        quanlyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quanlyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Checklist_64px.png"))); // NOI18N
        getContentPane().add(quanlyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 90, 80));

        thongkeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        thongkeLabel.setForeground(new java.awt.Color(51, 51, 51));
        thongkeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thongkeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Combo_Chart_64px_1.png"))); // NOI18N
        getContentPane().add(thongkeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 100, 80));

        thongtinLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        thongtinLabel.setForeground(new java.awt.Color(51, 51, 51));
        thongtinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thongtinLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_User_64px.png"))); // NOI18N
        getContentPane().add(thongtinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 80, 80));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HỌC VÀ ÔN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 260, 42));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TỪ VỰNG ĐÃ HỌC");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 260, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TRẮC NGHIỆM ÔN TẬP");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 260, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("QUẢN LÝ TỪ VỰNG");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 260, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("THỐNG KÊ DỮ LIỆU");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 260, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("THÔNG TIN");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 260, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ôn từ, học từ vựng theo chủ đề");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 260, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Xem từ vựng hằng ngày, tra cứu từ cũ..");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 260, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ôn từ vựng trắc nghiệm xuôi, ngược..");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 260, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Quản lý chủ đề, quản lý từ, xuất excel..");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 260, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Thống kê số từ học/ôn theo ngày");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 260, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Thông tin tác giả, chương trình");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, 260, 30));

        thongtinJoin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                thongtinJoinMouseMoved(evt);
            }
        });
        thongtinJoin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongtinJoinMouseClicked(evt);
            }
        });
        getContentPane().add(thongtinJoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 260, 170));

        thongtinJoin1.setOpaque(true);
        thongtinJoin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongtinJoin1MouseClicked(evt);
            }
        });
        getContentPane().add(thongtinJoin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 260, 170));

        hoctuJoin1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoctuJoin1MouseMoved(evt);
            }
        });
        hoctuJoin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hoctuJoin1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoctuJoin1MouseExited(evt);
            }
        });
        getContentPane().add(hoctuJoin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 260, 170));

        hoctuJoin2.setOpaque(true);
        hoctuJoin2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoctuJoin2MouseMoved(evt);
            }
        });
        hoctuJoin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hoctuJoin2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoctuJoin2MouseExited(evt);
            }
        });
        getContentPane().add(hoctuJoin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 260, 170));

        tucuJoin1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tucuJoin1MouseMoved(evt);
            }
        });
        tucuJoin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tucuJoin1MouseClicked(evt);
            }
        });
        getContentPane().add(tucuJoin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 260, 170));

        tucuJoin2.setOpaque(true);
        tucuJoin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tucuJoin2MouseClicked(evt);
            }
        });
        getContentPane().add(tucuJoin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 260, 170));

        tracnghiemJoin1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tracnghiemJoin1MouseMoved(evt);
            }
        });
        tracnghiemJoin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tracnghiemJoin1MouseClicked(evt);
            }
        });
        getContentPane().add(tracnghiemJoin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 260, 170));

        tracnghiemJoin2.setOpaque(true);
        tracnghiemJoin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tracnghiemJoin2MouseClicked(evt);
            }
        });
        getContentPane().add(tracnghiemJoin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 260, 170));

        quanlyJoin1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                quanlyJoin1MouseMoved(evt);
            }
        });
        quanlyJoin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanlyJoin1MouseClicked(evt);
            }
        });
        getContentPane().add(quanlyJoin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 260, 170));

        quanlyJoin2.setOpaque(true);
        quanlyJoin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanlyJoin2MouseClicked(evt);
            }
        });
        getContentPane().add(quanlyJoin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 260, 170));

        thongkeJoin1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                thongkeJoin1MouseMoved(evt);
            }
        });
        thongkeJoin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongkeJoin1MouseClicked(evt);
            }
        });
        getContentPane().add(thongkeJoin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 260, 170));

        thongkeJoin2.setOpaque(true);
        thongkeJoin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongkeJoin2MouseClicked(evt);
            }
        });
        getContentPane().add(thongkeJoin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 260, 170));

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
        getContentPane().add(thoatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 30, 30));

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label.setForeground(new java.awt.Color(51, 51, 51));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText(" PHẦN MỀM HỌC TIẾNG ANH");
        label.setOpaque(true);
        label.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labelMouseMoved(evt);
            }
        });
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 150));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgchonchucnang.png"))); // NOI18N
        jLabel15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel15MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel15MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Chức năng khôi phục dữ liệu
     *
     * @param evt sự kiện
     */
    private void khoiphucLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khoiphucLabelMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "Khôi phục lại dữ liệu về thời điểm gần đây nhất truy cập chương trình? Chú ý: những chủ đề đã xóa không thể khôi phục!") == 0) {

            //Làm mới dữ liệu trong các biến hiện tại
            DuLieuTuVung temp1 = new DuLieuTuVung();
            TuOnTap temp2 = new TuOnTap();

            BienChuongTrinh.dulieutuvung = temp1;
            BienChuongTrinh.tuontap = temp2;

            try {
                //Nhập lại dữ liệu từ file nguồn
                IOFile.InputBook(BienChuongTrinh.dulieutuvung);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ChonChucNang.class.getName()).log(Level.SEVERE, null, ex);
            }
            IOFile.InputWord(BienChuongTrinh.dulieutuvung);
            IOFile.InputOldWords(BienChuongTrinh.tuontap);
            for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
                for (TuVung W : BienChuongTrinh.dulieutuvung.getBook().get(i).getList()) {
                    if (W.isIsRead() == true) {
                        BienChuongTrinh.dulieutuvung.getBook().get(i).UpSoLuongCu();
                    }
                }
            }
            BienChuongTrinh.dulieuthongke.reset();
            IOFile.InputDataStatistic(BienChuongTrinh.dulieuthongke);
            IOFile.InputTuMoiNgay(BienChuongTrinh.dulieutuvung);

            JOptionPane.showMessageDialog(rootPane, "Khôi phục dữ liệu thành công");

        }
    }//GEN-LAST:event_khoiphucLabelMouseClicked

    /**
     * Chức năng lưu dữ liệu ra file nguồn
     *
     * @param evt sự kiện
     */
    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn lưu lại dữ liệu không?") == 0) {
            try {
                //Ghi dữ liệu mới ra file nguồn
                IOFile.OutputBook(BienChuongTrinh.dulieutuvung);
                IOFile.OutputWord(BienChuongTrinh.dulieutuvung);
                IOFile.OutputOldWords(BienChuongTrinh.tuontap);
                IOFile.OutputTuMoiNgay(BienChuongTrinh.dulieutuvung);
                JOptionPane.showMessageDialog(rootPane, "Đã lưu dữ liệu!");
            } catch (IOException ex) {
                Logger.getLogger(ChonChucNang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    /**
     * Hiệu ứng di chuyển chuột vào nhãn khôi phục
     *
     * @param evt sự kiện
     */
    private void khoiphucLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khoiphucLabelMouseMoved
        khoiphucHint.setVisible(true);
    }//GEN-LAST:event_khoiphucLabelMouseMoved

    private void khoiphucLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khoiphucLabelMouseDragged

    }//GEN-LAST:event_khoiphucLabelMouseDragged

    /**
     * Hiệu ứng di chuyển chuột vào nhãn lưu dữ liệu
     *
     * @param evt sự kiện
     */
    private void saveButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseMoved
        luuHint.setVisible(true);
    }//GEN-LAST:event_saveButtonMouseMoved

    private void labelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseMoved
        thoatButton.setBackground(Color.black);
    }//GEN-LAST:event_labelMouseMoved

    private void hoctuJoin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoctuJoin1MouseClicked
        new HocTu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hoctuJoin1MouseClicked

    private void tucuJoin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tucuJoin1MouseClicked
        new TuDaHoc().setVisible(true);
    }//GEN-LAST:event_tucuJoin1MouseClicked

    private void tracnghiemJoin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tracnghiemJoin1MouseClicked
        new TracNghiem().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tracnghiemJoin1MouseClicked

    private void quanlyJoin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanlyJoin1MouseClicked
        new QuanLy().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_quanlyJoin1MouseClicked

    private void thongkeJoin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeJoin1MouseClicked
        new ThongKeTatCa().setVisible(true);
    }//GEN-LAST:event_thongkeJoin1MouseClicked

    private void thongtinJoinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongtinJoinMouseClicked
        new ThongTin().setVisible(true);
    }//GEN-LAST:event_thongtinJoinMouseClicked

    private void hoctuJoin1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoctuJoin1MouseMoved
        hoctuJoin2.setVisible(true);
    }//GEN-LAST:event_hoctuJoin1MouseMoved

    private void hoctuJoin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoctuJoin1MouseExited

    }//GEN-LAST:event_hoctuJoin1MouseExited

    private void hoctuJoin2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoctuJoin2MouseMoved

    }//GEN-LAST:event_hoctuJoin2MouseMoved

    private void hoctuJoin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoctuJoin2MouseClicked

    }//GEN-LAST:event_hoctuJoin2MouseClicked

    private void hoctuJoin2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoctuJoin2MouseExited

    }//GEN-LAST:event_hoctuJoin2MouseExited

    private void jLabel15MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseMoved
        hoctuJoin2.setVisible(false);
        tucuJoin2.setVisible(false);
        quanlyJoin2.setVisible(false);
        thongkeJoin2.setVisible(false);
        thongtinJoin1.setVisible(false);
        tracnghiemJoin2.setVisible(false);
        khoiphucHint.setVisible(false);
        luuHint.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseMoved

    private void tucuJoin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tucuJoin2MouseClicked

    }//GEN-LAST:event_tucuJoin2MouseClicked

    private void tucuJoin1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tucuJoin1MouseMoved
        tucuJoin2.setVisible(true);
    }//GEN-LAST:event_tucuJoin1MouseMoved

    private void tracnghiemJoin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tracnghiemJoin2MouseClicked

    }//GEN-LAST:event_tracnghiemJoin2MouseClicked

    private void quanlyJoin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanlyJoin2MouseClicked

    }//GEN-LAST:event_quanlyJoin2MouseClicked

    private void thongkeJoin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeJoin2MouseClicked

    }//GEN-LAST:event_thongkeJoin2MouseClicked

    private void thongtinJoin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongtinJoin1MouseClicked

    }//GEN-LAST:event_thongtinJoin1MouseClicked

    private void tracnghiemJoin1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tracnghiemJoin1MouseMoved
        tracnghiemJoin2.setVisible(true);
    }//GEN-LAST:event_tracnghiemJoin1MouseMoved

    private void quanlyJoin1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanlyJoin1MouseMoved
        quanlyJoin2.setVisible(true);
    }//GEN-LAST:event_quanlyJoin1MouseMoved

    private void thongkeJoin1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeJoin1MouseMoved
        thongkeJoin2.setVisible(true);
    }//GEN-LAST:event_thongkeJoin1MouseMoved

    private void thongtinJoinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongtinJoinMouseMoved
        thongtinJoin1.setVisible(true);
    }//GEN-LAST:event_thongtinJoinMouseMoved

    private void jLabel15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseDragged

    }//GEN-LAST:event_jLabel15MouseDragged

    private void thoatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatButtonMouseClicked
        //Tùy chọn thoát chương trình
        if (JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn thoát chương trình? ") == 0) {
            try {
                //Thực hiện xuất dữ liệu ra các file nguồn
                IOFile.OutputBook(BienChuongTrinh.dulieutuvung);
                IOFile.OutputWord(BienChuongTrinh.dulieutuvung);
                IOFile.OutputOldWords(BienChuongTrinh.tuontap);
                IOFile.OutputDataStatistic(BienChuongTrinh.dulieuthongke);
                IOFile.OutputTuMoiNgay(BienChuongTrinh.dulieutuvung);
                System.exit(0);
            } catch (IOException ex) {
                Logger.getLogger(ChonChucNang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_thoatButtonMouseClicked

    private void thoatButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatButtonMouseMoved
        thoatButton.setBackground(Color.red);
    }//GEN-LAST:event_thoatButtonMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dahocLabel;
    private javax.swing.JLabel hoctuJoin1;
    private javax.swing.JLabel hoctuJoin2;
    private javax.swing.JLabel hoctuLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel khoiphucHint;
    private javax.swing.JLabel khoiphucLabel;
    private javax.swing.JLabel label;
    private javax.swing.JLabel luuHint;
    private javax.swing.JLabel quanlyJoin1;
    private javax.swing.JLabel quanlyJoin2;
    private javax.swing.JLabel quanlyLabel;
    private javax.swing.JLabel saveButton;
    private javax.swing.JLabel thoatButton;
    private javax.swing.JLabel thongkeJoin1;
    private javax.swing.JLabel thongkeJoin2;
    private javax.swing.JLabel thongkeLabel;
    private javax.swing.JLabel thongtinJoin;
    private javax.swing.JLabel thongtinJoin1;
    private javax.swing.JLabel thongtinLabel;
    private javax.swing.JLabel tracnghiemJoin1;
    private javax.swing.JLabel tracnghiemJoin2;
    private javax.swing.JLabel tracnghiemLabel;
    private javax.swing.JLabel tucuJoin1;
    private javax.swing.JLabel tucuJoin2;
    // End of variables declaration//GEN-END:variables
}
