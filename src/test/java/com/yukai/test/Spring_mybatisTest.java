package com.yukai.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yukai.beans.TestUser;
import com.yukai.dao.TestUserMapper;

public class Spring_mybatisTest {
	private static ApplicationContext bean=new ClassPathXmlApplicationContext("spring\\applicationContext.xml");
    private TestUserMapper testUserMapper; 
	@Test
    public void testMapper() {
		testUserMapper=bean.getBean(TestUserMapper.class);
        TestUser user=TestUser.builder().name("asda").build();
        testUserMapper.insertSelective(user);
	}

	

}
