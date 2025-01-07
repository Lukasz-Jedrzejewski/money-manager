package com.legion.moneymanager.transactiontype.domain.model;

import lombok.Builder;

@Builder(toBuilder = true)
public record TransactionType(Long id, String name, Short priority) {
}
