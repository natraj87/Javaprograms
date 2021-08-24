import java.util.HashSet;
import java.util.Set;

public class DupliacteusingHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,9,8,10,9,7,6,5,4,3,2};
		
		printduplicate(a);
		

	}

	private static void printduplicate(int[] a) {
		
		Set<Integer> hs = new HashSet<Integer>();
		for(int i = 0 ; i < a.length ; i++)
		{
			if(!hs.add(a[i]))
			{
				System.out.println("Duplicate numbers are "+ a[i]);
			}
		}
		
		System.out.println("_____________________________________________________________");
		System.out.print(hs);
		
	}

}
