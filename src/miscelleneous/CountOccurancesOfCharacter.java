package miscelleneous;

import java.util.HashMap;

public class CountOccurancesOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		characterCount("Allve is Awseome");
		characterCount("Java is Programming language");
		characterCount("US has 50 sates");

	}

	public static void characterCount(String string) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> charMap= new HashMap<Character,Integer>();
		char[] charArray=string.toCharArray();
		for(char ch:charArray) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(charMap);
	}

}
