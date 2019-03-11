package Bad_Code;

public class Main {
	public static void main(String[] args) {
		String[] words = {"hello", "Hi", "Goodbye", "Goodbye"};
		String[] words2 = new String[4];
		
		System.out.println(LoopExamples.hasWord(words, "Goodbye"));
		
		System.out.println(LoopExamples.reverseString("Hello"));
		
		System.out.println(LoopExamples.longestRun(words));
		
	}
}
