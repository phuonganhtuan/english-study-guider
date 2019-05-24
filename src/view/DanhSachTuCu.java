package view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BienChuongTrinh;
import model.TuVung;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableCellRenderer;
import org.jdesktop.swingx.autocomplete.*;

/**
 * Lớp quản lý giao diện đồ họa thực hiện truy vấn danh sách các từ vựng đã học
 *
 * @author Phương Anh Tuấn + Nguyễn Ngọc Tú
 */
public class DanhSachTuCu extends javax.swing.JFrame {

    //Mẫu bảng cho lớp
    DefaultTableModel modelDSTC = new DefaultTableModel();

    //Một từ được tạo ra như bộ nhớ tạm
    TuVung tmpWord = new TuVung();

    //Xét trạng thái tìm kiếm từ
    boolean found = false;

    /**
     * Tạo form DanhsachTucu
     */
    public DanhSachTuCu() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
        anhLabel.setVisible(false);

        jScrollPane1.setOpaque(false);
        tucuTable.setOpaque(false);
        ((DefaultTableCellRenderer) tucuTable.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        tracuuText.setBackground(new Color(0, 0, 0, 30));
        timButton.setBackground(new Color(255, 255, 255, 100));
        label.setBackground(new Color(255, 255, 255, 55));
        modelDSTC = (DefaultTableModel) tucuTable.getModel();
        HienThiTatCa();

        ArrayList<String> list = new ArrayList<>();
        for (TuVung TV : BienChuongTrinh.tuontap.getLearntWord()) {
            list.add(TV.getEnglish());
            list.add(TV.getVietnamese());
        }

        AutoCompleteDecorator.decorate(tracuuText, list, true);
    }

    /**
     * Thiết lập nội dung cho bảng
     */
    public final void HienThiTatCa() {
        modelDSTC.setRowCount(0);
        for (TuVung W : BienChuongTrinh.tuontap.getLearntWord()) {
            modelDSTC.addRow(W.tolearntObject());
        }
        sotuLabel.setText("Danh sách gồm: " + BienChuongTrinh.tuontap.getSoluongTu() + " từ");
    }

    /**
     * thiết lập nội dung từ tìm thấy cho bảng
     *
     * @return trạng thái tìm từ
     */
    public boolean HienThiTuDaTim() {
        modelDSTC.setRowCount(0);

        //Vòng lặp tìm kiếm từ
        for (int i = 0; i < BienChuongTrinh.tuontap.getSoluongTu(); i++) {
            String temp1 = BienChuongTrinh.tuontap.getLearntWord().get(i).getEnglish().toLowerCase();
            String temp2 = tracuuText.getText().trim().toLowerCase();
            String temp3 = BienChuongTrinh.tuontap.getLearntWord().get(i).getVietnamese().toLowerCase();
            if (temp1.compareTo(temp2) == 0 || temp3.compareTo(temp2) == 0) {
                modelDSTC.addRow(BienChuongTrinh.tuontap.getLearntWord().get(i).tolearntObject());
                tmpWord = BienChuongTrinh.tuontap.getLearntWord().get(i);
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tucuTable = new javax.swing.JTable();
        label = new javax.swing.JLabel();
        tracuuText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        anhLabel = new javax.swing.JLabel();
        sotuLabel = new javax.swing.JLabel();
        timButton = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tucuTable.setBackground(new java.awt.Color(51, 0, 51));
        tucuTable.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tucuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tiếng anh", "Nghĩa", "Phát âm", "Từ loại", "Ví dụ sử dụng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tucuTable.setGridColor(new java.awt.Color(255, 255, 255));
        tucuTable.setOpaque(false);
        tucuTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tucuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tucuTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tucuTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 760, 227));

        label.setBackground(new java.awt.Color(0, 204, 0));
        label.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Book_64px_1.png"))); // NOI18N
        label.setText("DANH SÁCH CÁC TỪ VỰNG ĐÃ HỌC");
        label.setOpaque(true);
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 91));

        tracuuText.setForeground(new java.awt.Color(255, 255, 255));
        tracuuText.setBorder(null);
        getContentPane().add(tracuuText, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 349, 237, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tra cứu:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 30));
        getContentPane().add(anhLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 100, 100));

        sotuLabel.setForeground(new java.awt.Color(255, 255, 255));
        sotuLabel.setText("jLabel3");
        getContentPane().add(sotuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 416, 174, -1));

        timButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        timButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timButton.setText("Tìm");
        timButton.setOpaque(true);
        timButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timButtonMouseClicked(evt);
            }
        });
        getContentPane().add(timButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 90, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Làm mới");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 90, 30));

        jLabel1.setBackground(new java.awt.Color(102, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bgquanlytu.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sự kiện khi click vào 1 từ trong bảng
     *
     * @param evt sự kiện
     */
    private void tucuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tucuTableMouseClicked

        int index = -1;
        index = tucuTable.getSelectedRow();
        if (index != -1) {
            if (found == false) {
                anhLabel.setVisible(true);
                Icon icon = new ImageIcon(BienChuongTrinh.tuontap.getLearntWord().get(index).getExampleImage()) {
                };
                anhLabel.setIcon(icon);
            }
        }
    }//GEN-LAST:event_tucuTableMouseClicked

    private void timButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timButtonMouseClicked
        //Xét ngoại lệ trống trường văn bản
        if (tracuuText.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng không bỏ trống trường tra cứu!");
        } else {

            found = HienThiTuDaTim();

            if (found) {
                anhLabel.setVisible(true);
                Icon icon = new ImageIcon(tmpWord.getExampleImage()) {
                };
                anhLabel.setIcon(icon);
            } else {
            }
        }
    }//GEN-LAST:event_timButtonMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        found = false;
        HienThiTatCa();
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anhLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel sotuLabel;
    private javax.swing.JLabel timButton;
    private javax.swing.JTextField tracuuText;
    private javax.swing.JTable tucuTable;
    // End of variables declaration//GEN-END:variables
}
