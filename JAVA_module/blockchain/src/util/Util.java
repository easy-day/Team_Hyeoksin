package util;

import java.security.MessageDigest;

public class Util {

		public static String getHash(String input) { //getHash함수 이름, String input 함수의 입력 값
			StringBuffer result = new StringBuffer();
			try {
				MessageDigest md = MessageDigest.getInstance("SHA-256"); //messageDigest라는 라이브러리를 이용하여 'SHA-256' 해시알고리즘을 사용
				md.update(input.getBytes());
				byte bytes[] = md.digest(); //바이트 배열 형태
				for(int i = 0; i < bytes.length; i++) {
					result.append(
							Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			return result.toString(); //함수의 반환 값
		}
}
