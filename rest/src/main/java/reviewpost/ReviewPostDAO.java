package reviewpost;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class ReviewPostDAO {
    private Connection connection;

    public ReviewPostDAO() {
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

    // 리뷰 게시물 추가
    public void addReviewPost(ReviewPost reviewPost) {
        // ...
    }

    // 리뷰 게시물 조회
    public ReviewPost getReviewPostById(int postId) {
        // ...
    }

    // 리뷰 게시물 수정
    public void updateReviewPost(ReviewPost reviewPost) {
        // ...
    }

    // 리뷰 게시물 삭제
    public void deleteReviewPost(ReviewPost reviewPost) {
        // ...
    }
}
