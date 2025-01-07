package com.legion.moneymanager.gui.transactiontype;

import com.legion.moneymanager.transactiontype.domain.model.TransactionType;
import org.mapstruct.Mapper;

@Mapper
public interface TransactionTypeDtoMapper {
    TransactionTypeDto toDto(TransactionType transactionType);
    TransactionType toDomain(TransactionTypeDto transactionTypeDto);
}
