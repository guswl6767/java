package kr.ac.mlec.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 drop table t_test;

create table t_test (
id varchar2(10) primary key,
name varchar2(20) not null );

id : hong, name : ȫ�浿 ����

insert into t_test(id,name) values ('hong', 'ȫ�浿')
 */
public class InsertMain01 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// 1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
//             2. �����ͺ��̽� ���� �� connection ���� ���
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password ="hr";
			
     		conn = DriverManager.getConnection(url,user,password);
			
//             3. SQL�� ���� statement ��ü ������
			stmt = conn.createStatement();
			String sql = "insert into t_test(id, name) values('hong2','ȫ�浿')";
			
//	           4. statement ��ü�� �̿��Ͽ� sql�� ����, �����ȯ
			int cnt = stmt.executeUpdate(sql);
			System.out.println("��"+ cnt+"�� ���� ���ԵǾ����ϴ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//         5. �����ͺ��̽� ���� ���� stack ���·� ����
			
			try {
				stmt.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	}


