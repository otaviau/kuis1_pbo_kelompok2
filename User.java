package kuis1_pbo_kelompok2;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticate(String username, String password) {
        if (this.username == null || this.password == null)
            return false;
        return this.username.equals(username) && this.password.equals(password);
    }
}