package miscelleneous;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatedCharThird {
	
	public static Character firstNonRepeatedChar(String str) {
		Set<Character> repeatingchars= new HashSet<>();
		List<Character> nonrepeatingchars= new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			char letter=str.charAt(i);
			if(repeatingchars.contains(letter))
				continue;
			if(nonrepeatingchars.contains(letter)) {
				nonrepeatingchars.remove((Character)letter);
				repeatingchars.add(letter);
			}
			else {
				nonrepeatingchars.add(letter);
			}
		}
		
		return nonrepeatingchars.get(0);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the string");
		Scanner scanner= new Scanner(System.in);
		String str= scanner.nextLine();
		char ch=firstNonRepeatedChar(str);
		System.out.println("firstNonRepeatedChar "+ch );
		scanner.close();
		

	}

}
