package org.example.services.impl;

import org.apache.poi.ss.usermodel.*;
import org.example.services.XlsxService;
import org.example.utils.XlsxReader;
import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

@Service
public class XlsxServiceImpl implements XlsxService {
    public Integer findNthMaxNumber(String filePath, Integer n) {
        Workbook workbook = XlsxReader.getWorkbook(filePath);
        Sheet sheet = workbook.getSheetAt(0);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(n);
        int count = 0;

        for (Row row : sheet) {
            Cell cell = row.getCell(0);
            if (cell != null && cell.getCellType() == CellType.NUMERIC) {
                int num = (int) cell.getNumericCellValue();
                count++;

                if (minHeap.size() < n) {
                    minHeap.offer(num);
                } else if (!minHeap.isEmpty() && num > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.offer(num);
                }
            }
        }

        // Проверяем, есть ли вообще N чисел в файле
        if (count < n) {
            throw new IllegalArgumentException("В файле недостаточно чисел для поиска N-го максимального.");
        }

        return minHeap.peek();
    }
}
