package demo;

public class TaxCollector {
	public static void main(String[] args) {
		TayPayer[] taxPayers = {
					new EmployedPerson("Billy", "ssn-1123"),
					new MomPopShop("Coffee", "corp-id")
		};
		
		double taxesCollectedAmt = 0;
		
		for(TayPayer taxPayer : taxPayers) {
			taxesCollectedAmt+= taxPayer.payTaxes();
		}
		
		
		System.out.printf("Taxes Collected: $%.2f", taxesCollectedAmt);
				
	}
} 
