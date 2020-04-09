import java.sql.*;

public class DbBatch {
    public static void main(String[] args) {
        try {
            // 1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2.创建连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_examination_sys?useUnicode=true&characterEncoding=utf-8&serverTimezone=Hongkong", "root", "root");

            // 3.创建语句对象
//            Statement statement = connection.createStatement();
            String sql = "INSERT INTO student (id, name, age, sex) values (null, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);

            // 4.执行语句
            pstmt.setString(1, "name4");
            pstmt.setString(2, "4");
            pstmt.setString(3, "女");
            pstmt.addBatch();

            pstmt.setString(1, "name5");
            pstmt.setString(2, "5");
            pstmt.setString(3, "女");
            pstmt.addBatch();

            pstmt.setString(1, "name6");
            pstmt.setString(2, "6");
            pstmt.setString(3, "女");
            pstmt.addBatch();

            int[] ints = pstmt.executeBatch();
            for (int i : ints) {
                System.out.println(i);
            }


        } catch (ClassNotFoundException e) {
            System.err.println("驱动类未找到");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("连接失败");
            e.printStackTrace();
        }
    }
}
