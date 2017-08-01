package cn.netkiller.util;

import java.util.Random;

public class Randoms {
	public String randomString(String chars, int length) {
		Random rand = new Random();
		StringBuilder buf = new StringBuilder();
		for (int i = 0; i < length; i++) {
			buf.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return buf.toString();
	}
	/**
     * 获取4位随机验证码
     * @return
     */
    public static String getValidationCode(){
        return String.valueOf((new Random().nextInt(8999) + 1000));
    }

    /**
     * 获取6位随机验证码
     * @return
     */
    public static String getValidationCode2(){
        return String.valueOf((new Random().nextInt(899999) + 100000));
    }
}
