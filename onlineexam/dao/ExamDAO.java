
package onlineexam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import onlineexam.dbutil.DbConnection;
import onlineexam.pojo.Exam;


public class ExamDAO {
    public static String getExamId()throws SQLException
    {
        Connection conn=DbConnection.getConnection();
        Statement st=conn.createStatement();
        int count;
        ResultSet rs=st.executeQuery("select count(*)from exam");
        rs.next();
        count=rs.getInt(1);
        String newId="EX_"+(count);
        return newId;
        
        
    }
    public static boolean addExam(Exam exam)throws SQLException
    {
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into exam values(?,?,?)");
        ps.setString(1, exam.getExamId());
        ps.setString(2, exam.getLanguage());
        ps.setInt(3, exam.getTotalQuestions());
        int ans=ps.executeUpdate();
         return ans==1;
    }
    public static ArrayList<String> getExamIdBySubject(String subject)throws SQLException
    {
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from exam where language=?");
        ps.setString(1,subject);
        ResultSet rs=ps.executeQuery();
        ArrayList<String> examIdList = new ArrayList<>();
        while(rs.next())
        {
                  examIdList.add(rs.getString(1));
  
        }
        return examIdList;
    }
    public static int getQuestionCountByExam(String examId)throws SQLException
    {
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select totalquestion from exam where examid =?");
        ps.setString(1,examId);
        ResultSet rs=ps.executeQuery();
         ArrayList<String> examIdList = new ArrayList<>();
         rs.next();
         return rs.getInt(1);
         
        
    }
    public static boolean isPaperSet(String subject)throws SQLException
    {
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from exam where language =?");
        ps.setString(1,subject);
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    public static ArrayList<String> getExamIdBySubject( String userid, String subject)throws SQLException
    {
        String qry="Select examid from Exam where language=? minus Select examid from performance where userid=?";
       ArrayList<String> examList=new ArrayList<>();
       Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,subject);
        ps.setString(2,userid);
        ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
               examList.add(rs.getString(1));
        }
         return examList;

    }
    

    
}
