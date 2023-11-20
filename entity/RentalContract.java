package entity;

import java.util.Date;

public class RentalContract {

	private int contractID;
    private int propertyID;
    private int tenantID;
    private Date startDate;
    private Date endDate;
    private double rentAmount;

    private RentalContract(RentalContractBuilder builder) {
        this.contractID = builder.contractID;
        this.propertyID = builder.propertyID;
        this.tenantID = builder.tenantID;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.rentAmount = builder.rentAmount;
    }

    public static class RentalContractBuilder {
        private int contractID;
        private int propertyID;
        private int tenantID;
        private Date startDate;
        private Date endDate;
        private double rentAmount;

        public RentalContractBuilder(int contractID, int propertyID, int tenantID) {
            this.contractID = contractID;
            this.propertyID = propertyID;
            this.tenantID = tenantID;
        }

        public RentalContractBuilder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public RentalContractBuilder setEndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public RentalContractBuilder setRentAmount(double rentAmount) {
            this.rentAmount = rentAmount;
            return this;
        }

        public RentalContract build() {
            return new RentalContract(this);
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
			return startDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public double getRentAmount() {
			return rentAmount;
		}
    }

    public void createContract() {
    	
        System.out.println("Rental contract created. Contract ID: " + contractID);
        
    }

    public void terminateContract() {
    	 System.out.println("Rental contract terminated. Contract ID: " + contractID);
        
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
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

}