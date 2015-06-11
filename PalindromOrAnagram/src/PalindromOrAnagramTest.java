import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromOrAnagramTest {

	@Test
	public void testIsPalindrom1() {
		assertEquals(true, PalindromOrAnagram.isPalindrom("ala"));
	}
	
	@Test
	public void testIsPalindrom2() {
		assertEquals(true, PalindromOrAnagram.isPalindrom("kajak"));
	}

	@Test
	public void testIsPalindrom3() {
		assertEquals(true, PalindromOrAnagram.isPalindrom("oko"));
	}
	
	@Test
	public void testIsPalindrom4() {
		assertEquals(false, PalindromOrAnagram.isPalindrom("prima"));
	}
	
	@Test
	public void testIsPalindrom5() {
		assertEquals(false, PalindromOrAnagram.isPalindrom("aprylis"));
	}
	
	@Test
	public void testIsAnagram1() {
		assertEquals(true, PalindromOrAnagram.isAnagram("121", "112"));
	}
	
	@Test
	public void testIsAnagram2() {
		assertEquals(false, PalindromOrAnagram.isAnagram("121", "212"));
	}
}
