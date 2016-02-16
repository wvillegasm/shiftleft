package org.shiftleft.test.selenium.mock;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Matchers.any;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.testng.annotations.Test;

@RunWith(MockitoJUnitRunner.class)
public class InitialMockTesting {

	static final double TAX_FACTOR = 10;

	@Mock
	TaxService taxService;

	@InjectMocks
	MeanTaxFactorCalculator sut;

	@Test
	public void should_calculate_mean_tax_factor() {
		
		given(taxService.getCurrentTaxFactorFor(any(Person.class))).willReturn(TAX_FACTOR);
		
		double meanTaxFactor = sut.calculateMEanTaxFactorFor(new Person());
		then(meanTaxFactor).equals(TAX_FACTOR);
		
	}

}
