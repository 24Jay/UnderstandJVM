

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDatabase
{
	public static final String url = "jdbc:mysql://localhost:3306/QQSpider";

	public static void main(String[] args) throws SQLException 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%55");
		Connection connection;
		try
		{
			connection = DriverManager.getConnection(url, "root", "zhangjie");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from singers");// 选择import
			while (rs.next())
			{// 如果对象中有数据，就会循环打印出来
				System.out.println(rs.getString("name"));
			}
		} catch (SQLException e)
		{
			System.out.print("SQLException e = " + e);
			e.printStackTrace();
		}

		
																					// java.sql.ResultSet;
		
	}
}
