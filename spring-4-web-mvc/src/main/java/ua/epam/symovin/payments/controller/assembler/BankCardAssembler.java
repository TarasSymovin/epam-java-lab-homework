package ua.epam.symovin.payments.controller.assembler;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;
import ua.epam.symovin.payments.controller.BankCardController;
import ua.epam.symovin.payments.controller.model.BankCardModel;
import ua.epam.symovin.payments.dto.BankCardDto;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class BankCardAssembler extends RepresentationModelAssemblerSupport<BankCardDto, BankCardModel> {
    public static final String GET_REL = "get_bankCard";
    public static final String CREATE_REL = "create_bankCard";
    public static final String DELETE_REL = "delete_bankCard";

    public BankCardAssembler() {
        super(BankCardController.class, BankCardModel.class);
    }

    @Override
    public BankCardModel toModel(BankCardDto entity) {
        BankCardModel bankCardModel = new BankCardModel(entity);

        Link get = linkTo(methodOn(BankCardController.class).getBankCard(entity.getCardId())).withRel(GET_REL);
        Link create = linkTo(methodOn(BankCardController.class).addBankCard(entity.getUser().getUserId())).withRel(CREATE_REL);
        Link delete = linkTo(methodOn(BankCardController.class).deleteBankCard(entity.getCardId()))
                .withRel(DELETE_REL);

        bankCardModel.add(get, create, delete);

        return bankCardModel;
    }
}
