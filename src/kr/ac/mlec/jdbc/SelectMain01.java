package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.mlec.util.ConnectionFactory;
import kr.ac.mlec.util.JDBCClose;

public class SelectMain01 {
  public static void main(String[] args) {
	
          Connection conn = null;
          PreparedStatement pstmt = null;
          
          
           try {
        	   //1,2
        	   conn= new ConnectionFactory().getConnection();
			   //3
        	   String sql = "select * from t_test ";
        	   pstmt = conn.prepareStatement(sql);
        	   
        	   //4 executequery�� �����ͺ��̽��� �����͸� ������(2���� ǥ���� ����)
        	   ResultSet rs = pstmt.executeQuery();
        	   
        	   while(rs.next()) {
        		   
        	   String id =rs.getString("id");
        	   String name =rs.getString("name");
        	   System.out.println("id: " +id+",name :" + name);
        	   System.out.println("��ȸ�� �Ϸ��߽��ϴ�");
        	   }
		} catch (Exception e) {
             e.printStackTrace();	
			// TODO: handle exception
		} finally {
			JDBCClose.close(conn,pstmt);
		}
}
          
}
