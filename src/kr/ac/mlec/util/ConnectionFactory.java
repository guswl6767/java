package kr.ac.mlec.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
          public Connection getConnection() {
        	  //연결되기전에는 null
        	 Connection conn =null; 
        	  try {
				
        		  Class.forName("oracle.jdbc.driver.OracleDriver");
        		  
        		  String url ="jdbc:oracle:thin:@localhost:1521:xe";
        		  String user ="hr";
        		  String password ="hr";
        		  
        		  conn = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	  return conn;
          }
}
