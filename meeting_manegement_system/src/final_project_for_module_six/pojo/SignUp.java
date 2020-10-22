package final_project_for_module_six.pojo;

import java.text.SimpleDateFormat;

public class SignUp {

    private int id;
    private String fullName;
    private String email;
    private String userName;
    private String password;

    public SignUp() {
    }

    public SignUp(int id, String fullName, String email, String userName, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public SignUp(String fullName, String email, String userName, String password) {
        this.fullName = fullName;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
