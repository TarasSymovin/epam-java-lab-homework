package ua.epam.symovin.payments.exception;

import ua.epam.symovin.payments.model.enums.ErrorType;

public class ServiceException extends RuntimeException{
    private ErrorType errorType;

    public ServiceException(String message){
        super(message);
    }

    public ErrorType getErrorType() {
        return ErrorType.FATAL_ERROR_TYPE;
    }
}
