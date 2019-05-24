package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class đại diện cho cấu trúc 1 bộ từ vựng tiếng anh
 *
 * @author Phương Anh Tuấn + Nguyễn Ngọc Tú
 */
public class BoTuVung {

    //Danh sách mảng lưu các từ vựng trong bộ
    private ArrayList<TuVung> list = new ArrayList();

    //Số lượng từ vựng hiện có ( mặc định là 0 )
    private int soluongTu = 0;

    //Số thứ tự của chủ đề hiện tại
    private int soThuTu;

    //Tên chủ đề của bộ từ
    private String chude;

    //Đường dẫn đến file chứa dữ liệu
    private String duongdanFile;

    //Số lượng từ đã được học( mặc định là 0 )
    private int soluongdahoc = 0;


    /**
     * Lấy danh sách từ vựng
     *
     * @return danh sách từ vựng
     */
    public ArrayList<TuVung> getList() {
        return list;
    }

    /**
     * Thiết lập danh sách từ vựng
     *
     * @param list danh sách từ vựng
     */
    public void setList(ArrayList<TuVung> list) {
        this.list = list;
    }

    /**
     * Lấy số lượng từ
     *
     * @return số lượng từ
     */
    public int getSoluongTu() {
        return soluongTu;
    }

    /**
     * Thiết lập số lượng từ
     *
     * @param soluongTu số lượng từ vựng
     */
    public void setSoluongTu(int soluongTu) {
        this.soluongTu = soluongTu;
    }

    /**
     * Lấy số thứ tự của bộ từ hiện tại
     *
     * @return số thứ tự bộ từ
     */
    public int getSoThuTu() {
        return soThuTu;
    }

    /**
     * Thiết lập giá trị số thứ tự
     *
     * @param soThuTu là số thứ tự bộ từ
     */
    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    /**
     * Lấy tên chủ đề
     *
     * @return tên chủ đề
     */
    public String getChude() {
        return chude;
    }

    /**
     * Thiết lập tên chủ đề
     *
     * @param chude tên chủ đề
     */
    public void setChude(String chude) {
        this.chude = chude;
    }

    /**
     * Lấy đường dẫn đến file dữ liệu
     *
     * @return đường dẫn dữ liệu
     */
    public String getDuongdanFile() {
        return duongdanFile;
    }

    /**
     * Thiết lập đường dẫn file dữ liệu
     *
     * @param duongdanFile đường dẫn file
     */
    public void setDuongdanFile(String duongdanFile) {
        this.duongdanFile = duongdanFile;
    }

    /**
     * Lấy số lượng từ đã học trong bộ
     *
     * @return số lượng từ đã học
     */
    public int getNumberLearnt() {
        return soluongdahoc;
    }

    /**
     * Thiết lập giá trị số lượng từ đã học
     *
     * @param numberLearnt số lượng từ đã học
     */
    public void setNumberLearnt(int numberLearnt) {
        this.soluongdahoc = numberLearnt;
    }

    /**
     * Thêm 1 từ vào bộ
     *
     * @param temp là từ muốn thêm
     */
    public void addW(TuVung temp) {
        list.add(temp);
        soluongTu++;
        Sort();
    }

    /**
     * Thêm 1 từ vào bộ với tham số khác nhau
     *
     * @param eng là tên từ bằng tiếng anh
     * @param vie là nghĩa tiếng việt của từ
     * @param voi là phát âm của từ
     * @param typ là từ loại
     * @param exa là ví dụ sử dụng
     * @param img là đường dẫn đến file ảnh minh họa của từ
     */
    public void addW(String eng, String vie, String voi, String typ, String exa, String img) {
        TuVung temp = new TuVung();
        temp.setEnglish(eng);
        temp.setVietnamese(vie);
        temp.setVoice(voi);
        temp.setType(typ);
        temp.setExampleCase(exa);
        temp.setExampleImage(img);
        temp.setIsRead(false);
        list.add(temp);
        soluongTu++;
        Sort();
    }

    /**
     * Xóa 1 từ khỏi bộ từ
     *
     * @param index là vị trí từ muốn xóa
     */
    public void removeW(int index) {
        list.remove(index);
        soluongTu--;
    }

    /**
     * Tăng số lượng từ cũ lên 1
     */
    public void UpSoLuongCu() {
        soluongdahoc++;
    }

    /**
     * Giảm số lượng từ cũ đi 1
     */
    public void DownSoLuongCu() {
        soluongdahoc--;
    }

    /**
     * Ghép 2 bộ từ vựng với nhau
     *
     * @param temp là bộ từ đầu vào
     * @param tenchudemoi là tên chủ đề mới
     */
    public void Up(BoTuVung temp, String tenchudemoi) {
        this.list.addAll(temp.list);
        this.soluongTu += temp.soluongTu;
        this.chude = tenchudemoi;
        Sort();
    }

    /**
     * Tìm kiếm 1 từ có trong list hay không
     *
     * @param English là tên tiếng anh của từ muốn tìm
     * @return true nếu tìm thấy, false nếu không tìm thấy
     */
    public boolean Search(String English) {
        for (int i = 0; i < soluongTu; i++) {
            if (list.get(i).getEnglish().compareTo(English) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Sắp xếp danh sách các từ theo thứ tự bảng chữ cái
     */
    public void Sort() {
        Collections.sort(list, (TuVung o1, TuVung o2) -> {
            if (o1.getEnglish().compareTo(o2.getEnglish()) > 0) {
                return 1;
            } else if (o1.getEnglish().compareTo(o2.getEnglish()) < 0) {
                return -1;
            } else {
                return 0;
            }
        });
    }

    /**
     * Thiết lập lại trạng thái mới cho tất cả các từ
     */
    public void reset() {
        for (TuVung TV : list) {
            if (TV.isIsRead() == true) {
                TV.setIsRead(false);
                for (TuVung W : BienChuongTrinh.tuontap.getLearntWord()) {
                    if (W.getEnglish().compareTo(TV.getEnglish()) == 0) {
                        BienChuongTrinh.tuontap.remove(W);
                        break;
                    }
                }
            }
        }
        soluongdahoc = 0;
    }
}
