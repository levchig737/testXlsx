package org.example.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.example.services.XlsxService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/xlsx")
public class XlsxController {

    private final XlsxService xlsxService;

    @GetMapping("/find-max")
    @Operation(summary = "Находит N-ое максимальное число в XLSX файле")
    public int findNthMaxNumber(
            @RequestParam @Parameter(description = "Путь к локальному файлу XLSX") String filePath,
            @RequestParam @Parameter(description = "Порядковый номер максимального числа") int n
    ) {
        return xlsxService.findNthMaxNumber(filePath, n);
    }
}

