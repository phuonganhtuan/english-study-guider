package view;

import controller.IOFile;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.ImageIcon;
import model.BienChuongTrinh;
import static controller.SoSanhNgay.after;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TuVung;

/**
 * Giao diện đồ họa khởi động chương trình
 *
 * @author Nguyễn Ngọc Tú
 */
public class MoDau extends javax.swing.JFrame {

    /**
     * Tạo form Modau
     */
    public MoDau() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
        batdauLabel1.setBackground(new Color(255,255,255, 200));
        batdauLabel.setBackground(new Color(0,0,0,25));
        batdauLabel1.setVisible(false);
        thoatLabel1.setBackground(new Color(255,255,255, 200));
        thoatLabel.setBackground(new Color(0,0,0,25));
        thoatLabel1.setVisible(false);
        label.setBackground(new Color(255,255,255,55));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        thoatLabel = new javax.swing.JLabel();
        thoatLabel1 = new javax.swing.JLabel();
        batdauLabel = new javax.swing.JLabel();
        batdauLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(600, 300));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label.setForeground(new java.awt.Color(51, 51, 51));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Open_Book_64px_1.png"))); // NOI18N
        label.setText("  E - LEARNING");
        label.setName(""); // NOI18N
        label.setOpaque(true);
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 130));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("version 2.0.1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 102, -1));

        thoatLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        thoatLabel.setForeground(new java.awt.Color(51, 51, 51));
        thoatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thoatLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Delete_32px_1.png"))); // NOI18N
        thoatLabel.setText("THOÁT");
        thoatLabel.setOpaque(true);
        thoatLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                thoatLabelMouseMoved(evt);
            }
        });
        thoatLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thoatLabelMouseClicked(evt);
            }
        });
        getContentPane().add(thoatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 280, 70));

        thoatLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        thoatLabel1.setForeground(new java.awt.Color(51, 51, 51));
        thoatLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thoatLabel1.setOpaque(true);
        thoatLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thoatLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(thoatLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 280, 70));

        batdauLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        batdauLabel.setForeground(new java.awt.Color(51, 51, 51));
        batdauLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batdauLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Checkmark_32px_7.png"))); // NOI18N
        batdauLabel.setText("BẮT ĐẦU");
        batdauLabel.setOpaque(true);
        batdauLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                batdauLabelMouseMoved(evt);
            }
        });
        batdauLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batdauLabelMouseClicked(evt);
            }
        });
        getContentPane().add(batdauLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 280, 70));

        batdauLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        batdauLabel1.setForeground(new java.awt.Color(51, 51, 51));
        batdauLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batdauLabel1.setOpaque(true);
        batdauLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                batdauLabel1MouseMoved(evt);
            }
        });
        batdauLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batdauLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(batdauLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 280, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgmodau.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batdauLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batdauLabelMouseClicked
        try {
            //Hiển thị bảng chức năng
            new ChonChucNang().setVisible(true);
            this.setVisible(false);
            //Nhập dữ liệu từ các file nguồn
            IOFile.InputBook(BienChuongTrinh.dulieutuvung);
            IOFile.InputWord(BienChuongTrinh.dulieutuvung);
            IOFile.InputOldWords(BienChuongTrinh.tuontap);
            
            for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
                for (TuVung W : BienChuongTrinh.dulieutuvung.getBook().get(i).getList()) {
                    if (W.isIsRead() == true) {
                        BienChuongTrinh.dulieutuvung.getBook().get(i).UpSoLuongCu();
                    }
                }
            }
            IOFile.InputDataStatistic(BienChuongTrinh.dulieuthongke);
            IOFile.InputTuMoiNgay(BienChuongTrinh.dulieutuvung);
            Calendar date;
            date = Calendar.getInstance();
            if (BienChuongTrinh.dulieuthongke.getSoluongngaythongke() == 0) {
                BienChuongTrinh.dulieuthongke.addNewDate();
                BienChuongTrinh.dulieutuvung.updateTucu(BienChuongTrinh.tuontap);
                BienChuongTrinh.dulieutuvung.updateTumoi();
                
            } else if (after(date, BienChuongTrinh.dulieuthongke.getThongke().get(0).getDate()) == true) {
                BienChuongTrinh.dulieuthongke.addNewDate();
                BienChuongTrinh.dulieutuvung.updateTucu(BienChuongTrinh.tuontap);
                BienChuongTrinh.dulieutuvung.updateTumoi();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MoDau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_batdauLabelMouseClicked

    private void thoatLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_thoatLabelMouseClicked

    private void batdauLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batdauLabelMouseMoved
        batdauLabel1.setVisible(true);
    }//GEN-LAST:event_batdauLabelMouseMoved

    private void batdauLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batdauLabel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_batdauLabel1MouseMoved

    private void batdauLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batdauLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_batdauLabel1MouseClicked

    private void thoatLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_thoatLabel1MouseClicked

    private void thoatLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatLabelMouseMoved
        thoatLabel1.setVisible(true);
    }//GEN-LAST:event_thoatLabelMouseMoved

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        batdauLabel1.setVisible(false);
        thoatLabel1.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseMoved

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batdauLabel;
    private javax.swing.JLabel batdauLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel thoatLabel;
    private javax.swing.JLabel thoatLabel1;
    // End of variables declaration//GEN-END:variables
}
