package jobsite;
import java.sql.*;
public class LoginDatabase {
	public boolean loginValidate(String u, String p) {
		boolean check = false;
		try {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:file:F:/DB/h2", "sa", "");

			PreparedStatement ps = con.prepareStatement("select * from accounts where User=? and Pass=?");
			ps.setString(1, u);
			ps.setString(2, p);
			ResultSet rs = ps.executeQuery();
			System.out.println("Lobindb Module" + rs);
			check = rs.next();
			con.close(); // Error can't declare in finally	// out.print("You are successfully logged in...");
		} catch (Exception e2) {
			System.out.println(e2);
		}
		return check;
	}

}
