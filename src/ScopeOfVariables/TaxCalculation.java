package ScopeOfVariables;

public class TaxCalculation {
	
		
		double taxAmount = 1500;
		
		
		void isPersonHavingRRSP() {
			taxAmount = taxAmount-500;
		}
		
		void utilityRebate(boolean isWorkingFromHome) {
			if(isWorkingFromHome) {
			taxAmount = taxAmount-200;
			}
		}
		
		void hasKids(int ageOfKids) {
			if(ageOfKids<18) {
				taxAmount = taxAmount-300;
			}
			
		}
		
		void finalTaxCalculated() {
			System.out.println("Final Tax: "+taxAmount);
		}

	}

