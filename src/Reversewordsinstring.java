
public class Reversewordsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = " My name is Natarajan";

String[] ch = str.split(" ");

for (int i = ch.length-1; i >=0 ; i-- ) 

{
	System.out.print(ch[i] + " ");
}



	}

}
