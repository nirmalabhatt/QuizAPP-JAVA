
package onlineexam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import onlineexam.dbutil.DbConnection;
import onlineexam.pojo.User;

public class UserDAO {
    public static boolean validateUser(User user) throws SQLException
    {
         Connection conn=DbConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password =? and userType=?");
         ps.setString(1, user.getUserId());
         ps.setString(2, user.getPassword());
         ps.setString(3, user.getUserType());
         ResultSet rs = ps.executeQuery();
         return rs.next();
         }
    public static boolean addUser(User user)throws SQLException{
        String qry="Select * from users where userid=?";
        boolean status=true;
        Connection conn=DbConnection.getConnection();
           PreparedStatement ps=conn.prepareStatement(qry);
           ps.setString(1,user.getUserId());
           ResultSet rs=ps.executeQuery();
           if(rs.next())
               status=false;
           else
           {
               qry="Insert into users values(?,?,?)";
               ps=conn.prepareStatement(qry);
               ps.setString(1, user.getUserId());
               ps.setString(2, user.getPassword());
               ps.setString(3,user.getUserType());
               ps.executeUpdate();
           }
         return status;

    
}
    public static boolean changePassword(String userid,String password)throws SQLException
    {
        String qry="Update users set password=? where userid=?";
        boolean status=true;
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,password);
        ps.setString(2,userid);
        int ans=ps.executeUpdate();
        if(ans==0)
               status=false;
     return status;

    }
    public static boolean deleteStudentByUserID(String userid)throws SQLException
    {
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from users where userid=?");
        ps.setString(1, userid);
        int result=ps.executeUpdate();
         return result==1;
    }
}
