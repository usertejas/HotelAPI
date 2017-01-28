package com.hotelapi.details.DButils;
import java.sql.*;  



public class MysqlCon{  
public static String runQuery(String query){  
	ResultSet rs = null;
	String result = null;
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/hotel","root","passion123");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		 rs=stmt.executeQuery(query);  
		while(rs.next())  
			result ="{Hotel_id:"+rs.getInt(1)+","+"Hotelname:"+rs.getString(2)+"}";  
		con.close();  
	}catch(Exception e){
		             	System.out.println(e);
						}  
	return result;
	}  
}  