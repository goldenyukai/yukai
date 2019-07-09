package com.yukai.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yukai.beans.TestUser;
import com.yukai.dao.TestUserMapper;
import com.yukai.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
//@Resource
//private TestUserMapper testUserMapper;
	@Resource
	private TestService testsService;
@RequestMapping("/testMethod")
public String testMethod(Model model) {
	String msg="sdsa";
	model.addAttribute("msg", msg);
	return "test";
	
}
@RequestMapping("/insert")
public String testInsert() {
	testsService.insertTest();
//    TestUser user=TestUser.builder().name("asdahhh").build();
//    testUserMapper.insertSelective(user);
    return "test";
}
}
