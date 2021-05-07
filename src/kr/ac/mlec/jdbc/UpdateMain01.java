package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*id�� hang�� ȸ���� �̸��� ��浿���� ����

  update t_test
  set name = '��浿'
  where id = 'hang'
*/
public class UpdateMain01 {
       public static void main(String[] args) {
		   
    	   Connection conn = null;
   		PreparedStatement pstmt = null;
    	   
    	   try {
			
    		  Class.forName("oracle.jdbc.driver.OracleDriver");
    					String url = "jdbc:oracle:thin:@localhost:1521:xe";
    					String user = "hr";
    					String password ="hr"; 
    					
    		  conn = DriverManager.getConnection(url,user,password);
    		  
    		  String sql = "update t_test ";
    		         sql += "set name =(?)";
    		         sql += "where id =(?)";
    		         
    		         Scanner sc = new Scanner(System.in);
      	     		
      	     		System.out.println("���̵� �Է� :");
      	     		String id =sc.nextLine();
      	     		System.out.println("�̸��� �Է� :");
      	     		String name = sc.nextLine();
      	     		
      	     		pstmt = conn.prepareStatement(sql);
      	     		// values �� ?? ���ڿ� ä���ֱ� �˾Ƽ� ��������ǥ �� ->preparestatement ��ü ����
                     pstmt.setString(1, name);
                     pstmt.setString(2, id);
                     
      	     		int cnt = pstmt.executeUpdate();
      	     		System.out.println("��"+cnt+"�� ���� �����Ǿ����ϴ�");
      		//5�ܰ� close��Ű�� null�� �ƴѰ�쿡�� �����ϰ��ϱ�
      	  		
   		} catch (Exception e) {
   			e.printStackTrace();
   		} finally {
   			if (pstmt !=null)
   				try {
   					pstmt.close();
   				} catch (SQLException e1) {
   					// TODO Auto-generated catch block
   					e1.printStackTrace();
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
 	
