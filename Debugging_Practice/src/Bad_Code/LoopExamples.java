package Bad_Code;

public class LoopExamples {
	
	public static boolean hasWord(String[] wordArray, String word)
	{
		for(int i = 0; i < wordArray.length; i++)
		{
			if(wordArray[i] == word)
			{
				return true;
			}
		}
		return false;
	}
	
	public static String reverseString(String str)
	{
		String result = "";
		for(int i = str.length() - 1; i > 0; i--)
		{
			result += str.charAt(i);
		}
		return result;
	}
	
	

}
