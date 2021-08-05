package ua.epam.symovin.payments.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.iban4j.Iban;
import org.springframework.stereotype.Service;
import ua.epam.symovin.payments.dto.BankCardDto;
import ua.epam.symovin.payments.dto.UserDto;
import ua.epam.symovin.payments.repository.BankCardRepository;
import ua.epam.symovin.payments.repository.UserRepository;
import ua.epam.symovin.payments.service.BankCardService;
import ua.epam.symovin.payments.service.MappingService;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class BankCardServiceImpl implements BankCardService {
    private final BankCardRepository bankCardRepository;
    private final MappingService mappingService;
    private final UserRepository userRepository;

    @Override
    public List<BankCardDto> getBankCardsForUser(int id) {
        log.info("Get bank cards for user with id {}", id);
        return bankCardRepository.getBankCardsForUser(id).stream()
                .map(mappingService::mapBankCardToBankCardDto)
                .collect(Collectors.toList());
    }

    @Override
    public BankCardDto getBankCard(int id) {
        log.info("Get bank card with id {}", id);
        return mappingService.mapBankCardToBankCardDto(bankCardRepository.getBankCard(id));
    }

    @Override
    public BankCardDto createBankCard(int userId) {
        log.info("Create bank card for user with id {}", userId);

        BankCardDto bankCardDto = new BankCardDto();
        bankCardDto.setCardNumber(generate());
        bankCardDto.setCardIban(Iban.random().toString());

        UserDto userDto = mappingService.mapUserToUserDto(userRepository.getUser(userId));
        bankCardDto.setUser(userDto);

        bankCardRepository.createBankCard(mappingService.mapBankCardDtoToBankCard(bankCardDto));

        return bankCardDto;
    }

    @Override
    public void deleteBankCard(int id) {
        log.info("Delete bank card with id {}", id);
        bankCardRepository.deleteBankCard(id);
    }

    private String generate() {
        Random random = new Random(System.currentTimeMillis());

        StringBuilder builder = new StringBuilder(16);
        for (int i = 0; i < 16; i++) {
            int digit = random.nextInt(10);
            builder.append(digit);
        }

        return builder.toString();
    }
}
