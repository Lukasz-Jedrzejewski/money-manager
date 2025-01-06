package com.legion.moneymanager.dataaccess.common;

public interface GenericDomainSqlMapper<DOMAIN_INSTANCE, SQL_INSTANCE> {
    SQL_INSTANCE fromDomain(DOMAIN_INSTANCE domainInstance);

    DOMAIN_INSTANCE toDomain(SQL_INSTANCE sqlInstance);
}
