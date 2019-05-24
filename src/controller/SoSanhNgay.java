package controller;

import java.util.Calendar;

/**
 * class thực hiện chức năng so sánh 2 ngày với nhau
 *
 * @author Phương Anh Tuấn + Nguyễn Ngọc Tú
 */
public class SoSanhNgay {

    /**
     * Hàm so sánh 2 ngày
     *
     * @param day1 ngày thứ nhất
     * @param day2 ngày thứ hai
     * @return true nếu ngày thứ nhất muộn hơn ngày thứ 2 và false nếu ngược lại
     */
    public static boolean after(Calendar day1, Calendar day2) {
        if (day1.get(Calendar.YEAR) > day2.get(Calendar.YEAR)) {
            return true;
        } else {
            if (day1.get(Calendar.MONTH) > day2.get(Calendar.MONTH)) {
                return true;
            } else {
                if (day1.get(Calendar.DAY_OF_MONTH) > day2.get(Calendar.DAY_OF_MONTH)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
