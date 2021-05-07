package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import kr.ac.mlec.util.ConnectionFactory;

/*id가 hang인 회원의 이름을 행길동으로 변경

  update t_test
  set name = '행길동'
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
      	     		
      	     		System.out.println("아이디를 입력 :");
      	     		String id =sc.nextLine();
      	     		System.out.println("이름을 입력 :");
      	     		String name = sc.nextLine();
      	     		
      	     	
      	     		// values 값 ?? 문자열 채워넣기 알아서 작은따옴표 들어감 ->preparestatement 객체 역할
                     pstmt.setString(1, name);
                     pstmt.setString(2, id);
                     
      	     		int cnt = pstmt.executeUpdate();
      	     		System.out.println("총"+cnt+"개 행이 수정되었습니다");
      		//5단계 close시키기 null이 아닌경우에만 실행하게하기
      	  		
   		} catch (Exception e) {
   			e.printStackTrace();
   		} 
   		
   	}

   }
 	