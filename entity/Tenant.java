package entity;

import java.util.ArrayList;
import java.util.List;

public class Tenant extends User {
	 private List<RentalContract> rentedProperties = new ArrayList<>();

	    public Tenant(UserBuilder builder) {
	        super(builder);
	    }

	    public void createRentalContract(RentalContract.RentalContractBuilder builder) {
	    	 RentalContract rentalContract = builder.build();
	         rentedProperties.add(rentalContract);
	         System.out.println("Rental contract created successfully. Contract ID: " + rentalContract.getContractID());
	    }

	    public void terminateRentalContract(int contractID) {
	      
	        for (RentalContract rentalContract : rentedProperties) {
	            if (rentalContract.getContractID() == contractID) {
	                rentedProperties.remove(rentalContract);
	                System.out.println("Rental contract terminated successfully. Contract ID: " + contractID);
	                return;
	            }
	        }
	        System.out.println("Rental contract not found with ID: " + contractID);
	    }
}
