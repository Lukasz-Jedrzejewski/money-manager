package com.legion.moneymanager.gui.transactiontype;

import org.springframework.stereotype.Component;

@Component
public class TransactionTypeGuiService {

    private final TransactionTypeDtoMapper mapper;

    public TransactionTypeGuiService(TransactionTypeDtoMapper mapper) {
        this.mapper = mapper;
    }

    public void test(TransactionTypeDto dto) {
        var domain = mapper.toDomain(dto);
        System.out.println(domain.toString());
    }
}
