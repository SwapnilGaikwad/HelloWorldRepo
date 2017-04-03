package com.fun.java8;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Encoding {

	public static void main(String[] args) {
		try {
			String base64Encoding = Base64.getEncoder().encodeToString("Encoded string".getBytes("utf-8"));
			System.out.println("Encoding string: " + base64Encoding);
			byte [] origStr = Base64.getDecoder().decode(base64Encoding);
			System.out.println("Decoded string: " + new String(origStr, "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
