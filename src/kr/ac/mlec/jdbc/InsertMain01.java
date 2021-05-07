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

id : hong, name : 홍길동 삽입

insert into t_test(id,name) values ('hong', '홍길동')
 */
public class InsertMain01 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
//             2. 데이터베이스 접속 및 connection 접속 얻기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password ="hr";
			
     		conn = DriverManager.getConnection(url,user,password);
			
//             3. SQL을 갖는 statement 객체 얻어오기
			stmt = conn.createStatement();
			String sql = "insert into t_test(id, name) values('hong2','홍길동')";
			
//	           4. statement 객체를 이용하요 sql문 실행, 결과반환
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총"+ cnt+"개 행이 삽입되었습니다");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//         5. 데이터베이스 접속 해제 stack 형태로 해제
			
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


