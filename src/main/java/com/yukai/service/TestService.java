package com.yukai.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yukai.beans.TestUser;
import com.yukai.dao.TestUserMapper;

@Service
public class TestService {
@Resource
private TestUserMapper testUserMapper;
public void insertTest() {
  TestUser user=TestUser.builder().name("asdahhhjj").build();
  testUserMapper.insertSelective(user);
}
}
