package com.ty.keystore.Service;

import static com.ty.keystore.util.AppConstant.SECRETE_KEY;

import com.ty.keystore.dao.UserDao;
import com.ty.keystore.util.AES;
import com.ty.userkeystore.dto.User;

public class UserService {
	UserDao dao=new UserDao();
	public int saveUser(User user)
	{
		String encName=AES.encrypt((user.getUserName()),SECRETE_KEY );
		String encEmail=AES.encrypt((user.getEmail()),SECRETE_KEY );
		//String encPhone=AES.encrypt(p.getPhone(),SECRETE_KEY );
		
		user.setUserName(encName);
		user.setEmail(encEmail);
	//	user.setPhone(encPhone);
		return dao.saveUser(user);
	}
		
}
