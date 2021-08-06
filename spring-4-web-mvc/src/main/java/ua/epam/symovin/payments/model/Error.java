package ua.epam.symovin.payments.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.epam.symovin.payments.model.enums.ErrorType;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Error {
    private String message;
    private ErrorType errorType;
    private LocalDateTime timeStamp;
}
