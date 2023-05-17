package com.spring.demo.service;

import com.spring.demo.entity.Test;

public interface CustomRepository {
  Test customFindMethod(Integer id);
}
