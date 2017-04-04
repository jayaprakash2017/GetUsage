package com.demo.getusage.util;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.demo.getusage.util.RequestValidator;

public class RequestValidatorTest {
	RequestValidator requestValidator = new RequestValidator();
	
	@Test
	public void testMsisdn_Blank() {
		String msisdn = "";
		Boolean expectedResult = false;
	//	Boolean expectedResult = true;
		Boolean actualResult = requestValidator.isValidMsisdn(msisdn);
		Assert.assertEquals(expectedResult, actualResult);
	} 

	@Test
	public void testMsisdn_Null() {
		String msisdn = null;
		Boolean expectedResult = false;
		Boolean actualResult = requestValidator.isValidMsisdn(msisdn);
		Assert.assertEquals(expectedResult, actualResult);
	}

	
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}

}
