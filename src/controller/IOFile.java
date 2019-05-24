package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import model.DuLieuTuVung;
import model.BoTuVung;
import model.TuVung;
import java.io.PrintWriter;
import java.util.Calendar;
import model.BienChuongTrinh;
import model.DuLieuThongKe;
import model.TuOnTap;

/**
 * Class thực hiện chức năng vào ra dữ liệu từ file cho chương trình
 *
 * @author Phương Anh Tuấn + Nguyễn Ngọc Tú
 */
public class IOFile {

    /**
     * Phương thức nhập các bìa bộ từ vựng vào biến chính
     *
     * @param dulieutuvung là lớp quản lý các bộ từ vựng
     * @throws java.io.FileNotFoundException
     */
    public static void InputBook(DuLieuTuVung dulieutuvung) throws FileNotFoundException {
        int STT = 0;
        File file = new File("data/book.txt");
        try (Scanner scanner = new Scanner(file, "UTF-8")) {
            while (scanner.hasNext()) {
                String tenchude = scanner.nextLine();
                String duongdan = scanner.nextLine();
                BoTuVung temp = new BoTuVung();
                temp.setChude(tenchude);
                temp.setDuongdanFile(duongdan);
                temp.setSoThuTu(STT);
                temp.setNumberLearnt(0);
                STT++;
                dulieutuvung.addBook(temp);
            }
        } catch (Exception e) {
            System.out.println("Có lỗi!");
        }
    }

    /**
     * Phương thức nhập dữ liệu từ 1 file từ mới được thêm vào bằng chức năng
     * thêm bộ từ
     *
     * @param BTV là bộ từ cần nhập dữ liệu
     * @param filename là tên file chứa dữ liệu từ vựng
     */
    public static void InputNewBook(BoTuVung BTV, String filename) {
        File file = new File(filename);
        try (Scanner scanner = new Scanner(file, "UTF-8")) {
            while (scanner.hasNext()) {
                String eng = scanner.nextLine();
                String vie = scanner.nextLine();
                String Voice = scanner.nextLine();
                String Type = scanner.nextLine();
                String exam = scanner.nextLine();
                String img = scanner.nextLine();
                String islearnt = scanner.nextLine();
                TuVung tempWord = new TuVung();
                tempWord.setEnglish(eng);
                tempWord.setVietnamese(vie);
                tempWord.setVoice(Voice);
                tempWord.setType(Type);
                tempWord.setExampleCase(exam);
                tempWord.setExampleImage(img);
                if (islearnt.compareTo("false") == 0) {
                    tempWord.setIsRead(false);
                } else {
                    tempWord.setIsRead(true);
                }
                BTV.addW(tempWord);
            }
        } catch (Exception e) {
            System.out.println("Có lỗi!");
        }
    }

    /**
     * Phương thức xuất dữ liệu bìa bộ từ ra file nguồn
     *
     * @param dulieutuvung là lớp quản lý các bộ từ vựng
     * @throws java.io.IOException
     */
    public static void OutputBook(DuLieuTuVung dulieutuvung) throws IOException {
        File file = new File("data/book.txt");

        try (PrintWriter printwrite = new PrintWriter(file, "UTF-8")) {
            for (int i = 0; i < dulieutuvung.getSoluongBotuvung(); i++) {
                printwrite.println(dulieutuvung.getBook().get(i).getChude());
                printwrite.println(dulieutuvung.getBook().get(i).getDuongdanFile());
            }
        } catch (Exception e) {
            System.out.println("Có lỗi!");
        }
    }

    /**
     * Phương thức nhập các từ vựng từ file nguồn vào biến chính
     *
     * @param dulieutuvung là lớp quản lý dữ liệu từ vựng
     */
    public static void InputWord(DuLieuTuVung dulieutuvung) {
        for (int i = 0; i < dulieutuvung.getSoluongBotuvung(); i++) {
            File file = new File(dulieutuvung.getBook().get(i).getDuongdanFile());
            try (Scanner scanner = new Scanner(file, "UTF-8")) {
                while (scanner.hasNext()) {
                    String eng = scanner.nextLine();
                    String vie = scanner.nextLine();
                    String Voice = scanner.nextLine();
                    String Type = scanner.nextLine();
                    String exam = scanner.nextLine();
                    String img = scanner.nextLine();
                    String islearnt = scanner.nextLine();
                    TuVung tempWord = new TuVung();
                    tempWord.setEnglish(eng);
                    tempWord.setVietnamese(vie);
                    tempWord.setVoice(Voice);
                    tempWord.setType(Type);
                    tempWord.setExampleCase(exam);
                    tempWord.setExampleImage(img);
                    if (islearnt.compareTo("false") == 0) {
                        tempWord.setIsRead(false);
                    } else {
                        tempWord.setIsRead(true);
                    }
                    dulieutuvung.getBook().get(i).addW(tempWord);
                    dulieutuvung.getBook().get(i).Sort();
                }
            } catch (Exception e) {
                System.out.println("Có lỗi!");
            }
        }
    }

