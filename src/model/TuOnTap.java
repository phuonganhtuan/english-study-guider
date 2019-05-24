package model;

import java.util.ArrayList;

/**
 * Lớp dại diện quản lý danh sách các từ vựng đã được học
 *
 * @author Phương Anh Tuấn
 */
public class TuOnTap {

    //Danh sách mảng chứa dữ liệu
    private ArrayList<TuVung> learntWord = new ArrayList();

    //Số lượng từ của mảng
    private int soluongTu = 0;

    /**
     * Lấy danh sách từ đã học
     *
     * @return danh sách đã học
     */
    public ArrayList<TuVung> getLearntWord() {
        return learntWord;
    }

    /**
     * Thiết lập danh sách từ đã học
     *
     * @param learntWord danh sách từ đã học
     */
    public void setLearntWord(ArrayList<TuVung> learntWord) {
        this.learntWord = learntWord;
    }

    /**
     * lấy số lượng từ
     *
     * @return số lượng từ
     */
    public int getSoluongTu() {
        return soluongTu;
    }

    /**
     * Thiết lập số lượng từ
     *
     * @param soluongTu số lượng từ
     */
    public void setSoluongTu(int soluongTu) {
        this.soluongTu = soluongTu;
    }

    /**
     * Xóa phần từ đầu của danh sách
     */
    public void remove() {
        learntWord.remove(learntWord.get(0));
        soluongTu--;
    }

    /**
     * Xóa phần từ của danh sách
     *
     * @param temp
     */
    public void remove(TuVung temp) {
        learntWord.remove(temp);
        soluongTu--;
    }

    /**
     * Thêm 1 từ vào đuôi danh sách
     *
     * @param temp là từ muốn thêm
     */
    public void add(TuVung temp) {
        learntWord.add(temp);
        soluongTu++;
    }

}
