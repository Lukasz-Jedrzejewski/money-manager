package com.legion.moneymanager.gui.transactiontype;

import org.springframework.stereotype.Component;

@Component
public class TransactionTypeGuiService {

    private final TransactionTypeDtoMapper mapper;

    public TransactionTypeGuiService(TransactionTypeDtoMapper mapper) {
        this.mapper = mapper;
    }
}
