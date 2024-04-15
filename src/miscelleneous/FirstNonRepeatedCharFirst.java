package miscelleneous;

public class FirstNonRepeatedCharFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="teeter";
		for(char i:input.toCharArray()) {
			if(input.indexOf(i)==input.lastIndexOf(i)) {
				System.out.println("First non repeating character is"+i);
				break;
			}
		}

	}

}
