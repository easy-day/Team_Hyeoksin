package util;

import java.security.MessageDigest;

public class Util {

		public static String getHash(String input) { //getHash�Լ� �̸�, String input �Լ��� �Է� ��
			StringBuffer result = new StringBuffer();
			try {
				MessageDigest md = MessageDigest.getInstance("SHA-256"); //messageDigest��� ���̺귯���� �̿��Ͽ� 'SHA-256' �ؽþ˰����� ���
				md.update(input.getBytes());
				byte bytes[] = md.digest(); //����Ʈ �迭 ����
				for(int i = 0; i < bytes.length; i++) {
					result.append(
							Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			return result.toString(); //�Լ��� ��ȯ ��
		}
}
