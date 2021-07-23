package co.com.choucair.daniellogin.model;

public class LoginData {
    private String strUser;
    private String strPassword;

    public String getStrUser() {
        return strUser;
    }
    public String getStrPassword() {
        return strPassword;
    }
    public LoginData(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }
}
