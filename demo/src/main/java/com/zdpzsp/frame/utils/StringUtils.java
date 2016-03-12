package com.zdpzsp.frame.utils;

public class StringUtils {

	private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String ASCII_LOWERCASE = LOWERCASE;
	public static final String ASCII_UPPERCASE = UPPERCASE;
	public static final String ASCIILETTERS = ASCII_LOWERCASE + ASCII_UPPERCASE;
	public static final String DIGITS = "0123456789";

	public static String base62Encode(Integer num){
		String alphabet = DIGITS + ASCIILETTERS;
		if (num == 0){
			return String.valueOf(alphabet.charAt(0));
		}
		StringBuilder digitsBuilder = new StringBuilder();
		int base = alphabet.length();
		while (num != 0){
			int rem = num % base;
			num = num / base;
			digitsBuilder.append(String.valueOf(alphabet.charAt(rem)));
		}
		return digitsBuilder.reverse().toString();
	}

	public static String arrayToDelimitedString(Object[] arr, String delim) {
		if (arr == null || arr.length == 0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				sb.append(delim);
			}
			sb.append(arr[i]);
		}
		return sb.toString();
	}
}
