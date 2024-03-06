public class PasswordManager {
    private String username;
    private String password;

    public PasswordManager(){
        username = null;
        password = null;
    }
    public PasswordManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "Your username is " + username + " and your password is " + password;
    }
}
