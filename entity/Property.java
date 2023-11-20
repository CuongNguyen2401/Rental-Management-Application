package entity;

import java.util.List;

public class Property {
	private int propertyID;
	private String description;
	private double rentalRate;

	private Property(PropertyBuilder builder) {
		this.propertyID = builder.propertyID;
		this.description = builder.description;
		this.rentalRate = builder.rentalRate;
	}

	public static class PropertyBuilder {
		private int propertyID;
		private String description;
		private double rentalRate;

		public PropertyBuilder(int propertyID, String description, double rentalRate) {
			this.propertyID = propertyID;
			this.description = description;
			this.rentalRate = rentalRate;
		}

		public Property build() {
			return new Property(this);
		}
	}

	public void createProperty(List<Property> propertyList) {
		propertyList.add(this);
		System.out.println("Property created successfully. Property ID: " + propertyID);
	}

	public void updateProperty(String newDescription, double newRentalRate) {
		this.description = newDescription;
		this.rentalRate = newRentalRate;
		System.out.println("Property updated successfully. New description: " + newDescription + ", New rental rate: "
				+ newRentalRate);

	}

	public void deleteProperty(List<Property> propertyList, int propertyID) {
		for (Property property : propertyList) {
			if (property.propertyID == propertyID) {
				propertyList.remove(property);
				System.out.println("Property deleted successfully. Property ID: " + propertyID);
				return;
			}
		}
		System.out.println("Property not found with ID: " + propertyID);

	}

	public int getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}
	

}
