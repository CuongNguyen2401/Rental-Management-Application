package entity;

import java.util.ArrayList;
import java.util.List;

public class PropertyOwner extends User {

	private List<Property> ownedProperties = new ArrayList<>();

	public PropertyOwner(UserBuilder builder) {
		super(builder);
	}

	public void listProperty() {
		
        System.out.println("Owned Properties:");
        for (Property property : ownedProperties) {
            System.out.println("Property ID: " + property.getPropertyID() +
                    ", Description: " + property.getDescription() +
                    ", Rental Rate: " + property.getRentalRate());
        }

	}

	public void createProperty(Property.PropertyBuilder builder) {
		 Property property = builder.build();
	        ownedProperties.add(property);
	        System.out.println("Property created successfully. Property ID: " + property.getPropertyID());

	}

	public void updateProperty(int propertyID, String newDescription, double newRentalRate) {
		for (Property property : ownedProperties) {
            if (property.getPropertyID() ==propertyID) {
                property.updateProperty(newDescription, newRentalRate);
                System.out.println("Property updated successfully. Property ID: " + propertyID);
                return;
            }
        }
        System.out.println("Property not found with ID: " + propertyID);

	}

	public void deleteProperty(int propertyID) {
	
        ownedProperties.removeIf(property -> property.getPropertyID() ==propertyID);
        System.out.println("Property deleted successfully. Property ID: " + propertyID);

	}

	public List<Property> getOwnedProperties() {
		return ownedProperties;
	}

	public void setOwnedProperties(List<Property> ownedProperties) {
		this.ownedProperties = ownedProperties;
	}
	
	

}
