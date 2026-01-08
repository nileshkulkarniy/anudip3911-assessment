class Login {

    private String username;
    private String password;
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters long");
        }
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class Login1 {
    public static void main(String[] args) {

        Login login = new Login();

        login.setUsername("nilesh");
        login.setPassword("Nilesh@123");

        System.out.println("Username: " + login.getUsername());
        System.out.println("Password: " + login.getPassword());
    }
}
