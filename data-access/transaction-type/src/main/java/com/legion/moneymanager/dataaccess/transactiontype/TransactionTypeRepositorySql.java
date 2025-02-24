package com.legion.moneymanager.dataaccess.transactiontype;

import com.legion.moneymanager.dataaccess.common.GenericCommonRepositorySql;
import com.legion.moneymanager.dataaccess.common.GenericDomainSqlMapper;
import com.legion.moneymanager.transactiontype.domain.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public class TransactionTypeRepositorySql extends GenericCommonRepositorySql<TransactionType, Long, TransactionTypeSql> {

    public TransactionTypeRepositorySql(GenericDomainSqlMapper<TransactionType, TransactionTypeSql> domainSqlMapper, JpaRepository<TransactionTypeSql, Long> jpaRepository) {
        super(domainSqlMapper, jpaRepository);
    }
}
