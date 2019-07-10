package com.moviereviews.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidationUtilTest {

	private static ValidationUtil valid = new ValidationUtil();
	
//	// Illegal Characters
//	@Test
//	public void hasIllegalChars() {
//		assertFalse(valid.illegalCharacters("has ille;gal:char{]s"));
//	}
//	
//	@Test
//	public void hasNoIllegalChars() {
//		assertTrue(valid.illegalCharacters("noIllegal,Chars&Here"));
//	}
//	
//	@Test
//	public void hasOneIllegalChar() {
//		assertFalse(valid.illegalCharacters("onlyoneillegal`Char"));
//	}
//	
//	@Test
//	public void illegalCharNullValue() {
//		assertFalse(valid.illegalCharacters(null));
//	}
//	
//	// User Exists
//	@Test
//	public void userExists() {
//		assertTrue(valid.userExists("stimbo"));
//	}
//	
//	@Test
//	public void userDoesNotExist() {
//		assertFalse(valid.userExists("notUser"));
//	}
//	
//	@Test
//	public void userIsEmpty() {
//		assertFalse(valid.userExists(""));
//	}
//	
//	@Test
//	public void userIsNull() {
//		assertFalse(valid.userExists(null));
//	}
//	
//	// User Info Correct
//	@Test
//	public void userInfoCorrect() {
//		assertTrue(valid.userInfoCorrect("stimbo", "gran40h"));
//	}
//	
//	@Test
//	public void userInfoIncorrect() {
//		assertFalse(valid.userInfoCorrect("stimbo", "notPass"));
//	}
//	
//	@Test
//	public void noUserForInfo() {
//		assertFalse(valid.userInfoCorrect("", "gran40h"));
//	}
//	
//	@Test
//	public void userForInfoNull() {
//		assertFalse(valid.userInfoCorrect(null, "gran40h"));
//	}
//	
//	@Test
//	public void passForInfoNull() {
//		assertFalse(valid.userInfoCorrect("stimbo", null));
//	}
//	
//	// Valid Email
//	@Test
//	public void validEmail() {
//		assertTrue(valid.validEmail("test@gmail.com"));
//	}
//	
//	@Test
//	public void invalidEmail() {
//		assertFalse(valid.validEmail("notEmail"));
//	}
//	
//	@Test
//	public void illegalCharsEmail() {
//		assertFalse(valid.validEmail("has;illegal@gmail.com"));
//	}
//	
//	@Test
//	public void emailTwoAts() {
//		assertFalse(valid.validEmail("email@gmail@com"));
//	}
//	
//	@Test
//	public void emailTwoDots() {
//		assertFalse(valid.validEmail("email.gmail.com"));
//	}
//	
//	@Test
//	public void wrongOrderEmail() {
//		assertFalse(valid.validEmail("com.gmail@test"));
//	}
//	
//	@Test
//	public void emailIsNull() {
//		assertFalse(valid.validEmail(null));
//	}
//	
//	// Valid Password
//	@Test
//	public void validPassword() {
//		assertTrue(valid.validPassword("val1d@p4ss"));
//	}
//	
//	@Test
//	public void invalidPasswordTooShort() {
//		assertFalse(valid.validPassword("no"));
//	}
//	
//	@Test
//	public void illegalCharsPassword() {
//		assertFalse(valid.validPassword("has illch`ars"));
//	}
//	
//	@Test
//	public void invalidPasswordTooLong() {
//		assertFalse(valid.validPassword("IHateSandItsCoarseAndRoughAndIrritatingAndItGetsEverywhere"));
//	}
//	
//	@Test
//	public void passwordIsNull() {
//		assertFalse(valid.validPassword(null));
//	}

}
