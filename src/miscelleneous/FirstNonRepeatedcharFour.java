package miscelleneous;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedcharFour {
	public static Character findFirstNonRepeatedchar(String str) {
		Map<Character, Integer> map= new HashMap<>();
		for(Character ch:str.toCharArray()) {
			map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
		}
		return map.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		char ch=findFirstNonRepeatedchar(s);
		System.out.println(ch);
		

	}

}
