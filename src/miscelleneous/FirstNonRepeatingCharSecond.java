package miscelleneous;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstNonRepeatingCharSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the string");
		Scanner scanner= new Scanner(System.in);
		String s= scanner.nextLine();
		char ch=firstNonRepeatedCharacter(s);
		System.out.println("The first non repeated character is"+ch);
       scanner.close();
	}

	public static char firstNonRepeatedCharacter(String s) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> charHashMap= new LinkedHashMap<Character,Integer>();
		int lengh;
		Character ch = null;
		lengh=s.length();
		for(int i=0;i<lengh;i++)
		{
			ch=s.charAt(i);
			if(charHashMap.containsKey(ch)) {
				charHashMap.put(ch, charHashMap.get(ch)+1);
				}
			else {
				charHashMap.put(ch, 1);
			}
		}
		for(Entry<Character, Integer>entry:charHashMap.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		
		
		return ch;
	}

}
