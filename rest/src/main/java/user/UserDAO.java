package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class UserDAO {
    private Connection conn;

    public UserDAO() {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/restaurant?serverTimezone=UTC";
            String dbID = "root";
            String dbPassword = "1234";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 회원 가입
    public int register(User user) {
        String SQL = "INSERT INTO user (name, email, password, registration_date) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setDate(4, new java.sql.Date(user.getRegistrationDate().getTime()));
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // 데이터베이스 오류
    }
    public int update(User user) {
        String SQL = "UPDATE user SET name = ?, email = ?, password = ? WHERE user_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setInt(4, user.getUserId());
            return pstmt.executeUpdate();
        } catch (SQLException e) { 
            e.printStackTrace();
        }
        return -1; // 데이터베이스 오류
    }

    // 회원 삭제
    public int delete(User user) {
        String SQL = "DELETE FROM user WHERE user_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setInt(1, user.getUserId());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // 데이터베이스 오류
    }
}
