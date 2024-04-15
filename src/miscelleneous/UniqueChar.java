package miscelleneous;

import java.util.HashSet;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result= false;
		String inputString="aliveiswsom";
		System.out.println(inputString);
		
		HashSet<Character> uniquecharset= new HashSet<>();
		for(int i=0;i<inputString.length();i++)
		{
			result=uniquecharset.add(inputString.charAt(i));
			break;
		}

		System.out.println(result);
	}

}
