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
	
	public static int longestRun(String[] a) {
		int count = 1;
		int max = 1;
		for(int i = 1; i < a.length; i++) {
			if(a[i].equals(a[i--])) {
				count ++;
			}
			else {
				max = Math.max(count, max);
				count = 1;
			}
		}
		
		return count;
	}
	
	public static boolean isPalindrome(String str)
	{
		//TODO
		return false;
	}

}
