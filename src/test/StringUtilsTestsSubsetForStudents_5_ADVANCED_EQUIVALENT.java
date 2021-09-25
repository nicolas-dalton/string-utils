package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTestsSubsetForStudents_5_ADVANCED_EQUIVALENT extends StringUtilsTestsSubsetForStudents_4_INTERMEDIATE_EQUIVALENT
{
	@Points(value=5)
	@Test
	public void reverse_UnicornRainbowCone()
	{
		String str = "\uD83E\uDD84" + "\uD83C\uDF08" + "\uD83C\uDF66";
//		String str = "ðŸ¦„ðŸŒˆðŸ�¦";
		String correctAnswer = "\uD83C\uDF66" + "\uD83C\uDF08" + "\uD83E\uDD84";
//		String correctAnswer = "ðŸ�¦ðŸŒˆðŸ¦„";
		String actualAnswer = reverse(str);
		assertEquals(correctAnswer, actualAnswer);
	}
	
	@Points(value=5)
	@Test
	public void rotate_abc_Neg2()
	{
		String str = "abc";
		int delta = -2;
		String correctAnswer = "cab";
		String actualAnswer = rotate(str, delta);
		assertEquals(correctAnswer, actualAnswer);
	}
	
	@Points(value=5)
	@Test
	public void isPalindrome_TurtleFrogPandaFrogTurtle()
	{
		String str = "\uD83D\uDC22" + "\uD83D\uDC38" + "\uD83D\uDC3C" +  "\uD83D\uDC38" + "\uD83D\uDC22";
//		String str = "ðŸ�¢ðŸ�¸ðŸ�¼ðŸ�¸ðŸ�¢";
		boolean correctAnswer = true;
		boolean actualAnswer = isPalindrome(str);
		assertEquals(correctAnswer, actualAnswer);
	}
	
	@Points(value=5)
	@Test
	public void isPalindrome_Turtle77Turtle()
	{
		String str = "\uD83D\uDC22" + "7" + "7" + "\uD83D\uDC22";
//		String str = "ðŸ�¢77ðŸ�¢";
		boolean correctAnswer = true;
		boolean actualAnswer = isPalindrome(str);
		assertEquals(correctAnswer, actualAnswer);
	}
	
	@Points(value=5)
	@Test
	public void isPalindrome_TurtlePanda7()
	{
		String str = "\uD83D\uDC22" + "\uD83D\uDC3C" + "7";
//		String str = "ðŸ�¢ðŸ�¼7";
		boolean correctAnswer = false;
		boolean actualAnswer = isPalindrome(str);
		assertEquals(correctAnswer, actualAnswer);
	}

	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void areAnagrams_abc_null()
	{
		String str1 = "abc";
		String str2 = null;
		
		areAnagrams(str1, str2);
	}
	
	@Points(value=0)
	@Test
	public void reverse_nonASCIIStringWithVariation()
	{
		String nonASCIIString = "\uD83D\uDE04" + "\uD83E\uDD84" + "\u26BD" + "\uD83C\uDFB5" + "\u262F\uFE0F" + "\u262F";
//		String nonASCIIString = "ðŸ˜„ðŸ¦„âš½ðŸŽµâ˜¯ï¸�â˜¯";
		assert getCodePointCount(nonASCIIString) == 7;
		
		String correctAnswer = "\uD83D\uDE04" + "\uD83E\uDD84" + "\u26BD" + "\uD83C\uDFB5" + "\u262F\uFE0F" + "\u262F";
//		String correctAnswer = "â˜¯â˜¯ï¸�ðŸŽµâš½ðŸ¦„ðŸ˜„";
		assert getCodePointCount(correctAnswer) == 7;
		String actualAnswer = reverse(nonASCIIString);
		assertEquals("NOTICE THAT THIS IS WORTH 0 POINTS", correctAnswer, actualAnswer);
	}
}
