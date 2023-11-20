package entity;

public class User {
	private String userID;
	private String firstName;
	private String lastName;
	private String email;
	private String password;

	protected User(UserBuilder builder) {
		this.userID = builder.userID;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.password = builder.password;
	}

	public static class UserBuilder {
		private String userID;
		private String firstName;
		private String lastName;
		private String email;
		private String password;

		public UserBuilder(String userID, String email, String password) {
			this.userID = userID;
			this.email = email;
			this.password = password;
		}

		public UserBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public UserBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

	public void register() {

		System.out.println("User registered successfully. UserID: " + userID);
	}

	public boolean login(String enteredPassword) {

		if (enteredPassword.equals(password)) {
			System.out.println("User logged in successfully. UserID: " + userID);
			return true;
		} else {
			System.out.println("Login failed. Incorrect password.");
			return false;
		}
	}

	public void updateProfile(String newFirstName, String newLastName, String newEmail) {

		this.firstName = newFirstName;
		this.lastName = newLastName;
		this.email = newEmail;
		System.out.println("User profile updated successfully. New FirstName: " + newFirstName + ", New LastName: "
				+ newLastName + ", New Email: " + newEmail);
	}

	public void resetPassword(String newPassword) {

		this.password = newPassword;
		System.out.println("Password reset successfully. New Password: " + newPassword);
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

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

}
