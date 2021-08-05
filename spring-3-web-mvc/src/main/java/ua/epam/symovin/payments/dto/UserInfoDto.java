package ua.epam.symovin.payments.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Builder
@Data
@AllArgsConstructor
public class UserInfoDto {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date birthday;
    private BigDecimal income;
    private String taxPayerNumber;
}
