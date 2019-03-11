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
	
	

}
