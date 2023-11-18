package entity;

import java.util.ArrayList;
import java.util.Date;

public class RentalContract {

	private int contractID;
	private int propertyID;
	private int tenantID;
	private Date StartDate;
	private Date EndDate;
	private double rentAmount;

	public RentalContract(int contractID, int propertyID, int tenantID, Date startDate, Date endDate,
			double rentAmount) {
		super();
		this.contractID = contractID;
		this.propertyID = propertyID;
		this.tenantID = tenantID;
		StartDate = startDate;
		EndDate = endDate;
		this.rentAmount = rentAmount;
	}

	public static ArrayList<RentalContract> createContract(RentalContract contract,
			ArrayList<RentalContract> listOfContract) {
		listOfContract.add(contract);
		return listOfContract;
	}

	public static ArrayList<RentalContract> terminateContract(RentalContract contract,
			ArrayList<RentalContract> contracts) {
		contracts.remove(contract);
		return contracts;
	}

	public int getContractID() {
		return contractID;
	}

	public void setContractID(int contractID) {
		this.contractID = contractID;
	}

	public int getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}

	public int getTenantID() {
		return tenantID;
	}

	public void setTenantID(int tenantID) {
		this.tenantID = tenantID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

}