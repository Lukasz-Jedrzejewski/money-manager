package com.legion.moneymanager.dataaccess.common;

import com.legion.moneymanager.common.genericserviceapi.GenericCrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class GenericCommonRepositorySql<DOMAIN_INSTANCE, DOMAIN_INSTANCE_ID, SQL_INSTANCE> implements GenericCrudRepository<DOMAIN_INSTANCE, DOMAIN_INSTANCE_ID> {
    protected final GenericDomainSqlMapper<DOMAIN_INSTANCE, SQL_INSTANCE> domainSqlMapper;

    protected final JpaRepository<SQL_INSTANCE, DOMAIN_INSTANCE_ID> jpaRepository;

    public GenericCommonRepositorySql(GenericDomainSqlMapper<DOMAIN_INSTANCE, SQL_INSTANCE> domainSqlMapper,
                                      JpaRepository<SQL_INSTANCE, DOMAIN_INSTANCE_ID> jpaRepository) {
        this.domainSqlMapper = domainSqlMapper;
        this.jpaRepository = jpaRepository;
    }

    @Override
    public DOMAIN_INSTANCE save(DOMAIN_INSTANCE domainInstance) {
        var sqlInstance = domainSqlMapper.fromDomain(domainInstance);
        var savedInstance = jpaRepository.save(sqlInstance);
        return domainSqlMapper.toDomain(sqlInstance);
    }

    @Override
    public DOMAIN_INSTANCE update(DOMAIN_INSTANCE domainInstance) {
        return save(domainInstance);
    }

    @Override
    public void delete(DOMAIN_INSTANCE_ID id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public boolean existsById(DOMAIN_INSTANCE_ID id) {
        return jpaRepository.existsById(id);
    }

    @Override
    public Optional<DOMAIN_INSTANCE> findById(DOMAIN_INSTANCE_ID id) {
        return jpaRepository.findById(id).map(domainSqlMapper::toDomain);
    }

    @Override
    public List<DOMAIN_INSTANCE> findAll() {
        return jpaRepository.findAll().stream().map(domainSqlMapper::toDomain).toList();
    }
}
