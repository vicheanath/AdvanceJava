package demo;

public class MomPopShop extends Business implements TayPayer{
	String industry;
	String ein;
	
	public MomPopShop(String businessName, String ein) {
		
		this.ein = ein;
	}
	
	public MomPopShop(String address, String businessName, String ein) {
		this.address = address;
		this.ein = ein;
	}

	@Override
	public double payTaxes() {
		return 0.5;
	}

	@Override
	public String getTaxId() {
		return ein;
	}
}
