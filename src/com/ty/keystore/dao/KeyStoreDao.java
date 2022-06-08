package com.ty.keystore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.keystore.util.ConnectionObject;
import com.ty.userkeystore.dto.KeyStore;

public class KeyStoreDao {

	public int saveKeyStore(KeyStore keyStore) {
		Connection connection = ConnectionObject.getConnection();
		String sql = "Insert into keystore values(?,?,?,?,?,?)";
		int resultCount = 0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, keyStore.getPid());
			preparedStatement.setString(2, keyStore.getComment());
			preparedStatement.setString(3, keyStore.getDescription());
			preparedStatement.setString(4, keyStore.getKey());
			preparedStatement.setString(5, keyStore.getValue());
			preparedStatement.setInt(6, keyStore.getUid());

			resultCount = preparedStatement.executeUpdate();
			System.out.println("Data Saved");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return resultCount;
	}

	public List<KeyStore> getKeyStoreById(int uid) {
		List<KeyStore> list = new ArrayList<KeyStore>();
		Connection connection = ConnectionObject.getConnection();
		String sql = "Select * from keystore where uid=?";

		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, uid);
			ArrayList<KeyStore> arrayList = new ArrayList<KeyStore>();
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int pid = resultSet.getInt(1);
				String comment = resultSet.getString(2);
				String description = resultSet.getString(3);
				String key = resultSet.getString(4);
				String value = resultSet.getString(5);
				int uid1 = resultSet.getInt(6);

				KeyStore keyStore = new KeyStore();
				keyStore.setPid(pid);
				keyStore.setComment(comment);
				keyStore.setDescription(description);
				keyStore.setKey(key);
				keyStore.setValue(value);
				keyStore.setUid(uid);
				list.add(keyStore);
				System.out.println("*********");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

}
