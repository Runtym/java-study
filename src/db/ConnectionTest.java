package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "select * from user_info2";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.print(rs.getString("ui_num")+",");
				System.out.print(rs.getString("ui_name")+",");
				System.out.print(rs.getString("ui_age")+",");
			}
			sql = "insert into user_info2(ui_num, ui_name,ui_age)";
			sql += " values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.setString(2, "test");
			ps.setInt(3, 33);
			ps.executeUpdate();

			sql = "update user_info2 set ui_name=?,ui_age=?";
			sql += " where ui_num=?";
			ps = con.prepareStatement(sql);
			ps.setInt(2, 22);
			ps.setString(1, "test");
			ps.setInt(3, 1);
			ps.executeUpdate();

			sql = "delete user_info2 ";
			sql += " where ui_num=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}




