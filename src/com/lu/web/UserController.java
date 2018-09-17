package com.lu.web;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lu.pojo.User;

@Controller
public class UserController {
	
	/*
	 * @RequestParam("username") String name 等价于
	 * name = username
	 */
	@RequestMapping("login")
	public String login(@RequestParam("username") String name,String password) {
		System.out.println("ssfafas");
		System.out.println(name);
		System.out.println(password);
		return "success";
	}
	
	
	@ModelAttribute
	public void getUser(Map<String,Object> map) {
		//模拟要修改的数据库的数据
		System.out.println("******getUser*******");
		User user = new User(1, "赵日天", "123456");
		map.put("user", user);
	}
	
	@RequestMapping("update")
	public String update(User user) {
		System.out.println(user);
		return "success";
	}
	
	@RequestMapping("sendSession")
	public String sendSession(HttpSession session) {
		session.setAttribute("msg", "你好啊");
		return "success";
	}
	
	
	
	

}
