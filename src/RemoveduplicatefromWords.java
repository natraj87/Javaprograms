import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveduplicatefromWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am am Natarajan Natarajan";
		
		String[] arr = str.split(" ");
		
		Set<String> s = new LinkedHashSet<String>();
		
		for (String s1: arr)
		{
				s.add(s1);
					
		}
		
		
		System.out.println("The String after remobing duplicate is "+ s);
		
		System.out.println("______________________________________________");
		
		System.out.println();
		Iterator<String> sd = s.iterator();
		
		while(sd.hasNext())
		{
			System.out.print(sd.next() + " ");
		}
	}

}
