import java.util.Arrays;

public class validateanagramstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "pots";
		String str2 = "tops";
		
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2= str2.toLowerCase().toCharArray();
		
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	if(Arrays.equals(ch1, ch2))
	{
		System.out.println("Given Strings are anagram");
	}
	else
	{
		System.out.println("Given Strings are not anagram");
	}

	}

}
