package com.spring.demo.service;

import com.spring.demo.entity.Test;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.Objects;

public class CustomRepositoryImpl implements CustomRepository {

  @PersistenceContext private EntityManager entityManager;

  @Override
  public Test customFindMethod(Integer id) {
    return (Test)
        entityManager
            .createQuery("FROM Test t WHERE t.id = :id")
            .setParameter("id", id)
            .getSingleResult();
  }

  @PostConstruct
  public void postConstruct() {
    Objects.requireNonNull(entityManager);
  }
}
