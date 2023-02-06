package controller;

public class LoginCommand {
    private String email;
    private String password;
    private boolean rememberEmail;

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

    public boolean isRememberEamil() {
        return rememberEmail;
    }

    public void setRemberEmail(boolean rememberEmail) {
        this.rememberEmail = rememberEmail;
    }
}
