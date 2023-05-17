package com.spring.demo.service;

import com.spring.demo.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomTestRepository extends JpaRepository<Test, Integer>, CustomRepository {}
