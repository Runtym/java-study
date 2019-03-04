package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectionTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "select * from board";
			ResultSet rs = stmt.executeQuery(sql);
			List<HashMap<String,String>> rowList = new ArrayList<>();
			ResultSetMetaData rsmd = rs.getMetaData();
			for(int i=0;i<rsmd.getColumnCount();i++) {
				System.out.println(rsmd.getColumnLabel(i));
			}
			while(rs.next()){
				HashMap<String,String> row = new HashMap<>();
				row.put("num1",rs.getString("num1"));
				row.put("num2",rs.getString("num2"));
				row.put("sum",rs.getString("sum"));
				row.put("title",rs.getString("title"));
				row.put("reg_date",rs.getString("reg_date"));
				row.put("content",rs.getString("content"));
				rowList.add(row);
			}
			
			System.out.println("연결 성공!");
			for(HashMap<String,String> row : rowList) {
				System.out.println(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}




