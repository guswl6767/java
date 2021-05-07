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
  아이디를 입력하세요 : kang
  이름을 입력하세요  : 강길동
 */
public class InsertMain03 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//간단히 한줄, 두줄 둘다 사용가능
			//conn = new ConnectionFactory().getConnection();
     		
			ConnectionFactory factory = new ConnectionFactory();
			conn = factory.getConnection();
			
			//3단계
     		String sql = "insert into t_test(id,name) ";
     		       sql += " values(?,?) ";
     		
     		        Scanner sc = new Scanner(System.in);
     	     		
     	     		System.out.println("아이디를 입력 :");
     	     		String id =sc.nextLine();
     	     		System.out.println("이름을 입력 :");
     	     		String name = sc.nextLine();
     	     		
     	     		pstmt = conn.prepareStatement(sql);
     	     		// values 값 ?? 문자열 채워넣기 알아서 작은따옴표 들어감 ->preparestatement 객체 역할
                    pstmt.setString(1, id);
                    pstmt.setString(2, name);
                    
     	     		int cnt = pstmt.executeUpdate();
     	     		System.out.println("총"+cnt+"개 행이 삽입되었습니다");
     		//5단계 close시키기 null이 아닌경우에만 실행하게하기
     		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			JDBCClose.close(conn,pstmt);
			
//			JDBCClose.close(pstmt);
//			JDBCClose.close(conn);
				}
		}
		
	}


