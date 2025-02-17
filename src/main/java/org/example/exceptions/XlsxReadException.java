package org.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class XlsxReadException extends RuntimeException {
    public XlsxReadException(String message) {
        super(message);
    }
}
