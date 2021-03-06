package com.cuba.jpa.repository.config;

import com.cuba.jpa.repository.support.CubaRepositoryConfigurationExtension;
import org.springframework.data.repository.config.RepositoryBeanDefinitionRegistrarSupport;
import org.springframework.data.repository.config.RepositoryConfigurationExtension;

import java.lang.annotation.Annotation;

public class CubaRepositoriesRegistrar extends RepositoryBeanDefinitionRegistrarSupport {

    @Override
    protected Class<? extends Annotation> getAnnotation() {
        return EnableCubaRepositories.class;
    }

    @Override
    protected RepositoryConfigurationExtension getExtension() {
        return new CubaRepositoryConfigurationExtension();
    }
}
