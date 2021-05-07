package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
  ���̵� �Է��ϼ��� : kang
  �̸��� �Է��ϼ���  : ���浿
 */
public class InsertMain02 {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//1�ܰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2�ܰ�
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password ="hr";
			
     		conn = DriverManager.getConnection(url,user,password);
     		
			
     		// 3�ܰ�
     		stmt = conn.createStatement();
     		//Ű���� �Է� ��ü
     		Scanner sc = new Scanner(System.in);
     		
     		System.out.println("���̵� �Է� :");
     		String id =sc.nextLine();
     		System.out.println("�̸��� �Է� :");
     		String name = sc.nextLine();
     		
     		// �̾���� �� space  
     		String sql = "insert into t_test(id,name)" ;
     		       sql += "values(\'"+ id +"\', \'"+name+"\')";
     		       
     		 // 4�ܰ� �����ϴ°� stmt ��ü
     		int cnt = stmt.executeUpdate(sql);
     		System.out.println("��"+cnt+"�� ���� ���ԵǾ����ϴ�");
     		
     		
     		//5�ܰ� close��Ű�� null�� �ƴѰ�쿡�� �����ϰ��ϱ�
     		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(stmt !=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(conn !=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}
