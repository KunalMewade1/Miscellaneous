package miscelleneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniqueChar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 boolean result= false;
			 
			 String input="Alive is awesome";
			 System.out.println("String method3 "+method3(input));
	}

	private static boolean method3(String input) {
		// TODO Auto-generated method stub
		ArrayList ar= new ArrayList();
		for(int i=0;i<input.length();i++) {
			int j=input.indexOf(input.charAt(i));
			ar.add(j);
			
		}
		Collections.sort(ar);
		for(int i=0;i<(ar.size()-1);i++)
		{
			if(ar.get(i)==ar.get(i+1));
			return false;
		}
		return true;
	

}
}
