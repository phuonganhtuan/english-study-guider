package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import model.BoTuVung;
import model.TuVung;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Lớp thực hiện chức năng làm việc với file Excel
 *
 * @author Phương Anh Tuấn + Nguyễn Ngọc Tú
 */
public class IOExcel {

    /**
     * Nhập dữ liệu vào 1 bộ từ vựng từ file excel
     *
     * @param BTV là bộ từ muốn thêm
     * @param filename là tên file excel
     * @throws FileNotFoundException là lỗi không tìm thấy file
     * @throws IOException là lỗi vào ra file
     */
    public static void InputFromExcel(BoTuVung BTV, String filename) throws FileNotFoundException, IOException {
        try (FileInputStream file = new FileInputStream(filename); XSSFWorkbook workbook = new XSSFWorkbook(file)) {
            XSSFSheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                TuVung TV = new TuVung();
                TV.setEnglish(row.getCell(0).getStringCellValue());
                TV.setVietnamese(row.getCell(1).getStringCellValue());
                TV.setVoice(row.getCell(2).getStringCellValue());
                TV.setType(row.getCell(3).getStringCellValue());
                TV.setExampleCase(row.getCell(4).getStringCellValue());
                TV.setExampleImage(row.getCell(5).getStringCellValue());
                TV.setIsRead(false);
                BTV.addW(TV);
            }
        } catch (Exception e) {
            System.out.println("có lỗi!");
        }
    }

    /**
     * Xuất dữ liệu của 1 bộ từ ra file excel
     *
     * @param BTV là bộ từ muốn xuất
     * @throws FileNotFoundException lỗi không tìm thấy file
     * @throws IOException lỗi file
     */
    public static void OutputToExcel(BoTuVung BTV) throws FileNotFoundException, IOException {
        try (FileOutputStream file = new FileOutputStream(BTV.getChude() + ".xlsx"); XSSFWorkbook workbook = new XSSFWorkbook()) {
            XSSFSheet sheet = workbook.createSheet(BTV.getChude());
            XSSFRow row;
            XSSFCell cellA;
            XSSFCell cellB;
            XSSFCell cellC;
            XSSFCell cellD;
            XSSFCell cellE;
            XSSFCell cellF;

            for (int i = 0; i < BTV.getSoluongTu(); i++) {
                row = sheet.createRow(i);
                cellA = row.createCell(0);
                cellA.setCellValue(BTV.getList().get(i).getEnglish());
                cellB = row.createCell(1);
                cellB.setCellValue(BTV.getList().get(i).getVietnamese());
                cellC = row.createCell(2);
                cellC.setCellValue(BTV.getList().get(i).getVoice());
                cellD = row.createCell(3);
                cellD.setCellValue(BTV.getList().get(i).getType());
                cellE = row.createCell(4);
                cellE.setCellValue(BTV.getList().get(i).getExampleCase());
                cellF = row.createCell(5);
                cellF.setCellValue(BTV.getList().get(i).getExampleImage());
            }
            workbook.write(file);
        } catch (Exception e) {
            System.out.println("có lỗi!");
        }
    }
}
