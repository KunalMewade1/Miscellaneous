package miscelleneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraySumTargetPair2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {2,7,11,15,6};
		int target=17;
 Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < array1.length; i++) {
            int complement = target - array1[i];
            if (map.containsKey(complement)) {
                List<Integer> indices = map.get(complement);
                for (int index : indices) {
                    System.out.println("Indexes: " + index + ", " + i);
                }
            }
            List<Integer> indices = map.getOrDefault(array1[i], new ArrayList<>());
            indices.add(i);
            map.put(array1[i], indices);
        }
    }
	}


