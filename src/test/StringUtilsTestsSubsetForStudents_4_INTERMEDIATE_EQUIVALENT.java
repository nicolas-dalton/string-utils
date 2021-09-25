package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTestsSubsetForStudents_4_INTERMEDIATE_EQUIVALENT extends StringUtilsTestsSubsetForStudents_3_BASIC_EQUIVALENT
{
	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void getCount_abc_null()
	{
		String str = "abc";
		String pattern = null;
		getCount(str, pattern);
	}

	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void getCount_ab55d_empty()
	{
		String str = "ab55d";
		String pattern = "";
		getCount(str, pattern);
	}

	@Points(value=5)
	@Test
	public void getCount_ab555cd_55()
	{
		String str = "ab555cd";
		String pattern = "55";
		int correctAnswer = 2;
		int actualAnswer = getCount(str, pattern);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void getCount_empty_empty()
	{
		String str = "";
		String pattern = "";
		getCount(str, pattern);
	}

	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void rotate_abc_7()
	{
		String str = "abc";
		int delta = 7;
		rotate(str, delta);
	}

	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void shift_null_3()
	{
		String str = null;
		int delta = 3;
		
		shift(str, delta);
	}

	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void shift_exclamationPointPeriod_1()
	{
		String str = "!.";
		int delta = 1;
		shift(str, delta);
	}

	@Points(value=5)
	@Test
	public void areAnagrams_stars_astra()
	{
		String str1 = "stars";
		String str2 = "astra";
		boolean correctAnswer = false;
		boolean actualAnswer = areAnagrams(str1, str2);
		assertEquals(correctAnswer, actualAnswer);
	}
}
