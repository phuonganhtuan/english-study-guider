package view;

import controller.IOExcel;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.BienChuongTrinh;
import model.BoTuVung;

/**
 * class minh họa cho người dùng cách tạo 1 filw excel chuẩn định dạng từ
 *
 * @author Phương Anh Tuấn + Nguyễn Ngọc Tú
 */
public class MauFileExcel extends javax.swing.JFrame {

    //Biến tạm để lưu bộ từ
    BoTuVung BTV = new BoTuVung();

    /**
     * Creates new form MauFileExcel
     */
    public MauFileExcel() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
        
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        
        huongdanTextArea.setBackground(new Color(255,255,255,55));
        
        
        for (int i = 0; i < BienChuongTrinh.dulieutuvung.getSoluongBotuvung(); i++) {
            if (BienChuongTrinh.dulieutuvung.getBook().get(i).getChude().compareTo(BienChuongTrinh.chudehientai) == 0) {
                BTV = BienChuongTrinh.dulieutuvung.getBook().get(i);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minhoaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        huongdanTextArea = new javax.swing.JTextArea();
        okButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        minhoaLabel.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        huongdanTextArea.setEditable(false);
        huongdanTextArea.setBackground(new java.awt.Color(255, 0, 0));
        huongdanTextArea.setColumns(20);
        huongdanTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        huongdanTextArea.setRows(5);
        huongdanTextArea.setText("1 File Excel chứa dữ liệu có định dạng và nội dung các Cell(Cột) và các Row(Dòng) như sau:\n\tMỗi dòng tương ứng với 1 từ vựng, với 6 cột chứa nội dung lần lượt từ trái sang phải\n\t\tDòng 1: Tên tiếng anh của từ\n\t\tDòng 2: Nghĩa tiếng việt của từ\n\t\tDòng 3: Phát âm của từ\n\t\tDòng 4: Từ loại\n\t\tDòng 5: Ví dụ sử dụng từ\n\t\tDòng 6: Đường dẫn đến ảnh minh họa của từ( Không nhất thiết phải có )");
        jScrollPane1.setViewportView(huongdanTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 796, 156));

        okButton.setBackground(new java.awt.Color(204, 204, 204));
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 330, 165, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/excelFormat.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 163, 796, 154));

        jLabel1.setBackground(new java.awt.Color(102, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgquanlytu.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Chức năng bắt đầu nhập
     *
     * @param evt sự kiện
     */
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        try {
            JFileChooser filechooser = new JFileChooser();
            filechooser.showOpenDialog(null);
            File file = filechooser.getSelectedFile();

            String duongdanFile = file.getAbsolutePath();
            IOExcel.InputFromExcel(BTV, duongdanFile);
            JOptionPane.showMessageDialog(rootPane, "Nhập thành công!");
            this.dispose();
            new QuanLyTuVung().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MauFileExcel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.lang.NullPointerException ex) {
            System.out.println("Không chọn file nào!");
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved

    }//GEN-LAST:event_formComponentRemoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea huongdanTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minhoaLabel;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
