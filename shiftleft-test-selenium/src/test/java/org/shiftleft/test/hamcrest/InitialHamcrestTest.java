package org.shiftleft.test.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringStartsWith.startsWith;

import org.junit.Test;

public class InitialHamcrestTest {

	@Test
	public void test() {
		String urlFromSite = "ANY";
		assertThat("Check that URL returned is empty", urlFromSite, allOf(containsString("N"), startsWith("F")));
		
	}

}
