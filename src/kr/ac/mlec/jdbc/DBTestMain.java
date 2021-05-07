package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 �۾�����
 1. ����̹��ε� : Class.forname()
 2. �����ͺ��̽� ���� : drivermanager�� �̿��Ͽ� db����, connection ��ü ���
 3. SQL ����
 4. ��� ����
 5. ���� ����
 */
public class DBTestMain {
	
	public static void main(String[] args) {
		
		try {
			// 1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
//             2. �����ͺ��̽� ���� �� connection ���� ���
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("DB���� ���� :" + conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
