package com.legion.moneymanager.common.genericserviceapi;

import java.util.List;
import java.util.Optional;

public interface GenericCrudRepository<DOMAIN_INSTANCE, DOMAIN_INSTANCE_ID> {

    DOMAIN_INSTANCE save(DOMAIN_INSTANCE entity);

    DOMAIN_INSTANCE update(DOMAIN_INSTANCE entity);

    void delete(DOMAIN_INSTANCE_ID domainObjectId);

    boolean existsById(DOMAIN_INSTANCE_ID id);

    Optional<DOMAIN_INSTANCE> findById(DOMAIN_INSTANCE_ID id);

    List<DOMAIN_INSTANCE> findAll();
}

