package recommendedrestaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class RecommendedRestaurantDAO {
    private Connection connection;

    public RecommendedRestaurantDAO() {
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

    // 추천 맛집 업로드
    public void addRecommendedRestaurant(RecommendedRestaurant restaurant) {
        // ...
    }

    // 추천 맛집 조회
    public RecommendedRestaurant getRecommendedRestaurantById(int uploadId) {
		return null;
        // ...
    }

    // 추천 맛집 수정
    public void updateRecommendedRestaurant(RecommendedRestaurant restaurant) {
        // ...
    }

    // 추천 맛집 삭제
    public void deleteRecommendedRestaurant(RecommendedRestaurant restaurant) {
        // ...
    }
} 
