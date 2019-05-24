package view;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * giao diện hiển thị khi kết thúc ôn trắc nghiệm
 *
 * @author Nguyễn Ngọc Tú
 */
public class HoanThanhTracNghiem extends javax.swing.JFrame {

    /**
     * Creates new form HoanThanhTracNghiem
     */
    public HoanThanhTracNghiem() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
    }

    /**
     * Khởi tạo với các tham số
     *
     * @param Flag là trạng thái đã hoàn thành hay chưa
     * @param socauhoi là tổng số câu đã hỏi
     * @param socausai là tổng số câu trả lời sai
     * @param chude là tên chủ đề
     */
    public HoanThanhTracNghiem(boolean Flag, int socauhoi, int socausai, String chude, int tongcauhoi) {
        initComponents();
        chudeLabel.setText(chude);
        label.setBackground(new Color(255,255,255,55));
        cauhoiLabel.setText("Số câu đã hỏi: " + socauhoi + " / " + tongcauhoi);
        caudungLabel.setText("Số câu trả lời đúng: " + (socauhoi - socausai));
        causaiLabel.setText("Số câu trả lời sai: " + socausai);

        //Đánh giá mức độ hoàn thành bài trắc nghiệm
        if (socausai == 0 && socauhoi == 0) {
            trangthaiLabel.setText("");
        } else if (socausai <= socauhoi / 10) {
            trangthaiLabel.setText("Xuất sắc!");
        } else if (socausai <= socauhoi / 5) {
            trangthaiLabel.setText("Tốt!");
        } else if (socausai <= socauhoi / 2) {
            trangthaiLabel.setText("Khá tốt!");
        } else {
            trangthaiLabel.setText("Cần cố gắng nhiều hơn!");
        }
        trangthaiLabel.setForeground(Color.blue);
        if (Flag == true) {
            hoanthanhLabel.setText("Hoàn thành");
            hoanthanhLabel.setForeground(Color.black);
        } else {
            hoanthanhLabel.setText("Chưa hoàn thành!");
            hoanthanhLabel.setForeground(Color.white);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hoanthanhLabel = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        chudeLabel = new javax.swing.JLabel();
        cauhoiLabel = new javax.swing.JLabel();
        causaiLabel = new javax.swing.JLabel();
        trangthaiLabel = new javax.swing.JLabel();
        caudungLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hoanthanhLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        hoanthanhLabel.setForeground(new java.awt.Color(255, 255, 51));
        hoanthanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoanthanhLabel.setText("jLabel2");
        getContentPane().add(hoanthanhLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 440, 40));

        label.setBackground(new java.awt.Color(255, 153, 0));
        label.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Pass_Fail_64px_1.png"))); // NOI18N
        label.setText("KẾT QUẢ TRẮC NGHIỆM");
        label.setOpaque(true);
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 102));

        chudeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chudeLabel.setText("Chủ đề:");
        getContentPane().add(chudeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 137, 380, 34));

        cauhoiLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cauhoiLabel.setForeground(new java.awt.Color(255, 255, 255));
        cauhoiLabel.setText("Số lượng câu hỏi: ");
        getContentPane().add(cauhoiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 380, 32));

        causaiLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        causaiLabel.setForeground(new java.awt.Color(255, 255, 255));
        causaiLabel.setText("Số câu sai:");
        getContentPane().add(causaiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 360, 32));

        trangthaiLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        trangthaiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trangthaiLabel.setText("jLabel2");
        getContentPane().add(trangthaiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 302, 30));

        caudungLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        caudungLabel.setForeground(new java.awt.Color(255, 255, 255));
        caudungLabel.setText("Số câu đúng:");
        getContentPane().add(caudungLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 361, 37));

        jLabel1.setBackground(new java.awt.Color(102, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgquanlytu.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caudungLabel;
    private javax.swing.JLabel cauhoiLabel;
    private javax.swing.JLabel causaiLabel;
    private javax.swing.JLabel chudeLabel;
    private javax.swing.JLabel hoanthanhLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel trangthaiLabel;
    // End of variables declaration//GEN-END:variables
}
