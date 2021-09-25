package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface StringUtils_Dalton
{	
	public static ArrayList<Integer> adjustCodePointList(String str)
	{
		int[] codePointList = new int[str.length()];
		ArrayList<Integer> codePointListCorrectIndex = new ArrayList<Integer>();
		for(int i = 0;  i <str.length(); i++)
		{
			codePointList[i] = str.codePointAt(i);
		}
		for(int i = 0;  i <codePointList.length; i++)
		{
			int countChars  = Character.charCount(codePointList[i]);
			codePointListCorrectIndex.add(codePointList[i]);
			if(countChars==2)
			{
				i= i+1;
			}
		}
		return codePointListCorrectIndex;
	}
	//postcondition : return value == reversed str
	//STRAIGHTFORWARD : reverse("hello") -> "olleh"
	//EXTREME : reverse("") -> ""
	//BIZZARE/EXTOIC : reverse(null) -> NB
	public static String reverse(String str)
	{
		assert str != null : "string cannot be null !";
		String reverseString = "";
		ArrayList<Integer> codePointList = new ArrayList<Integer>(StringUtils_Dalton.adjustCodePointList(str));
		for(int i = codePointList.size()-1; i >= 0; i--)
		{
			int codePoint = codePointList.get(i);
			reverseString += StringUtils_Dalton.convertToString(codePoint);
		}
		return reverseString;
	}
	
	//precondition: "nothing"
	//postcondition: rv== true <=>  (reverseString.equals(str));
	//STRAIGHTFORWARD: isPalindrome("racecar") -> true
	//EXTREME: isPalindrome("") -> true
	//BIZZARE/EXOTIC : isPalindrome(null) -> NB
	public static boolean isPalindrome(String str)
	{
		String reverseString = StringUtils_Dalton.reverse(str);
		boolean isPalindrome = (reverseString.equals(str));
		return isPalindrome;
	} 
	
	//postcondition: return value equals the number of times a pattern
		//appears in a string
	//STRAIGHTFORWARD: getCount("hello", "ll") -> 1
	//EXTREME : getCount("helllllllllo", "ll") -> 9
	//BIZZARE/EXOTIC getCount("abc", "")  -> NB
	public static int getCount(String str, String pattern)
	{
		assert pattern != null : "pattern cannot be null !";
		assert pattern != "" : "pattern cannot be an empty space";
		assert str != null : "string cannot be null !";
		int count = 0;
		int j =1;
		while( j != -1)
		{
			j = str.indexOf(pattern);
			if (j >= 0)
			{
				str = str.substring(j+1, str.length());
				count++;
			}

		}
		return count;
	}
	
	//postcondition: return value equals to a string 
	public static String rotate(String str, int rotation)
	{
		assert rotation < str.length():"delta must be less than " + str.length();
		assert rotation > -(str.length()) : "delta must be greater than: " + -(str.length());
		String rotatedString = "";
		ArrayList<Integer> codePointList = StringUtils_Dalton.adjustCodePointList(str);
		int count = 0;
		int index = 0;
		if(rotation >= 0)
		{
			index = str.length()-rotation;
			while(count < rotation)
			{
				count++;
				int codePointlist_i = codePointList.get(index);
				rotatedString += StringUtils_Dalton.convertToString(codePointlist_i);
				index++;
			}
			String sub = str.substring(0,str.length()-rotation);
			rotatedString += sub;
		}
		if(rotation < 0)
		{
			int positiveRotation = rotation + str.length();
			index = str.length()-positiveRotation;
			while(count < positiveRotation)
			{
				count++;
				int codePointlist_i = codePointList.get(index);
				rotatedString += StringUtils_Dalton.convertToString(codePointlist_i);
				index++;
			}
			String sub = str.substring(0,str.length()-positiveRotation);
		
			rotatedString += sub;
		}
		return rotatedString;
	}
	
	//postcondition: rv = unicode character of codepoint
	//STRAIGHTFORWARD : convertToString(9825) -> "\u2661"
	//EXTREME :convertToString(128512) -> "\uD83D\uDE00"
	public static String convertToString(int codePoint)
	{
		String str = "";
		char[] chList = Character.toChars(codePoint);
		if(chList.length==2)
		{
			str+= chList[0];
			str+= chList[1];
		}
		if(chList.length==1)
		{
			str+=chList[0];
		}
		return str;
	}

	public static List<Character> lowercaseLetters = Arrays.asList(new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'});
	public static List<Character> uppercaseLetters = Arrays.asList(new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'});
	//postcondition : rv = lettersOnlyString+= lowercaseLetters.get(i) || lettersOnlyString+= uppercaseLetters.get(i)
		//lettersOnlyString = lettersOnlyString.substring(lettersOnlyString.length()-lettersOnlyString.length()-1)
	//STRAIGHTFORDWARD : shift("abc", 2) -> "cde"
	//EXTREME : shift("xyz", -3) -> "wvx"
	//BIZZARE/EXTOIC : shift(null, 3) -> NB
	public static String shift(String lettersOnlyString, int shift)
	{
		assert lettersOnlyString!= null :"lettersOnlyString cannot have null!";
		assert lettersOnlyString!="" : "lettersOnlyString cannot be empty!";
		for(int i = 0; i <lettersOnlyString.length(); i++)
		{
			assert Character.isLetter(lettersOnlyString.charAt(i)): "lettersOnlyString must have letters only! ";
		}
		String editOfLettersOnlyString=lettersOnlyString;
		int indexForLettersArray = 0;
		String shiftString = "";
		char lastLetter = lettersOnlyString.charAt(lettersOnlyString.length()-1);
		char firstLetter = lettersOnlyString.charAt(0);
		int countNumberOfShifts =0;
		if(shift >= 0 )
		{
			if(lowercaseLetters.indexOf(lastLetter)!= -1)
			{
				indexForLettersArray = lowercaseLetters.indexOf(lastLetter);
			}
			if(uppercaseLetters.indexOf(lastLetter)!= -1)
			{
				indexForLettersArray = uppercaseLetters.indexOf(lastLetter);
			}
			while(countNumberOfShifts < shift)
			{
				
				indexForLettersArray++;
				if(indexForLettersArray >= lowercaseLetters.size())
				{
					indexForLettersArray = 0;
				}
				editOfLettersOnlyString += lowercaseLetters.get(indexForLettersArray);
				countNumberOfShifts++;
			}
			int lettersOnlyStringLength = lettersOnlyString.length();
			editOfLettersOnlyString = editOfLettersOnlyString.substring(editOfLettersOnlyString.length()-lettersOnlyStringLength);
			for(int i = 0; i <lettersOnlyString.length();i++)
			{
				if(Character.isUpperCase(lettersOnlyString.charAt(i)))
				{
					shiftString+= Character.toUpperCase(editOfLettersOnlyString.charAt(i));
				}
				else
				{
					shiftString+= editOfLettersOnlyString.charAt(i);
				}
			}
		}
		if(shift < 0 )
		{
			editOfLettersOnlyString = "";
			List<Character> reversedLowerCaseLetters =lowercaseLetters;
			Collections.reverse(reversedLowerCaseLetters);
			List<Character> reversedUpperCaseLetters =uppercaseLetters;
			Collections.reverse(reversedUpperCaseLetters);
			if(reversedLowerCaseLetters.indexOf(firstLetter)!= -1)
			{
				indexForLettersArray = reversedLowerCaseLetters.indexOf(firstLetter);
			}
			if(reversedUpperCaseLetters.indexOf(firstLetter)!= -1)
			{
				indexForLettersArray = reversedUpperCaseLetters.indexOf(firstLetter);
			}
			while(countNumberOfShifts >= shift)
			{
				editOfLettersOnlyString += reversedLowerCaseLetters.get(indexForLettersArray);
				indexForLettersArray++;
				if(indexForLettersArray >= reversedLowerCaseLetters.size())
				{
					indexForLettersArray = 0;
				}
				countNumberOfShifts--;
			}
			int lettersOnlyStringLength = lettersOnlyString.length();
			editOfLettersOnlyString = editOfLettersOnlyString.substring(editOfLettersOnlyString.length()-lettersOnlyStringLength);
			editOfLettersOnlyString = StringUtils_Dalton.reverse(editOfLettersOnlyString);
			for(int i = 0; i <lettersOnlyString.length();i++)
			{
				if(Character.isUpperCase(lettersOnlyString.charAt(i)))
				{
					shiftString+= Character.toUpperCase(editOfLettersOnlyString.charAt(i));
				}
				else
				{
					shiftString+= editOfLettersOnlyString.charAt(i);
				}
			}
		}
		
		return shiftString;
	}
	
	//postcondtion : rv== true <=> sort(str1) = sort(str1)
	// STRAIGHFORWARD : areAnagrams("listen", "silent") -> true
	//EXTREME : areAnagrams("dormitory", "dirty room") -> true
	//EXOTIC :areAnagrams("hello", null) -> NB
	public static boolean areAnagrams(String str1, String str2)
	{
		assert str1 != null: "string cannot be null!";
		assert str2 != null: "string cannot be null!";
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		ArrayList<Integer> codePointList1 = new ArrayList<Integer>(StringUtils_Dalton.adjustCodePointList(str1));
		ArrayList<Integer> codePointList2 = new ArrayList<Integer>(StringUtils_Dalton.adjustCodePointList(str2));
		Collections.sort(codePointList1); Collections.sort(codePointList2);
		boolean areAnagrams = (codePointList1.equals(codePointList2));
		return areAnagrams;
	}

	public static int getCodePointCount(String str)
	{
		assert str != null : "str is null";
		int count = str.codePointCount(0,str.length());
		return count;
	}
	//postcondition : rv = str.codePointAt(codePointIndex)
	//STRAIGHTFORWARD : getCodePoint("\uD83D\uDE00", 0) -> 128512
	//EXTREME : getCodePoint("\uD83D\uDE00"+"\u2661", 1) -> 9825
	//EXOTIC : getCodePoint(null, 0) -> NB
	public static int getCodePoint(String str, int codePointIndex)
	{
		assert str != null : "str is null";
		assert codePointIndex >= 0 : String.format("codePointIndex = %s < 0!", codePointIndex);
		assert codePointIndex < getCodePointCount(str) : String.format("codePointIndex = %s >= %s = getCodePointCount(str)", codePointIndex, getCodePointCount(str));
		ArrayList<Integer> codePointList = new ArrayList<Integer>(StringUtils_Dalton.adjustCodePointList(str));
		int codePoint = codePointList.get(codePointIndex);
		return codePoint;

	}

	//STUDENT: Realize that all ASCII characters are Unicode characters, however,
	//not all Unicode characters are ASCII characters
	//postcondition : rv = convertToString(str.codePointAt(codePointIndex))
	//STRAIGHTFORWARD : getUnicodeCharacter("\uD83D\uDE00", 0) -> "\uD83D\uDE00"
	//EXTREME : getUnicodeCharacter("\uD83D\uDE00"+"\uD83D\uDE00"+ "\uD83D\uDE00" , 3) -> "\uD83D\uDE00"
	// EXOTIC : getUnicodeCharacter(null, 0) -> NB
	
	public static String getUnicodeCharacter(String str, int codePointIndex)
	{
		assert str != null : "str is null";
		assert codePointIndex >= 0 : String.format("codePointIndex = %s < 0!", codePointIndex);
		assert codePointIndex < getCodePointCount(str) : String.format("codePointIndex = %s >= %s = getCodePointCount(str)", codePointIndex, getCodePointCount(str));
		String unicodeString = "";
		ArrayList<Integer> codePointList = new ArrayList<Integer>(StringUtils_Dalton.adjustCodePointList(str));
		int codePoint = codePointList.get(codePointIndex);
		unicodeString = StringUtils_Dalton.convertToString(codePoint);
		return unicodeString;
	}
}