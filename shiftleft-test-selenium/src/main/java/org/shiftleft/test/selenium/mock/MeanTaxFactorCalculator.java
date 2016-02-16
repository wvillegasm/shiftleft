package org.shiftleft.test.selenium.mock;

public class MeanTaxFactorCalculator {

	private final TaxService taxService;
	
	public MeanTaxFactorCalculator(TaxService taxService){
		this.taxService = taxService;
	}
	
	public double calculateMEanTaxFactorFor(Person p){
		double currentTaxFactorFor = taxService.getCurrentTaxFactorFor(p);
		double currentTaxFactorFor2 = taxService.getCurrentTaxFactorFor(p);
		return (currentTaxFactorFor+currentTaxFactorFor2) /2;
	}

}
