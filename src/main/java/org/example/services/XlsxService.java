package org.example.services;

import org.example.exceptions.CountNumsException;

/**
 * Сервис для поиска N-го максимального числа в XLSX-файле.
 */
public interface XlsxService {

    /**
     * Находит N-е по величине число в указанном XLSX-файле.
     *
     * @param filePath Путь к локальному файлу формата XLSX.
     * @param n Порядковый номер максимального числа (1 — максимум, 2 — второй максимум и т. д.).
     * @return N-е максимальное число, если файл содержит достаточное количество чисел.
     * @throws CountNumsException Если в файле недостаточно чисел.
     */
    Integer findNthMaxNumber(String filePath, Integer n);
}
