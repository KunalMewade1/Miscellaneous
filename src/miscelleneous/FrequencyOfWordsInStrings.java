package miscelleneous;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfWordsInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="I have more more more number than than this";
		
		printRepeatedWords(input);

	}

	private static void printRepeatedWords(String input) {
		// TODO Auto-generated method stub
		String [] words=input.split("\\s+");
		Map<String, Integer> wordCount= new HashMap<>();
		for(String word:words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
			
		}
		System.out.println("repeated counts of words and their count");
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
		
	}

	}
}
