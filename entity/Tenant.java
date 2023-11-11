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

	
	
}
