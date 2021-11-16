package creditcard;

public class User {
    private String username;
    private int password;

    public User() {
        this.username = "joao";
        this.password = 12345;
    }

    public boolean login(String username, int password) {
        if(username.toLowerCase().equals(this.username) && password == this.password) {
            return true;
        } else {
            return false;
        }
    }

    public boolean logout() {
        System.out.println("Realizando logout...");
        return false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
