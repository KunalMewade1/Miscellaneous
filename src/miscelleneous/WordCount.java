package miscelleneous;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the String");
		String input= scanner.nextLine();
		int wordCount=countWords(input);
		System.out.println("Number of words in the String: "+wordCount);
		scanner.close();

	}

	private static int countWords(String input) {
		// TODO Auto-generated method stub
		if(input==null ||input.trim().isEmpty()) {
			return 0;
			
		}
		String[]words=input.split("\\s+");
		return words.length;


	}

}
