package user;
 
import java.sql.Date;

public class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    private Date registrationDate;

    // 기본 생성자
    public User() {}

    // 모든 필드를 초기화하는 생성자
    public User(int userId, String name, String email, String password, Date registrationDate) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    // getter와 setter 메서드
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
} 
