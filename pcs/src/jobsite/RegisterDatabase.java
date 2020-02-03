package jobsite;
import java.sql.*;
public class RegisterDatabase {
	protected boolean registerAdd(String N,String US, String PWD, String email,String PN,String e)
	{

		boolean exist=false;
		try{  
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:file:F:/DB/h2","sa","");  
			//Username and Email Validation 
			/*
			String usr = "SELECT USER FROM ACCOUNTS";
			String ema = "SELECT EMAIL FROM ACCOUNTS";
		    Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery(usr);
		    ResultSet rs1 = stmt.executeQuery(ema);
		    */
			PreparedStatement ps1 = con.prepareStatement("Select * from ACCOUNTS where USER = ? or EMAIL = ?");
			ps1.setString(1, US);
			ps1.setString(2, email);
			ResultSet rs = ps1.executeQuery();
			exist=rs.next();
			System.out.println("Exist:" +exist);
		    if(exist==false)
		    {
		    	//System.out.println("Inside If Block:"+FN +SN+ +PWD +email +PN);
			PreparedStatement ps = con.prepareStatement("insert into accounts values(?,?,?,?,?,?)");
			ps.setString(1, N);
	        ps.setString(2, US);
	        ps.setString(3, PWD);
	        ps.setString(4, email);
	        ps.setString(5, PN);
	        ps.setString(6, e);
	        int i = ps.executeUpdate();
	        System.out.println("Inside If Block:"+N +US+ PWD +email +PN +e);
	        System.out.println("Registeration Successfull Updated Row Count" +i);
		    }
		    else
		    {
		    	System.out.println("Account Already Exist So No Details Added");
		    }
		    }
	        //Error can't declare in finally-Cleared
			//out.print("You are successfully registered...")
		catch (Exception e2)
	    {
		System.out.println(e2);
		}
		/*finally
		{
			try
	        {
	            if (con != null)
	                con.close ();
	            if (stmt != null)
	                stmt.close ();
	            if (ps != null)
	                ps.close ();
	        }
	        catch (SQLException ignore)
	        {
	        }
		}*/
		return exist;
	}


}
