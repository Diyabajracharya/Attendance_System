import models.Users;

import java.sql.*;

public class DBUtils {
    public static Connection connect() {

        Connection connect = null;

        String url = "jdbc:sqlite:src/main/resources/database/Attendance.db";

        try {
            connect = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connect;
    }

    public void insert_user(Connection connection, String username, String password) {

    }

    public void insert_class(Connection connection, String class_name) {

    }

    public void insert_attendance(Connection connection, int class_id, int user_id, int attendance) {
    }

    public void select_users(Connection connection, int inp_id) {
    }

    public void select_class(Connection connection, int class_id) {
    }
}
