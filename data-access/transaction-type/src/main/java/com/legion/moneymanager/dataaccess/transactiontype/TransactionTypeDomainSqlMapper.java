package com.legion.moneymanager.dataaccess.transactiontype;

import com.legion.moneymanager.transactiontype.domain.model.TransactionType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionTypeDomainSqlMapper {
    TransactionTypeSql toSql(TransactionType transactionType);
    TransactionType toDomain(TransactionTypeSql transactionTypeSql);
}
