import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateusingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,9,8,10,9,7,6,5,4,3,2,10};
		printduplicate(a);

	}

	private static void printduplicate(int[] a) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> hs = new HashMap<Integer,Integer>();
		int value = 0;
		for(int x: a)
		{
			if(!hs.containsKey(x))
			{
				hs.put(x,  1);
			}
			else
			{
				hs.put(x, hs.get(x)+1);
			}
		}
		
		System.out.println(hs);
		
		
		for(int x: hs.keySet())
		{
			if(hs.get(x)> 1)
			{
				System.out.println("Duplicate values are " + x + " and values are " + hs.get(x));
			}
		}
	}
       
	
}