    /**
     * Phương thức xuất dữ liệu từ vựng từ biến chính ra file nguồn
     *
     * @param dulieutuvung là lớp quản lý dữ liệu từ vựng
     * @throws java.io.IOException
     */
    public static void OutputWord(DuLieuTuVung dulieutuvung) throws IOException {
        for (int i = 0; i < dulieutuvung.getSoluongBotuvung(); i++) {
            File file = new File(dulieutuvung.getBook().get(i).getDuongdanFile());

            try (PrintWriter printwrite = new PrintWriter(file, "UTF-8")) {
                for (int j = 0; j < dulieutuvung.getBook().get(i).getSoluongTu(); j++) {
                    printwrite.println(dulieutuvung.getBook().get(i).getList().get(j).getEnglish());
                    printwrite.println(dulieutuvung.getBook().get(i).getList().get(j).getVietnamese());
                    printwrite.println(dulieutuvung.getBook().get(i).getList().get(j).getVoice());
                    printwrite.println(dulieutuvung.getBook().get(i).getList().get(j).getType());
                    printwrite.println(dulieutuvung.getBook().get(i).getList().get(j).getExampleCase());
                    printwrite.println(dulieutuvung.getBook().get(i).getList().get(j).getExampleImage());
                    if (dulieutuvung.getBook().get(i).getList().get(j).isIsRead() == false) {
                        printwrite.println("false");
                    } else {
                        printwrite.println("true");
                    }
                }
            } catch (Exception e) {
                System.out.println("Có lỗi!");
            }
        }
    }

    /**
     * Phương thức nhập dữ liệu từ vựng đã được học từ file nguồn vào biến chính
     *
     * @param tuontap là lớp quản lý các từ vựng cũ
     */
    public static void InputOldWords(TuOnTap tuontap) {
        File file = new File("data/learnt.txt");
        try (Scanner scanner = new Scanner(file, "UTF-8")) {
            while (scanner.hasNext()) {
                String eng = scanner.nextLine();
                String vie = scanner.nextLine();
                String Voice = scanner.nextLine();
                String Type = scanner.nextLine();
                String exam = scanner.nextLine();
                String img = scanner.nextLine();
                TuVung tempWord = new TuVung();
                tempWord.setEnglish(eng);
                tempWord.setVietnamese(vie);
                tempWord.setExampleImage(img);
                tempWord.setVoice(Voice);
                tempWord.setType(Type);
                tempWord.setExampleCase(exam);
                tuontap.add(tempWord);
            }
        } catch (Exception e) {
            System.out.println("Có lỗi!");
        }
    }

    /**
     * Phương thức xuất dữ liệu từ vựng đã được ôn ra file nguồn
     *
     * @param tuontap là lớp quản lý các từ vựng cũ
     */
    public static void OutputOldWords(TuOnTap tuontap) throws IOException {
        File file = new File("data/learnt.txt");
        if (file == null) {
            file.createNewFile();
        }
        try (PrintWriter printwrite = new PrintWriter(file, "UTF-8")) {
            for (int i = 0; i < tuontap.getSoluongTu(); i++) {
                printwrite.println(tuontap.getLearntWord().get(i).getEnglish());
                printwrite.println(tuontap.getLearntWord().get(i).getVietnamese());
                printwrite.println(tuontap.getLearntWord().get(i).getVoice());
                printwrite.println(tuontap.getLearntWord().get(i).getType());
                printwrite.println(tuontap.getLearntWord().get(i).getExampleCase());
                printwrite.println(tuontap.getLearntWord().get(i).getExampleImage());
            }
        } catch (Exception e) {
            System.out.println("Có lỗi!");
        }

    }

    /**
     * Nhập dữ liệu thống kê từ file nguồn
     *
     * @param dulieuthongke là đối tượng quản lý dữ liệu thống kê
     */
    public static void InputDataStatistic(DuLieuThongKe dulieuthongke) {
        File file = new File("data/dataview/thongke.txt");
        try (Scanner scanner = new Scanner(file, "UTF-8")) {
            while (scanner.hasNext()) {
                Calendar date;
                date = Calendar.getInstance();
                int ngay = scanner.nextInt();
                int thang = scanner.nextInt();
                int nam = scanner.nextInt();
                int tudahoc = scanner.nextInt();
                int tudaon = scanner.nextInt();
                date.set(nam, thang - 1, ngay);
                BienChuongTrinh.dulieuthongke.addFromFile(date, tudahoc, tudaon);
            }
        } catch (Exception e) {
            System.out.println("Có lỗi!");
        }
    }

