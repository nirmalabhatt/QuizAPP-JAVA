
package onlineexam.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DbConnection {
    private static Connection conn;
       static
       {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BMH1KMQ:1521/XE","examinationsystem","project");
           JOptionPane.showMessageDialog(null,"Connection opened successfully","success",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Can not connect to the Database!","error!!",JOptionPane.ERROR_MESSAGE);
             ex.printStackTrace();
             System.exit(0);

        }
        }
       public static Connection getConnection()
       {
           return conn;
       }
       public static void closeConnection()
       {
         try
         {
             conn.close();
            
         }  
         catch(SQLException ex)
         {
         JOptionPane.showMessageDialog(null,"error in disconnecting from  the Database!:"+ex,"error",JOptionPane.ERROR_MESSAGE);
         System.out.println("error is:"+ex);
         ex.printStackTrace();
             
         }
       }
    
}
