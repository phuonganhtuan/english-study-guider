package view;

import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.BienChuongTrinh;

/**
 * Lớp giao diện thực hiện chức năng thêm 1 bộ từ mới
 *
 * @author Phương Anh Tuấn
 */
public class ThemChuDe extends javax.swing.JFrame {

    /**
     * Tạo form ThemBoTu
     */
    public ThemChuDe() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
        chudeText.setBackground(new Color(0,0,0,50));
        fileText.setBackground(new Color(0,0,0,50));
        label.setBackground(new Color(255,255,255,55));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        label = new javax.swing.JLabel();
        chudeText = new javax.swing.JTextField();
        fileText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        themButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setBackground(new java.awt.Color(255, 0, 0));
        label.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Checklist_64px.png"))); // NOI18N
        label.setText("THÊM BỘ TỪ VỰNG MỚI");
        label.setOpaque(true);
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 100));

        chudeText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chudeText.setForeground(new java.awt.Color(255, 255, 255));
        chudeText.setBorder(null);
        chudeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chudeTextActionPerformed(evt);
            }
        });
        getContentPane().add(chudeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 249, 30));

        fileText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fileText.setForeground(new java.awt.Color(255, 255, 255));
        fileText.setBorder(null);
        fileText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileTextMouseClicked(evt);
            }
        });
        fileText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileTextActionPerformed(evt);
            }
        });
        getContentPane().add(fileText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 249, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tên chủ đề:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Đường dẫn file:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        themButton.setBackground(new java.awt.Color(0, 102, 204));
        themButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        themButton.setForeground(new java.awt.Color(255, 255, 255));
        themButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        themButton.setText("THÊM");
        themButton.setOpaque(true);
        themButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themButtonMouseClicked(evt);
            }
        });
        getContentPane().add(themButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 120, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgquanlytu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chudeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chudeTextActionPerformed

    }//GEN-LAST:event_chudeTextActionPerformed

    private void fileTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileTextActionPerformed

    }//GEN-LAST:event_fileTextActionPerformed

    private void fileTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileTextMouseClicked
        try {
            JFileChooser filechooser = new JFileChooser();
            filechooser.showOpenDialog(null);
            File file = filechooser.getSelectedFile();
            
            String duongdanFile = file.getAbsolutePath();
            fileText.setText(duongdanFile);
            
        } catch (java.lang.NullPointerException ex) {
            System.out.println("Không chọn file nào!");
        }
    }//GEN-LAST:event_fileTextMouseClicked

    private void themButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themButtonMouseClicked
        //Xử lý ngoại lệ trống trường văn bản
        if (chudeText.getText().trim().length() == 0 || fileText.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đủ thông tin!");
        } else {
            BienChuongTrinh.dulieutuvung.addBook(chudeText.getText(), fileText.getText());
            JOptionPane.showMessageDialog(rootPane, "Đã thêm thành công!");
            this.dispose();
            new QuanLy().setVisible(true);
        }
    }//GEN-LAST:event_themButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chudeText;
    private javax.swing.JTextField fileText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel themButton;
    // End of variables declaration//GEN-END:variables
}
