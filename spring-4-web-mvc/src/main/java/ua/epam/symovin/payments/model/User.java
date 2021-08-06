package ua.epam.symovin.payments.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int userId;
    private String login;
    private String password;
    private boolean active;

    private UserInfo userInfo;
    private UserType userType;

    private List<BankCard> bankCards;
}
