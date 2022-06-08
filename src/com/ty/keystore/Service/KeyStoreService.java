package com.ty.keystore.Service;

import static com.ty.keystore.util.AppConstant.SECRETE_KEY;

import com.ty.keystore.dao.KeyStoreDao;
import com.ty.userkeystore.dto.KeyStore;
import com.ty.keystore.util.AES;

public class KeyStoreService {
	KeyStoreDao dao=new KeyStoreDao();
	KeyStore keyStore=new KeyStore();
	public int saveVisitor( KeyStore keyStore)
	{
		String encName=AES.encrypt(keyStore.getValue(),SECRETE_KEY );
		String encEmail=AES.encrypt(keyStore.getKey(),SECRETE_KEY );
		//String encPhone=AES.encrypt(p.getPhone(),SECRETE_KEY );
		
		keyStore.setValue(encName);
		keyStore.setKey(encEmail);
	//	person.setPhone(encPhone);
		return dao.saveKeyStore(keyStore);
	}
		
}
