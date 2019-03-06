package demo03;

/**
 * @Acthor:孙琪; date:2019/3/6;
 */
public class User {
    private String userId;
    private String userName;
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public User() {
        super();
    }

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
