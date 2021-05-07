package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.mlec.util.ConnectionFactory;

public class InsertMain04 {
    public static void main(String[] args) {
		//sql은 auto를 가지고있지않아서 try위쪽에 위치해야한다 try안에 위치 x
    	String sql = "insert into t_test";
    	       sql += " values(?,?)";
    	//괄호안에는 특정한 변수(autoclose라는 메소드를 상속받은 변수만 가능) connection 넣으면 무조건 close 가능 1.7	버전
    	try(
    			Connection conn = new ConnectionFactory().getConnection();
    			PreparedStatement pstmt = conn.prepareStatement(sql);
    			
    			
    			) {
			Scanner sc = new Scanner(System.in);
			System.out.println("삽입할 아이디 :");
			String id = sc.nextLine();
			System.out.println("삽입할 이름:");
			String name = sc.nextLine();
			
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"행 입력");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
