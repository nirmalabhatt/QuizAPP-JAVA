
package onlineexam.pojo;



public class Performance 
{

    public Performance(String userId, String examId, int right, int wrong, int unattempted, double per, String language) {
        this.userId = userId;
        this.examId = examId;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.per = per;
        this.language = language;
    }

    

    public Performance(String examId, String language, String username, int right, int wrong, int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    private String userId;
    private String examId;
    private int right;
    private int wrong;
    private int unattempted;
    private double per;
    private String language;
 
    
}
