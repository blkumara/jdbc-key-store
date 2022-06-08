package com.ty.userkeystore.Controller;

import com.ty.keystore.Service.UserService;
import com.ty.keystore.dao.UserDao;
import com.ty.userkeystore.dto.User;

public class TestUser {
	public static void main(String[] args) {
		
	
		UserService service=new UserService();
		
		User user= new User();
		user.setUid(2);
		user.setUserName("pavan");
		user.setEmail("pavan@gmail.com");
		user.setPassword("pavan123");
		
		UserDao dao=new UserDao();
		
		dao.saveUser(user);
		

	
	
	}
	
}
