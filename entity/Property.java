package entity;

public class Property {
	private int propertyID;
	private String description;
	private Double rentalRate;

	public Property(int propertyID, String description, Double rentalRate) {
		super();
		this.propertyID = propertyID;
		this.description = description;
		this.rentalRate = rentalRate;
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

	public Double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(Double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public void createProperty() {

	}

	public void updateProperty() {

	}

	public void deleteProperty() {

	}

}
