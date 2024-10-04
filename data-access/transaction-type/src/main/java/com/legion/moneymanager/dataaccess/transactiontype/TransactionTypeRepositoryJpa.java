package com.legion.moneymanager.dataaccess.transactiontype;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionTypeRepositoryJpa extends JpaRepository<TransactionTypeSql, Long> {
}
