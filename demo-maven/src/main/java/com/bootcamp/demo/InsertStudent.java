


import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertStudent {
  public static void main(String[] args) {
    try(Connection conn= DBUtil.getConnection()){
      String sql = "INSERT INTO STUDENTS(name, email)VALUES(?,?)";
      PreparedStatement stmt =conn.prepareStatement(sql);
      stmt.setString(1, "john");
      stmt.setString(2, "john@example.com");
      int rows =stmt.executeUpdate();
      System.out.println("instered"+rows);


    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
