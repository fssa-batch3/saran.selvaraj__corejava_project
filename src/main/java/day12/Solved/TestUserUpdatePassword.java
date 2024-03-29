package day12.Solved;
import java.sql.Connection;
import java.sql.PreparedStatement;
import day11.Solved.*;
public class TestUserUpdatePassword {

	  public static void main(String[] args) throws Exception {
			 
	        Connection connection = ConnectionUtil.getConnection();
	 
	        // Input
	        String userName = "<username>";
	        String password = "<password>";
	        
	       
	        // DEPOSIT
	        String query = "UPDATE user SET password=? WHERE username=?";
	 
	        PreparedStatement pst = connection.prepareStatement(query);
	        pst.setString(1, password);
	        pst.setString(2, userName);
	 
	        int rows = pst.executeUpdate();
	        System.out.println("No of rows updated" + rows);
	    }
}
