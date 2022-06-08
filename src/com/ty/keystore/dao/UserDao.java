
package com.ty.keystore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.keystore.util.ConnectionObject;
import com.ty.userkeystore.dto.User;

public class UserDao {
	public int saveUser(User user)
	{
		int resultCount= 0;
		Connection connection=ConnectionObject.getConnection();
		String sql="Insert into user values(?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, user.getUid());
			preparedStatement.setString(2,user.getUserName());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPassword());
			
			resultCount=preparedStatement.executeUpdate();
			System.out.println("Data Inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCount;
		
	}
}
