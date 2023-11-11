public abstract class User {
    private String UserID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;





    public User(String userID, String firstName, String lastName, String email, String password) {
        this.UserID = userID;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.Password = password;
    }


    public String getUserID() {
        return UserID;
    }


    public void setUserID(String userID) {
        UserID = userID;
    }


    public String getFirstName() {
        return FirstName;
    }


    public void setFirstName(String firstName) {
        FirstName = firstName;
    }


    public String getLastName() {
        return LastName;
    }


    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public String getEmail() {
        return Email;
    }


    public void setEmail(String email) {
        Email = email;
    }


    public String getPassword() {
        return Password;
    }


    public void setPassword(String password) {
        Password = password;
    }

    public void Register() {

    }

    public void Login() {

    }

    public void UpdateProfile() {

    }

    public void ResetPassword() {

    }

}
