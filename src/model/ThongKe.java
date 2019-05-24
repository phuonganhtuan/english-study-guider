package model;

import java.util.Calendar;

/**
 * class đại diện cho một ngày thống kê
 *
 * @author Nguyễn Ngọc Tú
 */
public class ThongKe {

    //Biến thời gian dạng lịch
    private Calendar date = new Calendar() {
        @Override
        protected void computeTime() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        protected void computeFields() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void add(int field, int amount) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void roll(int field, boolean up) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getMinimum(int field) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getMaximum(int field) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getGreatestMinimum(int field) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getLeastMaximum(int field) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    //Số từ đã học trong ngày
    private int sotudahoc = 0;

    //Số từ đã ôn trong ngày
    private int sotudaon = 0;

    /**
     * Lấy thông tin ngày thống kê
     *
     * @return ngày thống kê
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Thiết lập thông tin ngày thống kê
     *
     * @param date là ngày thống kê
     */
    public void setDate(Calendar date) {
        this.date = date;
    }

    /**
     * Lấy số lượng từ đã học
     *
     * @return số từ đã học
     */
    public int getSotudahoc() {
        return sotudahoc;
    }

    /**
     * thiết lập số từ đã học trong ngày
     *
     * @param sotudahoc số từ đã học
     */
    public void setSotudahoc(int sotudahoc) {
        this.sotudahoc = sotudahoc;
    }

    /**
     * Lấy số lượng từ đã ôn trong ngày
     *
     * @return số từ đã ôn
     */
    public int getSotudaon() {
        return sotudaon;
    }

    /**
     * Thiết lập số từ đã ôn trong ngày
     *
     * @param sotudaon số từ đã ôn
     */
    public void setSotudaon(int sotudaon) {
        this.sotudaon = sotudaon;
    }

    /**
     * Thiết lập giá trị mới cho số từ
     *
     * @param dahoc số từ đã học muốn thêm vào dữ liệu
     * @param daon số từ đã ôn muốn thêm vào dữ liệu
     */
    public void update(int dahoc, int daon) {
        sotudahoc += dahoc;
        sotudaon += daon;
    }

}
