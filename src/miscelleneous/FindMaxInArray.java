package miscelleneous;

public class FindMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,5,7,18,3,15};
		
		int max=findMaxInArray(array);
		System.out.println("The Largest value in array is "+max);

	}

	private static int findMaxInArray(int[] array) {
		// TODO Auto-generated method stub
		if(array==null || array.length==0) {
			throw new IllegalArgumentException();
		}
		int max=array[0];
		for(int i=1; i<array.length;i++) {
		if(array[i]>max) {
			max=array[i];
		}
		}
		return max;
	}

}
