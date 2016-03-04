package com.zdpzsp.frame.utils;

import com.zdpzsp.frame.exception.DESDecryptException;
import com.zdpzsp.frame.exception.DESEncryptException;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

public class DES {

	public static int _DES = 1;
	public static int _DESede = 2;
	public static int _Blowfish = 3;

	private Cipher p_Cipher;
	private SecretKey p_Key;
	private String p_Algorithm;
	private static DES _instance;

	private static String hexKey = "183712131312314353484591dadbc382a18340bf83414536";/*密钥 */

	private void selectAlgorithm(int al) {
		switch (al) {
		default:
		case 1:
			this.p_Algorithm = "DES";
			break;
		case 2:
			this.p_Algorithm = "DESede";
			break;
		case 3:
			this.p_Algorithm = "Blowfish";
			break;
		}
	}

	public DES(int algorithm) throws NoSuchPaddingException, NoSuchAlgorithmException {
		this.selectAlgorithm(algorithm);
		Security.addProvider(new com.sun.crypto.provider.SunJCE());
		this.p_Cipher = Cipher.getInstance(this.p_Algorithm);
	}

	public byte[] getKey() {
		return this.checkKey().getEncoded();
	}

	private SecretKey checkKey() {
		try {
			if (this.p_Key == null) {
				KeyGenerator keygen = KeyGenerator
						.getInstance(this.p_Algorithm);
				/*
				 SecureRandom sr = new SecureRandom(key.getBytes());
				 keygen.init(168, sr);*/
				this.p_Key = keygen.generateKey();
			}
		} catch (Exception nsae) {
		}
		return this.p_Key;
	}

	public void setKey(byte[] enckey) {
		this.p_Key = new SecretKeySpec(enckey, this.p_Algorithm);
	}

	public byte[] encode(byte[] data) throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
		this.p_Cipher.init(Cipher.ENCRYPT_MODE, this.checkKey());
		return this.p_Cipher.doFinal(data);
	}

	public byte[] decode(byte[] encdata, byte[] enckey) throws Exception {
		this.setKey(enckey);
		this.p_Cipher.init(Cipher.DECRYPT_MODE, this.p_Key);
		return this.p_Cipher.doFinal(encdata);
	}

	public String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int i = 0; i < b.length; i++) {
			stmp = Integer.toHexString(b[i] & 0xFF);
			if (stmp.length() == 1) {
				hs += "0" + stmp;
			} else {
				hs += stmp;
			}
		}
		return hs.toUpperCase();
	}

	public byte[] hex2byte(String hex) throws IllegalArgumentException {
		if (hex.length() % 2 != 0) {
			System.out.println("hex:" + hex + "\nlength:" + hex.length());
			throw new IllegalArgumentException();
		}
		char[] arr = hex.toCharArray();
		byte[] b = new byte[hex.length() / 2];
		for (int i = 0, j = 0, l = hex.length(); i < l; i++, j++) {
			String swap = "" + arr[i++] + arr[i];
			int byteint = Integer.parseInt(swap, 16) & 0xFF;
			b[j] = new Integer(byteint).byteValue();
		}
		return b;
	}

	public static String encrypt(String s) throws DESEncryptException {
		String hexenc = null;

		try {
			//byte[] key; //密钥文件(byte)
			if (null == _instance) {
                _instance = new DES(DES._DESede);
            }
			//key = _instance.getKey();
			_instance.setKey(_instance.hex2byte(_instance.hexKey));
			//String hexkey = _instance.byte2hex(key); //生成十六进制密钥
			byte[] enc = _instance.encode(s.getBytes()); //生成加密文件(byte)
			hexenc = _instance.byte2hex(enc);
			//System.out.println("hexkey:"+hexkey);
			//System.out.println("hexenc:"+hexenc);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DESEncryptException();
		}
		return hexenc;
	}

	public static String decrypt(String s) throws DESDecryptException {
		String r=null;
		try {
			if (null == _instance) {
                _instance = new DES(DES._DESede);
            }
			r=new String(_instance.decode(_instance.hex2byte(s), _instance
                    .hex2byte(_instance.hexKey)));
		} catch (Exception e) {
			e.printStackTrace();
			throw new DESDecryptException();
		}
		return r;
	}

	public static void main(String[] args) throws Exception {
		String passwd = DES.encrypt("m2ducAONPxAWeq3pQMjq");
		//String passwd = "";
		System.out.println("密文：" + passwd);
		System.out.println("明文：" + DES.decrypt(passwd));
		char s = 47;
	}

}
