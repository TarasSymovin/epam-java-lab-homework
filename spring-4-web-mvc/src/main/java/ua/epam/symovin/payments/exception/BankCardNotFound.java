package ua.epam.symovin.payments.exception;

import ua.epam.symovin.payments.model.enums.ErrorType;

public class BankCardNotFound extends ServiceException{
    private static final String DEFAULT_MESSAGE = "Bank card is not found!";

    public BankCardNotFound(String message) {
        super(DEFAULT_MESSAGE);
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.VALIDATION_ERROR_TYPE;
    }
}
