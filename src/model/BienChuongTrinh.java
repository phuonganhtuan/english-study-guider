package model;

import java.util.ArrayList;

/**
 * class chứa các biến toàn cục dùng trong chương trình
 *
 * @author Phương Anh Tuấn
 */
public class BienChuongTrinh {

    //Đối tượng quản lý dữ liệu từ vựng
    public static DuLieuTuVung dulieutuvung = new DuLieuTuVung();

    //Đối tượng quản lý từ vựng đã học
    public static TuOnTap tuontap = new TuOnTap();

    //Đối tượng quản lý thống kê
    public static DuLieuThongKe dulieuthongke = new DuLieuThongKe();

    //Tên chủ đề hiện đang được 1 số frame truy cập
    public static String chudehientai;

}
