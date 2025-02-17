package org.example.controllers.annotations;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Operation(summary = "Найти N-ое максимальное число",
        description = "Находит N-ое максимальное число в XLSX файле",
        parameters = {
                @Parameter(
                        name = "filePath",
                        description = "Путь к локальному файлу XLSX",
                        required = true,
                        example = "test.xlsx"),
                @Parameter(
                        description = "Порядковый номер максимального числа",
                        name = "n",
                        required = true)
        }
)
public @interface SwaggerFindN {}