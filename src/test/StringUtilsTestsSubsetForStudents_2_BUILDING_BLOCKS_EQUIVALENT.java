package test;

import static org.junit.Assert.assertEquals;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Vector;

import org.junit.Test;

public class StringUtilsTestsSubsetForStudents_2_BUILDING_BLOCKS_EQUIVALENT extends StringUtilsTestsSubsetForStudents_1_ENVIRONMENT
{
	@Points(value=5)
	@Test
	public void codePointCount_NonASCII()
	{
		//STUDENT: MAKE SURE YOU ARE ABLE TO VISUALLY SEE THE NEXT LINE AS
		//6 ICONS
		String nonASCIIString = "\uD83D\uDE04" + "\uD83E\uDD84" + "\u26BD" + "\uD83C\uDFB5" + "\u262F\uFE0F" + "\u262F";
		//String nonASCIIString = "😄🦄⚽🎵☯️☯";

		//STUDENT: DON'T TRUST THE *RENDERING* OF THE STRING
		//Notice that the string is rendered with 6 icons, but
		//it actually consists of 7 codePoints:
		int correctAnswer = 7;
		int actualAnswer = getCodePointCount(nonASCIIString);
		assertEquals(correctAnswer, actualAnswer);
	}
	
	@Points(value=5)
	@Test
	public void codePoint_NonASCII()
	{
		//STUDENT: MAKE SURE YOU ARE ABLE TO VISUALLY SEE THE NEXT LINE AS
		//6 ICONS
		String nonASCIIString = "\uD83D\uDE04" + "\uD83E\uDD84" + "\u26BD" + "\uD83C\uDFB5" + "\u262F\uFE0F" + "\u262F";
		//String nonASCIIString = "😄🦄⚽🎵☯️☯";

		//STUDENT: DON'T TRUST THE *RENDERING* OF THE STRING
		//Notice that the string is rendered with 6 icons, but
		//it actually consists of 7 codePoints:
		assert getCodePointCount(nonASCIIString) == 7;
		
		final String SMILEY_FACE = "\uD83D\uDE04";//"😄";
		final String UNICORN = "\uD83E\uDD84";//🦄";
		final String SOCCER_BALL = "\u26BD";//"⚽";
		final String MUSIC_NOTE = "\uD83C\uDFB5";//"🎵";
		final String YIN_AND_YANG = "\u262F";//"☯";
		final String VARIATION_SELECTOR_16 = "\uFE0F";
		final String YIN_AND_YANG_VARIANT = YIN_AND_YANG + VARIATION_SELECTOR_16;
		
		assert getCodePointCount(SMILEY_FACE) == 1;
		assert getCodePointCount(UNICORN) == 1;
		assert getCodePointCount(SOCCER_BALL) == 1;
		assert getCodePointCount(MUSIC_NOTE) == 1;
		assert getCodePointCount(YIN_AND_YANG_VARIANT) == 2;
		assert getCodePointCount(YIN_AND_YANG) == 1;

		int codePointIndex;
		int correctAnswer;
		int actualAnswer;
		
		codePointIndex = 0;
		correctAnswer = SMILEY_FACE.codePointAt(0);
		actualAnswer = getCodePoint(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);
		
		codePointIndex = 1;
		correctAnswer = UNICORN.codePointAt(0);
		actualAnswer = getCodePoint(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);

		codePointIndex = 2;
		correctAnswer = SOCCER_BALL.codePointAt(0);
		actualAnswer = getCodePoint(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);

		codePointIndex = 3;
		correctAnswer = MUSIC_NOTE.codePointAt(0);
		actualAnswer = getCodePoint(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);

		codePointIndex = 4;
		correctAnswer = YIN_AND_YANG.codePointAt(0);
		actualAnswer = getCodePoint(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);

		codePointIndex = 5;
		correctAnswer = VARIATION_SELECTOR_16.codePointAt(0);
		actualAnswer = getCodePoint(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);
		
		codePointIndex = 6;
		correctAnswer = YIN_AND_YANG.codePointAt(0);
		actualAnswer = getCodePoint(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);
	}
	
	@Points(value=5)
	@Test
	public void unicodeCharacter_Emojis()
	{
		String nonASCIIString = "\uD83D\uDE04" + "\uD83E\uDD84" + "\u26BD" + "\uD83C\uDFB5" + "\u262F\uFE0F" + "\u262F";
		//String nonASCIIString = "😄🦄⚽🎵☯️☯";
		
		//STUDENT: DON'T TRUST THE *RENDERING* OF THE STRING
		//Notice that the string is rendered with 6 icons, but
		//it actually consists of 7 codePoints:
		assert getCodePointCount(nonASCIIString) == 7;
		
		final String SMILEY_FACE = "\uD83D\uDE04";//"😄";
		final String UNICORN = "\uD83E\uDD84";//🦄";
		final String SOCCER_BALL = "\u26BD";//"⚽";
		final String MUSIC_NOTE = "\uD83C\uDFB5";//"🎵";
		final String YIN_AND_YANG = "\u262F";//"☯";
		final String VARIATION_SELECTOR_16 = "\uFE0F";
		final String YIN_AND_YANG_VARIANT = YIN_AND_YANG + VARIATION_SELECTOR_16;
		
		assert getCodePointCount(SMILEY_FACE) == 1;
		assert getCodePointCount(UNICORN) == 1;
		assert getCodePointCount(SOCCER_BALL) == 1;
		assert getCodePointCount(MUSIC_NOTE) == 1;
		assert getCodePointCount(YIN_AND_YANG_VARIANT) == 2;
		assert getCodePointCount(YIN_AND_YANG) == 1;
		
		int codePointIndex;
		String correctAnswer;
		String actualAnswer;
		
		codePointIndex = 0;
		correctAnswer = SMILEY_FACE;
		actualAnswer = getUnicodeCharacter(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);
		
		codePointIndex = 1;
		correctAnswer = UNICORN;
		actualAnswer = getUnicodeCharacter(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);

		codePointIndex = 2;
		correctAnswer = SOCCER_BALL;
		actualAnswer = getUnicodeCharacter(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);

		codePointIndex = 3;
		correctAnswer = MUSIC_NOTE;
		actualAnswer = getUnicodeCharacter(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);

		codePointIndex = 4;
		correctAnswer = YIN_AND_YANG;
		actualAnswer = getUnicodeCharacter(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);

		codePointIndex = 5;
		correctAnswer = VARIATION_SELECTOR_16;
		actualAnswer = getUnicodeCharacter(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);
		
		codePointIndex = 6;
		correctAnswer = YIN_AND_YANG;
		actualAnswer = getUnicodeCharacter(nonASCIIString, codePointIndex);
		assertEquals(correctAnswer, actualAnswer);
		
	}
	
	public static void main(String[] args)
	{
		String nonASCIIString = "\uD83D\uDE04" + "\uD83E\uDD84" + "\u26BD" + "\uD83C\uDFB5" + "\u262F\uFE0F" + "\u262F";
		
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().
                getAvailableFontFamilyNames();
        System.out.println(fonts.length + " font families installed");
        Vector<String> supportedFonts = new Vector<>();
        for (String fontName : fonts) {
            Font f = new Font(fontName, Font.PLAIN, 1);
            if (f.canDisplayUpTo(nonASCIIString)<0) {
                System.out.println(fontName);
                supportedFonts.add(fontName);
            }
        }
//        fontComboBox = new JComboBox(supportedFonts);
       
	}
}
