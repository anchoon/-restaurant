package freePost;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class FreePostDAO {
    private Connection connection;

    public FreePostDAO() {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/restaurant";
            String dbID = "root";
            String dbPassword = "1234";

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(dbURL, dbID, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 자유 게시물 추가
    public void addFreePost(FreePost freePost) {
        // ...
    }

    // 자유 게시물 조회
    public FreePost getFreePostById(int postId) {
        // ...
    }

    // 자유 게시물 수정
    public void updateFreePost(FreePost freePost) {
        // ...
    }

    // 자유 게시물 삭제
    public void deleteFreePost(FreePost freePost) {
        // ...
    }
}
