package ua.epam.symovin.payments.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankCard {
    private int cardId;
    private String cardNumber;
    private String cardIban;
    private BigDecimal cardBalance;
    private BigDecimal creditLimitCurrent;
    private BigDecimal creditLimitAvailable;
    private boolean block;
    private Date startDate;
    private Date endDate;
    private boolean request;

    private User user;
    private List<Payment> payments;
}
