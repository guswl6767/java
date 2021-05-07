package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.mlec.util.ConnectionFactory;
import kr.ac.mlec.util.JDBCClose;

public class SelectMain02 {
           public static void main(String[] args) {
			
        	   Connection conn = null;
        	   PreparedStatement pstmt = null;
        	   
        	   Scanner sc = new Scanner(System.in);
        	   System.out.println("검색할 아이디 입력 : ");
        	   String id = sc.nextLine();
        	   
        	   try {
				
        		   conn = new ConnectionFactory().getConnection();
        		   String sql ="select name ";
        		          sql += " from t_test ";
        		          sql += " where id=? ";
        		    pstmt = conn.prepareStatement(sql);
        		    pstmt.setString(1, id);
        		    
        		    ResultSet rs = pstmt.executeQuery();
        		    
        		    if(rs.next()) {
        		    	String name = rs.getString("name");
        		    	System.out.println(id +"에 회원명은"+name+"입니다");
        		    } else {
        		    	System.out.println("[" + id + "]에 해당 회원이 없습니다.");
        		    }
        		    
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			} finally {
				JDBCClose.close(conn,pstmt);
			}
		}
}
