package Bad_Code;

public class Main {
	public static void main(String[] args) {
		String[] words = {"hello", "Hello", "Hi", "Goodbye"};
		
		LoopExamples le = new LoopExamples();
		
		System.out.println(LoopExamples.hasWord(words, "Goodbye"));
	}
}
