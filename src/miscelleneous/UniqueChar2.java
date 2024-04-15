package miscelleneous;

public class UniqueChar2 {

	public static void main(String[] args) {
		String input="Alive is Awesome";
		System.out.println("String method2"+ method2( input));
		
		
	}

	private static Object method2(String input) {
		// TODO Auto-generated method stub
		for(int i=0;i<input.length();i++) {
		char chacterOfInputString= input.charAt(i);
		int count=0;
		for(int j=0;j<input.length();j++) {
			if(chacterOfInputString==input.charAt(j));
			count++;
		}
		if(count>1) {
			return false;
		}
		
		return null;
		}
		return true;
	}

}
