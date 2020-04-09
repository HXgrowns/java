import java.sql.*;

public class App {
    public static void main(String[] args) {
        try {
            // 1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2.创建连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_examination_sys?useUnicode=true&characterEncoding=utf-8&serverTimezone=Hongkong", "root", "root");

            // 3.创建语句对象
            Statement statement = connection.createStatement();

            // 4.执行语句
            String sql = "select * from student";
            ResultSet resultSet = statement.executeQuery(sql);

            // 5.处理结果
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String sex = resultSet.getString("sex");

                System.out.println(String.format("id = %d, name = %s, age = %d, sex = %s", id, name, age, sex));
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
