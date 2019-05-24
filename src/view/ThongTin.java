package view;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * class hiển thị thông tin về tác giả và chương trình
 *
 * @author Nguyễn Ngọc Tú
 */
public class ThongTin extends javax.swing.JFrame {

    /**
     * Creates new form ThongTin
     */
    public ThongTin() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        thongtin.setBorder(null);
        thongtin.setBackground(new Color(0,0,0,0));
        label.setBackground(new Color(255,255,255,55));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        thongtin = new javax.swing.JTextArea();
        label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(51, 0, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        thongtin.setEditable(false);
        thongtin.setBackground(new java.awt.Color(102, 0, 153));
        thongtin.setColumns(20);
        thongtin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        thongtin.setRows(5);
        thongtin.setText("\n\tTrường Đại học Công nghệ - Đại học Quốc Gia Hà Nội\n\t\tKhoa: Công nghệ thông tin\n\n  Tác giả:\n  1 - Phương Anh Tuấn - MSSV: 16021215\n       Lớp: K61 - CC\n\n  2 - Nguyễn Ngọc Tú - MSSV: 16021207\n       Lớp: K61 - CC\n\n\n\tChương trình gồm các chức năng chính:\n\n         Chức năng học từ vựng và ôn tập từ vựng. \n         Gợi ý từ mới và từ cũ mỗi ngày.\n         Công cụ quản lý các chủ đề từ vựng trực quan.\n         Ôn tập quá trình học bằng hệ thống câu hỏi trắc nghiệm.\n         Xem lại số liệu thống kê trong cả quá trình học.\n         Hỗ trợ nhập và xuất dữ liệu bằng tệp excel tiện lợi.\n         Chức năng khôi phục dữ liệu an toàn.\n         Giao diện trực quan dễ sử dụng.");
        jScrollPane1.setViewportView(thongtin);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 580, 430));

        label.setBackground(new java.awt.Color(255, 255, 0));
        label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_User_64px.png"))); // NOI18N
        label.setText(" CHƯƠNG TRÌNH HỌC TIẾNG ANH TỰ ĐỘNG");
        label.setOpaque(true);
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 90));

        jLabel2.setBackground(new java.awt.Color(102, 0, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgchonchucnang.png"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTextArea thongtin;
    // End of variables declaration//GEN-END:variables
}
