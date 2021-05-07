package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
  아이디를 입력하세요 : kang
  이름을 입력하세요  : 강길동
 */
public class InsertMain02 {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password ="hr";
			
     		conn = DriverManager.getConnection(url,user,password);
     		
			
     		// 3단계
     		stmt = conn.createStatement();
     		//키보드 입력 객체
     		Scanner sc = new Scanner(System.in);
     		
     		System.out.println("아이디를 입력 :");
     		String id =sc.nextLine();
     		System.out.println("이름을 입력 :");
     		String name = sc.nextLine();
     		
     		// 이어붙일 때 space  
     		String sql = "insert into t_test(id,name)" ;
     		       sql += "values(\'"+ id +"\', \'"+name+"\')";
     		       
     		 // 4단계 실행하는게 stmt 객체
     		int cnt = stmt.executeUpdate(sql);
     		System.out.println("총"+cnt+"개 행이 삽입되었습니다");
     		
     		
     		//5단계 close시키기 null이 아닌경우에만 실행하게하기
     		
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
