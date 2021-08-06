package ua.epam.symovin.payments.controller.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;
import ua.epam.symovin.payments.dto.BankCardDto;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class BankCardModel extends RepresentationModel<BankCardModel> {
    @JsonUnwrapped
    private BankCardDto bankCardDto;
}
