package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.mlec.util.ConnectionFactory;

public class InsertMain04 {
    public static void main(String[] args) {
		//sql�� auto�� �����������ʾƼ� try���ʿ� ��ġ�ؾ��Ѵ� try�ȿ� ��ġ x
    	String sql = "insert into t_test";
    	       sql += " values(?,?)";
    	//��ȣ�ȿ��� Ư���� ����(autoclose��� �޼ҵ带 ��ӹ��� ������ ����) connection ������ ������ close ���� 1.7	����
    	try(
    			Connection conn = new ConnectionFactory().getConnection();
    			PreparedStatement pstmt = conn.prepareStatement(sql);
    			
    			
    			) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������ ���̵� :");
			String id = sc.nextLine();
			System.out.println("������ �̸�:");
			String name = sc.nextLine();
			
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"�� �Է�");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
