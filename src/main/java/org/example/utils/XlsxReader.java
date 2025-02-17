package org.example.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.exceptions.XlsxReadException;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Component
public class XlsxReader {

    public static Workbook getWorkbook(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(new File(filePath));
            return new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new XlsxReadException("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
