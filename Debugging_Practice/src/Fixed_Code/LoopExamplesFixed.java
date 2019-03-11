package Fixed_Code;

public class LoopExamplesFixed {
	
	public static boolean hasWord(String[] wordArray, String word) {
		for(int i = 0; i < wordArray.length; i++ )
		{
			if(wordArray[i].equals(word)) {
				return true;
			}
		}
		return false;
	}
	
	public static String reverseString(String str)
	{
		String result = "";
		for(int i = str.length() - 1; i > -1; i--)
		{
			result += str.charAt(i);
		}
		return result;
	}

}
