package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTestsSubsetForStudents_3_BASIC_EQUIVALENT extends StringUtilsTestsSubsetForStudents_2_BUILDING_BLOCKS_EQUIVALENT
{
	public static final String STRINGUTILS_PACKAGE_NAME = "utils";
	public static final String STRINGUTILS_PREFIX = "StringUtils";
	public static final String SUFFIX = "";
	
	@Points(value=5)
	@Test
	public void reverse_abc()
	{
		String str = "abc";
		String correctAnswer = "cba";
		String actualAnswer = reverse(str);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void isPalindrome_empty()
	{
		String str = "";
		boolean correctAnswer = true;
		boolean actualAnswer = isPalindrome(str);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void isPalindrome_ab()
	{
		String str = "ab";
		boolean correctAnswer = false;
		boolean actualAnswer = isPalindrome(str);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void isPalindrome_exclamationPoint()
	{
		String str = "!";
		boolean correctAnswer = true;
		boolean actualAnswer = isPalindrome(str);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void isPalindrome_panama()
	{
		String str = "A man, a plan, a canal, Panama!";
		boolean correctAnswer = false;
		boolean actualAnswer = isPalindrome(str);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void getCount_abc_a()
	{
		String str = "abc";
		String pattern = "a";
		int correctAnswer = 1;
		int actualAnswer = getCount(str, pattern);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void getCount_ab55d_5()
	{
		String str = "ab55d";
		String pattern = "5";
		int correctAnswer = 2;
		int actualAnswer = getCount(str, pattern);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void getCount_ab55d_55()
	{
		String str = "ab55d";
		String pattern = "55";
		int correctAnswer = 1;
		int actualAnswer = getCount(str, pattern);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void getCount_empty_a()
	{
		String str = "";
		String pattern = "a";
		int correctAnswer = 0;
		int actualAnswer = getCount(str, pattern);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void rotate_abc_1()
	{
		String str = "abc";
		int delta = 1;
		String correctAnswer = "cab";
		String actualAnswer = rotate(str, delta);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void shift_abc_2()
	{
		String str = "abc";
		int delta = 2;
		String correctAnswer = "cde";
		String actualAnswer = shift(str, delta);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void shift_abc_7()
	{
		String str = "abc";
		int delta = 7;
		String correctAnswer = "hij";
		String actualAnswer = shift(str, delta);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void shift_xyz_3()
	{
		String str = "xyz";
		int delta = 3;
		String correctAnswer = "abc";
		String actualAnswer = shift(str, delta);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void shift_xyz_Neg2()
	{
		String str = "xyz";
		int delta = -2;
		String correctAnswer = "vwx";
		String actualAnswer = shift(str, delta);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void shift_aBc_2()
	{
		String str = "aBc";
		int delta = 2;
		String correctAnswer = "cDe";
		String actualAnswer = shift(str, delta);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void shift_ABC_2()
	{
		String str = "ABC";
		int delta = 2;
		String correctAnswer = "CDE";
		String actualAnswer = shift(str, delta);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	public void shift_empty_3()
	{
		String str = "";
		int delta = 3;
		String correctAnswer = "";
		String actualAnswer = shift(str, delta);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void areAnagrams_empty_empty()
	{
		String str1 = "";
		String str2 = "";
		boolean correctAnswer = true;
		boolean actualAnswer = areAnagrams(str1, str2);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test
	public void areAnagrams_abc_cab()
	{
		String str1 = "abc";
		String str2 = "cab";
		boolean correctAnswer = true;
		boolean actualAnswer = areAnagrams(str1, str2);
		assertEquals(correctAnswer, actualAnswer);
	}
}
