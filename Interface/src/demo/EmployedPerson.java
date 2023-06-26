package demo;

public class EmployedPerson extends Person implements TayPayer {
	
	String jobAddress;
	String ssn;
	
	public EmployedPerson(String fname, String ssn) {
		this.fname =  fname;
		this.ssn = ssn;
		
	}
	
	public EmployedPerson(String height, String weight, String fname, String lname) {
		this.height = height;
		this.weight = weight;
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getJobAddress() {
		return jobAddress;
	}

	@Override
	public double payTaxes() {
		// TODO Calculate taxes
		return 10.6;
	}

	@Override
	public String getTaxId() {
		return ssn;
	}
	
	
}
