package org.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CountNumsException extends RuntimeException {
    public CountNumsException(String message) {
        super(message);
    }
}
