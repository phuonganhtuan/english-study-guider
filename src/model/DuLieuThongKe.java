package model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * class quản lý dữ liệu thống kê từ vựng
 *
 * @author Phương Anh Tuấn
 */
public class DuLieuThongKe {

    //Số ngày đã được thống kê 
    private int soluongngaythongke = 0;

    //Danh sách các ngày thống kê
    private ArrayList<ThongKe> thongke = new ArrayList();

    /**
     * Lấy số lượng ngày thống kê
     *
     * @return số lượng ngày
     */
    public int getSoluongngaythongke() {
        return soluongngaythongke;
    }

    /**
     * Đặt số lượng ngày thống kê
     *
     * @param soluongngaythongke số ngày đã thống kê
     */
    public void setSoluongngaythongke(int soluongngaythongke) {
        this.soluongngaythongke = soluongngaythongke;
    }

    /**
     * Lấy danh sách ngày
     *
     * @return danh sách ngày
     */
    public ArrayList<ThongKe> getThongke() {
        return thongke;
    }

    /**
     * Thiết lập danh sách thống kê
     *
     * @param thongke danh sách ngày thống kê
     */
    public void setThongke(ArrayList<ThongKe> thongke) {
        this.thongke = thongke;
    }

    /**
     * Thêm ngày hiện tại vào dữ liệu thống kê
     */
    public void addNewDate() {
        Calendar date;
        date = Calendar.getInstance();
        ThongKe temp = new ThongKe();
        temp.setDate(date);
        temp.setSotudahoc(0);
        temp.setSotudaon(0);
        thongke.add(0, temp);
        soluongngaythongke++;
    }

    /**
     * Thêm ngày từ file vào dữ liệu
     *
     * @param calendar là ngày đầu vào
     * @param dahoc là số từ đã học trong ngày
     * @param daon là số từ đã ôn trong ngày
     */
    public void addFromFile(Calendar calendar, int dahoc, int daon) {
        ThongKe temp = new ThongKe();
        temp.setDate(calendar);
        temp.setSotudahoc(dahoc);
        temp.setSotudaon(daon);
        thongke.add(temp);
        soluongngaythongke++;
    }

    /**
     * Thiết đặt trống cho dữ liệu thống kê
     */
    public void reset() {
        ArrayList<ThongKe> temp = new ArrayList();
        soluongngaythongke = 0;
        thongke = temp;
    }

}
