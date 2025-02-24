package com.legion.moneymanager.transactiontype.domain.port.out;

import com.legion.moneymanager.common.genericserviceapi.GenericCrudRepository;
import com.legion.moneymanager.transactiontype.domain.model.TransactionType;

public interface TransactionTypeRepository extends GenericCrudRepository<TransactionType, Long> {
}
