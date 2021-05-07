package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import kr.ac.mlec.util.ConnectionFactory;
import kr.ac.mlec.util.JDBCClose;

/*
  ���̵� �Է��ϼ��� : kang
  �̸��� �Է��ϼ���  : ���浿
 */
public class InsertMain03 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//������ ����, ���� �Ѵ� ��밡��
			//conn = new ConnectionFactory().getConnection();
     		
			ConnectionFactory factory = new ConnectionFactory();
			conn = factory.getConnection();
			
			//3�ܰ�
     		String sql = "insert into t_test(id,name) ";
     		       sql += " values(?,?) ";
     		
     		        Scanner sc = new Scanner(System.in);
     	     		
     	     		System.out.println("���̵� �Է� :");
     	     		String id =sc.nextLine();
     	     		System.out.println("�̸��� �Է� :");
     	     		String name = sc.nextLine();
     	     		
     	     		pstmt = conn.prepareStatement(sql);
     	     		// values �� ?? ���ڿ� ä���ֱ� �˾Ƽ� ��������ǥ �� ->preparestatement ��ü ����
                    pstmt.setString(1, id);
                    pstmt.setString(2, name);
                    
     	     		int cnt = pstmt.executeUpdate();
     	     		System.out.println("��"+cnt+"�� ���� ���ԵǾ����ϴ�");
     		//5�ܰ� close��Ű�� null�� �ƴѰ�쿡�� �����ϰ��ϱ�
     		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			JDBCClose.close(conn,pstmt);
			
//			JDBCClose.close(pstmt);
//			JDBCClose.close(conn);
				}
		}
		
	}


