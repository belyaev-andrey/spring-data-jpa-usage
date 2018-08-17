package com.company.sample.core.repositories.config;

import com.haulmont.cuba.core.entity.Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface CubaJpaRepository<T extends Entity<ID>, ID extends Serializable> extends CrudRepository <T, ID> {

    T findOne(ID id, String view);

    Iterable<T> findAll(String view);

    Iterable<T> findAll(Iterable<ID> ids, String view);

    String getDefaultViewName();

    void setDefaultViewName(String defaultViewName);
}
