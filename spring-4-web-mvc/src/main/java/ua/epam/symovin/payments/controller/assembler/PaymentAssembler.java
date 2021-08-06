package ua.epam.symovin.payments.controller.assembler;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;
import ua.epam.symovin.payments.controller.PaymentController;
import ua.epam.symovin.payments.controller.UserController;
import ua.epam.symovin.payments.controller.model.PaymentModel;
import ua.epam.symovin.payments.controller.model.UserModel;
import ua.epam.symovin.payments.dto.PaymentDto;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class PaymentAssembler extends RepresentationModelAssemblerSupport<PaymentDto, PaymentModel> {
    public static final String GET_REL = "get_payment";
    public static final String CREATE_REL = "create_payment";
    public static final String UPDATE_REL = "update_payment";
    public static final String DELETE_REL = "delete_payment";

    public PaymentAssembler() {
        super(PaymentController.class, PaymentModel.class);
    }

    @Override
    public PaymentModel toModel(PaymentDto entity) {
        PaymentModel paymentModel = new PaymentModel(entity);

        Link get = linkTo(methodOn(PaymentController.class).getPayment(entity.getPaymentId())).withRel(GET_REL);
        Link create = linkTo(methodOn(PaymentController.class).addPayment(entity)).withRel(CREATE_REL);
        Link update = linkTo(methodOn(PaymentController.class).confirmPayment(entity.getPaymentId()))
                .withRel(UPDATE_REL);
        Link delete = linkTo(methodOn(PaymentController.class).deletePayment(entity.getPaymentId()))
                .withRel(DELETE_REL);

        paymentModel.add(get, create, update, delete);

        return paymentModel;
    }
}
