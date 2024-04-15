package miscelleneous;

import java.util.HashMap;
import java.util.Map;

public class ArraySumTargetPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {2,7,11,15,6};
		int target=17;
		Map<Integer, Integer> map= new HashMap<>();
		for(int i=0;i<array.length;i++) {
			int complement=target-array[i];
			if(map.containsKey(complement))
			{
				System.out.println("indices "+ map.get(complement)+":"+i);
			}
			map.put(array[i], i);
		}
		

	}

}
