package com.spring.demo.service;

import com.spring.demo.entity.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<Test, Integer> {}
