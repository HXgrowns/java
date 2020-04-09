import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_examination_sys?useUnicode=true&characterEncoding=utf-8&serverTimezone=Hongkong", "root", "root");
            Statement statement = connection.createStatement();
            String update = "UPDATE student SET name = '小红1' WHERE id=2";

            System.out.println(statement.executeUpdate(update));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
