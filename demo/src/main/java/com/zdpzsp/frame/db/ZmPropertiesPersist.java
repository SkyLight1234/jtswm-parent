package com.zdpzsp.frame.db;


import com.zdpzsp.frame.utils.DES;
import org.springframework.util.DefaultPropertiesPersister;

import java.io.*;
import java.util.Properties;

public class ZmPropertiesPersist extends DefaultPropertiesPersister {

	public void load(Properties props, InputStream is) throws IOException {

		Properties properties = new Properties();
		properties.load(is);

		if ((properties.get("password") != null)) {
			/* 这里通过解密算法，得到你的真实密码，然后写入到properties中 */
			try {
				String password = DES.decrypt(properties
						.getProperty("password"));
				properties.setProperty("password", password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		OutputStream outputStream = null;
		try {
			outputStream = new ByteArrayOutputStream();
			properties.store(outputStream, "");
			is = outStream2InputStream(outputStream);
			super.load(props, is);
		} catch (IOException e) {
			throw e;
		} finally {
			outputStream.close();
		}
	}

	private InputStream outStream2InputStream(OutputStream out) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos = (ByteArrayOutputStream) out;
		ByteArrayInputStream swapStream = new ByteArrayInputStream(
				bos.toByteArray());
		return swapStream;
	}
}
