package model;

import controller.IOFile;
import java.util.ArrayList;

/**
 * Class đại diện cho việc quản lý các bộ từ vựng
 *
 * @author Phương Anh Tuấn + Nguyễn Ngọc Tú
 */
public class DuLieuTuVung {

    //danh sách mảng chứa các bộ từ vựng
    private ArrayList<BoTuVung> Book = new ArrayList();

    //Số lượng bộ từ vựng hiện tại
    private int soluongBotuvung = 0;

    //Mảng lưu 10 từ mới theo từng ngày
    private ArrayList<TuVung> tumoi = new ArrayList(10);

    //Mảng lưu 10 từ lâu nhất chưa ôn lại
    private ArrayList<TuVung> tucu = new ArrayList(10);

    /**
     * Lấy danh sách 10 từ mới theo ngày
     *
     * @return danh sách từ mới
     */
    public ArrayList<TuVung> getTumoi() {
        return tumoi;
    }

    /**
     * Thiết lập danh sách từ mới theo ngày
     *
     * @param tumoi danh sách 10 từ mới theo từng ngày
     */
    public void setTumoi(ArrayList<TuVung> tumoi) {
        this.tumoi = tumoi;
    }

    /**
     * lấy danh sách 10 từ lâu nhất chưa ôn theo ngày
     *
     * @return danh sách từ lâu nhất chưa ôn
     */
    public ArrayList<TuVung> getTucu() {
        return tucu;
    }

    /**
     * thiết lập danh sách 10 từ lâu nhất chưa ôn
     *
     * @param tucu danh sách từ lâu nhất chưa ôn
     */
    public void setTucu(ArrayList<TuVung> tucu) {
        this.tucu = tucu;
    }

    /**
     * Làm mới dữ liệu từ lâu ôn nhất khi sang ngày hôm sau
     *
     * @param TOT là nơi chứa dữ liệu từ đã học
     */
    public void updateTucu(TuOnTap TOT) {
        ArrayList<TuVung> temp = new ArrayList(10);
        tucu = temp;
        if (TOT.getSoluongTu() >= 10) {
            for (int i = 0; i < 10; i++) {
                tucu.add(TOT.getLearntWord().get(i));
            }
        } else {
            for (int i = 0; i < TOT.getSoluongTu(); i++) {
                tucu.add(TOT.getLearntWord().get(i));
            }
        }
    }

    /**
     * Làm mới dữ liệu từ mới mỗi ngày khi sang ngày hôm sau
     */
    public void updateTumoi() {
        ArrayList<TuVung> temp = new ArrayList(10);
        tumoi = temp;
        int numNew = 0;
        for (int i = 0; i < soluongBotuvung; i++) {
            for (int j = 0; j < Book.get(i).getSoluongTu(); j++) {
                if (Book.get(i).getList().get(j).isIsRead() == false) {
                    tumoi.add(Book.get(i).getList().get(j));
                    numNew++;
                    if (numNew == 10) {
                        break;
                    }
                }
            }
            if (numNew == 10) {
                break;
            }
        }
    }

    /**
     * Lấy dữ liệu bộ từ
     *
     * @return tham chiếu đến danh sách bộ từ
     */
    public ArrayList<BoTuVung> getBook() {
        return Book;
    }

    /**
     * Thiết lập bộ từ
     *
     * @param Book là các bộ từ
     */
    public void setBook(ArrayList<BoTuVung> Book) {
        this.Book = Book;
    }

    /**
     * lấy số lượng bộ từ vựng
     *
     * @return số lượng bộ từ vựng
     */
    public int getSoluongBotuvung() {
        return soluongBotuvung;
    }

    /**
     * Thiết lập giá trị cho số lượng bột từ
     *
     * @param soluongBotuvung là số lượng bộ từ đang có
     */
    public void setSoluongBotuvung(int soluongBotuvung) {
        this.soluongBotuvung = soluongBotuvung;
    }

    /**
     * Thêm 1 bộ từ vựng mới
     *
     * @param btv là đối tượng bộ từ vựng
     */
    public void addBook(BoTuVung btv) {
        Book.add(btv);
        soluongBotuvung++;
    }

    /**
     * Thêm 1 bộ từ vựng theo tên truyền vào
     *
     * @param tenchude là tên của chủ đề từ vựng đó
     * @param duongdanfile là tên file chứa dữ liệu
     */
    public void addBook(String tenchude, String duongdanfile) {
        BoTuVung temp = new BoTuVung();
        temp.setChude(tenchude);
        temp.setDuongdanFile(duongdanfile);
        IOFile.InputNewBook(temp, duongdanfile);
        Book.add(temp);
        soluongBotuvung++;
    }

    /**
     * Xóa 1 bộ từ vựng theo vị trí truyền vào
     *
     * @param i là số thứ tự của bộ từ vựng đó trong mảng
     */
    public void removeBook(int i) {
        Book.remove(i);
        soluongBotuvung--;
    }

}
