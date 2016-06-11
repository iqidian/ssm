package com.ssm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.web.base.BaseService;
import com.ssm.web.pojo.UserInfo;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private  BaseService<UserInfo> baseServer;
	
	@RequestMapping("add")
	public ModelAndView add(@ModelAttribute UserInfo obj){
		ModelAndView view=new ModelAndView();
		try {
			for (int i = 0; i < 100000; i++) {
				obj.setUsername("make"+i);
				obj.setNickname("nickname"+i);
				baseServer.add("UserMapper.add", obj);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		view.setViewName("user/user_list");
		return view;
	}
	
	@RequestMapping("list")
	public ModelAndView list(@ModelAttribute UserInfo obj){
		ModelAndView view=new ModelAndView();
		try {
			List<UserInfo> list=baseServer.list("UserMapper.list", obj);
			view.addObject("list", list);
			view.setViewName("user/user_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	
}
