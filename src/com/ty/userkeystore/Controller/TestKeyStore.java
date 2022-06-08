package com.ty.userkeystore.Controller;

import java.util.List;

import com.ty.keystore.dao.KeyStoreDao;
import com.ty.userkeystore.dto.KeyStore;

public class TestKeyStore {
	public static void main(String[] args) {
		//KeyStoreService keyStoreService=new KeyStoreService();
		KeyStore keyStore=new KeyStore();
		KeyStoreDao dao=new  KeyStoreDao();
		
//		keyStore.setPid(4);
//		keyStore.setComment("this is my snapchat");
//		keyStore.setDescription("SnapChat");
//		keyStore.setKey("7411920739");
//		keyStore.setValue("pavan@123");
//		keyStore.setUid(2);
//		dao.saveKeyStore(keyStore);
		
		List<KeyStore> list=dao.getKeyStoreById(1);
		
		System.out.println(list);
//		
		
	}
}
