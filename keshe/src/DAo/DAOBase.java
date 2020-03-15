package DAo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DAOBase implements DAO{
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=MOVIE_DATABASE;user=student;password=student";
			conn = DriverManager.getConnection(url);
			System.out.println("shujukulianjiecheng");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
