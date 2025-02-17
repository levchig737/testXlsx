package org.example.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.example.controllers.annotations.SwaggerFindN;
import org.example.services.XlsxService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/xlsx")
public class XlsxController {

    private final XlsxService xlsxService;

    @GetMapping("/find-max")
    @SwaggerFindN
    public Integer findNthMaxNumber(
            @RequestParam String filePath,
            @RequestParam Integer n
    ) {
        return xlsxService.findNthMaxNumber(filePath, n);
    }
}

