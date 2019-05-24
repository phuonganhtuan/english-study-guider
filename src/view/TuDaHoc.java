package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.BienChuongTrinh;
import model.TuVung;

/**
 * Lớp quản lý các từ đã học
 *
 * @author Phương Anh Tuấn + Nguyễn Ngọc Tú
 */
public class TuDaHoc extends javax.swing.JFrame {

    /**
     * Tạo form tudahoc
     */
    public TuDaHoc() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        tucuTextarea.setBorder(null);
        tucuTextarea.setBackground(new Color(255,255,255,0));

        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        tumoiTextArea.setBorder(null);
        tumoiTextArea.setBackground(new Color(255,255,255,0));
        
        label.setBackground(new Color(255,255,255,55));
        danhsachButton.setBackground(new Color(255,255,255,100));

        tucuTextarea.setText("");
        tumoiTextArea.setText("");
        for (TuVung TV : BienChuongTrinh.dulieutuvung.getTucu()) {
            tucuTextarea.append(TV.toString() + "\n\n");
        }
        if (BienChuongTrinh.dulieutuvung.getTucu().isEmpty()) {
            tumoiTextArea.setText("Bạn chưa học từ nào!");
        }
        for (TuVung TV : BienChuongTrinh.dulieutuvung.getTumoi()) {
            tumoiTextArea.append(TV.toString() + "\n\n");
        }
        if (BienChuongTrinh.dulieutuvung.getTumoi().isEmpty()) {
            tumoiTextArea.setText("Không còn từ mới nào!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tucuTextarea = new javax.swing.JTextArea();
        danhsachButton = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tumoiTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tucuTextarea.setEditable(false);
        tucuTextarea.setBackground(new java.awt.Color(0, 0, 51));
        tucuTextarea.setColumns(20);
        tucuTextarea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tucuTextarea.setRows(5);
        jScrollPane1.setViewportView(tucuTextarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 290, 390));

        danhsachButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        danhsachButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        danhsachButton.setText("Danh sách tất cả những từ đã học");
        danhsachButton.setOpaque(true);
        danhsachButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                danhsachButtonMouseClicked(evt);
            }
        });
        getContentPane().add(danhsachButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 260, 30));

        label.setBackground(new java.awt.Color(0, 204, 0));
        label.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Book_64px_1.png"))); // NOI18N
        label.setText(" Từ vựng đã học");
        label.setOpaque(true);
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 86));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("10 TỪ CŨ MỖI NGÀY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 93, 300, 40));

        tumoiTextArea.setEditable(false);
        tumoiTextArea.setBackground(new java.awt.Color(0, 0, 51));
        tumoiTextArea.setColumns(20);
        tumoiTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tumoiTextArea.setRows(5);
        jScrollPane2.setViewportView(tumoiTextArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 280, 390));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("10 TỪ MỚI MỖI NGÀY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 93, 299, 40));

        jLabel1.setBackground(new java.awt.Color(102, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgquanlytu.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void danhsachButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_danhsachButtonMouseClicked
        //Tạo frame danh sách từ cũ
        new DanhSachTuCu().setVisible(true);
    }//GEN-LAST:event_danhsachButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel danhsachButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JTextArea tucuTextarea;
    private javax.swing.JTextArea tumoiTextArea;
    // End of variables declaration//GEN-END:variables
}
