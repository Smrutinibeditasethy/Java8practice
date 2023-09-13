package com.datenineteentwentytwentyonetwentytwo;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Demo10 {
public static void main(String[] args) {
	String pwd = "Smruti_890";
	
	Encoder ec = Base64.getEncoder();
	byte[] encode = ec.encode(pwd.getBytes());
	String ecPwd = new String(encode);
	System.out.println(ecPwd);
	
	Decoder dc = Base64.getDecoder();
	byte[] decode = dc.decode(ecPwd);
	String dcPwd = new String(decode);
	System.out.println(dcPwd);
	
}
}
