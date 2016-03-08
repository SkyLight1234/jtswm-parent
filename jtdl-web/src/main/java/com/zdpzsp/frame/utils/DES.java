package com.zdpzsp.frame.utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.Security;

/**
 * Created by apple on 15/12/15.
 */
public class DES {

    public static int _DES = 1;
    public static int _DESede = 2;
    public static int _Blowfish = 3;

    private Cipher p_Cipher;
    private SecretKey p_Key;
    private String p_Algorithm;
    private static DES _instance;

    private static String hexKey = "183712131312314353484591dadbc382a18340bf83414536";/*密钥 */

    public static int getDes() {
        return _DES;
    }

    public static void setDes(int Des) {
        _DES = Des;
    }

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

    public DES(int algorithm) throws Exception {
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

    public byte[] encode(byte[] data) throws Exception {
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

    public static String encrypt(String s) throws Exception {
        //byte[] key; //密钥文件(byte)
        if (null == _instance) {
            _instance = new DES(DES._DESede);
        }
        //key = _instance.getKey();
        _instance.setKey(_instance.hex2byte(_instance.hexKey));
        //String hexkey = _instance.byte2hex(key); //生成十六进制密钥
        byte[] enc = _instance.encode(s.getBytes()); //生成加密文件(byte)
        String hexenc = _instance.byte2hex(enc);
        //System.out.println("hexkey:"+hexkey);
        //System.out.println("hexenc:"+hexenc);
        return hexenc;
    }

    public static String decrypt(String s) throws Exception {
        if (null == _instance) {
            _instance = new DES(DES._DESede);
        }
        return new String(_instance.decode(_instance.hex2byte(s), _instance
                .hex2byte(_instance.hexKey)));
    }

    public static void main(String[] args) throws Exception {
		String passwd = DES.encrypt("4BWj3euVS59VqVCH");
        //String passwd = "06D129761979353A25DA4A5B6DA8E09B";
        System.out.println("密文：" + passwd);
        System.out.println("明文：" + DES.decrypt(passwd));

        System.out.println(DES.encrypt("spu:1;1:3;2:5"));
        char s = 47;
    }

}
