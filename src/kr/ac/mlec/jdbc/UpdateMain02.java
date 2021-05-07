package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import kr.ac.mlec.util.ConnectionFactory;

/*id�� hang�� ȸ���� �̸��� ��浿���� ����

  update t_test
  set name = '��浿'
  where id = 'hang'
*/
public class UpdateMain02 {
       public static void main(String[] args) {
		   
    	   String sql = "update t_test ";
    	   sql += "set name =(?)";
    	   sql += "where id =(?)";
    	
    	   
    	   try(	
    			   Connection conn = new ConnectionFactory().getConnection();
       			PreparedStatement pstmt = conn.prepareStatement(sql);
       			
    			   
    			   ) {
			
    		
    		  
    		         
    		        Scanner sc = new Scanner(System.in);
      	     		
      	     		System.out.println("���̵� �Է� :");
      	     		String id =sc.nextLine();
      	     		System.out.println("�̸��� �Է� :");
      	     		String name = sc.nextLine();
      	     		
      	     	
      	     		// values �� ?? ���ڿ� ä���ֱ� �˾Ƽ� ��������ǥ �� ->preparestatement ��ü ����
                     pstmt.setString(1, name);
                     pstmt.setString(2, id);
                     
      	     		int cnt = pstmt.executeUpdate();
      	     		System.out.println("��"+cnt+"�� ���� �����Ǿ����ϴ�");
      		//5�ܰ� close��Ű�� null�� �ƴѰ�쿡�� �����ϰ��ϱ�
      	  		
   		} catch (Exception e) {
   			e.printStackTrace();
   		} 
   		
   	}

   }
 	