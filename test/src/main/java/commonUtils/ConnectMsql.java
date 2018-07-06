package commonUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMsql {
	public static void main(String[] args) throws SQLException {
		//声明Connection对象
		Connection con;
		//驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		//url指向要访问的数据库名ip360_test
		String url = "jdbc:mysql://101.201.112.127:3306/ip360_test";
		//mysql用户名
		String user = "ip360";
		//mysql密码
		String passWord = "ip360@truthso2016";
		
		try {
			//加载驱动程序
			Class.forName(driver);
			//连接数据库
			con = DriverManager.getConnection(url, user, passWord);
			if(!con.isClosed())
				System.out.println("Succeeded connecting to the Database!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
