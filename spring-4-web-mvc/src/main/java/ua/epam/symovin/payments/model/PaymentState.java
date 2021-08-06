package ua.epam.symovin.payments.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class PaymentState {
    private int paymentStateId;
    private String paymentState;
}
