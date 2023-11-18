<<<<<<< HEAD
package entity;


public class Tenant extends User {
	private int tenantId;
	private String tenantContracts;
	
	
	public Tenant(String userID, String firstName, String lastName, String email, String password) {
		super(userID, firstName, lastName, email, password);
		
	}
	
	public Tenant() {
		
		
	}

	
	public void createRentalContract() {
		
	}
	public void terminateRentalContract() {
		
	}

	
	
=======

public class Tenant extends User{

    public Tenant(String UserID, String FirstName, String LastName, String Email, String Password) {
        super(UserID, FirstName, LastName, Email, Password);
    }
    
    public void CreateRentalContract(){
    }
    public void TerminateRentalContract(){
        
    }
>>>>>>> 5673538d0accbd1afbce0a684b63f9bd8e291824
}
