package model;

/**
 * class đại diện cho cấu trúc của 1 từ vựng tiếng anh
 *
 * @author Phương Anh Tuấn
 */
public class TuVung {

    //Tiếng anh
    private String english;

    //Nghĩa của từ
    private String vietnamese;

    //Tên file ảnh minh họa
    private String exampleImage;

    //Phát âm của từ
    private String voice;

    //Từ loại
    private String type;

    //Ví dụ sử dụng
    private String exampleCase;

    //Biến trạng thái đã hay chưa được học
    private boolean isRead = false;

    //Biến phụ phục vụ chức năng ôn tập trắc nghiệm
    public boolean isAsked = false;

    /**
     * Lấy phát âm từ
     *
     * @return phát ấm từ
     */
    public String getVoice() {
        return voice;
    }

    /**
     * Thiết lập phát âm từ
     *
     * @param voice phát âm từ
     */
    public void setVoice(String voice) {
        this.voice = voice;
    }

    /**
     * Lấy thông tin từ loại
     *
     * @return từ loại
     */
    public String getType() {
        return type;
    }

    /**
     * Thiết lập từ loại
     *
     * @param type từ loại
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Lấy thông tin ví dụ minh họa của từ
     *
     * @return ví dụ minh họa
     */
    public String getExampleCase() {
        return exampleCase;
    }

    /**
     * Thiết lập ví dụ minh họa cho từ
     *
     * @param exampleCase ví dụ minh họa
     */
    public void setExampleCase(String exampleCase) {
        this.exampleCase = exampleCase;
    }

    /**
     * Lấy tên tiếng anh của từ
     *
     * @return tên tiếng anh
     */
    public String getEnglish() {
        return english;
    }

    /**
     * Thiết lập tên tiếng anh của từ
     *
     * @param english là tên tiếng anh
     */
    public void setEnglish(String english) {
        this.english = english;
    }

    /**
     * Lấy nghĩa của từ
     *
     * @return là nghĩa tiếng việt
     */
    public String getVietnamese() {
        return vietnamese;
    }

    /**
     * Đặt nghĩa cho từ
     *
     * @param vietnamese là nghĩa tiếng việt của từ
     */
    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    /**
     * Lấy tên file ảnh minh họa cho từ
     *
     * @return tên ảnh minh họa
     */
    public String getExampleImage() {
        return exampleImage;
    }

    /**
     * Đặt ảnh minh họa cho từ
     *
     * @param exampleImage là tên ảnh minh họa
     */
    public void setExampleImage(String exampleImage) {
        this.exampleImage = exampleImage;
    }

    /**
     * Lấy trạng thái đã học của từ
     *
     * @return là trạng thái đã học
     */
    public boolean isIsRead() {
        return isRead;
    }

    /**
     * Đặt trạng thái đã học cho từ
     *
     * @param isRead là trạng thái đã học
     */
    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    /**
     * In ra dạng chuỗi của từ
     *
     * @return dạng chuỗi của từ
     */
    @Override
    public String toString() {
        return (english + " (" + voice + "): " + vietnamese);
    }

    /**
     * lấy giá trị theo dòng của từ
     *
     * @return đối tượng dòng chứa các thuộc tính văn bản
     */
    public Object[] toObject() {
        return new Object[]{
            english, vietnamese, voice, type, exampleCase, exampleImage
        };
    }

    /**
     * lấy giá trị theo dòng của từ
     *
     * @return đối tượng dòng chứa các thuộc tính văn bản
     */
    public Object[] tolearntObject() {
        return new Object[]{
            english, vietnamese, voice, type, exampleCase
        };
    }

}
