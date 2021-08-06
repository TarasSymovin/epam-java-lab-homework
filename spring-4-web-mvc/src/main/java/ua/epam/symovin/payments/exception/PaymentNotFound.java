package ua.epam.symovin.payments.exception;

import ua.epam.symovin.payments.model.enums.ErrorType;

public class PaymentNotFound extends ServiceException{
    private static final String DEFAULT_MESSAGE = "Payment is not found!";

    public PaymentNotFound(String message) {
        super(DEFAULT_MESSAGE);
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.VALIDATION_ERROR_TYPE;
    }
}
