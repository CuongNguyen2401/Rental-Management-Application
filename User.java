public abstract class User {
    private String UserID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;


    public User(String UserID,String FirstName, String LastName,String Email,String Password) {
        Email= this.Email;
        FirstName=this.FirstName;
        LastName= this.LastName;
        Password=this.Password;
        UserID=this.UserID;
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