    /**
     * Xuất dữ liệu thống kê ra file nguồn
     *
     * @param dulieuthongke là đối tượng quản lý dữ liệu thống kê
     */
    public static void OutputDataStatistic(DuLieuThongKe dulieuthongke) throws IOException {
        File file = new File("data/dataview/thongke.txt");
        if (file == null) {
            file.createNewFile();
        }
        try (PrintWriter printwrite = new PrintWriter(file, "UTF-8")) {
            for (int i = 0; i < dulieuthongke.getSoluongngaythongke(); i++) {
                printwrite.println(dulieuthongke.getThongke().get(i).getDate().get(Calendar.DAY_OF_MONTH));
                printwrite.println(dulieuthongke.getThongke().get(i).getDate().get(Calendar.MONTH) + 1);
                printwrite.println(dulieuthongke.getThongke().get(i).getDate().get(Calendar.YEAR));
                printwrite.println(dulieuthongke.getThongke().get(i).getSotudahoc());
                printwrite.println(dulieuthongke.getThongke().get(i).getSotudaon());
            }
        } catch (Exception e) {
            System.out.println("Có lỗi!");
        }
    }

    /**
     * Nhập dữ liệu từ vựng mỗi ngày từ file nguồn
     *
     * @param dulieutuvung là nơi lưu dữ liệu
     */
    public static void InputTuMoiNgay(DuLieuTuVung dulieutuvung) {
        File file = new File("data/dataview/tumoi.txt");
        try (Scanner scanner = new Scanner(file, "UTF-8")) {
            while (scanner.hasNext()) {
                String eng = scanner.nextLine();
                String vie = scanner.nextLine();
                String Voice = scanner.nextLine();
                String Type = scanner.nextLine();
                String exam = scanner.nextLine();
                String img = scanner.nextLine();
                TuVung tempWord = new TuVung();
                tempWord.setEnglish(eng);
                tempWord.setVietnamese(vie);
                tempWord.setExampleImage(img);
                tempWord.setVoice(Voice);
                tempWord.setType(Type);
                tempWord.setExampleCase(exam);
                dulieutuvung.getTumoi().add(tempWord);
            }
        } catch (Exception e) {
            System.out.println("Có lỗi!");
        }

        file = new File("data/dataview/tucu.txt");
        try (Scanner scanner = new Scanner(file, "UTF-8")) {
            while (scanner.hasNext()) {
                String eng = scanner.nextLine();
                String vie = scanner.nextLine();
                String Voice = scanner.nextLine();
                String Type = scanner.nextLine();
                String exam = scanner.nextLine();
                String img = scanner.nextLine();
                TuVung tempWord = new TuVung();
                tempWord.setEnglish(eng);
                tempWord.setVietnamese(vie);
                tempWord.setExampleImage(img);
                tempWord.setVoice(Voice);
                tempWord.setType(Type);
                tempWord.setExampleCase(exam);
                dulieutuvung.getTucu().add(tempWord);
            }
        } catch (Exception e) {
            System.out.println("Có lỗi!");
        }
    }

    /**
     * Xuất dữ liệu từ mỗi ngày ra file nguồn
     *
     * @param dulieutuvung nơi lưu dữ liệu
     */
    public static void OutputTuMoiNgay(DuLieuTuVung dulieutuvung) throws IOException {
        File file = new File("data/dataview/tumoi.txt");
        if (file == null) {
            file.createNewFile();
        }
        try (PrintWriter printwrite = new PrintWriter(file, "UTF-8")) {
            for (TuVung TV : dulieutuvung.getTumoi()) {
                printwrite.println(TV.getEnglish());
                printwrite.println(TV.getVietnamese());
                printwrite.println(TV.getVoice());
                printwrite.println(TV.getType());
                printwrite.println(TV.getExampleCase());
                printwrite.println(TV.getExampleImage());
            }
        } catch (Exception e) {
            System.out.println("Có lỗi!");
        }

        file = new File("data/dataview/tucu.txt");
        try (PrintWriter printwrite = new PrintWriter(file, "UTF-8")) {
            for (TuVung TV : dulieutuvung.getTucu()) {
                printwrite.println(TV.getEnglish());
                printwrite.println(TV.getVietnamese());
                printwrite.println(TV.getVoice());
                printwrite.println(TV.getType());
                printwrite.println(TV.getExampleCase());
                printwrite.println(TV.getExampleImage());
            }
        } catch (Exception e) {
            System.out.println("Có lỗi!");
        }
    }

    /**
     * Phương thức xóa 1 file theo tên truyền vào
     *
     * @param filename là đường dẫn đến file và tên
     */
    public static void removeFile(String filename) {
        File file = new File(filename);
    }
}
