package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.BienChuongTrinh;
import model.ThongKe;

/**
 * giao diện đồ họa hiển thị tất cả dữ liệu thống kê theo ngày
 *
 * @author Nguyễn Ngọc Tú
 */
public class ThongKeTatCa extends javax.swing.JFrame {

    /**
     * Creates new form ThongKeTatCa
     */
    public ThongKeTatCa() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        thongke.setBorder(null);
        thongke.setBackground(new Color(255, 255, 255, 0));
        label.setBackground(new Color(255, 255, 255, 55));
        HienThi();
    }

    /**
     * Hiển thị nội dung thống kê ra khung văn bản
     */
    void HienThi() {
        thongke.setText("");
        for (int i = 0; i < BienChuongTrinh.dulieuthongke.getSoluongngaythongke(); i++) {
            thongke.append("\n\nNgày " + BienChuongTrinh.dulieuthongke.getThongke().get(i).getDate().get(Calendar.DAY_OF_MONTH) + "/" + (BienChuongTrinh.dulieuthongke.getThongke().get(i).getDate().get(Calendar.MONTH) + 1) + "/" + BienChuongTrinh.dulieuthongke.getThongke().get(i).getDate().get(Calendar.YEAR) + ":");
            thongke.append("\nSố từ đã học: " + BienChuongTrinh.dulieuthongke.getThongke().get(i).getSotudahoc() + " - Số từ đã ôn: " + BienChuongTrinh.dulieuthongke.getThongke().get(i).getSotudaon());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        thongke = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Combo_Chart_64px_1.png"))); // NOI18N
        label.setText("THỐNG KÊ DỮ LIỆU");
        label.setOpaque(true);
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 401, 88));

        thongke.setEditable(false);
        thongke.setBackground(new java.awt.Color(102, 0, 153));
        thongke.setColumns(20);
        thongke.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        thongke.setRows(5);
        jScrollPane1.setViewportView(thongke);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 380, 430));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đặt lại dữ liệu thống kê");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 360, 30));

        jLabel2.setBackground(new java.awt.Color(102, 0, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgtracnghiem.png"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn đặt lại mọi dữ liệu đã thống kê?") == 0) {
            ArrayList<ThongKe> thongkemoi = new ArrayList();
            BienChuongTrinh.dulieuthongke.setThongke(thongkemoi);
            BienChuongTrinh.dulieuthongke.setSoluongngaythongke(0);
            BienChuongTrinh.dulieuthongke.addNewDate();
            HienThi();
            JOptionPane.showMessageDialog(rootPane, "Đã làm mới dữ liệu thống kê");
        }
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTextArea thongke;
    // End of variables declaration//GEN-END:variables
}
